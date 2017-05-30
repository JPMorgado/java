package OctalDecimal;
import java.io.*;

public class OctalSemVetor {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int n = 0,dec=0,aux,p=-1,i=1,pot=1;
		while ((n<1)||(n>10000)){
			n = Integer.parseInt(in.readLine());
		}		
		while(n>0){
			aux=n%10;
			p++;
			while(i<=p){
				pot=pot*8;
				i++;
			}
			dec=dec+(aux*pot);
			i=1;
			n=n/10;
			pot=1;
		}
		System.out.printf("%d\n",dec);
	}

}