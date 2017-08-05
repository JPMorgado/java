package FATEC;
import java.io.*;

public class Vetor3 {

	public static void main(String[] args)throws IOException{
		int vet1[] = new int[3];
		int vet2[] = new int[3];
		int vet3[] = new int[6];
		vet3=concatenar(vet1,vet2,vet3);
		exibir(vet3);
	}
	
	public static int[] concatenar(int vet1[], int vet2[], int vet3[])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for(int i=0;i<3;i++){
			vet1[i]=Integer.parseInt(in.readLine());
			vet2[i]=Integer.parseInt(in.readLine());
			vet3[i]=vet1[i];
			vet3[i+3]=vet2[i];
		}
		return vet3;
	}
	
	public static void exibir(int vet3[]){
		for(int i=0;i<6;i++){
			System.out.printf("%d\n",vet3[i]);
		}
	}

}
