package edu.cccti.gspork.bean;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class UserJPanel extends JPanel {

	private BindingGroup m_bindingGroup;
	private edu.cccti.gspork.bean.UserBean userBean = new edu.cccti.gspork.bean.UserBean();
	private JTextField accountIDJTextField;
	private JTextField accountNameJTextField;
	private JTextField channelJTextField;
	private JTextField creationDateJTextField;
	private JTextField creationTimeJTextField;
	private JTextField givenNameJTextField;
	private JTextField lastLoginDateJTextField;
	private JTextField lastLoginTimeJTextField;
	private JTextField lastPOPDateJTextField;
	private JTextField lastPOPTimeJTextField;
	private JTextField lastWebMailDateJTextField;
	private JTextField lastWebMailTimeJTextField;
	private JTextField primaryAccountIDJTextField;
	private JTextField primaryAccountNameJTextField;
	private JTextField quotaInMBJTextField;
	private JTextField reportDateJTextField;
	private JTextField serviceTierJTextField;
	private JTextField statusJTextField;
	private JTextField surnameJTextField;
	private JTextField suspensionReasonJTextField;
	private JTextField usageInBytesJTextField;

	public UserJPanel(edu.cccti.gspork.bean.UserBean newUserBean) {
		this();
		setUserBean(newUserBean);
	}

	public UserJPanel() {
		setBorder(new CompoundBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null), null));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 240, 143, 240, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4 };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 1.0E-4 };
		setLayout(gridBagLayout);
								
										JLabel reportDateLabel = new JLabel("ReportDate:");
										GridBagConstraints labelGbc_15 = new GridBagConstraints();
										labelGbc_15.insets = new Insets(5, 5, 5, 5);
										labelGbc_15.gridx = 0;
										labelGbc_15.gridy = 0;
										add(reportDateLabel, labelGbc_15);
								
										reportDateJTextField = new JTextField();
										GridBagConstraints componentGbc_15 = new GridBagConstraints();
										componentGbc_15.insets = new Insets(5, 0, 5, 5);
										componentGbc_15.fill = GridBagConstraints.HORIZONTAL;
										componentGbc_15.gridx = 1;
										componentGbc_15.gridy = 0;
										add(reportDateJTextField, componentGbc_15);
						
								JLabel primaryAccountIDLabel = new JLabel("PrimaryAccountID:");
								GridBagConstraints labelGbc_12 = new GridBagConstraints();
								labelGbc_12.insets = new Insets(5, 5, 5, 5);
								labelGbc_12.gridx = 0;
								labelGbc_12.gridy = 1;
								add(primaryAccountIDLabel, labelGbc_12);
						
								primaryAccountIDJTextField = new JTextField();
								GridBagConstraints componentGbc_12 = new GridBagConstraints();
								componentGbc_12.insets = new Insets(5, 0, 5, 5);
								componentGbc_12.fill = GridBagConstraints.HORIZONTAL;
								componentGbc_12.gridx = 1;
								componentGbc_12.gridy = 1;
								add(primaryAccountIDJTextField, componentGbc_12);
				
						JLabel accountIDLabel = new JLabel("AccountID:");
						GridBagConstraints labelGbc_0 = new GridBagConstraints();
						labelGbc_0.insets = new Insets(5, 5, 5, 5);
						labelGbc_0.gridx = 2;
						labelGbc_0.gridy = 1;
						add(accountIDLabel, labelGbc_0);
		
				accountIDJTextField = new JTextField();
				GridBagConstraints componentGbc_0 = new GridBagConstraints();
				componentGbc_0.insets = new Insets(5, 0, 5, 5);
				componentGbc_0.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_0.gridx = 3;
				componentGbc_0.gridy = 1;
				add(accountIDJTextField, componentGbc_0);
								
										JLabel primaryAccountNameLabel = new JLabel("PrimaryAccountName:");
										GridBagConstraints labelGbc_13 = new GridBagConstraints();
										labelGbc_13.insets = new Insets(5, 5, 5, 5);
										labelGbc_13.gridx = 0;
										labelGbc_13.gridy = 2;
										add(primaryAccountNameLabel, labelGbc_13);
								
										primaryAccountNameJTextField = new JTextField();
										GridBagConstraints componentGbc_13 = new GridBagConstraints();
										componentGbc_13.insets = new Insets(5, 0, 5, 5);
										componentGbc_13.fill = GridBagConstraints.HORIZONTAL;
										componentGbc_13.gridx = 1;
										componentGbc_13.gridy = 2;
										add(primaryAccountNameJTextField, componentGbc_13);
						
								JLabel accountNameLabel = new JLabel("AccountName:");
								GridBagConstraints labelGbc_1 = new GridBagConstraints();
								labelGbc_1.insets = new Insets(5, 5, 5, 5);
								labelGbc_1.gridx = 2;
								labelGbc_1.gridy = 2;
								add(accountNameLabel, labelGbc_1);
				
						accountNameJTextField = new JTextField();
						accountNameJTextField.setToolTipText("Account Name");
						accountNameJTextField.setEditable(false);
						GridBagConstraints componentGbc_1 = new GridBagConstraints();
						componentGbc_1.fill = GridBagConstraints.BOTH;
						componentGbc_1.insets = new Insets(5, 0, 5, 5);
						componentGbc_1.gridx = 3;
						componentGbc_1.gridy = 2;
						add(accountNameJTextField, componentGbc_1);
		
				JLabel givenNameLabel = new JLabel("GivenName:");
				GridBagConstraints labelGbc_5 = new GridBagConstraints();
				labelGbc_5.insets = new Insets(5, 5, 5, 5);
				labelGbc_5.gridx = 0;
				labelGbc_5.gridy = 3;
				add(givenNameLabel, labelGbc_5);
		
				givenNameJTextField = new JTextField();
				GridBagConstraints componentGbc_5 = new GridBagConstraints();
				componentGbc_5.insets = new Insets(5, 0, 5, 5);
				componentGbc_5.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_5.gridx = 1;
				componentGbc_5.gridy = 3;
				add(givenNameJTextField, componentGbc_5);
						
								JLabel surnameLabel = new JLabel("Surname:");
								GridBagConstraints labelGbc_18 = new GridBagConstraints();
								labelGbc_18.insets = new Insets(5, 5, 5, 5);
								labelGbc_18.gridx = 2;
								labelGbc_18.gridy = 3;
								add(surnameLabel, labelGbc_18);
				
						surnameJTextField = new JTextField();
						GridBagConstraints componentGbc_18 = new GridBagConstraints();
						componentGbc_18.insets = new Insets(5, 0, 5, 5);
						componentGbc_18.fill = GridBagConstraints.HORIZONTAL;
						componentGbc_18.gridx = 3;
						componentGbc_18.gridy = 3;
						add(surnameJTextField, componentGbc_18);

		JLabel creationDateLabel = new JLabel("CreationDate:");
		GridBagConstraints labelGbc_3 = new GridBagConstraints();
		labelGbc_3.insets = new Insets(5, 5, 5, 5);
		labelGbc_3.gridx = 0;
		labelGbc_3.gridy = 5;
		add(creationDateLabel, labelGbc_3);

		creationDateJTextField = new JTextField();
		GridBagConstraints componentGbc_3 = new GridBagConstraints();
		componentGbc_3.insets = new Insets(5, 0, 5, 5);
		componentGbc_3.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_3.gridx = 1;
		componentGbc_3.gridy = 5;
		add(creationDateJTextField, componentGbc_3);
				
						JLabel creationTimeLabel = new JLabel("CreationTime:");
						GridBagConstraints labelGbc_4 = new GridBagConstraints();
						labelGbc_4.insets = new Insets(5, 5, 5, 5);
						labelGbc_4.gridx = 2;
						labelGbc_4.gridy = 5;
						add(creationTimeLabel, labelGbc_4);
		
				creationTimeJTextField = new JTextField();
				GridBagConstraints componentGbc_4 = new GridBagConstraints();
				componentGbc_4.insets = new Insets(5, 0, 5, 5);
				componentGbc_4.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_4.gridx = 3;
				componentGbc_4.gridy = 5;
				add(creationTimeJTextField, componentGbc_4);

		JLabel lastLoginDateLabel = new JLabel("LastLoginDate:");
		GridBagConstraints labelGbc_6 = new GridBagConstraints();
		labelGbc_6.insets = new Insets(5, 5, 5, 5);
		labelGbc_6.gridx = 0;
		labelGbc_6.gridy = 6;
		add(lastLoginDateLabel, labelGbc_6);

		lastLoginDateJTextField = new JTextField();
		GridBagConstraints componentGbc_6 = new GridBagConstraints();
		componentGbc_6.insets = new Insets(5, 0, 5, 5);
		componentGbc_6.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_6.gridx = 1;
		componentGbc_6.gridy = 6;
		add(lastLoginDateJTextField, componentGbc_6);
				
						JLabel lastLoginTimeLabel = new JLabel("LastLoginTime:");
						GridBagConstraints labelGbc_7 = new GridBagConstraints();
						labelGbc_7.insets = new Insets(5, 5, 5, 5);
						labelGbc_7.gridx = 2;
						labelGbc_7.gridy = 6;
						add(lastLoginTimeLabel, labelGbc_7);
		
				lastLoginTimeJTextField = new JTextField();
				GridBagConstraints componentGbc_7 = new GridBagConstraints();
				componentGbc_7.insets = new Insets(5, 0, 5, 5);
				componentGbc_7.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_7.gridx = 3;
				componentGbc_7.gridy = 6;
				add(lastLoginTimeJTextField, componentGbc_7);
		
				JLabel lastPOPDateLabel = new JLabel("LastPOPDate:");
				GridBagConstraints labelGbc_8 = new GridBagConstraints();
				labelGbc_8.insets = new Insets(5, 5, 5, 5);
				labelGbc_8.gridx = 0;
				labelGbc_8.gridy = 7;
				add(lastPOPDateLabel, labelGbc_8);
		
				lastPOPDateJTextField = new JTextField();
				GridBagConstraints componentGbc_8 = new GridBagConstraints();
				componentGbc_8.insets = new Insets(5, 0, 5, 5);
				componentGbc_8.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_8.gridx = 1;
				componentGbc_8.gridy = 7;
				add(lastPOPDateJTextField, componentGbc_8);
		
				JLabel lastPOPTimeLabel = new JLabel("LastPOPTime:");
				GridBagConstraints labelGbc_9 = new GridBagConstraints();
				labelGbc_9.insets = new Insets(5, 5, 5, 5);
				labelGbc_9.gridx = 2;
				labelGbc_9.gridy = 7;
				add(lastPOPTimeLabel, labelGbc_9);
		
				lastPOPTimeJTextField = new JTextField();
				GridBagConstraints componentGbc_9 = new GridBagConstraints();
				componentGbc_9.insets = new Insets(5, 0, 5, 5);
				componentGbc_9.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_9.gridx = 3;
				componentGbc_9.gridy = 7;
				add(lastPOPTimeJTextField, componentGbc_9);
		
				JLabel lastWebMailDateLabel = new JLabel("LastWebMailDate:");
				GridBagConstraints labelGbc_10 = new GridBagConstraints();
				labelGbc_10.insets = new Insets(5, 5, 5, 5);
				labelGbc_10.gridx = 0;
				labelGbc_10.gridy = 8;
				add(lastWebMailDateLabel, labelGbc_10);
		
				lastWebMailDateJTextField = new JTextField();
				GridBagConstraints componentGbc_10 = new GridBagConstraints();
				componentGbc_10.insets = new Insets(5, 0, 5, 5);
				componentGbc_10.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_10.gridx = 1;
				componentGbc_10.gridy = 8;
				add(lastWebMailDateJTextField, componentGbc_10);
		
				JLabel lastWebMailTimeLabel = new JLabel("LastWebMailTime:");
				GridBagConstraints labelGbc_11 = new GridBagConstraints();
				labelGbc_11.insets = new Insets(5, 5, 5, 5);
				labelGbc_11.gridx = 2;
				labelGbc_11.gridy = 8;
				add(lastWebMailTimeLabel, labelGbc_11);
		
				lastWebMailTimeJTextField = new JTextField();
				GridBagConstraints componentGbc_11 = new GridBagConstraints();
				componentGbc_11.insets = new Insets(5, 0, 5, 5);
				componentGbc_11.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_11.gridx = 3;
				componentGbc_11.gridy = 8;
				add(lastWebMailTimeJTextField, componentGbc_11);
		
				JLabel channelLabel = new JLabel("Channel:");
				GridBagConstraints labelGbc_2 = new GridBagConstraints();
				labelGbc_2.insets = new Insets(5, 5, 5, 5);
				labelGbc_2.gridx = 0;
				labelGbc_2.gridy = 10;
				add(channelLabel, labelGbc_2);
		
				channelJTextField = new JTextField();
				GridBagConstraints componentGbc_2 = new GridBagConstraints();
				componentGbc_2.insets = new Insets(5, 0, 5, 5);
				componentGbc_2.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_2.gridx = 1;
				componentGbc_2.gridy = 10;
				add(channelJTextField, componentGbc_2);
		
				JLabel suspensionReasonLabel = new JLabel("SuspensionReason:");
				GridBagConstraints labelGbc_19 = new GridBagConstraints();
				labelGbc_19.insets = new Insets(5, 5, 5, 5);
				labelGbc_19.gridx = 2;
				labelGbc_19.gridy = 10;
				add(suspensionReasonLabel, labelGbc_19);
		
				suspensionReasonJTextField = new JTextField();
				GridBagConstraints componentGbc_19 = new GridBagConstraints();
				componentGbc_19.insets = new Insets(5, 0, 5, 5);
				componentGbc_19.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_19.gridx = 3;
				componentGbc_19.gridy = 10;
				add(suspensionReasonJTextField, componentGbc_19);

		JLabel quotaInMBLabel = new JLabel("QuotaInMB:");
		GridBagConstraints labelGbc_14 = new GridBagConstraints();
		labelGbc_14.insets = new Insets(5, 5, 5, 5);
		labelGbc_14.gridx = 0;
		labelGbc_14.gridy = 11;
		add(quotaInMBLabel, labelGbc_14);

		quotaInMBJTextField = new JTextField();
		GridBagConstraints componentGbc_14 = new GridBagConstraints();
		componentGbc_14.insets = new Insets(5, 0, 5, 5);
		componentGbc_14.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_14.gridx = 1;
		componentGbc_14.gridy = 11;
		add(quotaInMBJTextField, componentGbc_14);
		
				JLabel usageInBytesLabel = new JLabel("UsageInBytes:");
				GridBagConstraints labelGbc_20 = new GridBagConstraints();
				labelGbc_20.insets = new Insets(5, 5, 5, 5);
				labelGbc_20.gridx = 2;
				labelGbc_20.gridy = 11;
				add(usageInBytesLabel, labelGbc_20);
		
				usageInBytesJTextField = new JTextField();
				GridBagConstraints componentGbc_20 = new GridBagConstraints();
				componentGbc_20.insets = new Insets(5, 0, 5, 0);
				componentGbc_20.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_20.gridx = 3;
				componentGbc_20.gridy = 11;
				add(usageInBytesJTextField, componentGbc_20);

		JLabel serviceTierLabel = new JLabel("ServiceTier:");
		GridBagConstraints labelGbc_16 = new GridBagConstraints();
		labelGbc_16.insets = new Insets(5, 5, 5, 5);
		labelGbc_16.gridx = 0;
		labelGbc_16.gridy = 12;
		add(serviceTierLabel, labelGbc_16);

		serviceTierJTextField = new JTextField();
		GridBagConstraints componentGbc_16 = new GridBagConstraints();
		componentGbc_16.insets = new Insets(5, 0, 5, 5);
		componentGbc_16.fill = GridBagConstraints.HORIZONTAL;
		componentGbc_16.gridx = 1;
		componentGbc_16.gridy = 12;
		add(serviceTierJTextField, componentGbc_16);
				
						JLabel statusLabel = new JLabel("Status:");
						GridBagConstraints labelGbc_17 = new GridBagConstraints();
						labelGbc_17.insets = new Insets(5, 5, 5, 5);
						labelGbc_17.gridx = 2;
						labelGbc_17.gridy = 12;
						add(statusLabel, labelGbc_17);
		
				statusJTextField = new JTextField();
				GridBagConstraints componentGbc_17 = new GridBagConstraints();
				componentGbc_17.insets = new Insets(5, 0, 5, 5);
				componentGbc_17.fill = GridBagConstraints.HORIZONTAL;
				componentGbc_17.gridx = 3;
				componentGbc_17.gridy = 12;
				add(statusJTextField, componentGbc_17);

		if (userBean != null) {
			m_bindingGroup = initDataBindings();
		}
	}

	protected BindingGroup initDataBindings() {
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> accountIDProperty = BeanProperty
				.create("accountID");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						accountIDProperty, accountIDJTextField, textProperty);
		autoBinding.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> accountNameProperty = BeanProperty
				.create("accountName");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_1 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_1 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						accountNameProperty, accountNameJTextField,
						textProperty_1);
		autoBinding_1.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> channelProperty = BeanProperty
				.create("channel");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_2 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_2 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						channelProperty, channelJTextField, textProperty_2);
		autoBinding_2.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> creationDateProperty = BeanProperty
				.create("creationDate");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_3 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_3 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						creationDateProperty, creationDateJTextField,
						textProperty_3);
		autoBinding_3.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> creationTimeProperty = BeanProperty
				.create("creationTime");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_4 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_4 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						creationTimeProperty, creationTimeJTextField,
						textProperty_4);
		autoBinding_4.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> givenNameProperty = BeanProperty
				.create("givenName");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_5 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_5 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						givenNameProperty, givenNameJTextField, textProperty_5);
		autoBinding_5.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastLoginDateProperty = BeanProperty
				.create("lastLoginDate");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_6 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_6 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastLoginDateProperty, lastLoginDateJTextField,
						textProperty_6);
		autoBinding_6.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastLoginTimeProperty = BeanProperty
				.create("lastLoginTime");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_7 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_7 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastLoginTimeProperty, lastLoginTimeJTextField,
						textProperty_7);
		autoBinding_7.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastPOPDateProperty = BeanProperty
				.create("lastPOPDate");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_8 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_8 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastPOPDateProperty, lastPOPDateJTextField,
						textProperty_8);
		autoBinding_8.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastPOPTimeProperty = BeanProperty
				.create("lastPOPTime");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_9 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_9 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastPOPTimeProperty, lastPOPTimeJTextField,
						textProperty_9);
		autoBinding_9.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastWebMailDateProperty = BeanProperty
				.create("lastWebMailDate");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_10 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_10 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastWebMailDateProperty, lastWebMailDateJTextField,
						textProperty_10);
		autoBinding_10.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> lastWebMailTimeProperty = BeanProperty
				.create("lastWebMailTime");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_11 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_11 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						lastWebMailTimeProperty, lastWebMailTimeJTextField,
						textProperty_11);
		autoBinding_11.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> primaryAccountIDProperty = BeanProperty
				.create("primaryAccountID");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_12 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_12 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						primaryAccountIDProperty, primaryAccountIDJTextField,
						textProperty_12);
		autoBinding_12.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> primaryAccountNameProperty = BeanProperty
				.create("primaryAccountName");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_13 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_13 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						primaryAccountNameProperty,
						primaryAccountNameJTextField, textProperty_13);
		autoBinding_13.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> quotaInMBProperty = BeanProperty
				.create("quotaInMB");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_14 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_14 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						quotaInMBProperty, quotaInMBJTextField, textProperty_14);
		autoBinding_14.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> reportDateProperty = BeanProperty
				.create("reportDate");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_15 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_15 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						reportDateProperty, reportDateJTextField,
						textProperty_15);
		autoBinding_15.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> serviceTierProperty = BeanProperty
				.create("serviceTier");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_16 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_16 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						serviceTierProperty, serviceTierJTextField,
						textProperty_16);
		autoBinding_16.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> statusProperty = BeanProperty
				.create("status");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_17 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_17 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						statusProperty, statusJTextField, textProperty_17);
		autoBinding_17.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> surnameProperty = BeanProperty
				.create("surname");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_18 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_18 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						surnameProperty, surnameJTextField, textProperty_18);
		autoBinding_18.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> suspensionReasonProperty = BeanProperty
				.create("suspensionReason");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_19 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_19 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						suspensionReasonProperty, suspensionReasonJTextField,
						textProperty_19);
		autoBinding_19.bind();
		//
		BeanProperty<edu.cccti.gspork.bean.UserBean, java.lang.String> usageInBytesProperty = BeanProperty
				.create("usageInBytes");
		BeanProperty<javax.swing.JTextField, java.lang.String> textProperty_20 = BeanProperty
				.create("text");
		AutoBinding<edu.cccti.gspork.bean.UserBean, java.lang.String, javax.swing.JTextField, java.lang.String> autoBinding_20 = Bindings
				.createAutoBinding(AutoBinding.UpdateStrategy.READ, userBean,
						usageInBytesProperty, usageInBytesJTextField,
						textProperty_20);
		autoBinding_20.bind();
		//
		BindingGroup bindingGroup = new BindingGroup();
		bindingGroup.addBinding(autoBinding);
		bindingGroup.addBinding(autoBinding_1);
		bindingGroup.addBinding(autoBinding_2);
		bindingGroup.addBinding(autoBinding_3);
		bindingGroup.addBinding(autoBinding_4);
		bindingGroup.addBinding(autoBinding_5);
		bindingGroup.addBinding(autoBinding_6);
		bindingGroup.addBinding(autoBinding_7);
		bindingGroup.addBinding(autoBinding_8);
		bindingGroup.addBinding(autoBinding_9);
		bindingGroup.addBinding(autoBinding_10);
		bindingGroup.addBinding(autoBinding_11);
		bindingGroup.addBinding(autoBinding_12);
		bindingGroup.addBinding(autoBinding_13);
		bindingGroup.addBinding(autoBinding_14);
		bindingGroup.addBinding(autoBinding_15);
		bindingGroup.addBinding(autoBinding_16);
		bindingGroup.addBinding(autoBinding_17);
		bindingGroup.addBinding(autoBinding_18);
		bindingGroup.addBinding(autoBinding_19);
		bindingGroup.addBinding(autoBinding_20);
		//
		return bindingGroup;
	}

	public edu.cccti.gspork.bean.UserBean getUserBean() {
		return userBean;
	}

	public void setUserBean(edu.cccti.gspork.bean.UserBean newUserBean) {
		setUserBean(newUserBean, true);
	}

	public void setUserBean(edu.cccti.gspork.bean.UserBean newUserBean,
			boolean update) {
		userBean = newUserBean;
		if (update) {
			if (m_bindingGroup != null) {
				m_bindingGroup.unbind();
				m_bindingGroup = null;
			}
			if (userBean != null) {
				m_bindingGroup = initDataBindings();
			}
		}
	}

}
