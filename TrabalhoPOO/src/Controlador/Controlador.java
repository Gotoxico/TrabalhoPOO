/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Classes.Universidade;
import Classes.Departamento;
import java.util.ArrayList;
import Classes.Funcionario;
/**
 *
 * @author rodri
 */
public class Controlador {
    protected Universidade universidade;
    
    public void AdicionarUniversidade(String nome, int tamanho){
        universidade = new Universidade(nome, tamanho);
    }

    public Controlador() {
    }

    public Universidade getUniversidade() {
        return universidade;
    }
    
    public Departamento[] getDepartamentos(){
        return universidade.getDepartamentos();
    }
    
    public int GetQtdDepartamentos(){
        return universidade.getContador();
    }
    
    public void setTamanho(int tamanho){
        universidade.setTamanho(tamanho);
    }
    public void setNome(String nome){
        universidade.setNome(nome);
    }
    
    public void adicionarDepartamento(Departamento departamento){
        universidade.adicionarDepartamento(departamento);
    }
    
    public void removerDepartamento(String codigo, String nome){
        universidade.removerDepartamento(codigo, nome);
    }
    
    public ArrayList<Departamento> geral(){
        return universidade.geral();
    }
    
    public ArrayList<Departamento> resumoDepartamentos(){
        return universidade.resumoDepartamentos();
    }
    
    public ArrayList<Departamento> resumoDepartamentoFaixa(double limiteInferior, double limiteSuperior){
        return universidade.resumoDepartamentoFaixa(limiteInferior, limiteSuperior);
    }
    
    public ArrayList<Funcionario> funcionariosSalarioFaixa(double limiteInferior, double limiteSuperior){
        return universidade.funcionariosSalarioFaixa(limiteInferior, limiteSuperior);
    }
    
    public ArrayList<Funcionario> exibirTodosFuncionarios(){
        return universidade.exibirTodosFuncionarios();
    }
    
    public ArrayList<Funcionario> exibirTodosTecnicos(){
        return universidade.exibirTodosTecnicos();
    }
    
    public ArrayList<Funcionario> exibirTodosDocentes(){
        return universidade.exibirTodosDocentes();
    }
    
    public ArrayList<Funcionario> exibirTodosDocentesEfetivos(){
        return universidade.exibirTodosDocentesEfetivos();
    }
    
    public ArrayList<Funcionario> exibirTodosDocentesSubstitutos(){
        return universidade.exibirTodosDocentesSubstitutos();
    }
    
    public Departamento exibirInformaçõesDepreartamento(Departamento dep){
        return universidade.exibirInformaçõesDepartamento(dep);
    }
    
    public Funcionario buscarFuncionarioCodigo(String codigo){
        return universidade.buscarFuncionarioCodigo(codigo);
    }
    
    public Funcionario buscarFuncionarioNome(String nome){
        return universidade.buscarFuncionarioNome(nome);
    }
    
}
