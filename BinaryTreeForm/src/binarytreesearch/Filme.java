package binarytreesearch;

import java.util.Objects;

public class Filme implements Comparable<Filme>{
    private int codigo;
    private String nome;
    
    public Filme(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
        public Filme(){

    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int matricula) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public int compareTo(Filme outro){
        return Integer.compare
           (this.codigo, outro.codigo);
    }
    @Override
    public String toString(){
            return " Código do filme:"+this.codigo+ " Nome: " +this.nome;
    }
    
    
}
