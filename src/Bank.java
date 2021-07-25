class BankException extends Exception
{
	public BankException(String e)
	{
		super(e);
	}
}
public class Bank {
	private int balance;
	private int account;
	public int getBalance() throws BankException{
		if(balance<10000)
		{
			throw new BankException("Minimum Balance is low");
		}
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	public static void main(String args[])
	{
		Bank obj=new Bank();
		obj.setAccount(1234);
		obj.setBalance(2000);
		try
		{
			System.out.println(obj.getAccount());
			System.out.println(obj.getBalance());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
