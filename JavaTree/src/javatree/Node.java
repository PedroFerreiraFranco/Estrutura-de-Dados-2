/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatree;


/**
 *
 * @author 17352499636
 */
public class Node<T extends Comparable<T>> {
    T dado;
    Node <T> esquerda;
    Node <T> direita;
    
    public Node(T novoDado){
        this.dado = novoDado;
        this.esquerda = null;
        this.direita = null;
    }
}
