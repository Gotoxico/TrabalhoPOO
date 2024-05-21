/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

/**
 *
 * @author kauan
 */

import Classes.Funcionario;
import Classes.Efetivo;
import Classes.Substituto;
import Classes.Tecnico;
import Classes.Constantes;
import Classes.Departamento;
 
public class DataBase {
    //private Funcionario funcionarios[];
    private int tamanho;
    private int contDep = 0;
    Departamento departamentos[];
    String mensagem;
    private double gastoTotalDepartamento = 0;

    public DataBase(){
        tamanho = Constantes.MAX;
        departamentos = new Departamento[tamanho];
    }
    
    public DataBase(int tamanho){
        this.tamanho = tamanho;
        departamentos = new Departamento[tamanho];
    }
    
    //DEPARTAMENTOS
    
    public void AddDepartamento(Departamento dep){
       if(contDep < tamanho)
        departamentos[contDep++] = dep;
    }
    
    public void AddFuncionario(String nome, Funcionario a){
        for(int i = 0; i < contDep; i++){
            if(departamentos[i].getNome().equals(nome)){
                departamentos[i].AddFuncionario(a);
            }
            
        }
    }
    public Departamento[] getDepartamentos() {
        return departamentos;
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public int getContDep() {
        return contDep;
    }

    public void buscarFuncionarioNome(String nome){
        for(int i = 0; i < contDep; i++){
           departamentos[i].BuscarFuncPorNome(nome);
        }
    }

    public void buscarFuncionarioCod(String codigo){
        for(int i = 0; i < contDep; i++){
           departamentos[i].BuscarFuncPorCod(codigo);
        }
        
    }

    public void FucionariosPorFaixa(double min, double max){
        for(int i = 0; i < contDep; i++){
           departamentos[i].FucionariosPorFaixa(min, max);
        }
    }

    public void exibirTodosFuncionarios(){
        for(int i = 0; i < contDep; i++){
           departamentos[i].exibirTodosFuncionarios();
;
        }   
    }

    public void ExibirDocentesEfetivos(){
        
        for(int i = 0; i < contDep; i++){
           departamentos[i].ExibirDocentesEfetivos();
        }
    }    

    public void ExibirSubstitutos(){
        for(int i = 0; i < contDep; i++){
           departamentos[i].ExibirSubstitutos();
        }
    }    
    
    public void removerFuncionario(String nome, String codigo){
        for(int i = 0; i < contDep; i++){
            departamentos[i].RemoverFuncionario(nome, codigo);
        }
    }
    
    

}
    

