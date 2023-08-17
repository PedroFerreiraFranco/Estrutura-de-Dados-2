
package javasorts;

import java.util.Random;
import java.util.Scanner;


public class JavaSorts {
    
    static int menuEntrada(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("\n\n");
        System.out.println("1-Gerar dados");
        System.out.println("2-Entrar com dados");
        op = scanner.nextInt();
        return op;
    }

        static int menuOpcoes(){
        Scanner scanner = new Scanner(System.in);
        int op;
        System.out.println("\n\n");
        System.out.println("1-bSort");
        System.out.println("2-bSortComentado");
        System.out.println("3-sSortComentado");
        System.out.println("4-iSort");
        System.out.println("5-iSortComentado"); 
        op = scanner.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
        int tamanho, op, opMenu;
        System.out.println("Tamanho do vetor: ");
        tamanho = scanner.nextInt();
        int[] vetor = new int [tamanho];
        
        op = menuEntrada();
        
        switch(op){
            case 1: for(int i=0;i<vetor.length;i++)
                    vetor[i] = rand.nextInt(100);
            break;
            
            case 2: System.out.println("Dados do vetor: ");
                    for(int i=0;i<vetor.length;i++)
                    vetor[i] = scanner.nextInt();
            break;
        }//fim switch
        
        opMenu = menuOpcoes();
        switch(opMenu){
            case 1:         
                System.out.println("Vetor original: ");
                printArray(vetor);
                BubbleSort.bSort(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor); 
            break;
            
            case 2:
                System.out.println("Vetor original: ");
                printArray(vetor);
                BubbleSort.bSortDescComentado(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor); 
            break;
            
            case 3:
                System.out.println("Vetor original: ");
                printArray(vetor);
                SelectionSort.sSortComentado(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor);       
            break;    
            
            case 4:
                System.out.println("Vetor original: ");
                printArray(vetor);
                InsertionSort.iSort(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor);       
            break;    
            
            case 5:
                System.out.println("Vetor original: ");
                printArray(vetor);
                InsertionSort.iSortComentado(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor);       
            break;    
        }
        
    }
    
    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+"| ");
        
        System.out.println("\n");
    }//fim Array
    
}