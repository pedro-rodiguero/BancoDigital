public class Main {

    public static void main(String[] args) {
        Client peter = new Client();
        peter.setName("Peter");

        Account checking = new CheckingAccount(peter);
        Account savings = new SavingsAccount(peter);

        checking.deposit(200);
        checking.transfer(10, savings);

        checking.printBalance();
        savings.printBalance();
    }

}