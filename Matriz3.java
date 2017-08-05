package FATEC;

public class Matriz3 {

	public static void main(String[] args){
		int mat[][] = new int[2][8];
		int soma = valor(mat);
		System.out.printf("%d\n",soma);
	}
	
	public static int valor(int mat[][]){
		mat[0][0]=1;
		mat[1][0]=1;
		int soma=mat[1][0];
		for(int j=1; j<8; j++){
			for(int i=0;i<2;i++){
				if(i==1){
					mat[i][j]=mat[i][j-1]+mat[i][j-1];
					soma+=mat[i][j];
				}else{
					mat[i][j]=j+1;
				}
						
			}
		}
		return soma;
	}

}
