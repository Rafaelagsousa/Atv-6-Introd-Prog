
import java.util.Scanner;
class Main {

public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);
        
float matriz[][] = new float[3][2];

for ( int i = 0; i < 3; i++) {
                        
for (int j = 0; j < 2; j++) { 
matriz[i][j] = teclado.nextFloat();
    
}
}

int linha = teclado.nextInt();
float soma =0;                           
for (int j = 0; j < 2; j++) {          
            
soma+= matriz[linha][j];
}

System.out.println("Matriz:");
    
for ( int i = 0; i < 3; i++) {                    
for (int j = 0; j < 2; j++) {
System.out.print(matriz[i][j]+" ");
    
}     
System.out.println();
}
System.out.println("\nSoma dos elementos da linha "+ linha +":\n"+soma);   
}
}