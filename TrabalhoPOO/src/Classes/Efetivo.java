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
    
    public Efetivo(String nome, String codigo, String nivel, String titulacao, String area){
        super(codigo, nome, nivel, titulacao);
        this.area = area;
        calcularSalario();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    
    public void calcularSalario(){
        if(nivel.equals("D1")){
            salario = Constantes.SALARIOBASE * Constantes.D1+ Constantes.SALARIOBASE*0.05;
        }else if(nivel.equals("D2")){
            salario = Constantes.SALARIOBASE * Constantes.D2 + Constantes.SALARIOBASE*0.05 ;
        }else{
            salario = Constantes.SALARIOBASE * Constantes.D3+ Constantes.SALARIOBASE*0.05;

        }
    }
}
