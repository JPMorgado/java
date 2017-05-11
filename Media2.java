package URI;
import java.io.*;

public class Media2 {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		double A,B,C,MEDIA;
		A=Double.parseDouble(in.readLine());
		B=Double.parseDouble(in.readLine());
		C=Double.parseDouble(in.readLine());
		MEDIA=(A*0.2)+(B*0.3)+(C*0.5);
		System.out.printf("MEDIA = %.1f\n",MEDIA);
				
	}

}
