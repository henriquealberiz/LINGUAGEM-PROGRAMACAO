/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visão;
import Modelo.Clientes;
/**
 *
 * @author 36127512021.2
 */
public class ExibirEmprestimo extends javax.swing.JFrame {

    /**
     * Creates new form ExibirEmprestimo
     */
    public ExibirEmprestimo() {
        initComponents();
    }
public void exportarDados (Clientes model){
            lblnome.setText(model.getNome());
            lbltitulo.setText(model.getTitulo());
            lblendereço.setText(model.getEndereço());
            lblcpf.setText(model.getCpf());
            lblinicio.setText(model.getInicio());
            lblfim.setText(model.getFim());
            
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        lblnome = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblendereço = new javax.swing.JLabel();
        lblcpf = new javax.swing.JLabel();
        lblquantidade = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblfim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("COMPROVANTE EMPRESTIMO");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 380, 40);

        jLabel2.setText("CLIENTE:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 64, 60, 20);

        jLabel3.setText("TÍTULO DO LIVRO:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 104, 110, 20);

        jLabel4.setText("ENDEREÇO:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 150, 140, 14);

        jLabel5.setText("CPF:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 194, 110, 20);

        Voltar.setText("VOLTAR");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(170, 340, 80, 30);
        getContentPane().add(lblnome);
        lblnome.setBounds(190, 60, 80, 30);
        getContentPane().add(lbltitulo);
        lbltitulo.setBounds(190, 104, 70, 30);
        getContentPane().add(lblendereço);
        lblendereço.setBounds(190, 150, 80, 30);
        getContentPane().add(lblcpf);
        lblcpf.setBounds(190, 190, 90, 30);
        getContentPane().add(lblquantidade);
        lblquantidade.setBounds(220, 300, 90, 30);

        jLabel6.setText("Data de Inicio");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 240, 90, 30);
        getContentPane().add(lblinicio);
        lblinicio.setBounds(180, 234, 80, 30);

        jLabel8.setText("Data de Entrega");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 300, 110, 30);
        getContentPane().add(lblfim);
        lblfim.setBounds(180, 294, 100, 30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        dispose();
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(ExibirEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExibirEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExibirEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExibirEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExibirEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblcpf;
    private javax.swing.JLabel lblendereço;
    private javax.swing.JLabel lblfim;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblnome;
    private javax.swing.JLabel lblquantidade;
    private javax.swing.JLabel lbltitulo;
    // End of variables declaration//GEN-END:variables
}
