
import java.io.FileOutputStream;
import java.io.IOException;
 
public class FileOutputStreamDemo {
	public static void main(String[] args) {
		FileOutputStream stream = null;
		try {
			stream = new FileOutputStream("fileio", true);
			
			String str = "\nhello world";
			byte[] b = str.getBytes();
			stream.write(b);
			System.out.println("data written in the file");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream != null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
		
	} 

}
