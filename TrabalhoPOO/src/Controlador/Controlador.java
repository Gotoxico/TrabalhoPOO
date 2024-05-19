/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Classes.Universidade;
import Classes.Departamento;


/**
 *
 * @author rodri
 */
public class Controlador {
    protected Universidade universidade = new Universidade("UniversidadeTrabalhoPOO", 100);
    
    public void adicionarDepartamento(Departamento departamento){
        universidade.adicionarDepartamento(departamento);
    }
    
    public void removerDepartamento(String codigo, String nome){
        universidade.removerDepartamento(codigo, nome);
    }
    
    public void geral(){
        universidade.geral();
    }
    
    public void resumoDepartamentos(){
        universidade.resumoDepartamentos();
    }
    
    public void resumoDepartamentoFaixa(double limiteInferior, double limiteSuperior){
        universidade.resumoDepartamentoFaixa(limiteInferior, limiteSuperior);
    }
    
    public void funcionariosSalarioFaixa(double limiteInferior, double limiteSuperior){
        universidade.funcionariosSalarioFaixa(limiteInferior, limiteSuperior);
    }
    
    public void exibirTodosFuncionarios(){
        universidade.exibirTodosFuncionarios();
    }
    
    public void exibirTodosTecnicos(){
        universidade.exibirTodosTecnicos();
    }
    
    public void exibirTodosDocentes(){
        universidade.exibirTodosDocentes();
    }
    
    public void exibirTodosDocentesEfetivos(){
        universidade.exibirTodosDocentesEfetivos();
    }
    
    public void exibirTodosDocentesSubstitutos(){
        universidade.exibirTodosDocentesSubstitutos();
    }
    
    public void exibirInformaçõesDepartamento(String codigo){
        universidade.exibirInformaçõesDepartamento(codigo);
    }
    
    public void buscarFuncionarioCodigo(String codigo){
        universidade.buscarFuncionarioCodigo(codigo);
    }
    
    public void buscarFuncionarioNome(String nome){
        universidade.buscarFuncionarioNome(nome);
    }
    
}
