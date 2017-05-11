package URI;
import java.io.*;

public class Circulo {
    
    public static void main(String[] args)throws IOException{
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
        double A, raio;
        raio = Double.parseDouble(in.readLine());
        A= (raio*raio)*3.14159;
        System.out.printf("A=%.4f\n",A);
        
    }
    
}