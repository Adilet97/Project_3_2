public class BankAccount {
    private double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
    }

    public void withdraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Сумма для снятия превышает остаток на счете", amount);
        }
        amount -= sum;
    }
}
