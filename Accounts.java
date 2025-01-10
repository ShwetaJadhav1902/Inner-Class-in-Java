package com.innerclasses;

public class Accounts {
	private int accId;
	private String accHolder;
	private double accBalance;
	public Accounts(int accId, String accHolder, double accBalance) {
		super();
		this.accId = accId;
		this.accHolder = accHolder;
		this.accBalance = accBalance;
	}
	public int getAccId() {
		return accId;
	}
	public String getAccHolder() {
		return accHolder;
	}
	public double getAccBalance() {
		return accBalance;
	}
	
	public class Locker{
		private int lockerId;
		private String lockerName;
		public Locker(int lockerId, String lockerName) {
			super();
			this.lockerId = lockerId;
			this.lockerName = lockerName;
		}
		public int getlockerId() {
			return lockerId;
		}
		public String getLockerName() {
			return lockerName;
		}
		
	}

}
