package Sort;
import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[20];
		for(int i=0;i<20;i++){
			vetor[i] = leia.nextInt(); 		
		}
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				if(vetor[j]>vetor[i]){
					 int k = vetor[i];
					 vetor[i]=vetor[j];
					 vetor[j]=k;
				}
				
			}
		}
		
		for(int i=0;i<20;i++){
			System.out.println(vetor[i]);
		}
	}

}
