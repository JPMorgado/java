package FATEC;
import java.io.*;

public class Vetor2 {

	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int vet[] = new int[100];
		vet[0] = Integer.parseInt(in.readLine());
		for (int i=1;i<100;i++){
			vet[i] = Integer.parseInt(in.readLine());
		}
		int maior=Maior(vet);
		int menor=Menor(vet);
		System.out.printf("%d\n%d\n",maior,menor);
	}
	
	public static int Maior(int v[]){
		int maior=0;
		for(int i=0;i<100;i++){
			if(v[i]>maior){
				maior=v[i];
			}
		}
		return maior;
	}
	
	public static int Menor(int v[]){
		int menor=v[0];
		for(int i=1;i<100;i++){
			if(v[i]<menor){
				menor=v[i];
			}
		}
		return menor;
	}

}
