package FATEC;
import java.io.*;

public class Vetor5 {

	public static void main(String[] args) throws IOException{
		int vet[] = new int[20];
		vet = receber(vet);
		soma(vet);
	}
	
	public static int[] receber(int vet[])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for(int i=0;i<20;i++){
			vet[i] = Integer.parseInt(in.readLine());
		}
		return vet;
	}
	
	public static void soma(int vet[]){
		int soma[] = new int[10];
		for(int i=0;i<10;i++){
			soma[i] = vet[i] - vet[19-i];
			System.out.printf("%d\n",soma[i]);
		}
	}

}
