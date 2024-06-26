/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Interface;

import Classes.Departamento;
import Classes.Efetivo;
import Classes.Funcionario;
import Classes.Substituto;
import Controlador.Controlador;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rodri
 */
public class UIDocenteSubstituto extends javax.swing.JDialog {

    /**
     * Creates new form UIDocenteSubstituto
     */
    public UIDocenteSubstituto(java.awt.Frame parent, boolean modal) {
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
        CodigoDocenteSubstituto = new javax.swing.JTextField();
        NomeDocenteSubstituto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        NivelDocenteSubstituto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        CargaHorariaDocenteSubstituto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        TitulacaoDocenteSubstituto = new javax.swing.JComboBox<>();
        SalvarDocenteSubstituto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDepartamentos = new javax.swing.JTable();
        ExibirDepartamentos = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDocentesSubstitutos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CodigoDocenteSubstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoDocenteSubstitutoActionPerformed(evt);
            }
        });

        NomeDocenteSubstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeDocenteSubstitutoActionPerformed(evt);
            }
        });

        jLabel1.setText("Nível");

        NivelDocenteSubstituto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S1", "S2" }));

        jLabel2.setText("Carga-Horária");

        CargaHorariaDocenteSubstituto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "24" }));

        jLabel3.setText("Titulação");

        TitulacaoDocenteSubstituto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Doutorado", "Livre - Docente Titular" }));

        SalvarDocenteSubstituto.setText("Salvar");
        SalvarDocenteSubstituto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarDocenteSubstitutoActionPerformed(evt);
            }
        });

        jLabel4.setText("Adicionar Docente Substituto");

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

        ExibirDepartamentos.setText("Exibir Departamentos");
        ExibirDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExibirDepartamentosActionPerformed(evt);
            }
        });

        TabelaDocentesSubstitutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Nível", "Titulação", "Carga-Horária"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        TabelaDocentesSubstitutos.setToolTipText("");
        jScrollPane1.setViewportView(TabelaDocentesSubstitutos);

        jScrollPane4.setViewportView(jScrollPane1);

        jLabel5.setText("Código");

        jLabel6.setText("Nome");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Escolha o Departamento em que o Docente Substituto será inserido");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalvarDocenteSubstituto)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(NivelDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TitulacaoDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(81, 81, 81)
                                    .addComponent(CargaHorariaDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addGap(137, 137, 137)
                                    .addComponent(jLabel2))
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CodigoDocenteSubstituto)
                                        .addComponent(NomeDocenteSubstituto))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExibirDepartamentos)
                            .addComponent(jLabel4))))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExibirDepartamentos)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CodigoDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NivelDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CargaHorariaDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitulacaoDocenteSubstituto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SalvarDocenteSubstituto)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeDocenteSubstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeDocenteSubstitutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeDocenteSubstitutoActionPerformed

    private void SalvarDocenteSubstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarDocenteSubstitutoActionPerformed
        // TODO add your handling code here:
        int row = TabelaDepartamentos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();
        
        String codigoDocenteSubstituto = CodigoDocenteSubstituto.getText();
        String nomeDocenteSubstituto = NomeDocenteSubstituto.getText();
        String nivelDocenteSubstituto = (String) NivelDocenteSubstituto.getSelectedItem();
        String titulacao = (String) TitulacaoDocenteSubstituto.getSelectedItem();
        String cargaHoraria = (String) CargaHorariaDocenteSubstituto.getSelectedItem();
        Integer cargaHorariaInteiro = Integer.parseInt(cargaHoraria);
        
        String codigoDepartamento = TabelaDepartamentos.getValueAt(row, 0).toString();
        String nomeDepartamento = TabelaDepartamentos.getValueAt(row, 1).toString();
        
        Substituto substituto = new Substituto( codigoDocenteSubstituto, nomeDocenteSubstituto, nivelDocenteSubstituto, titulacao, cargaHorariaInteiro);
        Controlador controlador = new Controlador();
        controlador.adicionarFuncionario( codigoDepartamento,nomeDepartamento, substituto);

        this.dispose();
    }//GEN-LAST:event_SalvarDocenteSubstitutoActionPerformed

    private void TabelaDepartamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDepartamentosMouseClicked
        // TODO add your handling code here:
        int row = TabelaDepartamentos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel)TabelaDepartamentos.getModel();

        String codigoDepartamento = TabelaDepartamentos.getValueAt(row, 0).toString();
        String nomeDepartamento = TabelaDepartamentos.getValueAt(row, 1).toString();
        
        DefaultTableModel modelo2 = (DefaultTableModel)TabelaDocentesSubstitutos.getModel();
        modelo2.setRowCount(0);
        Controlador controlador = new Controlador();
        ArrayList <Funcionario> funcionarios = controlador.exibirTodosFuncionariosDepartamento( codigoDepartamento, nomeDepartamento);
        
        for(Funcionario funcionario : funcionarios) {
            if(funcionario instanceof Substituto){
                Substituto substituto = (Substituto) funcionario;
                Object[] rowData = {substituto.getCodigo(), substituto.getNome(), substituto.getNivel(), substituto.getTitulacao(), substituto.getCargahoraria()};
                modelo2.addRow(rowData);
            }
        }
    }//GEN-LAST:event_TabelaDepartamentosMouseClicked

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

    private void CodigoDocenteSubstitutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoDocenteSubstitutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoDocenteSubstitutoActionPerformed

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
            java.util.logging.Logger.getLogger(UIDocenteSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIDocenteSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIDocenteSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIDocenteSubstituto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UIDocenteSubstituto dialog = new UIDocenteSubstituto(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> CargaHorariaDocenteSubstituto;
    private javax.swing.JTextField CodigoDocenteSubstituto;
    private javax.swing.JButton ExibirDepartamentos;
    private javax.swing.JComboBox<String> NivelDocenteSubstituto;
    private javax.swing.JTextField NomeDocenteSubstituto;
    private javax.swing.JButton SalvarDocenteSubstituto;
    private javax.swing.JTable TabelaDepartamentos;
    private javax.swing.JTable TabelaDocentesSubstitutos;
    private javax.swing.JComboBox<String> TitulacaoDocenteSubstituto;
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
