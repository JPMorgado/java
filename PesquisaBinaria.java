package Sort;
import java.io.*;

public class PesquisaBinaria {
	
	static boolean achado;
	
	public static void main(String[] args)throws IOException {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int vetor[] = new int[20];
		for(int i=0;i<20;i++){
			vetor[i] = Integer.parseInt(in.readLine()); 	
		}
		vetor=organizar(vetor);
		System.out.println("Digite um valor para pesquisa:");
		int pesq = Integer.parseInt(in.readLine());
		achado=false;
		int meio=encontrar(vetor,pesq);
		if(achado==true){
			System.out.println("valor existe, na posicao:" + " " + meio);
		}else{
			System.out.println("valor não existe no vetor");
		}
	}
	
	public static int[] organizar(int vetor[]){
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				if(vetor[j]>vetor[i]){
					 int k = vetor[i];
					 vetor[i]=vetor[j];
					 vetor[j]=k;
				}		
			}
		}
		return vetor;
	}
	
	public static int encontrar(int vetor[], int pesq){
		int maior=19,menor=0;
		int meio=(maior+menor)/2;
		while(menor<=maior){
			if (pesq==vetor[meio]){
				achado=true;
				return meio;
			} else if (vetor[meio]<pesq){
				menor=meio+1;
			} else {
				maior=meio-1;
			}
			meio=(maior+menor)/2;
		}
		achado=false;
		return meio;
	}
	
}
