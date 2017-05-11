package URI;
import java.io.*;

public class SalarioBonus {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		String VENDEDOR; 
		Double SALARY,MONTANTE;
		VENDEDOR = in.readLine();
		SALARY = Double.parseDouble(in.readLine());
		MONTANTE = Double.parseDouble(in.readLine());
		SALARY += (MONTANTE*0.15);
		System.out.printf("TOTAL = R$ %.2f\n",SALARY);		
	}

}
