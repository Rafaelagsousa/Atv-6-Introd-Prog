
import java.util.Scanner;

class Main {

    public static float somaLinha(float matriz[][], int linha){
        
        float soma=0;
        
        for (int j = 0; j < 2; j++) { //colunas 
            soma+= matriz[linha][j];
        }

        return soma;
    }
        
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        
        float matriz[][] = new float[3][2];

        //Lendo Matriz
        for ( int i = 0; i < 3; i++) { //linhas                        
            for (int j = 0; j < 2; j++) { //colunas
                matriz[i][j] = teclado.nextFloat();
            }
        }
        
        //Ler linha do usuario
        int linha = teclado.nextInt();
           
        teclado.close();

        //Mostra Matriz
        System.out.println("Matriz:");
        for ( int i = 0; i < 3; i++) { //linhas
                        
            for (int j = 0; j < 2; j++) { //colunas
                System.out.print(matriz[i][j]+" ");
            }
            
            System.out.println();

        }

        System.out.println("\nSoma dos elementos da linha "+ linha +":\n"+somaLinha(matriz, linha));
    
}}
