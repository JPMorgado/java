package URI;
import java.io.*;

public class Salario {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		double vh,SALARY;
		int NUMBER,ht;
		
		NUMBER= Integer.parseInt(in.readLine());
		ht = Integer.parseInt(in.readLine());
		vh = Double.parseDouble(in.readLine());
		SALARY = ht*vh;
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f",NUMBER,SALARY);

	}

}
