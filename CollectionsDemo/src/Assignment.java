import java.util.ArrayList;
import java.util.List;

public class Assignment {
	public static void main(String[] args) {
		Account[] accounts = new Account[10];
		for (int i = 0; i < 10; i++) {
			accounts[i] = new Account("Vai" + i, i * 100.5f);
		}
		List<Account> accountList = new ArrayList<Account>();

		for (int i = 0; i < accounts.length; i++) {
			accountList.add(accounts[i]);
		}

		System.out.println("Size of List = " + accountList.size());
		System.out.println("Elements of list = " + accountList);

	}
}
