public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printBalance() {
        System.out.println("=== Checking account balance ===");
        super.printCommonInfo();
    }

}