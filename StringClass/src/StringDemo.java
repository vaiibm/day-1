
public class StringDemo {
public static void main(String[] args) {
	witoutStringPool();
	withStringBuilder();
	
}
private static void witoutStringPool() {
	String s1 = new String("IBM");
	String s2 = new String("IBM");
	System.out.println(s1==s2);
}

private static void withStringBuilder() {
	StringBuilder s3 = new StringBuilder("IBM");
	StringBuilder s4 = new StringBuilder("IBM");
	System.out.println(s3==s4);
}
}
