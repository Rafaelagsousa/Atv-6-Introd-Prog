
import java.util.Scanner;

class Main {
    
public static void imprimeTriplo(int n, int n2, int n3) {
    
System.out.println(n*3);
System.out.println(n2*3);
System.out.println(n3*3);
    
}
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(System.in);    
    
    int n, n2, n3;  
    
    n = teclado.nextInt();
    n2 = teclado.nextInt();
    n3 = teclado.nextInt();
    
    teclado.close();
    
    imprimeTriplo(n,n2,n3);
 }

}
