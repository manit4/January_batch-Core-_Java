import java.io.*;
class Obaro {

	public static void main(String args[]) {
		
		try {
			File file = new File("b.txt");
			FileReader reader = new FileReader(file);
			System.out.println(reader.read());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}