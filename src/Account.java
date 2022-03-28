public abstract class Account extends IAccount {

    private static final int DEFAULT_AGENCY = 1;
    private static int SEQUENCIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.DEFAULT_AGENCY;
        this.number = SEQUENCIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        do{
            System.out.println("Your withdraw amount is superior to your balance.");
            System.out.println("Please insert another value.");
        } while(value > balance);
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        do{
            System.out.println("Your withdraw amount is superior to your balance.");
            System.out.println("Please insert another value.");
        } while(value > balance);
        
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Client: %s", this.client.getName()));
        System.out.println(String.format("Agency: %d", this.agency));
        System.out.println(String.format("Number: %d", this.number));
        System.out.println(String.format("Balance: %.2f", this.balance));
    }

    public abstract void printBalance();
}