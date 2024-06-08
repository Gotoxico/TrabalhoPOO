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
import java.util.ArrayList;

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
    
     public ArrayList<Funcionario> FuncionariosPorFaixa(double min, double max){
        ArrayList<Funcionario> arrayfuncionarios= new ArrayList<Funcionario>();
        
        if(min > max){
            double aux = min;
            min = max;
            max = aux;
        }
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getSalario() >= min && funcionarios[i].getSalario() <= max){
                arrayfuncionarios.add(funcionarios[i].clone());
            }
        }
        return arrayfuncionarios;
    }
    
     
    public ArrayList<Funcionario> ExibirTecnicos(){
        
        ArrayList<Funcionario> arrayfuncionarios= new ArrayList<Funcionario>();
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getNivel().equals(Constantes.nT1) || funcionarios[i].getNivel().equals(Constantes.nT2)){
                arrayfuncionarios.add(funcionarios[i].clone());
            }
        }
        return arrayfuncionarios;
    }
    
    public ArrayList<Funcionario> ExibirDocentes(){
        ArrayList<Funcionario> arrayfuncionarios= new ArrayList<Funcionario>();
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Efetivo || funcionarios[i] instanceof Substituto){
                arrayfuncionarios.add(funcionarios[i].clone());
            }
        }
        
        return arrayfuncionarios;
    }
    
    public Funcionario BuscarFuncPorNome(String nome){
        
        Funcionario funcionario = null;
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i].getNome().equals(nome)){
                funcionario = funcionarios[i];
                break;
            }
        }
        return funcionario.clone();
    }
    
    public Funcionario BuscarFuncPorCod(String codigo){
        Funcionario funcionario = null;
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i]. getNome().equals(codigo)){
                funcionario = funcionarios[i];
            }
        }
        return funcionario.clone();
    }
    
    public ArrayList<Funcionario> ExibirSubstitutos(){
        
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Substituto){
                arrayFuncionario.add(funcionarios[i].clone());
            }
        }
        return arrayFuncionario;
    }
    
    public ArrayList<Funcionario> ExibirDocentesEfetivos(){

        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contFunc; i++){
            if(funcionarios[i] instanceof Efetivo){
                arrayFuncionario.add(funcionarios[i].clone());
            }
        }
        return arrayFuncionario;
    }
    
    public ArrayList<Funcionario> exibirTodosFuncionarios(){
        
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contFunc; i++){
            arrayFuncionario.add(funcionarios[i].clone());
        }
        return arrayFuncionario;
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
    
    public double getGastoTotal(){
        double gasto = 0;
        for(int i = 0; i < contFunc; i++){
            gasto += funcionarios[i].getSalario();
        }
        return gasto;
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

