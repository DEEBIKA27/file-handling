import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInput {
	public static void main(String[] args) {
		BufferedReader fromUser = null;
		
		fromUser = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name: ");
		try {
			String name = fromUser.readLine();
			System.out.println("hi " + name);
			
			System.out.println("enter first number: ");
			int num1 = Integer.parseInt(fromUser.readLine());
			
			System.out.println("enter second number: ");
			int num2 = Integer.parseInt(fromUser.readLine());
			
			int sum = num1 + num2;
			System.out.println("the result is " + sum);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
