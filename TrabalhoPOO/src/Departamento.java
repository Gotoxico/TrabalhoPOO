/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class Departamento {
    protected String codigo, nome;
    protected Funcionario funcionarios[];
    protected int tamanho;

    public Departamento() {
        this.funcionarios = new Funcionario[50];
    }

    public Departamento(String codigo, String nome, int tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new Funcionario[tamanho];
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        this.funcionarios = new Funcionario[tamanho];
    }
    
    
    
    
    
}
