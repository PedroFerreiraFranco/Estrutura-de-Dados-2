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
public class BinarySearchTree<T extends Comparable<T>> {
    Node raiz=null;
    public void add(T novoDado){
        Node<T> novoNO = new Node<T>(novoDado);
        raiz = inserir(raiz, novoNO);
    }
        private Node<T> inserir(Node<T> raiz, Node<T> novo){
            if(raiz==null)
                return novo;
            if(novo.dado.compareTo(raiz.dado)>0)
                raiz.direita = inserir(raiz.direita,novo);
            else
                raiz.esquerda = inserir(raiz.esquerda,novo);
        return raiz;//retorna raiz atualizada
        }
        
        public void preOrder(){
            preOrder(raiz);
        }
        
        private void preOrder(Node<T> raiz){
            if(raiz!=null){
                System.out.print(raiz.dado+", ");
                preOrder(raiz.esquerda);
                preOrder(raiz.direita);
            }//fim if
        }
        
        public void inOrder(){
            inOrder(raiz);
        }
        
        private void inOrder(Node<T> raiz){
            if(raiz!=null){
                inOrder(raiz.esquerda);
                System.out.print(raiz.dado+", ");
                inOrder(raiz.direita);
            }//fim if
        } 
        
        public void posOrder(){
            posOrder(raiz);
        }
        
        private void posOrder(Node<T> raiz){
            if(raiz!=null){
                posOrder(raiz.esquerda);
                posOrder(raiz.direita);
                System.out.print(raiz.dado+", ");
            }//fim if
        } 
}
