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
public class Aluno implements Comparable<Aluno>{
    private int matricula;
    private String nome;
    
    public Aluno(int matricula, String nome){
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.matricula, outro.matricula);
    }
    
    @Override
    public String toString(){
        return "Aluno: [Nome: "+this.nome+"| Matricula: "+this.matricula+"]";
    }
}
