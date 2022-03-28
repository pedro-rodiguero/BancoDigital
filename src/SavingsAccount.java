public class SavingsAccount extends Account {

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printBalance() {
        System.out.println("=== Savings account balance ===");
        super.printCommonInfo();
    }
}