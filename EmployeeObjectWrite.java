
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeObjectWrite {
	public static void main(String[] args) {
		Employee employee = new Employee(101, "deeb", "developer");
		 
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("empIO"));
			stream.writeObject(employee);
			System.out.println("employee object written in the file");
		
		}  catch (IOException e) {
			
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
