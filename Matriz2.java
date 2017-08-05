package FATEC;
import java.io.*;

public class Matriz2 {

	public static void main(String[] args) throws IOException{
		int mat[][] = new int[4][4];
		mat=carregar(mat);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.printf("%d\n",mat[i][j]);
			}
		}
	}

	public static int[][] carregar(int mat[][]) throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(i==j){
					mat[i][j]=(int)Math.pow(4,i);
				}else{
					mat[i][j]=Integer.parseInt(in.readLine());
				}
			}
		}
		return mat;
	}
}
