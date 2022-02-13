
import java.util.Scanner;

 class Main {


    public static void main(String[] args) {
    
    Scanner teclado = new Scanner(System.in);
    
    int vetor [] = new int [5];
    
    //leitura do vetor;
    
    for(int i=0; i < 5; i++){
    vetor[i]= teclado.nextInt();
    }
    
    // valor antigo
    System.out.print("Vetor inicial: ");
    for (int i = 0; i < vetor.length; i++){
    System.out.print(vetor[i]+" ");
    }
    
    // Aumento
    for (int i= 0; i < 5; i++){
       if(i % 2 == 0){
        vetor[i] = vetor[i] +  (int) (vetor[i] *0.02);
        
    } 
       else{

        vetor[i] = vetor[i] +  (int) (vetor[i] *0.05);
    }
    }
    //vetor resultante
    System.out.print("\n\nVetor resultante: ");
    for (int i = 0; i < vetor.length; i++) {
        System.out.print(vetor[i]+" ");
    }
    }
 }
    
    

