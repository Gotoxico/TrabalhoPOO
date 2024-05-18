package Classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class Departamento {
    protected String codigo, nome, mensagem;
    protected Funcionario funcionarios[];
    protected int tamanho, contador = 0;
    protected double gastoTotalDepartamento = 0;

    public Departamento() {
        this.funcionarios = new Funcionario[Constantes.MAX];
    }

    public Departamento(String codigo, String nome, int tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.funcionarios = new Funcionario[tamanho];
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public int getTamanho() {
        return tamanho;
    }

    public double getGastoTotalDepartamento() {
        return gastoTotalDepartamento;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
        this.funcionarios = new Funcionario[tamanho];
    }
    
    public String adicionarFuncionario(Funcionario funcionario){
        if(contador < tamanho){
            if(funcionario instanceof Tecnico){
                Tecnico tecnico = (Tecnico) funcionario;
                gastoTotalDepartamento += tecnico.calcularSalario();
            }
            
            //Implementar para Docente Efetivo e Substituto
            
            funcionarios[contador] = funcionario;
            return mensagem = "Inserção Bem Sucedida\n";
        }
        return mensagem = "Inserção Mal Sucedida\nNúmero máximo funcionários atingido\n";
    }
    
    public String removerFuncionario(Funcionario funcionario){
        if(contador >= 0){
            for(int i = 0; i < tamanho; i++){
                if(funcionarios[i].getNome().equals(funcionario.getNome()) && funcionarios[i].getCodigo().equals(funcionario.getCodigo())){
                    for(int j = i; j < tamanho; j++, i++){
                        funcionarios[j] = funcionarios[i+1];
                    }
                    return mensagem = "Remoção Bem Sucedida\n";
                }
            }
            return mensagem = "Remoção Mal Sucedida\nFuncionário não localizado\n";
        }
        return mensagem = "Remoção Mal Sucedida\nNão presença de funcionarios\n";
    }
   
}
