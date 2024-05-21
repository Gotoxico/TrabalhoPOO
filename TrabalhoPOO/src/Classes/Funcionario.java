package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author rodri
 */
public abstract class Funcionario implements Cloneable{
    protected String codigo, nome, nivel;
    protected double salario;
    
    public Funcionario() {
    }

    public Funcionario(String codigo, String nome, String nivel) {
        this.codigo = codigo;
        this.nome = nome;
        this.nivel = nivel;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNivel() {
        return nivel;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void calcularSalario();
    
    @Override
    public Funcionario clone(){
        Funcionario funcionario;
        try{
            funcionario = (Funcionario) super.clone();
        }
         catch (CloneNotSupportedException e){
             System.out.println("Erro");  
             return null;
         }
         return funcionario;
    
    
}
