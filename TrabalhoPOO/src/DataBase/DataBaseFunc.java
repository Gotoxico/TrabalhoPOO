/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataBase;

import DataBase.DataBase;
import Classes.Funcionario;
import Classes.Constantes;
import Classes.Docente;
import Classes.Substituto;
import Classes.Efetivo;
/**
 *
 * @author kauan
 */
public class DataBaseFunc {
    int tamanho, contFunc = 0;
     Funcionario funcionarios[];
     String mensagem;
     
     
    public DataBaseFunc(){ 
        tamanho = Constantes.MAX;
        contFunc = 0;
        funcionarios = new Funcionario[tamanho];
    }
    
    public DataBaseFunc(int tamanho){
        this.tamanho = tamanho;
        funcionarios = new Funcionario[tamanho];
    }   
    
        public Funcionario RetornarFuncionario(int i){
        return funcionarios[i];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getContFunc() {
        return contFunc;
    }

    public void setContFunc(int contFunc) {
        this.contFunc = contFunc;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    
    public void AddFuncionario(Funcionario a){
        if(contFunc < tamanho){
            funcionarios[contFunc++] = a;
        }
    }
    
     public void FucionariosPorFaixa(double min, double max){
        
        if(min > max) return;
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getSalario() >= min && funcionarios[i].getSalario() <=              max){
                funcionarios[i].toString();
            }
        }
    }
    
    public void ExibirTecnicos(){
        
    
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getNivel().equals(Constantes.T1) || funcionarios[i].getNivel().equals(Constantes.T2)){
                funcionarios[i].toString();
            }
        }
    }
    
    public void ExibirDocentes(){
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Docente){
                funcionarios[i].toString();
            }
        }
    }
    
    public void BuscarFuncPorNome(String nome){
        
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getNome().equals(nome)){
                mensagem = funcionarios[i].toString();
            }
        }
    }
    
    public void BuscarFuncPorCod(String codigo){
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i]. getNome().equals(codigo)){
                funcionarios[i].toString();
            }
        }
    }
    
    public void ExibirSubstitutos(){
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Substituto){
                funcionarios[i].toString();
            }
        }
    }
    
    public void ExibirDocentesEfetivos(){

        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Efetivo){
                funcionarios[i].toString();
            }
        }
    }
    
    public void exibirTodosFuncionarios(){
        for(int i = 0; i < contFunc; i++){
            funcionarios[i].toString();
            System.out.println("");
        }
    }
    
    public void removerFuncionario(String nome, String codigo){
        if(contFunc >= 0){
            for(int i = 0; i < contFunc; i++){
                if(funcionarios[i].getNome().equals(nome) && funcionarios[i].getCodigo().equals(codigo)){
                    for(int j = i; j < contFunc; j++, i++){
                        funcionarios[j] = funcionarios[i+1];
                    }
                }
            }
        }
    }
    

    /*
    @Override
    public String toString() {
        return "Carro{" +
               "marca='" + marca + '\'' +
               ", modelo='" + modelo + '\'' +
               ", ano=" + ano +
               '}';
    };
*/
    
}   

