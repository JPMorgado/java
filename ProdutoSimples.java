package URI;
import java.io.*;

public class ProdutoSimples {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        int A,B,PROD;
        A=Integer.parseInt(in.readLine());
        B=Integer.parseInt(in.readLine());
        PROD=A*B;
        System.out.printf("PROD = %d\n",PROD);
	}	

}