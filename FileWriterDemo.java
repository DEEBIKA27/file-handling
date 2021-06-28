import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
	public static void main(String[] args) {
		FileWriter output = null;
		try {
			output = new FileWriter("file1io");
			String data = "this is the data written in the output file";
			output.write(data);
			System.out.println("data written in the file");
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			if(output != null) {
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
		
	}
}
