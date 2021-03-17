import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	public static void main(String[] args) {
		// demo1();
		readingLine();

	}

	private static void readingLine()

	{
		try {
			Reader reader = new FileReader("input.txt");
			BufferedReader bufferReader = new BufferedReader(reader);
			String line = bufferReader.readLine();
			// int character = reader.read();
			while (line != null) {
				System.out.println(line);
				// System.out.println(character);

				line = bufferReader.readLine();
			}
			// System.out.println(character);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void demo1() {
		try {
			Reader reader = new FileReader("input.txt");
			int character = reader.read();
			while (character != -1) {
				System.out.println((char) character);
				System.out.println(character);

				character = reader.read();
			}
			System.out.println(character);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}