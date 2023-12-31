/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreesearch;

/**
 *
 * @author luizh
 */
public class BinarySearchTree<T extends Comparable<T>> {
    Node root = null;
    int count;
    
    public int add(T newData) {
        Node<T> newNode = new Node<T>(newData);
        count = 0;
        root = insert(root, newNode);
        return count;
    }
    
    private Node<T> insert(Node<T> root, Node<T> newNode) {
        count++;
        if(root == null) {
            return newNode;
        }
        
        if(newNode.data.compareTo(root.data) > 0) {
            root.right = insert(root.right, newNode);
        }else {
            root.left = insert(root.left, newNode);
        }
        
        return root; //retorna a raiz atualizada.
    }
  
    public void preOrder() {
        preOrder(root);
    }
    
    
    private void preOrder(Node<T> root) {
        if(root != null) {
            System.out.print(root.data + ", ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    
    public void inOrder() {
        inOrder(root);
    }
    
    private void inOrder(Node<T> root) {
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + ", ");
            inOrder(root.right);
        }
    }
    
    
    public String getFilmeDataPreOrder() {
        StringBuilder filmeData = new StringBuilder();
        getFilmeDataPreOrder(root, filmeData);
        return filmeData.toString();
    }
    
    public void getFilmeDataPreOrder(Node<T> root, StringBuilder filmeData) {
        if(root != null) {
            filmeData.append(root.data.toString() + "\n");
            getFilmeDataPreOrder(root.left, filmeData);
            getFilmeDataPreOrder(root.right, filmeData);
        }
    }
    
    /*
    
    Mostra os alunos em ordem
    
    public String getStudentDataInOrder() {
        StringBuilder studentData = new StringBuilder();
        getStudentDataInOrder(root, studentData);
        return studentData.toString();
    }

    private void getStudentDataInOrder(Node<T> root, StringBuilder studentData) {
        if (root != null) {
            getStudentDataInOrder(root.left, studentData);
            studentData.append(root.data.toString() + "\n");
            getStudentDataInOrder(root.right, studentData);
        }
    }
    */

    
    public void postOrder() {
        postOrder(root);
    }
    
    private void postOrder(Node<T> root) {
        if(root != null) {
            postOrder(root.right);
            postOrder(root.left);
            System.out.print(root.data + ", ");
        }
    }
}
