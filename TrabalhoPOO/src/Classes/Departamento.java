package Classes;
import DataBase.DataBaseFunc;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DataBase.DataBase;
import DataBase.DataBaseFunc;
import java.util.ArrayList;
/**
 *
 * @author rodri
 */
public class Departamento implements Cloneable {
    protected String codigo, nome, mensagem;
    protected int tamanho, contador = 0;
    DataBaseFunc dbf ;
    public Departamento() {
        tamanho = Constantes.MAX;
        dbf = new DataBaseFunc(tamanho);
    }

    public Departamento(String codigo, String nome, int tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.tamanho = tamanho;
        dbf = new DataBaseFunc(tamanho);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return dbf.getFuncionarios();
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
    }
    
    public void AddFuncionario(Funcionario a){
        dbf.AddFuncionario(a);
    }
    
  
    
    public ArrayList<Funcionario> FucionariosPorFaixa(double min, double max){
        return dbf.FucionariosPorFaixa(min, max);
    }
    
        
    public ArrayList<Funcionario> ExibirTecnicos(){
        return dbf.ExibirTecnicos();
    }
    
    public ArrayList<Funcionario> ExibirDocentes(){
        return dbf.ExibirDocentes();
    }
    
    public Funcionario BuscarFuncPorNome(String nome){
        return dbf.BuscarFuncPorNome(nome);
    }
    
    public Funcionario BuscarFuncPorCod(String codigo){
        return dbf.BuscarFuncPorCod(codigo);
    }
    
    public ArrayList<Funcionario> ExibirSubstitutos(){
        return dbf.ExibirSubstitutos();
    }

    public ArrayList<Funcionario> ExibirDocentesEfetivos(){
        return dbf.ExibirDocentesEfetivos();
    }    
    
    public ArrayList<Funcionario> exibirTodosFuncionarios(){    
        return dbf.exibirTodosFuncionarios();
    }
    
    public void RemoverFuncionario(String nome, String codigo){
           dbf.removerFuncionario(nome, codigo);
    }
    
    public double getContFunc(){
        return dbf.getContFunc();
    }
    
    public Funcionario RetornarFuncionario(int i){
        return dbf.RetornarFuncionario(i);
    }
    
    public double GastoTotal(){
        return dbf.getGastoTotal();
    }
    
    @Override
    public Departamento clone(){
        Departamento departamento;
        try{
            departamento = (Departamento) super.clone();
        }
        catch(CloneNotSupportedException e){
            System.out.println("Erro\n");
            return null;
        }
        return departamento;
    }
    
}
