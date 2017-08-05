package FATEC;
import java.io.*;

public class Vetor1 {

	public static void main(String[] args) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int vet[] = new int[10];
		for(int i=0; i<10;i++){
			vet[i]=Integer.parseInt(in.readLine());
			
		}
		float media=Media(vet);
		System.out.printf("%.2f\n",media);
		int impar=Impares(vet);
		System.out.printf("%d\n",impar);
	}
	
	public static float Media(int v[]){
		int cont=0;
		float med=0;
		for(int i=0;i<10;i++){
			if((v[i]>=10)&&(v[i]<=200)){
				med=med+v[i];
				cont++;
			} 
		}
		med=med/cont;
		return med;
	}
	public static int Impares(int v[]){
		int impares=0;
		for(int i=0;i<10;i++){
			if((v[i]%2)!=0){
				impares=impares+v[i];
			}
		}
		return impares;
	}

}
