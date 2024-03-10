package my.Learning;

public class VipAccount {

	private String name;
	private double creditLimit;
	private String emailAddress;
	
	
	public VipAccount()
	{
		this("madhan",1000,"madhan@gmail.com");
	}
	
	public VipAccount(String name, double creditLimit)
	{
		this(name,creditLimit,"baddydhan@gmail.com");
		
	}
	
	public VipAccount(String name, double creditLimit, String emailAddress)
	{
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public String getEmailAddress() {
		return emailAddress;
	}
	
	
}
