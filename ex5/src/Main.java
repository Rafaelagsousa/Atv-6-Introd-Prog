
import java.util.Scanner;

class Main {

   public static boolean verificaPalindromo(int[] vetor){

    boolean palindromo = true;

    for (int i = 0; i <vetor.length; i++) {

    if(vetor[i] != vetor[vetor.length-1-i]){
    palindromo = false;
    
    }
    
    }      

    return palindromo;
    
    }

    
    public static void main(String[] args) throws Exception {
        
    Scanner teclado = new Scanner(System.in);
        
    int tamanhoVetor = teclado.nextInt(); //Lendo tamanho do vetor

    int vetor[] = new int[tamanhoVetor]; //Criando vetor

    //Iniciando meu vetor
    for (int i = 0; i < tamanhoVetor; i++) {
    vetor[i] = teclado.nextInt();
    }

    teclado.close();

    System.out.println(verificaPalindromo(vetor));
}
}
