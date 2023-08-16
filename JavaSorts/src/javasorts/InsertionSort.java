
package javasorts;

import java.util.Scanner;


public class InsertionSort {
    private static void insert(int array[], int i){
        int eleito = array[i];
        int comp = i-1;
        while(comp>=0 && eleito<array[comp]){
            //deslocar
            array[comp+1] = array[comp];
            comp--;
        }//fim while
        array[comp+1] = eleito;
    }//fim insert
    
    public static void iSort(int array[]) {
        for(int i=1;i<array.length;i++)
            insert(array,i);
    }
    
    private static void insertComentado(int array[], int i){
        Scanner scanner = new Scanner(System.in);
        int eleito = array[i];
        int comp = i-1;
        System.out.println("Eleito: "+eleito);
        scanner.nextLine();//pausa 
        while(comp>=0 && eleito<array[comp]){
            //deslocar
            System.out.println("Comparando ");
            System.out.println("v["+comp+"]="+array[comp]);
            array[comp+1] = array[comp];
            comp--;
            JavaSorts.printArray(array);//mostra o vetor
            scanner.nextLine();//pausa 
        }//fim while
        //inserindo o eleito na posição correta
        System.out.println("Inserindo eleito indice: "+(comp+1));
        array[comp+1] = eleito;
        JavaSorts.printArray(array);//mostra o vetor
        scanner.nextLine();//pausa 
    }//fim insert
    
    public static void iSortComentado(int array[]) {
        for(int i=1;i<array.length;i++){
            System.out.println("Fase "+1);
            insertComentado(array,i);
        }
    }
}

