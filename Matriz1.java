package FATEC;
import java.io.*;

public class Matriz1 {

	public static void main(String[] args)throws IOException{
		int mat[][] = new int[4][3];
		mat=receber(mat);
		int soma[] = new int[3];
		soma = cadames(mat);
		int soma2[] = new int[4];
		soma2 = cadasemana(mat);
		int somatotal = prodmes(mat);
		for (int i=0;i<3;i++){
			System.out.printf("Soma do mes: %d\n%d\n",i,soma[i]);
		}
		for (int i=0;i<4;i++){
			System.out.printf("Soma da semana: %d\n%d\n",i,soma2[i]);
		}
		System.out.printf("Soma Total: %d\n",somatotal);
		
	}
	
	public static int[][] receber(int mat[][]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				mat[i][j]=Integer.parseInt(in.readLine());
			}
		}
		return mat;
	}
	
	public static int[] cadames(int mat[][]){
		int soma[] = new int[3];
		for(int j=0;j<3;j++){
			for(int i=0;i<4;i++){
				soma[j]+=mat[i][j];
			}
		}
		return soma;
	}
	
	public static int[] cadasemana(int mat[][]){
		int soma[] = new int[4];
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				soma[i]+=mat[i][j];
			}
		}
		return soma;
	}
	
	public static int prodmes(int mat[][]){
		int soma=0;
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				soma+=mat[i][j];
			}
		}
		return soma;
	}

}
