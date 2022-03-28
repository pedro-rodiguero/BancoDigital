public abstract class IAccount {
    public abstract void withdraw(double value);

    public abstract void deposit(double value);

    public abstract void transfer(double value, IAccount destinationAccount);
}
