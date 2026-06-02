class Bank {
	int amount;
	int balance;
	public Bank() {
		
	}
	public Bank(int v1,int v2)
	{
		this.amount=v1;
		this.balance=v2;
	}
	public void deposit(int amount) {
		System.out.println("the amount "+amount+" deposited");
		balance=balance+amount;
		System.out.println("the bank balance is " +balance);
	}
	public void withdraw(int amount){
		if(amount<=balance)
		{
			System.out.println("the amount "+amount+" withdrawed");
			balance=balance-amount;
			System.out.println("the remaining balance is "+balance);
		}
		else
		{
			System.out.println("in sufficient funds");
		}
	}
	public void checkbalance(int balance)
	{
		System.out.println("the balance available is"+balance);
	}


}

class Customer extends Bank{
	v1=5000;
	v2=10000;
	public Customer(int v1,int v2)
	{
		super(v1,v2);
	}
	public static void main(String args[])
	{
		Customer c1= new Customer(5000,10000);
		c1.checkbalance(10000);
		c1.deposit(2000);
		c1.withdraw(2000);
	}
}