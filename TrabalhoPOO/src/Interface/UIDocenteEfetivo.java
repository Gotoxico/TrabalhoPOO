/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interface;

import Classes.Departamento;
import Controlador.Controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Classes.Efetivo;
import Classes.Funcionario;
import Classes.Tecnico;

/**
 *
 * @author rodri
 */
public class UIDocenteEfetivo extends javax.swing.JDialog {

    /**
     * Creates new form UIDocenteEfetivo
     */
    public UIDocenteEfetivo(java.awt.Frame parent, boolean modal) {
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
        CodigoDocenteEfetivo = new javax.swing.JTextField();
        NomeDocenteEfetivo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NivelDocenteEfetivo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        AreaDocenteEfetivo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TitulacaoDocenteEfetivo = new javax.swing.JComboBox<>();
        SalvarDocenteEfetivo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        ExibirDepartamentos = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDepartamentos = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDocentesEfetivos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CodigoDocenteEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoDocenteEfetivoActionPerformed(evt);
            }
        });

        NomeDocenteEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeDocenteEfetivoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nível");

        NivelDocenteEfetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3" }));

        jLabel2.setText("Área");

        AreaDocenteEfetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Biológicas", "Exatas", "Humanas", "Saúde" }));

        jLabel3.setText("Titulação");

        TitulacaoDocenteEfetivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Doutorado", "Livre - Docente Titular" }));

        SalvarDocenteEfetivo.setText("Salvar");
        SalvarDocenteEfetivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarDocenteEfetivoActionPerformed(evt);
            }
        });

        jLabel4.setText("Adicionar Docente Efetivo");

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

        TabelaDocentesEfetivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nível", "Titulação", "Área"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDocentesEfetivos.setToolTipText("");
        jScrollPane1.setViewportView(TabelaDocentesEfetivos);

        jScrollPane4.setViewportView(jScrollPane1);

        jLabel5.setText("Código");

        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Escolha o Departamento em que o Docente Efetivo será inserido");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExibirDepartamentos)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SalvarDocenteEfetivo)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(185, 185, 185)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(NivelDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)
                            .addComponent(TitulacaoDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AreaDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CodigoDocenteEfetivo)
                                .addComponent(NomeDocenteEfetivo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(74, 74, 74)))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(5, 5, 5)
                .addComponent(ExibirDepartamentos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitulacaoDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AreaDocenteEfetivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SalvarDocenteEfetivo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeDocenteEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDocenteEfetivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeDocenteEfetivoActionPerformed

    private void SalvarDocenteEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarDocenteEfetivoActionPerformed
        // TODO add your handling code here:
        int row = TabelaDepartamentos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();
        
        String codigoDocenteEfetivo = CodigoDocenteEfetivo.getText();
        String nomeDocenteEfetivo = NomeDocenteEfetivo.getText();
        String nivelDocenteEfetivo = (String) NivelDocenteEfetivo.getSelectedItem();
        String titulacao = (String) TitulacaoDocenteEfetivo.getSelectedItem();
        String area = (String) AreaDocenteEfetivo.getSelectedItem();
        
        String codigoDepartamento = TabelaDepartamentos.getValueAt(row, 0).toString();
        String nomeDepartamento = TabelaDepartamentos.getValueAt(row, 1).toString();
        
        Efetivo efetivo = new Efetivo( codigoDocenteEfetivo, nomeDocenteEfetivo, nivelDocenteEfetivo, titulacao, area);
        Controlador controlador = new Controlador();
        controlador.adicionarFuncionario( codigoDepartamento, nomeDepartamento, efetivo);
        
        this.dispose();
    }//GEN-LAST:event_SalvarDocenteEfetivoActionPerformed

    private void ExibirDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExibirDepartamentosActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();
        modelo.setRowCount(0);
        Controlador controlador = new Controlador();
        ArrayList <Departamento> departamentos = controlador.resumoDepartamentos();
        modelo.setRowCount(0);
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
        
        DefaultTableModel modelo2 = (DefaultTableModel)TabelaDocentesEfetivos.getModel();
        modelo2.setRowCount(0);
        Controlador controlador = new Controlador();
        ArrayList <Funcionario> funcionarios = controlador.exibirTodosFuncionariosDepartamento( codigoDepartamento, nomeDepartamento);
         for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Efetivo){
                Efetivo efetivo = (Efetivo) funcionario;
                Object[] rowData = {efetivo.getCodigo(), efetivo.getNome(), efetivo.getNivel(), efetivo.getTitulacao(), efetivo.getArea()};
                modelo2.addRow(rowData);
            }
        }
    }//GEN-LAST:event_TabelaDepartamentosMouseClicked

    private void CodigoDocenteEfetivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoDocenteEfetivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoDocenteEfetivoActionPerformed

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
            java.util.logging.Logger.getLogger(UIDocenteEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIDocenteEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIDocenteEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIDocenteEfetivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UIDocenteEfetivo dialog = new UIDocenteEfetivo(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> AreaDocenteEfetivo;
    private javax.swing.JTextField CodigoDocenteEfetivo;
    private javax.swing.JButton ExibirDepartamentos;
    private javax.swing.JComboBox<String> NivelDocenteEfetivo;
    private javax.swing.JTextField NomeDocenteEfetivo;
    private javax.swing.JButton SalvarDocenteEfetivo;
    private javax.swing.JTable TabelaDepartamentos;
    private javax.swing.JTable TabelaDocentesEfetivos;
    private javax.swing.JComboBox<String> TitulacaoDocenteEfetivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
