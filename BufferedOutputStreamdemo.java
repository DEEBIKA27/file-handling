import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamdemo {
	public static void main(String[] args) {
		BufferedOutputStream stream = null;
		try {
		stream = new BufferedOutputStream(new FileOutputStream("bufferIO"));
		String s = "this is to be written using buffer class";
		stream.write(s.getBytes());
		System.out.println("data written in the file using buffer");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(stream!=null) {
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			}
		}
	}
}
