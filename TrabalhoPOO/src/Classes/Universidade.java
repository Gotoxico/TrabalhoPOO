package Classes;

import DataBase.DataBase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DataBase.DataBase;
import java.util.ArrayList;
import Classes.Departamento;
/**
 *
 * @author rodri
 */
public class Universidade {
    //protected Departamento departamentos[];
    protected int tamanho;
    protected String nome, mensagem;
    DataBase db;

    public Universidade() {
        this.nome = "Universidade";
        this.tamanho = Constantes.MAX;
    }

    public Universidade(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
        db = new DataBase(tamanho);
    }

    public Departamento[] getDepartamentos() {
        return db.getDepartamentos();
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getContador() {
        return db.getContDep();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public void adicionarDepartamento(Departamento departamento){
        db.AddDepartamento(departamento);
    }
    
    public void removerDepartamento(String codigo, String nome){
        db.removerDepartamento(codigo, nome);
    }
    
    public void adicionarFuncionario( String codigo, String nome, Funcionario funcionario){
        db.AddFuncionario( codigo, nome, funcionario);
    }
    
    public ArrayList<Departamento> geral(){
        return db.Geral();
    }
    
    public ArrayList<Departamento> resumoDepartamentoFaixa(double limiteInferior, double limiteSuperior){
        return db.resumoDepartamentoFaixa(limiteInferior, limiteSuperior);
    }
    
    public ArrayList<Funcionario> funcionariosSalarioFaixa(double limiteInferior, double limiteSuperior){
        return db.FucionariosPorFaixa(limiteInferior, limiteSuperior);
    }
    
    public ArrayList<Funcionario> exibirTodosFuncionarios(){
        return db.exibirTodosFuncionarios();
    }
    
    public ArrayList<Funcionario> exibirTodosTecnicos(){
        return db.ExibirTecnicos();
    }
    
    public ArrayList<Funcionario> exibirTodosDocentes(){
        return db.ExibirDocentes();
    }
    
    
    public ArrayList<Funcionario> exibirTodosDocentesEfetivos(){
        return db.ExibirDocentesEfetivos();
    }
    
    public ArrayList<Funcionario> exibirTodosDocentesSubstitutos(){
        return db.ExibirSubstitutos();
    }
    
    public Departamento exibirInformaçõesDepartamento(Departamento dep){
        return db.ExibirInformacoesDepartamento(dep);
    }
    
    public Funcionario buscarFuncionarioCodigo(String codigo){
        return db.buscarFuncionarioCod(codigo);
    }
    
    public Funcionario buscarFuncionarioNome(String nome){
        return db.buscarFuncionarioNome(nome);
    }
    
    public ArrayList<Departamento> resumoDepartamentos(){
        return db.resumoDepartamentos();
    }
    
    public ArrayList<Funcionario> exibirTodosFuncionariosDepartamento( String codigo, String nome){
        return db.exibirTodosFuncionariosDepartamento( codigo , nome);
    }
    public double  GastoTotal(String Codigo, String Nome){
        return db.gastoTotal(Codigo, Nome);
    }
            
}
