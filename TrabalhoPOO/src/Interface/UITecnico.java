/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interface;
import Classes.Departamento;
import Classes.Funcionario;
import Controlador.Controlador;
import java.util.ArrayList;
import java.util.List;
import Classes.Tecnico;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class UITecnico extends javax.swing.JDialog {

    /**
     * Creates new form UITecnico
     */
    public UITecnico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NivelTecnico = new javax.swing.JComboBox<>();
        FuncaoTecnico = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        SalvarTecnico = new javax.swing.JButton();
        ExibirDepartamentos = new javax.swing.JButton();
        CodigoTecnico = new javax.swing.JTextField();
        NomeTecnico = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDepartamentos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaTecnicos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nível");

        jLabel2.setText("Função");

        NivelTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "T1", "T2" }));
        NivelTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NivelTecnicoActionPerformed(evt);
            }
        });

        FuncaoTecnico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Assessor", "Laboratório", "Secretário" }));

        jLabel3.setText("Adicionar Tecnico");

        SalvarTecnico.setText("Salvar");
        SalvarTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarTecnicoActionPerformed(evt);
            }
        });

        ExibirDepartamentos.setText("Exibir Departamentos");
        ExibirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirDepartamentosActionPerformed(evt);
            }
        });

        TabelaDepartamentos.setAutoCreateRowSorter(true);
        TabelaDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Tamanho Atual", "Tamanho Máximo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDepartamentos.setToolTipText("");
        TabelaDepartamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaDepartamentos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        TabelaDepartamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDepartamentosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaDepartamentos);

        jScrollPane3.setViewportView(jScrollPane2);

        TabelaTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nível", "Função"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaTecnicos.setToolTipText("");
        jScrollPane1.setViewportView(TabelaTecnicos);

        jScrollPane4.setViewportView(jScrollPane1);

        jLabel4.setText("Código");

        jLabel5.setText("Nome");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(238, 238, 238))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NivelTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FuncaoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalvarTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CodigoTecnico)
                            .addComponent(NomeTecnico))))
                .addGap(45, 45, 45))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(ExibirDepartamentos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(ExibirDepartamentos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FuncaoTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SalvarTecnico)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NivelTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NivelTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NivelTecnicoActionPerformed

    private void SalvarTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarTecnicoActionPerformed
        // TODO add your handling code here:
        int row = TabelaDepartamentos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();
        
        String codigoTecnico = CodigoTecnico.getText();
        String nomeTecnico = NomeTecnico.getText();
        String nivelTecnico = (String) NivelTecnico.getSelectedItem();
        String funcao = (String) FuncaoTecnico.getSelectedItem();
        
        String codigoDepartamento = TabelaDepartamentos.getValueAt(row, 0).toString();
        String nomeDepartamento = TabelaDepartamentos.getValueAt(row, 1).toString();
        
        Tecnico tecnico = new Tecnico(codigoTecnico, nomeTecnico, nivelTecnico, funcao);
        Controlador controlador = new Controlador();
        controlador.adicionarFuncionario(nomeDepartamento, codigoDepartamento, tecnico);
        
        this.dispose();
    }//GEN-LAST:event_SalvarTecnicoActionPerformed

    private void ExibirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirDepartamentosActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();
        modelo.setRowCount(0);
        Controlador controlador = new Controlador();
        ArrayList <Departamento> departamentos = controlador.resumoDepartamentos();
        
        for (Departamento departamento : departamentos) {
            Object[] rowData = {departamento.getCodigo(), departamento.getNome(), departamento.getContFunc(), departamento.getTamanho()};
            modelo.addRow(rowData);
        }
    }//GEN-LAST:event_ExibirDepartamentosActionPerformed

    private void TabelaDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDepartamentosMouseClicked
        // TODO add your handling code here:
        int row = TabelaDepartamentos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();

        String codigoDepartamento = TabelaDepartamentos.getValueAt(row, 0).toString();
        String nomeDepartamento = TabelaDepartamentos.getValueAt(row, 1).toString();
        
        DefaultTableModel modelo2 = (DefaultTableModel)TabelaTecnicos.getModel();
        modelo2.setRowCount(0);
        Controlador controlador = new Controlador();
        ArrayList <Funcionario> funcionarios = controlador.exibirTodosFuncionariosDepartamento(nomeDepartamento, codigoDepartamento);

        for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Tecnico){
                Tecnico tecnico = (Tecnico) funcionario;
                Object[] rowData = {tecnico.getCodigo(), tecnico.getNome(), tecnico.getNivel(), tecnico.getFuncao()};
                modelo2.addRow(rowData);
            }
        }
        
    }//GEN-LAST:event_TabelaDepartamentosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UITecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UITecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UITecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UITecnico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UITecnico dialog = new UITecnico(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoTecnico;
    private javax.swing.JButton ExibirDepartamentos;
    private javax.swing.JComboBox<String> FuncaoTecnico;
    private javax.swing.JComboBox<String> NivelTecnico;
    private javax.swing.JTextField NomeTecnico;
    private javax.swing.JButton SalvarTecnico;
    private javax.swing.JTable TabelaDepartamentos;
    private javax.swing.JTable TabelaTecnicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

    private static class tableModel {

        private static void setRowCount(int i) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private static void addRow(Object[] rowData) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public tableModel() {
        }
    }
    
}
