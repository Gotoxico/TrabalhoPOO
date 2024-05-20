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
 
public class DataBase {
    private static DataBase instance = null;
    Funcionario funcionario[];
    int tamanho;
     int contFunc = 0, contDep = 0;
     
    public DataBase(){
        tamanho = Constantes.MAX;
        funcionario = new Funcionario[tamanho];
    }
    
    public DataBase(int tamanho){
        this.tamanho = tamanho;
        funcionario = new Funcionario[tamanho];
    }
    
    
    public static DataBase getInstance(){
        if(instance == null){
            instance = new DataBase();
            return instance;
        }
        return instance;
    }
    
    public void AddFuncionario(Funcionario a){
        if(contFunc < tamanho){
            funcionario[contFunc++] = a;
        }
    }
    
    public void exibirTodosFuncionarios(){
        if(instance == null) return;
        
        for(int i = 0; i < contFunc; i++){
            funcionario[i].toString();
            System.out.println("");
        }
    }
    
    public void FucionariosPorFaixa(double min, double max){
        if(instance == null) return;
        if(min > max) return;
        for(int i = 0; i < contFunc; i++){
            if(funcionario[i].getSalario() >= min && funcionario[i].getSalario() <=              max){
                funcionario[i].toString();
            }
        }
    }
    
    public void ExibirTecnicos(){
        if(instance == null) return;
    
        for(int i = 0; i < contFunc; i++){
            if(funcionario[i].getNivel().equals(Constantes.T1) || funcionario[i].getNivel().equals(Constantes.T2)){
                funcionario[i].toString();
            }
        }
    }
    
    public void ExibirDocentes(){
        if(instance == null)return;
        
        for(int i = 0; i < contFunc; i++){
            
        }
    }
    
    public void BuscarFuncPorNome(String nome){
        if(instance == null) return;
        
        for(int i = 0; i < contFunc; i++){
            if(funcionario[i].getNome().equals(nome)){
                funcionario[i].toString();
            }
        }
    }
    
    public void BuscarFuncPorCod(String codigo){
        if(instance == null)return;
        
        for(int i = 0; i < contFunc; i++){
            if(funcionario[i]. getNome().equals(codigo)){
                funcionario[i].toString();
            }
        }
    }
    
    public void ExibirSubstitutos(){
        if(instance == null) return;
        
        for(int i = 0; i < contFunc; i++){
            if(funcionario[i].getNivel().equals(Constantes.S1) || funcionario[i].getNivel().equals(Constantes.S2)){
                funcionario[i].toString();
            }
        }
    }
    
    public void ExibirDocentesEfetivos(){
        if(instance == null) return;
        for(int i = 0; i < contFunc; i++){
            
        }
    }
            
            
    
    
}
