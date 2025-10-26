class Bank {
    public long[] bal;

    public Bank(long[] balance) {
        bal = balance.clone();
    }

    public boolean transfer(int account1, int account2, long money) {
        if (account1 <= bal.length && account2 <= bal.length && bal[account1 - 1] >= money) {
            bal[account2 - 1] += money;
            bal[account1 - 1] -= money;
            return true;
        } else
            return false;
    }

    public boolean deposit(int account, long money) {
        if (account <= bal.length) {
            bal[account - 1] += money;
            return true;
        } else
            return false;

    }

    public boolean withdraw(int account, long money) {
        if (account <= bal.length && bal[account - 1] >= money) {
            bal[account - 1] -= money;
            return true;
        }
        return false;
    }
}