package hm.edu.software.architecture.design.patterns.abstracttest;

public interface ATM {

    /**
     * This method returns the specific amount of money of a bank account
     * If the balance is smaller than the requested amount of money, then 0 should be returned.
     *
     * @return The requested amount of money.
     */
    int getMoney(int amount);
}
