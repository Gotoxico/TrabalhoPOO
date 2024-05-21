package Classes;


import Classes.Funcionario;
import Classes.Constantes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rodri
 */
public class Tecnico extends Funcionario{
    protected String funcao;
    

    public Tecnico() {
    }

    public Tecnico(String codigo, String nome, String nivel, String funcao) {
        super(codigo, nome, nivel);
        this.funcao = funcao;
        calcularSalario();
    }
    
    public void calcularSalario(){
        if(nivel.equals("T1")){
            salario = Constantes.SALARIOBASE * Constantes.T1;
        }else{
            salario = Constantes.SALARIOBASE * Constantes.T2;    
        }
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    
    
    
    
}
