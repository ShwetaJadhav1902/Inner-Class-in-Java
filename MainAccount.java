package com.innerclasses;

public class MainAccount {
	public static void main(String[] args) {
		
		Accounts a=new Accounts(123,"Shweta",43435622);
		Accounts.Locker l=a.new Locker(536,"treasure");
		
		System.out.println("Account Information");
	    System.out.println("Account no:"+a.getAccId());
	    System.out.println("Account holder:"+a.getAccHolder());
	    System.out.println("Account no:"+a.getAccBalance());
	    System.out.println("Account no:"+l.getlockerId());
	    System.out.println("Account no:"+l.getLockerName());
	}
}
