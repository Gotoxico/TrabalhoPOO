/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author kauan
 */
public class Substituto extends Docente {
    private int cargahoraria;
    
    public Substituto (){
        super();
    }
    
    public Substituto( String codigo, String nome,String nivel, String titulacao, String area){
        super(codigo, nome, nivel, titulacao);
        this.cargahoraria = cargahoraria;
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    public void calcularSalario(){
        if(nivel.equals("S1")){
            salario = Constantes.SALARIOBASE * Constantes.S1;
        }else{
            salario = Constantes.SALARIOBASE * Constantes.S2;
    }
    
    }
    
}
