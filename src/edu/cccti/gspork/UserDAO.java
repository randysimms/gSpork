package edu.cccti.gspork;

import java.util.Collection;

import sample.appsforyourdomain.AppsForYourDomainClient;

import com.google.gdata.data.appsforyourdomain.AppsForYourDomainException;
import com.google.gdata.data.appsforyourdomain.provisioning.UserEntry;

import edu.cccti.gspork.bean.UserBean;
import edu.cccti.gspork.test.DeleteUsersTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDAO {
	
	private static Logger logger = LoggerFactory.getLogger( UserDAO.class );
	
	private static UserDAO userDAO = null;	
	private static AppsForYourDomainClient appsClient;
	
	public UserDAO(AppsForYourDomainClient appsClient) {
		super();
		UserDAO.appsClient = appsClient;
	}
	
	//public UserDAO() {
	//	super();
	//}

	 // For lazy initialization
	public static synchronized UserDAO getInstance(AppsForYourDomainClient appsClient) {
		if (userDAO==null) {
			userDAO = new UserDAO(appsClient);
		}
		return userDAO;
	} 
  

	public static void deleteUsers(Collection<UserBean> coll) throws AppsForYourDomainException {
		
		int iDeleted=0;
		int iNotDeleted=0;
		boolean isDeleted = false;
		
			//TODO add navigate to each element in collection
			for( UserBean userbean : coll) {
				isDeleted = deleteUser(userbean);	
				if (isDeleted) {
					iDeleted++; 
				} else {
					iNotDeleted++;
				}
				
				//LIMIT the process to X records
				//if (iNotDeleted + iDeleted > 5){
				//	break;
				//}
			}

			logger.info("\n\n");
			logger.info("Accounts: " + coll.size() );
			logger.info("Deleted: " + iDeleted );
			logger.info("Not Deleted: " + iNotDeleted );
			logger.info("\n\n");
			
		}

	public static boolean deleteUser(UserBean userbean) throws AppsForYourDomainException{
		boolean isDeleted = false;
		String username = userbean.getAccountName();
		username = username.substring(0, username.indexOf("@") );
		try {
			//Get the Account
			logger.info("");
			logger.info("Retrieving username: " + username );
			UserEntry userentry = appsClient.retrieveUser(username);
			
			//DELETE the Google Account!!!
			logger.info("Deleting username: " + username + "...");
			userentry.delete();
			
			//Verify delete
			try{
				appsClient.retrieveUser(username);
			}
			catch(AppsForYourDomainException e){
				if ( e.getErrorCode().getErrorCodeAsInt() == 1301 ){
					isDeleted=true;
					logger.info("...Deleted " + username );
				}
			}
	
		} 
		catch(AppsForYourDomainException e){
			if ( e.getErrorCode().getErrorCodeAsInt() == 1301 ){
				logger.info("...User not Found!!!" );
				isDeleted=false;
			}
			else {
				throw e;
			}
		} 
		catch (Throwable e) {
			e.printStackTrace();
		} 
		return isDeleted;
	}
}
