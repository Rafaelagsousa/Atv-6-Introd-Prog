
import java.io.BufferedInputStream;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
    Scanner teclado = new Scanner(new BufferedInputStream(System.in));
    
    int indice = teclado.nextInt();
    int vet[] = new int[indice], temporario;
    
    for (int i = 0; i < vet.length; i++) {
        vet[i] = teclado.nextInt();
        }
    teclado.close();
    
    System.out.print("Numeros informados: ");
    
    for (int i = 0; i < vet.length; i++) {
        System.out.print(vet[i]+", ");
        }
    for (int i = 0; i < vet.length; i++) {
    for (int j = 0; j < (vet.length-1); j++) {
        if (vet[j]>vet[j+1]) {
            temporario = vet[j];
            vet[j] = vet[j+1];
            vet[j+1] = temporario;
            }
        }
    }
    System.out.println("\n");
    System.out.print("Numeros em ordem crescente: ");
    
    for (int i = 0; i < vet.length; i++) {
    System.out.print(vet[i]+", ");
        }
    }
    
}
