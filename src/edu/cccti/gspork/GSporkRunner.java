package edu.cccti.gspork;

/* INSTRUCTION: This is a command line application. So please execute this template with the following arguments:

		arg[0] = admin-username@domain (E.g. liz@abcd.com)
		arg[1] = admin-password
		arg[2] = domain (E.g. abcd.com)
*/

/**
 * @author Randy Simms rsimms@cccti.edu
 * @created 2011-07-20
 * 
 */
 

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;

import sample.appsforyourdomain.AppsForYourDomainClient;
import com.google.gdata.client.appsforyourdomain.UserService;
import com.google.gdata.data.appsforyourdomain.AppsForYourDomainErrorCode;
import com.google.gdata.data.appsforyourdomain.AppsForYourDomainException;
import com.google.gdata.data.appsforyourdomain.provisioning.UserEntry;
import com.google.gdata.data.appsforyourdomain.provisioning.UserFeed;
import com.google.gdata.util.AuthenticationException;
import com.google.gdata.util.ServiceException;

import edu.cccti.gspork.bean.UserBean;
import edu.cccti.gspork.exception.GSporkException;
import edu.cccti.gspork.util.DateUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import google.apps.reporting.*;

import org.beanio.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*************************************
 * GSporkRunner will gather all the users and display metrics on the users 
 *************************************/
public class GSporkRunner {
    
	private static Logger logger = LoggerFactory.getLogger( GSporkRunner.class );
	
	private boolean headerDone = false;
	private String email;
	private String password;
	private String domain;
	private Collection<UserBean> users = new HashSet<UserBean>();
	
	private static AppsForYourDomainClient appsClient;
	
    public static void main(String[] args) {
    	if ( args.length != 3) {
    		throw new IllegalArgumentException("USAGE: GSporkRunner [email] [password] [domain]");
    	}
    	
    	GSporkRunner gSpork = new GSporkRunner();
    	gSpork.email = args[0];
    	gSpork.password = args[1];
    	gSpork.domain = args[2];

        deleteUsersNeverLoggedIn200720082009(gSpork);
        
    }

	private static void deleteUsersNeverLoggedIn200720082009(GSporkRunner gSpork) {
		try {
        	
        	gSpork.prepare();
        	
        	//gSpork.createReport();
        	gSpork.loadReport();
        	//gSpork.showStatsByAccountAge();
        	
			// the current YEAR
			//int currentYear = Calendar.getInstance().get(Calendar.YEAR);
			//int whichYear = currentYear;
			// find users for each year and print stats
			Collection<UserBean> filtered1 = null;
			Collection<UserBean> filtered2 = null;
			
			int whichYear = 2009;  //process years 2009 through 2007
			while (whichYear > 2006) {
				
				logger.info("Preparing year " + whichYear + "...");
				
				filtered1 = gSpork.findUsersByCreateYear(gSpork.users,whichYear);
				gSpork.printStatsByCreateYear(filtered1, "created in "+ new Integer(whichYear).toString() );
				
				filtered2 = gSpork.findUsersByNeverLoggedIn(filtered1);
				gSpork.printStatsByCreateYear(filtered2, "created in "+ new Integer(whichYear).toString()+ " and Never Logged in");
				
				//CALL THIS ONLY AFTER VERIFIED THE ACCOUNT TOTALS ARE CORRECT
				logger.info("Deleting never-logged-in users for year " + whichYear + "...");
				UserDAO.getInstance(appsClient);
				UserDAO.deleteUsers(filtered2);
				
				whichYear--;
			}

        	
		} catch (Exception e) {
			e.printStackTrace();
			logger.info("Message: " + e.getMessage() );
		}
	}
     
