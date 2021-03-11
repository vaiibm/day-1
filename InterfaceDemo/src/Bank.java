
public class Bank {
	public static void main(String[] args) {
		IAccount[] account = new IAccount[3];
		account[0] = new SavingAccount();
		account[1] = new FDAccount();
		account[2] = new RecurringFDAccount();
		for (IAccount iAccount : account) {
			iAccount.deposit();
		}
	}
}
