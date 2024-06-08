/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface;

import Classes.Departamento;
import Classes.Funcionario;
import Classes.Tecnico;
import Controlador.Controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Controlador controlador = new Controlador("UNESP", 50);
        Departamento departamento = new Departamento("123", "Matematica", 50);
        
        controlador.adicionarDepartamento(departamento);
  
        
        
        
        
        controlador = new Controlador();
        
        ArrayList <Departamento> departamentos = controlador.resumoDepartamentos();
        
       // tableModel.setRowCount(0);
        for (Departamento d : departamentos) {
            System.out.println(""+d.getNome());
        };    
         Funcionario Func = new Tecnico("20", "Bianca", "T1", "Acessor");
        controlador.adicionarFuncionario("123", "Matematica", Func);
        
         Func = new Tecnico("20", "Fernando", "T1", "Acessor");
        controlador.adicionarFuncionario("123", "Matematica", Func);
        
         Func = new Tecnico("20", "Otávio", "T1", "Acessor");
        controlador.adicionarFuncionario("123", "Matematica", Func);
            
        Funcionario Busca = controlador.buscarFuncionarioNome("Fernando");
        System.out.println("Nome: " + Busca.getNome() + " Código: " + Busca. getCodigo());
    }
    
}
