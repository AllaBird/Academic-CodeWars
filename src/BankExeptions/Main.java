package BankExeptions;

public class Main {


    private static String debitFromAccount(Accounts acct, double amt) {
        try {
            acct.debit(amt);
            return "Ok";

        } catch (InsufflationException e) {
            return "Not enough money";
        } catch (AccountDeactivatedExeption e) {
            return "Account is not active";
        } catch (BankingException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) throws SomethingIsReallyWrongExeption {
        Accounts account = new Accounts();
        try {
             System.out.println(account.getBalance());
            account.credit(100);
            System.out.println(account.getBalance());
            account.deactivate();
            System.out.println(debitFromAccount(account, 90));
            System.out.println(account.getBalance());
            account.activate();
            System.out.println(debitFromAccount(account, 200));
            System.out.println(account.getBalance());

            account.debit(300);
        }catch (SomethingIsReallyWrongExeption e){
            e.printStackTrace();
        }
        }
    }