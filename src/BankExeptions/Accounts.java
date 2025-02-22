package BankExeptions;

public class Accounts {
    private double balance = 0.0;
    private boolean active = true;

    public void credit(double amt) {
        balance += amt;
    }
    public void debit (double amt) {
        if(!active){
            throw new AccountDeactivatedExeption();
        }

        if (amt > balance) {
            throw new InsufflationException();
        }
        balance -= amt;
    }
    public double getBalance() throws SomethingIsReallyWrongExeption {
        if(balance<0){
            throw new SomethingIsReallyWrongExeption("Imposible! Balance < 0");

        }
        return balance;
    }

    public void deactivate(){
        this.active = false;
    }

    public void activate() {
        this.active = true;
    }
}
