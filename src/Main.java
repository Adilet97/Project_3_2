public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(15000);
        while (true) {
            try {
                account.withdraw(6000);
                System.out.println("Снято 6000 сом. Остаток на счете: "+account.getAmount() + " сом.");
            } catch (LimitException e) {
                double remainingAmount = e.getRemainingAmount();
                System.out.println("Снято " + remainingAmount + " сом. Остаток на счете: 0 сом.");
                break;
            }
        }
    }
}