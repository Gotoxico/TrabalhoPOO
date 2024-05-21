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
import java.util.ArrayList;
import java.util.Collections;
 
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
        return departamentos.clone();
    }
    
    public int getTamanho() {
        return tamanho;
    }

    public int getContDep() {
        return contDep;
    }

    public Funcionario buscarFuncionarioNome(String nome){
        Funcionario funcionario = null;
        for(int i = 0; i < contDep; i++){
            funcionario = departamentos[i].BuscarFuncPorNome(nome);
        }
        
        return funcionario;
    }

    public Funcionario buscarFuncionarioCod(String codigo){
        Funcionario funcionario = null;
        for(int i = 0; i < contDep; i++){
          funcionario = departamentos[i].BuscarFuncPorCod(codigo);
        }
        return funcionario;
    }

    public ArrayList<Funcionario> FucionariosPorFaixa(double min, double max){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contDep; i++){
           arrayFuncionario.addAll(departamentos[i].FucionariosPorFaixa(min, max));
        }
        return arrayFuncionario;
    }

    
    public ArrayList<Funcionario> exibirTodosFuncionarios(){        
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contDep; i++){
           arrayFuncionario.addAll(departamentos[i].exibirTodosFuncionarios());
        }   
        return arrayFuncionario;
    }

    public ArrayList<Funcionario> ExibirDocentesEfetivos(){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contDep; i++){
           arrayFuncionario.addAll(departamentos[i].ExibirDocentesEfetivos());
        }
        return arrayFuncionario;
    }    

    public ArrayList<Funcionario> ExibirSubstitutos(){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contDep; i++){
           arrayFuncionario.addAll(departamentos[i].ExibirSubstitutos());
        }
        return arrayFuncionario;
    }    
    
    public void removerFuncionario(String nome, String codigo){
        for(int i = 0; i < contDep; i++){
            departamentos[i].RemoverFuncionario(nome, codigo);
        }
    }
    
    public ArrayList<Funcionario> ExibirDocentes(){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<Funcionario>();
        
        for(int i = 0; i < contDep; i++){
            arrayFuncionario.addAll(departamentos[i].ExibirDocentes());
        }
        return arrayFuncionario;
    }
    
    public ArrayList<Funcionario> ExibirTecnicos(){
        ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
        
        for(int i = 0; i < contDep; i++){
           arrayFuncionario.addAll(departamentos[i].ExibirTecnicos());
        }
        return arrayFuncionario;
    }
    
    public void removerDepartamento(String codigo, String nome){
        if(contDep >= 0){
            for(int i = 0; i < tamanho; i++){
                if(departamentos[i].getCodigo().equals(codigo) && departamentos[i].getNome().equals(nome)){
                    for(int j = i; j < tamanho; j++, i++){
                        departamentos[j] = departamentos[i+1];
                    }
                }
            }
        }
    }
    
    public ArrayList<Departamento> Geral(){
        ArrayList<Departamento> arradepartamento = new ArrayList<>();
        for(int i =  0; i<contDep; i++){
            arradepartamento.add(departamentos[i].clone());
        }
        return arradepartamento;
    }
    
    
    
    public ArrayList<Departamento> resumoDepartamentoFaixa(double inferior, double superior){
        ArrayList<Departamento> arraydepartamento = new ArrayList<>();

        
        for(int i = 0; i < tamanho; i++){
            if(departamentos[i].GastoTotal()>= inferior && departamentos[i].GastoTotal()<= superior){
                arraydepartamento.add(departamentos[i].clone());
            }
        }
        return arraydepartamento;
    }
    
    public Departamento ExibirInformacoesDepartamento(Departamento dep){
        Departamento departamento = null;   
        for(int i = 0; i < contDep; i++){
            if(departamentos[i].getNome().equals(dep.getNome()) && departamentos[i].getCodigo().equals(dep.getCodigo())){
                departamento = departamentos[i].clone();
            }
        }
        return departamento;
}
    
    public ArrayList<Departamento> resumoDepartamentos(){
        ArrayList<Departamento> arrayDep = new ArrayList<>();
        
        for(int i = 0; i < contDep; i++){
            arrayDep.add(departamentos[i].clone());
        }
        return arrayDep;
    }
    
}

