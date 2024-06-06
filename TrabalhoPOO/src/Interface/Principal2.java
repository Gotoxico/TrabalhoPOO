/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Interface;

import Classes.Departamento;
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
            
    }
    
}
