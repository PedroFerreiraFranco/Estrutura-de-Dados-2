
package javasorts;

import java.util.Scanner;

public class BubbleSort {
    public static long compara=0, trocas=0;
    
    public static void bSort(int array[]){
     for(int fase=1;fase<array.length;fase++){
        for(int comp=0;comp<array.length-fase;comp++){
            compara++;//contando comparações
            if(array[comp]>array[comp+1]){
                trocas++;
              int temp = array[comp];
              array[comp] = array[comp+1];
              array[comp+1] = temp;
           }// fim if
        }// for comp
     }// fim for fase
    }// fim bSort
    
    public static void bSortComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int fase=1;fase<array.length;fase++){
            System.out.println("Fase "+fase);//
            JavaSorts.printArray(array);//
            scanner.nextLine();// pause
        for(int comp=0;comp<array.length-fase;comp++){
            System.out.println
              ("Comparando "+array[comp]+ " com " + 
                                      array[comp+1]);//
            if(array[comp]>array[comp+1]){
                System.out.println("Trocou");  //
              int temp = array[comp];
              array[comp] = array[comp+1];
              array[comp+1] = temp;
           }// fim if
        }// for comp
     }// fim for fase
    }// fim bSort
    
         public static void bSortDescComentado(int array[]){
        Scanner scanner = new Scanner(System.in);
        for(int fase=1;fase<array.length;fase++){
             boolean ordem = false;
            System.out.println("Fase "+fase);
            JavaSorts.printArray(array);
            scanner.nextLine();//pause
            for(int comp=0;comp<array.length-fase;comp++){
                System.out.println("Comparando "+array[comp] + " com " + array[comp+1]);
                if(array[comp]<array[comp+1]){// Modificação: < ao invés de >
                    System.out.println("trocou");
                    ordem = true;
                    int temp = array[comp];
                    array[comp] = array[comp+1];
                    array[comp+1] = temp;
                }//fim if
            }//fim for comp
            if(ordem == false){
                System.out.println("Já está ordenado!");
                return;
            }
        }//fim for fase
    }//fim bSortDescComentado
    
    
}// fim classe
    
