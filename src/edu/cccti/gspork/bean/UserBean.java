package edu.cccti.gspork.bean;

import java.io.Serializable;

/*
 *  Fields returned by Google Data report:
 * 
 *  date, account_id, account_name, status, quota_in_mb,
 *  usage_in_bytes, primary_account_id, primary_account_name, creation_date,
 *  last_login_date, last_web_mail_date, surname, given_name,
 *  service_tier, channel, suspension_reason, last_pop_date, creation_time,
 *  last_login_time, last_web_mail_time, last_pop_time
 *
 */
public class UserBean implements Serializable, Comparable<UserBean> {

	private static final long serialVersionUID = 5984377484155244252L;

	String reportDate;
	String accountID;
	String accountName;
	String status;
	String quotaInMB;

	String usageInBytes;
	String primaryAccountID;
	String primaryAccountName;
	String creationDate;
	String lastLoginDate;

	String lastWebMailDate;
	String surname;
	String givenName;
	String serviceTier;
	String channel;

	String suspensionReason;
	String lastPOPDate;
	String creationTime;
	String lastLoginTime;
	String lastWebMailTime;

	String lastPOPTime;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserBean other = (UserBean) obj;
		if (accountID == null) {
			if (other.accountID != null)
				return false;
		} else if (!accountID.equals(other.accountID))
			return false;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (channel == null) {
			if (other.channel != null)
				return false;
		} else if (!channel.equals(other.channel))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (creationTime == null) {
			if (other.creationTime != null)
				return false;
		} else if (!creationTime.equals(other.creationTime))
			return false;
		if (givenName == null) {
			if (other.givenName != null)
				return false;
		} else if (!givenName.equals(other.givenName))
			return false;
		if (lastLoginDate == null) {
			if (other.lastLoginDate != null)
				return false;
		} else if (!lastLoginDate.equals(other.lastLoginDate))
			return false;
		if (lastLoginTime == null) {
			if (other.lastLoginTime != null)
				return false;
		} else if (!lastLoginTime.equals(other.lastLoginTime))
			return false;
		if (lastPOPDate == null) {
			if (other.lastPOPDate != null)
				return false;
		} else if (!lastPOPDate.equals(other.lastPOPDate))
			return false;
		if (lastPOPTime == null) {
			if (other.lastPOPTime != null)
				return false;
		} else if (!lastPOPTime.equals(other.lastPOPTime))
			return false;
		if (lastWebMailDate == null) {
			if (other.lastWebMailDate != null)
				return false;
		} else if (!lastWebMailDate.equals(other.lastWebMailDate))
			return false;
		if (lastWebMailTime == null) {
			if (other.lastWebMailTime != null)
				return false;
		} else if (!lastWebMailTime.equals(other.lastWebMailTime))
			return false;
		if (primaryAccountID == null) {
			if (other.primaryAccountID != null)
				return false;
		} else if (!primaryAccountID.equals(other.primaryAccountID))
			return false;
		if (primaryAccountName == null) {
			if (other.primaryAccountName != null)
				return false;
		} else if (!primaryAccountName.equals(other.primaryAccountName))
			return false;
		if (quotaInMB == null) {
			if (other.quotaInMB != null)
				return false;
		} else if (!quotaInMB.equals(other.quotaInMB))
			return false;
		if (reportDate == null) {
			if (other.reportDate != null)
				return false;
		} else if (!reportDate.equals(other.reportDate))
			return false;
		if (serviceTier == null) {
			if (other.serviceTier != null)
				return false;
		} else if (!serviceTier.equals(other.serviceTier))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		if (suspensionReason == null) {
			if (other.suspensionReason != null)
				return false;
		} else if (!suspensionReason.equals(other.suspensionReason))
			return false;
		if (usageInBytes == null) {
			if (other.usageInBytes != null)
				return false;
		} else if (!usageInBytes.equals(other.usageInBytes))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		return this.getAccountName().hashCode();
	}

	/**
     * Provides sorting algorithms with a comparison method for natural ordering
     * of UserBean elements
     */
    @Override
    public int compareTo(UserBean that)
    {
        return this.accountName.compareTo(that.accountName);
    }

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	/****
	 * @return 16-character HEX unique identifier
	 ****/
	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	/****
	 * @return Email address as the account name
	 */
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getQuotaInMB() {
		return quotaInMB;
	}

	public void setQuotaInMB(String quotaInMB) {
		this.quotaInMB = quotaInMB;
	}

	public String getUsageInBytes() {
		return usageInBytes;
	}

	public void setUsageInBytes(String usageInBytes) {
		this.usageInBytes = usageInBytes;
	}

	public String getPrimaryAccountID() {
		return primaryAccountID;
	}

	public void setPrimaryAccountID(String primaryAccountID) {
		this.primaryAccountID = primaryAccountID;
	}

	public String getPrimaryAccountName() {
		return primaryAccountName;
	}

	public void setPrimaryAccountName(String primaryAccountName) {
		this.primaryAccountName = primaryAccountName;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(String lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastWebMailDate() {
		return lastWebMailDate;
	}

	public void setLastWebMailDate(String lastWebMailDate) {
		this.lastWebMailDate = lastWebMailDate;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGivenName() {
		return givenName;
	}

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}

	public String getServiceTier() {
		return serviceTier;
	}

	public void setServiceTier(String serviceTier) {
		this.serviceTier = serviceTier;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getSuspensionReason() {
		return suspensionReason;
	}

	public void setSuspensionReason(String suspensionReason) {
		this.suspensionReason = suspensionReason;
	}

	public String getLastPOPDate() {
		return lastPOPDate;
	}

	public void setLastPOPDate(String lastPOPDate) {
		this.lastPOPDate = lastPOPDate;
	}

	public String getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(String creationTime) {
		this.creationTime = creationTime;
	}

	public String getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(String lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastWebMailTime() {
		return lastWebMailTime;
	}

	public void setLastWebMailTime(String lastWebMailTime) {
		this.lastWebMailTime = lastWebMailTime;
	}

	public String getLastPOPTime() {
		return lastPOPTime;
	}

	public void setLastPOPTime(String lastPOPTime) {
		this.lastPOPTime = lastPOPTime;
	}

}
