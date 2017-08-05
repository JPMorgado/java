package FATEC;
import java.io.*;

public class vetor4 {

	public static void main(String[] args)throws IOException{
		float vet[] = new float[30];
		int pos[] = new int[30];
		contar(vet,pos);
	}
	
	public static void contar(float vet[], int pos[])throws IOException{
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		float media=0;
		for(int i=0;i<30;i++){
			vet[i]=Integer.parseInt(in.readLine());
			media+=vet[i];
		}
		media/=30;
		int am=0;
		for(int i=0;i<30;i++){
			if(vet[i]>=media){
				am++;
			}else if(vet[i]<media){
				pos[i]=i;
			}
		}
		System.out.printf("%f\n%d\n",media,am);
		for(int i=0;i<30;i++){
			if(pos[i]!=0){
				System.out.printf("%d\n",pos[i]);
			}
		}
	}
	
}
