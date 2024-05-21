package Classes;
import DataBase.DataBaseFunc;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import DataBase.DataBase;
import DataBase.DataBaseFunc;
/**
 *
 * @author rodri
 */
public class Departamento {
    protected String codigo, nome, mensagem;
    protected int tamanho, contador = 0;
    DataBaseFunc dbf ;
    String mensagem;
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
    
    
    public void removerFuncionario(String nome,  String codigo){
         dbf.removerFuncionario(nome, codigo);
    }
    
    public void FucionariosPorFaixa(double min, double max){
        dbf.FucionariosPorFaixa(min, max);
    }
    
        
    public void ExibirTecnicos(){
        dbf.ExibirTecnicos();
    }
    
    public void ExibirDocentes(){
        dbf.ExibirDocentes();
    }
    
    public void BuscarFuncPorNome(String nome){
        dbf.BuscarFuncPorNome(nome);
    }
    
    public void BuscarFuncPorCod(String codigo){
        dbf.BuscarFuncPorCod(codigo);
    }
    
    public void ExibirSubstitutos(){
        dbf.ExibirSubstitutos();
    }

    public void ExibirDocentesEfetivos(){
        dbf.ExibirDocentesEfetivos();
    }    
    
    public void exibirTodosFuncionarios(){    
        dbf.exibirTodosFuncionarios();
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
}
