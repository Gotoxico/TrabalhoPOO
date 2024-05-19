package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Universidade {
    protected Departamento departamentos[];
    protected int tamanho, contador = 0;
    protected String nome, mensagem;

    public Universidade() {
        this.nome = "Universidade";
        this.departamentos = new Departamento[Constantes.MAX];
        this.tamanho = Constantes.MAX;
    }

    public Universidade(String nome, int tamanho) {
        this.nome = nome;
        this.departamentos = new Departamento[tamanho];
        this.tamanho = tamanho;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getContador() {
        return contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        this.departamentos = new Departamento[tamanho];
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
    
    public String adicionarDepartamento(Departamento departamento){
        if(contador < tamanho){
            departamentos[contador] = departamento;
            contador++;
            return mensagem = "Inserção Bem Sucedida\n";
        }
        return mensagem = "Inserção Mal Sucedida\nNúmero máximo departamentos atingido\n";
    }
    
    public String removerDepartamento(Departamento departamento){
        if(contador >= 0){
            for(int i = 0; i < tamanho; i++){
                if(departamentos[i].getCodigo().equals(departamento.getCodigo()) && departamentos[i].getNome().equals(departamento.getNome())){
                    for(int j = i; j < tamanho; j++, i++){
                        departamentos[j] = departamentos[i+1];
                    }
                    return mensagem = "Remoção Bem Sucedida\n";
                }
            }
            return mensagem = "Remoção Mal Sucedida\nDepartamento não localizado\n";
        }
        return mensagem = "Remoção Mal Sucedida\nNão presença de departamentos\n";
    }
    
    public void geral(){
        for(int i = 0; i < tamanho; i++){
            mensagem = "\nCódigo: " + departamentos[i].getCodigo() + "\tNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j] instanceof Tecnico){
                    Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                    mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario()); 
                }
      
                //Implementar para Docente Efetivo e Substituto
            }
        }
    }
    
    public void resumoDepartamentos(){
        for(int i = 0; i < tamanho; i++){
            mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            for(int j = 0; j < tamanho; j++){
                if(departamentos[i].funcionarios[j] instanceof Tecnico){
                    Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j]; 
                }
                
                //Implementar para Docente Efetivo e Substituto
            }
        }
    }
    
    public void resumoDepartamentoFaixa(double limiteInferior, double limiteSuperior){
        for(int i = 0; i < tamanho; i++){
            if(departamentos[i].getGastoTotalDepartamento() >= limiteInferior && departamentos[i].getGastoTotalDepartamento() <= limiteSuperior){
                mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            }
        }
    }
    
    public void funcionariosSalarioFaixa(double limiteInferior, double limiteSuperior){
        for(int i = 0; i < tamanho; i++){
            mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j] instanceof Tecnico){
                    Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                    if(tecnico.calcularSalario() >= limiteInferior && tecnico.calcularSalario() <= limiteSuperior){
                        mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario());
                    }
                }
                
                //Implementar para Docente Efetivo e Substituto
            }
        }
    }
    
    public void exibirTodosFuncionarios(){
        for(int i = 0; i < tamanho; i++){
            mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j] instanceof Tecnico){
                    Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                    mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario());
                }
                
                //Implementar para Docente Efetivo e Substituto

            }
        }
    }
    
    public void exibirTodosTecnicos(){
        for(int i = 0; i < tamanho; i++){
            mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j] instanceof Tecnico){
                    Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                    mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario());
                }
            }
        }
    }
    
    public void exibirTodosDocentes(){
        //Implementar
    }
    
    public void exibirTodosDocentesEfetivos(){
        //Implementar
    }
    
    public void exibirTodosDocentesSubstitutos(){
        //Implementar
    }
    
    public void exibirInformaçõesDepartamento(String codigo){
        for(int i = 0; i < tamanho; i++){
            if(departamentos[i].getCodigo().equals(codigo)){
                mensagem = "\nNome: " + departamentos[i].getNome() + "\tTamanho: " + departamentos[i].getTamanho() + "\tGasto Total Departamento: " + departamentos[i].getGastoTotalDepartamento();
                return;
            }
        }
        mensagem = "Busca Mal Sucedida\nDepartamento inexistente\n";
    }
    
    public void buscarFuncionarioCodigo(String codigo){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j].getCodigo().equals(codigo)){
                    if(departamentos[i].funcionarios[j] instanceof Tecnico){
                        Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                        mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario());
                        return;
                    }
                    
                    //Implementar Docente Efetivo e Substituto
                }
            }
        }
        mensagem = "Busca Mal Sucedida\nFuncionário inexistente\n";
    }
    
    public void buscarFuncionarioNome(String nome){
        for(int i = 0; i < tamanho; i++){
            for(int j = 0; j < departamentos[i].getTamanho(); j++){
                if(departamentos[i].funcionarios[j].getCodigo().equals(nome)){
                    if(departamentos[i].funcionarios[j] instanceof Tecnico){
                        Tecnico tecnico = (Tecnico) departamentos[i].funcionarios[j];
                        mensagem = "\nCódigo: " + tecnico.getCodigo() + "\tNome: " + tecnico.getNome() + "\tNível: " + tecnico.getNivel() + "\tFunção: " + tecnico.getFuncao() + "\tSalário: " + String.valueOf(tecnico.calcularSalario());
                        return;
                    }
                    
                    //Implementar Docente Efetivo e Substituto
                }
            }
        }
        mensagem = "Busca Mal Sucedida\nFuncionário inexistente\n";
    }
    
    
    
    
    
    
}