    private void prepare() {
    	try {
			appsClient = new AppsForYourDomainClient(this.email, this.password, this.domain);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
	public void createReport() throws GSporkException {
		
		try {
			ReportRunner runner = new ReportRunner();
			runner.setAdminEmail(this.email);
			runner.setAdminPassword(this.password);
			runner.setDomain(this.domain);
			// Run the latest accounts report to standard output.
			// runner.runReport("accounts", "2007-05-15", System.out);
	
			// Run the accounts report for today's date and save it to file
			logger.info("Gathering users...");		
			runner.runReport("accounts", new Date(), new FileOutputStream("c:\\temp\\google-users.csv"));
			logger.info("...Done");
		} catch (Throwable e) {
			throw new GSporkException(e);
		}
		    			
    }
    	 		
	public void loadReport() {
		// create a StreamFactory
        StreamFactory factory = StreamFactory.newInstance();
        // load the mapping file
        logger.info("Loading mapping file...");
        try {
        	factory.load("google-mapping.xml");
        	logger.info("...Done");
        }
        catch( BeanIOException be) {
        	//logger.info("File not found!!!");
        	be.printStackTrace();
        }
        
        // use a StreamFactory to create a BeanReader
        logger.info("Loading file of accounts...");
        BeanReader in = factory.createReader("GoogleDataReporting", new File("c:\\temp\\google-users.csv"));
        logger.info("...Done");
        
        logger.info("Processing accounts...");
        UserBean user;
        //int iUsers=0;
        users = new HashSet<UserBean>();
        while ((user = (UserBean) in.read()) != null) {
        	//process each user
        	//iUsers++;
        	users.add(user);
        }
        in.close();
        logger.info("...Done");
        logger.info(users.size() + ": Accounts processed.");
        //logger.info(users.size() +": Set of users count");
     
	}
	
	public void showStatsByAccountAge() {
		   
	    //statistics
	      Date today = new Date();
	      Date lastLogin=null;
	      int numYears;
	      int i5=0;
	      int i4=0;
	      int i3=0;
	      int i2=0;
	      int i1=0;
	      int iActive=0;
	      int iNever=0;
	      int iNeverAcct30days=0;
	      int iNeverAcct180days=0;
	      int iNeverAcct1year=0;
	      int iNeverAcct2year=0;
	      int iNeverAcctOther=0;
	      
	      UserBean thisuser;
	      for (Iterator<UserBean> it=users.iterator(); it.hasNext(); ) {
	      	thisuser = (UserBean)it.next();
	      	
	      	//1969 is a sign that the date has never been updated and thus the user never logged in
	  		if (thisuser.getLastLoginDate().contains("1969")) {
	  			iNever++;
	  			//filter based on account creation date
	  			try {
	  				lastLogin = new SimpleDateFormat("yyyyMMdd").parse(thisuser.getCreationDate());
	  			} catch (ParseException e) {
	  				e.printStackTrace();
	  			}
	  			
	  			double numDaysNever = DateUtils.daysBetween(today,lastLogin);
	  			
	  			//logged in within 30 days
	  			if (numDaysNever <= 30) {
	  				iNeverAcct30days++;
	  			}
	  			//logged in within 6 months
	  			else if (numDaysNever <= 180) {
	  				iNeverAcct180days++;
	  			}
	  			//logged in within 1 year
	  			else if (numDaysNever <= 365) {   
	  				iNeverAcct1year++;
	  			}
	  			//logged in within 2 year
	  			else  if (numDaysNever <= (365*2)) {
	  				iNeverAcct2year++;
	  			}
	  			else {
	  				iNeverAcctOther++;
	  			}
	  		}
	  		else {
	  			try {
	  				lastLogin = new SimpleDateFormat("yyyyMMdd").parse(thisuser.getLastLoginDate());
	  			} catch (ParseException e) {
	  				e.printStackTrace();
	  			}
	  			
	        	numYears = (int)DateUtils.yearsBetween(today,lastLogin);
	        	if (numYears >= 5) {
	        		i5++;
	        	}
	    		else if( numYears == 4) {
	    			i4++;
	    		}
				else if( numYears == 3) {
	    			i3++;
				}
	        	else if( numYears == 2) {
	            	i2++;
	    		}
				else if( numYears == 1) {
	    			i1++;
				}
	            else {
	            	iActive++;
	        	}
	      	}//end if
	      }//end for
	      
	      logger.info("\n Metrics by Account Age");
	      logger.info("-------------------------------");
		int iUsers = this.users.size();
	      //Number of Users that haven't logged in EVER, 5, 4, 3, 2, 1 years
	  	logger.info("Never used Gmail: " + "\t\t\t\t" 		+ iNever  			+ "\t (" + Math.round(((float)iNever/iUsers ) * 100) + "%)");
	  	logger.info("\t Account created within 30 days:\t" 	+ iNeverAcct30days  + "\t (" + Math.round(((float)iNeverAcct30days/iNever ) * 100) + "% of Never used Gmail)");
	  	logger.info("\t Account created 31-180 days ago:\t" 	+ iNeverAcct180days + "\t (" + Math.round(((float)iNeverAcct180days/iNever ) * 100) + "% of Never used Gmail)");
	  	logger.info("\t Account created 181-365 days ago:\t" + iNeverAcct1year  	+ "\t (" + Math.round(((float)iNeverAcct1year/iNever ) * 100) + "% of Never used Gmail)");
	  	logger.info("\t Account created 366-730 days ago:\t" + iNeverAcct2year  	+ "\t (" + Math.round(((float)iNeverAcct2year/iNever ) * 100) + "% of Never used Gmail)");
	  	logger.info("\t Account created OVER 2 years ago:\t" + iNeverAcctOther  	+ "\t (" + Math.round(((float)iNeverAcctOther/iNever ) * 100) + "% of Never used Gmail)");
	  	logger.info("");
	  	
	  	logger.info("Last login over 5 years: " + "\t\t\t" + i5 		+ " (" + Math.round(((float)i5/iUsers) * 100) + "%)");
		logger.info("Last login over 4 years: " + "\t\t\t" + i4 		+ " (" + Math.round(((float)i4/iUsers) * 100) + "%)");
		logger.info("Last login over 3 years: " + "\t\t\t" + i3 		+ " (" + Math.round(((float)i3/iUsers) * 100) + "%)");
		logger.info("Last login over 2 years: " + "\t\t\t" + i2 		+ " (" + Math.round(((float)i2/iUsers) * 100) + "%)");
		logger.info("Last login over 1 years: " + "\t\t\t" + i1 		+ " (" + Math.round(((float)i1/iUsers) * 100) + "%)");
		logger.info("Last login under 1 year: " + "\t\t\t" + iActive + " (" + Math.round(((float) iActive/iUsers) * 100) + "%)");
	
	}
		
	/*****
	 * Return a collection of user accounts created in a given year
	 ****/
	public Collection<UserBean> findUsersByCreateYear(Collection<UserBean> users, final int whichYear) {
		 	  
		Collection<UserBean> filtered = Collections2.filter( users, new Predicate<UserBean>() {		 
			@Override
			public boolean apply(UserBean userbean) {
				return userbean.getCreationDate().substring(0, 4).equals(new Integer(whichYear).toString()); 
			}
		});

	    return filtered;
	}
		
	public Collection<UserBean> findUsersByNeverLoggedIn(Collection<UserBean> users) {
			  
		//if (thisuser.getLastLoginDate().contains("1969")) {
		Collection<UserBean> filtered = Collections2.filter( users, new Predicate<UserBean>() {		 
			@Override
			public boolean apply(UserBean userbean) {
		        //return false;
				return userbean.getLastLoginDate().contains("1969"); 
			}
		});

	    return filtered;
	}
	
	public void printStatsByCreateYear(Collection<UserBean> coll, String subtitle) {
	
	      /**TODO Delete users if they are never logged in
	      
	      //FIND Never Logged In - 1969 is a sign the user never logged in
	  		if (thisuser.getLastLoginDate().contains("1969")) {
	  			iNever++;
	  			//filter based on account creation year
	  			try {
	  				lastLogin = new SimpleDateFormat("yyyyMMdd").parse(thisuser.getCreationDate());
	  			} catch (ParseException e) {
	  				e.printStackTrace();
	  			}
	  		**/	
	  		
	      if (headerDone != true) {
	    	  headerDone = true;
	    	  logger.info("\n Metrics by Account"); 
	    	  logger.info("-------------------------------");
	      }
	    	 
	      logger.info("\t Accounts for '" + subtitle + "': \t" 	+ coll.size() );
	    
	}
	
	public void listUsers() {
       try {
        
        // Create a new Google Apps Provisioning service
        UserService myService = new UserService("My Application");
        myService.setUserCredentials(this.email,this.password);
        
        // Get a list of all entries
        URL metafeedUrl = new URL("https://www.google.com/a/feeds/"+ this.domain +"/user/2.0/");
        logger.info("Getting user entries...\n");
        UserFeed resultFeed = myService.getFeed(metafeedUrl, UserFeed.class);
        List<UserEntry> entries = resultFeed.getEntries();
        for(int i=0; i<entries.size(); i++) {
          UserEntry entry = entries.get(i);
          logger.info("\t" + entry.getTitle().getPlainText());
          logger.info("\t\t\t" + "Last edit: " + entry.getEdited() );
          
        }
        logger.info("\nTotal Entries: "+entries.size());
      }
      catch(AuthenticationException e) {
        e.printStackTrace();
      }
      catch(MalformedURLException e) {
        e.printStackTrace();
      }
      catch(ServiceException e) {
        e.printStackTrace();
      }
      catch(IOException e) {
        e.printStackTrace();
      }
    }//end listUsers
	


}//end class
  
