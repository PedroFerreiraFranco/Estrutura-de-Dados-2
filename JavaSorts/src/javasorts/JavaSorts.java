
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
        System.out.println("3-sSort");
        System.out.println("4-sSortComentado");
        System.out.println("5-iSort");
        System.out.println("6-iSortComentado"); 
        op = scanner.nextInt();
        return op;
    }
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Random rand = new Random();
        int tamanho, op, opMenu;
        long tempoInicial, tempoFinal;
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
                tempoInicial = System.currentTimeMillis();//pega o tempo inicial
                BubbleSort.bSort(vetor);
                tempoFinal = System.currentTimeMillis();//pega o tempo final
                System.out.println("\nVetor Ordenado: ");
                printArray(vetor); 
                System.out.println("Comparações: "+BubbleSort.compara);
                System.out.println("Trocas: "+BubbleSort.trocas);
                System.out.println("Tempo: "+(tempoFinal-tempoInicial));
                
            break;
            
            case 2:
                System.out.println("\nVetor original: ");
                printArray(vetor);
                BubbleSort.bSortDescComentado(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor); 
            break;
            
            case 3:
               // System.out.println("Vetor original: ");
                //printArray(vetor);
                tempoInicial = System.currentTimeMillis();//pega o tempo inicial
                SelectionSort.sSort(vetor);
                tempoFinal = System.currentTimeMillis();//pega o tempo final
                //System.out.println("\nVetor Ordenado: ");
                //printArray(vetor);       
                System.out.println("Comparações: "+SelectionSort.compara);
                System.out.println("Trocas: "+SelectionSort.trocas);
                System.out.println("Tempo: "+(tempoFinal-tempoInicial));    
            break;
            
            case 4:
                System.out.println("\nVetor original: ");
                printArray(vetor);
                SelectionSort.sSortComentado(vetor);
                System.out.println("Vetor Ordenado: ");
                printArray(vetor);       
            break;    
            
            case 5:
               // System.out.println("\nVetor original: ");
                //printArray(vetor);
                tempoInicial = System.currentTimeMillis();//pega o tempo inicial
                InsertionSort.iSort(vetor);
                tempoFinal = System.currentTimeMillis();//pega o tempo final
               // System.out.println("Vetor Ordenado: ");
                //printArray(vetor);   
                System.out.println("Comparações: "+InsertionSort.compara);
                System.out.println("Deslocamentos: "+InsertionSort.deslocamento);
                System.out.println("Tempo: "+(tempoFinal-tempoInicial));
            break;    
            
            case 6:
                System.out.println("\nVetor original: ");
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