import java.io.IOException;

public class ReadFromConsole {
	public static void main(String[] args) {

		byte[] input = new byte[6];
		try {
			System.in.read(input);
			int i = 0;
			while (input[i] != '\0') {

				System.out.println((char) input[i]);
				i++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
		}
		System.out.println(input);
	}
}