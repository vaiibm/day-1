import java.util.ArrayList;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		int a = 1;
		Integer b = a;
		a = b;

		System.out.println(b);
		List<Integer> numbeers = new ArrayList<Integer>();
		numbeers.add(11);
		System.out.println(numbeers);
		 for (int i = 0; i < 4; i++) {
		      switch (i) {
		        case 0: System.out.print("A");
		        case 1: System.out.print("B");
		        case 2: System.out.print("C");}}
	}
}
