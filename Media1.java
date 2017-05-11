package URI;
import java.io.*;

public class Media1 {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		double A,B,MEDIA;
		A=Double.parseDouble(in.readLine());
		B=Double.parseDouble(in.readLine());
		MEDIA=((A*3.5)+(B*7.5))/11;
		System.out.printf("MEDIA = %.5f",MEDIA);
		
	}

}
