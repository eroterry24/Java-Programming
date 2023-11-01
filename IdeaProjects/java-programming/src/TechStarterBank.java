public class TechStarterBank {

    private double balance = 12000.0 - 50;


    public double sendMoney(int amountToSend) throws Exception {

        if (amountToSend > balance) {
            throw new Exception("Insufficient balance");

        }
        double total = balance - amountToSend;
        System.out.println("Amount transfer successfully and your balance is" + total);
        return total;


    }
}


