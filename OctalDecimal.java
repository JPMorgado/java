package OctalDecimal;
import java.io.*;

public class OctalDecimal {

	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int vet[] = new int[10];
		int n = 0,i=0,j,octal=0;
		while ((n<1)||(n>10000)){
			n = Integer.parseInt(in.readLine());
		}
		while (n>0){
			vet[i]=n%10;
			n/=10;
			i+=1;
		}
		j=i;
		i=0;
		while (i<=j) {
			octal+=vet[i]*Math.pow(8,i);
			i+=1;
		}
		System.out.printf("%d\n",octal);
	}

}
