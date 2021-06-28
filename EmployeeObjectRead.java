import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeObjectRead {
	public static void main(String[] args) {
		ObjectInputStream stream = null;
			try {
				stream = new ObjectInputStream(new FileInputStream("empIO"));
				Employee emp = (Employee) stream.readObject();
				System.out.println(emp);
			
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}  finally {
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

