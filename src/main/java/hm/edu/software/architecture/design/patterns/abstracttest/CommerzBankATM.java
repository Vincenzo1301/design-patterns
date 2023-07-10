package hm.edu.software.architecture.design.patterns.abstracttest;

public class CommerzBankATM implements ATM {

    private int balance = 100;

    @Override
    public int getMoney(int amount) {
        if ((balance - amount) < 0) {
            return 0;
        }
        return amount;
    }
}
