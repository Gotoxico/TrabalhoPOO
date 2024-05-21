/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author kauan
 */
public abstract class Docente extends Funcionario {

    protected String titulacao;
    
    public Docente(){
        super();
    }
    
    public Docente(String codigo, String nome, String nivel, String titulacao){
       super(codigo, nome, nivel);
       this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }
   
    
    public abstract void calcularSalario();
}


