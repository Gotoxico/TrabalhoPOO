/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.lang.constant.ConstantDesc;

/**
 *
 * @author kauan
 */
public class Efetivo extends Docente {
    private String area;
    public Efetivo (){
        super();
    }
    
    public Efetivo(String nome, String codigo, double salario, String nivel, String titulacao, String area){
        super(codigo, nome, salario, nivel, titulacao);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public double calcularSalrio(){
        if(nivel.equals("D1")){
            salario = Constantes.SALARIOBASE * Constantes.D1+ Constantes.SALARIOBASE*0.05;
            return salario;
        }else if(nivel.equals("D2")){
            salario = Constantes.SALARIOBASE * Constantes.D2 + Constantes.SALARIOBASE*0.05 ;
            return salario;
        }else{
            salario = Constantes.SALARIOBASE * Constantes.D3+ Constantes.SALARIOBASE*0.05;
            return salario;
        }
    }
}
