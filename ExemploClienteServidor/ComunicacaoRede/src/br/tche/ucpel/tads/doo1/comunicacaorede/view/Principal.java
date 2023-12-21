/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tche.ucpel.tads.doo1.comunicacaorede.view;

import br.tche.ucpel.tads.doo1.comunicacaorede.util.Conexao;
import br.tche.ucpel.tads.doo1.comunicacaorede.util.Mensagem;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author mertins
 */
public class Principal extends javax.swing.JFrame {

    private Conexao conexao;

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        btGrpServidor = new javax.swing.ButtonGroup();
        btGrpConexao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rdOpc1 = new javax.swing.JRadioButton();
        rdOpc2 = new javax.swing.JRadioButton();
        rdOpc3 = new javax.swing.JRadioButton();
        btEnvia = new javax.swing.JButton();
        btClose = new javax.swing.JButton();
        txtIp = new javax.swing.JTextField();
        btServidor = new javax.swing.JButton();
        btCliente = new javax.swing.JButton();
        lbModo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Servidor/Cliente"));

        btGrpServidor.add(rdOpc1);
        rdOpc1.setSelected(true);
        rdOpc1.setText("Opção 1");
        rdOpc1.setBorderPainted(true);
        rdOpc1.setEnabled(false);

        btGrpServidor.add(rdOpc2);
        rdOpc2.setText("Opção 2");
        rdOpc2.setBorderPainted(true);
        rdOpc2.setEnabled(false);

        btGrpServidor.add(rdOpc3);
        rdOpc3.setText("Opção 3");
        rdOpc3.setBorderPainted(true);
        rdOpc3.setEnabled(false);

        btEnvia.setText("Envia");
        btEnvia.setEnabled(false);
        btEnvia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnviaActionPerformed(evt);
            }
        });

        btClose.setText("Desconectar");
        btClose.setEnabled(false);
        btClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCloseActionPerformed(evt);
            }
        });

        txtIp.setText("127.0.0.1");
        txtIp.setEnabled(false);

        btServidor.setText("Inicia Servidor");
        btServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServidorActionPerformed(evt);
            }
        });

        btCliente.setText("Conecta no IP");
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btClose)
                            .addComponent(rdOpc3)
                            .addComponent(btEnvia)
                            .addComponent(rdOpc2)
                            .addComponent(rdOpc1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btServidor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbModo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIp, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btServidor)
                    .addComponent(lbModo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdOpc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdOpc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rdOpc3)
                .addGap(18, 18, 18)
                .addComponent(btEnvia))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-368)/2, (screenSize.height-299)/2, 368, 299);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnviaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnviaActionPerformed
        Mensagem msg = new Mensagem();
        try {
            if (rdOpc1.isSelected()) {
                msg.setCodigo(1);
                conexao.enviar(msg);
            } else if (rdOpc2.isSelected()) {
                msg.setCodigo(2);
                conexao.enviar(msg);
            } else {
                msg.setCodigo(3);
                conexao.enviar(msg);
            }
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btEnviaActionPerformed

    private void btCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCloseActionPerformed
        this.conexao.close();
        this.enableComponentesPosConexao(false);
        this.enableComponentesConexao(true);
    }//GEN-LAST:event_btCloseActionPerformed

    private void btServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServidorActionPerformed
        enableComponentesConexao(false);
        lbModo.setText("Modo Servidor");
        this.conexao = new Conexao();

        new Thread() {

            @Override
            public void run() {
                try {
                    conexao.aguardarCliente();
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            enableComponentesPosConexao(true);
                            readConexao();
                        }
                    });

                } catch (final Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    conexao.close();
                    conexao = null;
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            JOptionPane.showMessageDialog(Principal.this, String.format("Não foi possível iniciar o servidor! Verifique o log [%s]", ex.getMessage()));
                            enableComponentesConexao(true);
                            enableComponentesPosConexao(false);
                        }
                    });
                }
            }
        }.start();
    }//GEN-LAST:event_btServidorActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        enableComponentesConexao(false);
        lbModo.setText("Modo Cliente");
        this.conexao = new Conexao();

        new Thread() {

            @Override
            public void run() {
                try {
                    conexao.conectarServidor(txtIp.getText());
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            enableComponentesPosConexao(true);
                            readConexao();
                        }
                    });

                } catch (final Exception ex) {
                    Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                    conexao.close();
                    conexao = null;
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            JOptionPane.showMessageDialog(Principal.this, String.format("Não foi possível conectar no servidor! Verifique o log [%s]", ex.getMessage()));
                            enableComponentesConexao(true);
                            enableComponentesPosConexao(false);
                        }
                    });
                }
            }
        }.start();
    }//GEN-LAST:event_btClienteActionPerformed

    private void enableComponentesConexao(boolean valor) {
        this.btServidor.setEnabled(valor);
        this.btCliente.setEnabled(valor);
        this.txtIp.setEnabled(valor);
        this.btServidor.setSelected(false);
        this.btCliente.setSelected(false);
    }

    private void enableComponentesPosConexao(boolean valor) {
        this.btClose.setEnabled(valor);
        this.btEnvia.setEnabled(valor);
        this.rdOpc1.setEnabled(valor);
        this.rdOpc2.setEnabled(valor);
        this.rdOpc3.setEnabled(valor);
        if (!valor) {
            lbModo.setText(null);
        }
    }

    private void readConexao() {
        new Thread() {

            @Override
            public void run() {


                try {
                    while (true) {
                        final Mensagem msg = conexao.receber();
                        SwingUtilities.invokeLater(new Runnable() {

                            @Override
                            public void run() {
                                int valor = msg.getCodigo();
                                atribuiValor(valor);
                            }
                        });
                    }
                } catch (final Exception ex) {
                    conexao.close();
                    conexao = null;
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            JOptionPane.showMessageDialog(Principal.this, String.format("Não foi possível receber informação! Verifique o log [%s]", ex.getMessage()));
                            enableComponentesConexao(true);
                            enableComponentesPosConexao(false);
                        }
                    });
                }
            }
        }.start();
    }

    private void atribuiValor(int valor) {
        switch (valor) {
            case 1:
                this.rdOpc1.setSelected(true);
                break;
            case 2:
                this.rdOpc2.setSelected(true);
                break;
            case 3:
                this.rdOpc3.setSelected(true);
                break;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;




                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btClose;
    private javax.swing.JButton btEnvia;
    private javax.swing.ButtonGroup btGrpConexao;
    private javax.swing.ButtonGroup btGrpServidor;
    private javax.swing.JButton btServidor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbModo;
    private javax.swing.JRadioButton rdOpc1;
    private javax.swing.JRadioButton rdOpc2;
    private javax.swing.JRadioButton rdOpc3;
    private javax.swing.JTextField txtIp;
    // End of variables declaration//GEN-END:variables
}