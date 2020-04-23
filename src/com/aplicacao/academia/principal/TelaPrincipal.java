/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.principal;

import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class TelaPrincipal extends javax.swing.JFrame {

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String dataFormatada = sdf.format(date);
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        lblData.setText(dataFormatada);
        jMenuItem3.setEnabled(false);
        jMenuItem3.setVisible(false);
        jMenuItem4.setEnabled(false);
        jMenuItem4.setVisible(false);
        jMenuItem5.setEnabled(false);
        jMenuItem5.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblLogoIMG = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnReceber = new javax.swing.JButton();
        dekPrincipal = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCliente = new javax.swing.JMenuItem();
        jMenuItemPlanos = new javax.swing.JMenuItem();
        jMenuItemProfessor = new javax.swing.JMenuItem();
        jMenuItemUsuario = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSair = new javax.swing.JMenuItem();
        jMenuFinanceiro = new javax.swing.JMenu();
        jMenuItemRecePaga = new javax.swing.JMenuItem();
        jMenuItemReceExtr = new javax.swing.JMenuItem();
        jMenuItemSaidas = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        jMenuItemRelatPagam = new javax.swing.JMenuItem();
        jMenuItemRelatDeve = new javax.swing.JMenuItem();
        jMenuItemRelatSaida = new javax.swing.JMenuItem();
        jMenuSoftware = new javax.swing.JMenu();
        jMenuItemAgenda = new javax.swing.JMenuItem();
        jMenuItemCalculadora = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuSobre = new javax.swing.JMenu();
        jMenuItemSOSI = new javax.swing.JMenuItem();
        jMenuItemSOPR = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblNomeUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblNomeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNomeUsuario.setText("Nome do Usuario");

        lblData.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblData.setText("Data");

        lblHora.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblHora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHora.setText("Hora");

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aplicacao/academia/icones/user.png"))); // NOI18N
        btnCadastrar.setToolTipText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/aplicacao/academia/icones/money.png"))); // NOI18N
        btnReceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReceberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(lblData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLogoIMG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReceber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addGap(18, 18, 18)
                .addComponent(btnReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblData, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLogoIMG, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        dekPrincipal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout dekPrincipalLayout = new javax.swing.GroupLayout(dekPrincipal);
        dekPrincipal.setLayout(dekPrincipalLayout);
        dekPrincipalLayout.setHorizontalGroup(
            dekPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1042, Short.MAX_VALUE)
        );
        dekPrincipalLayout.setVerticalGroup(
            dekPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastros");
        jMenuCadastro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItemCliente.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemCliente.setText("Cliente");
        jMenuItemCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemClienteActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCliente);

        jMenuItemPlanos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemPlanos.setText("Planos");
        jMenuItemPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPlanosActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemPlanos);

        jMenuItemProfessor.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemProfessor.setText("Professor");
        jMenuItemProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProfessorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemProfessor);

        jMenuItemUsuario.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemUsuario.setText("Usuario");
        jMenuItemUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemUsuario);
        jMenuCadastro.add(jSeparator1);

        jMenuItemSair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemSair);

        jMenuBar.add(jMenuCadastro);

        jMenuFinanceiro.setText("Financeiro");
        jMenuFinanceiro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItemRecePaga.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemRecePaga.setText("Receber Pagamento");
        jMenuItemRecePaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRecePagaActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemRecePaga);

        jMenuItemReceExtr.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemReceExtr.setText("Recebimentos Extras");
        jMenuItemReceExtr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemReceExtrActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemReceExtr);

        jMenuItemSaidas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemSaidas.setText("Saídas");
        jMenuItemSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSaidasActionPerformed(evt);
            }
        });
        jMenuFinanceiro.add(jMenuItemSaidas);

        jMenuBar.add(jMenuFinanceiro);

        jMenuRelatorio.setText("Relatórios");
        jMenuRelatorio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItemRelatPagam.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemRelatPagam.setText("Relatorio de Pagamentos");
        jMenuRelatorio.add(jMenuItemRelatPagam);

        jMenuItemRelatDeve.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemRelatDeve.setText("Relatórios de Devedores");
        jMenuRelatorio.add(jMenuItemRelatDeve);

        jMenuItemRelatSaida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemRelatSaida.setText("Relatório de Saídas");
        jMenuRelatorio.add(jMenuItemRelatSaida);

        jMenuBar.add(jMenuRelatorio);

        jMenuSoftware.setText("Softwares");
        jMenuSoftware.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItemAgenda.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemAgenda.setText("Agenda");
        jMenuSoftware.add(jMenuItemAgenda);

        jMenuItemCalculadora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemCalculadora.setText("Calculadora");
        jMenuSoftware.add(jMenuItemCalculadora);

        jMenuItem3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem3.setText("jMenuItem3");
        jMenuSoftware.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem4.setText("jMenuItem4");
        jMenuSoftware.add(jMenuItem4);

        jMenuItem5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItem5.setText("jMenuItem5");
        jMenuSoftware.add(jMenuItem5);

        jMenuBar.add(jMenuSoftware);

        jMenuSobre.setText("Sobre");
        jMenuSobre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jMenuItemSOSI.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemSOSI.setText("Sobre O Sistema");
        jMenuItemSOSI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSOSIActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSOSI);

        jMenuItemSOPR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jMenuItemSOPR.setText("Sobre O Programador");
        jMenuItemSOPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSOPRActionPerformed(evt);
            }
        });
        jMenuSobre.add(jMenuItemSOPR);

        jMenuBar.add(jMenuSobre);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dekPrincipal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dekPrincipal)
                    .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1296, 807));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        CadastraCliente cc = new CadastraCliente();
        dekPrincipal.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnReceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReceberActionPerformed
        // TODO add your handling code here:
        CadastraPagamento cp = new CadastraPagamento();
        dekPrincipal.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_btnReceberActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        // Sair do Sistema
        int sair = JOptionPane.showConfirmDialog(null, "Deseja Fechar o sistema", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(sair);
        }
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemUsuarioActionPerformed
        // Cadastro de Usuario
        CadastrarUsuario CaUs = new CadastrarUsuario();
        dekPrincipal.add(CaUs);
        CaUs.setVisible(true);
    }//GEN-LAST:event_jMenuItemUsuarioActionPerformed

    private void jMenuItemClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemClienteActionPerformed
        // TODO add your handling code here:
        CadastraCliente cc = new CadastraCliente();
        dekPrincipal.add(cc);
        cc.setVisible(true);
    }//GEN-LAST:event_jMenuItemClienteActionPerformed

    private void jMenuItemPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPlanosActionPerformed
        // TODO add your handling code here:
        CadastraPlano cp = new CadastraPlano();
        dekPrincipal.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItemPlanosActionPerformed

    private void jMenuItemProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProfessorActionPerformed
        // TODO add your handling code here:
        CadastraProfessor caPr = new CadastraProfessor();
        dekPrincipal.add(caPr);
        caPr.setVisible(true);
    }//GEN-LAST:event_jMenuItemProfessorActionPerformed

    private void jMenuItemRecePagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRecePagaActionPerformed
        // TODO add your handling code here:
        CadastraPagamento cp = new CadastraPagamento();
        dekPrincipal.add(cp);
        cp.setVisible(true);
    }//GEN-LAST:event_jMenuItemRecePagaActionPerformed

    private void jMenuItemSOSIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSOSIActionPerformed
        // TODO add your handling code here:
        SobreSistema ss = new SobreSistema();
        dekPrincipal.add(ss);
        ss.setVisible(true);
    }//GEN-LAST:event_jMenuItemSOSIActionPerformed

    private void jMenuItemSOPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSOPRActionPerformed
        // TODO add your handling code here:
        SobreProgramador sp = new SobreProgramador();
        dekPrincipal.add(sp);
        sp.setVisible(true);
    }//GEN-LAST:event_jMenuItemSOPRActionPerformed

    private void jMenuItemReceExtrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemReceExtrActionPerformed
        // TODO add your handling code here:
        CadastraRecebimento cr = new CadastraRecebimento();
        dekPrincipal.add(cr);
        cr.setVisible(true);
    }//GEN-LAST:event_jMenuItemReceExtrActionPerformed

    private void jMenuItemSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSaidasActionPerformed
        // TODO add your handling code here:
        CadastraSaida cs = new CadastraSaida();
        dekPrincipal.add(cs);
        cs.setVisible(true);
    }//GEN-LAST:event_jMenuItemSaidasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnReceber;
    private javax.swing.JDesktopPane dekPrincipal;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuFinanceiro;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemAgenda;
    private javax.swing.JMenuItem jMenuItemCalculadora;
    private javax.swing.JMenuItem jMenuItemCliente;
    private javax.swing.JMenuItem jMenuItemPlanos;
    private javax.swing.JMenuItem jMenuItemProfessor;
    private javax.swing.JMenuItem jMenuItemReceExtr;
    private javax.swing.JMenuItem jMenuItemRecePaga;
    private javax.swing.JMenuItem jMenuItemRelatDeve;
    private javax.swing.JMenuItem jMenuItemRelatPagam;
    private javax.swing.JMenuItem jMenuItemRelatSaida;
    private javax.swing.JMenuItem jMenuItemSOPR;
    private javax.swing.JMenuItem jMenuItemSOSI;
    private javax.swing.JMenuItem jMenuItemSaidas;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemUsuario;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JMenu jMenuSobre;
    private javax.swing.JMenu jMenuSoftware;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblLogoIMG;
    public javax.swing.JLabel lblNomeUsuario;
    // End of variables declaration//GEN-END:variables
}