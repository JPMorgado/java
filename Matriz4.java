package FATEC;

public class Matriz4 {

	public static void main(String[] args) {
		int mat[][] = new int[8][8];
		mat=carregar(mat);
		exibir(mat);
	}
	
	public static int[][] carregar(int mat[][]){
		int z=1;
		while(z<5){
			for(int i=z-1;i<9-z;i++){
				for(int j=z-1;j<9-z;j++){
					mat[i][j]=z;
				}
			}
			z++;
		}
		return mat;
	}

	public static void exibir(int mat[][]){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				System.out.printf("%d",mat[i][j]);	
			}
		}
	}
}