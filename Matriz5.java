package FATEC;
import java.io.*;

public class Matriz5 {

	public static void main(String[] args)throws IOException{
		int mat[][] = new int[8][8];
		int vet[] = new int[8];
		vet=preencher(mat);
		soma(vet);
	}
	
	public static int[] preencher(int mat[][])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		int vet[] = new int[8];
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				mat[i][j]=Integer.parseInt(in.readLine());
				vet[mat[i][j]]++;
			}
		}
		return vet;
	}
	
	public static void soma(int vet[]){
		int soma=0;
		for(int i=1;i<8;i++){
			soma += vet[i];
		}
		System.out.printf("%d\n",soma);
	}

}