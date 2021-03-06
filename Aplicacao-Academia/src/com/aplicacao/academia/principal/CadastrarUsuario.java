/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacao.academia.principal;

import com.aplicacao.academia.apps.FuncoesUsuario;
import com.aplicacao.academia.classes.Hash;
import com.aplicacao.academia.models.Usuario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariano
 */
public class CadastrarUsuario extends javax.swing.JInternalFrame {

    FuncoesUsuario fu = new FuncoesUsuario();
    Usuario usuario = new Usuario();
    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario() {
        initComponents();
        btnExcluir.setEnabled(false);
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
        txtNome = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jcbTipo = new javax.swing.JComboBox<>();
        btnPesq = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Usuário");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Login:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Tipo:");

        txtNome.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtSenha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jcbTipo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        btnPesq.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnPesq.setText("Pesquisar");
        btnPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesqActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 147, Short.MAX_VALUE)
                        .addComponent(btnPesq)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNome)
                            .addComponent(txtLogin)
                            .addComponent(txtSenha))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesq)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO o codigo para pedir autorização para sair do campo de cadastro e fechar a janela de cadastro:
        int sair = JOptionPane.showConfirmDialog(null, "Deseja fechar a tela de cadastro de usuario?", "Atenção", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO o codigo para salvar ou atualizar os dados de usuarios:
        
        String senha = txtSenha.getText();
        senha = Hash.toHexadecimal(senha.getBytes());
        try {
            senha = Hash.toMD5Hash(senha);
        } catch (Exception e) {
            Logger.getLogger(TelaLoginAcademia.class.getName()).log(Level.SEVERE, null, e);
        }

        String opcao = btnSalvar.getText();
        
        if (opcao == "Salvar") {
            if (txtNome.getText().isEmpty() || txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Atenção Preencha todos os campos para cadastrar um novo usuario", "Atenção", 1);
            } else {
                usuario.setNomeUsuario(txtNome.getText());
                usuario.setLoginUsuario(txtLogin.getText());
                usuario.setSenhaUsuario(senha);
                usuario.setTipoUsuario(jcbTipo.getSelectedItem().toString());
                boolean salvou = fu.CadastraUsuario(usuario);
                if (salvou == true) {
                    JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso", "Sucesso", 1);
                    txtNome.setText("");
                    txtLogin.setText("");
                    txtSenha.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao salvar os dados do usuario", "Atenção", 1);
                }
            }
        } else {
            String senhaNC = txtSenha.getText();
            senhaNC = Hash.toHexadecimal(senhaNC.getBytes());
            try {
                senhaNC = Hash.toMD5Hash(senhaNC);
            } catch (Exception e) {
                Logger.getLogger(TelaLoginAcademia.class.getName()).log(Level.SEVERE, null, e);
            }
            if (txtNome.getText().isEmpty() || txtLogin.getText().isEmpty() || txtSenha.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos para poder atualizar o usuario", "Atenção", 1);
            } else {
                if (senhaNC == usuario.getSenhaUsuario()) {
                    usuario.setNomeUsuario(txtNome.getText());
                    usuario.setLoginUsuario(txtLogin.getText());
                    usuario.setTipoUsuario(jcbTipo.getSelectedItem().toString());
                    usuario.setSenhaUsuario(usuario.getSenhaUsuario());
                    boolean atualizou = fu.AtualizaUsuario(usuario);
                    if (atualizou == true) {
                        JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucesso", "Aviso", 1);
                        txtNome.setText("");
                        txtSenha.setText("");
                        txtLogin.setText("");
                        btnSalvar.setText("Salvar");
                        btnExcluir.setEnabled(false);
                    }
                } else {
                    usuario.setNomeUsuario(txtNome.getText());
                    usuario.setLoginUsuario(txtLogin.getText());
                    usuario.setSenhaUsuario(senhaNC);
                    usuario.setTipoUsuario(jcbTipo.getSelectedItem().toString());
                    boolean atualizou = fu.AtualizaUsuario(usuario);
                    if (atualizou == true) {
                        JOptionPane.showMessageDialog(null, "Usuario Atualizado com sucesso", "Aviso", 1);
                        txtNome.setText("");
                        txtSenha.setText("");
                        txtLogin.setText("");
                        btnSalvar.setText("Salvar");
                        btnExcluir.setEnabled(false);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesqActionPerformed
        // TODO add your handling code here:
        usuario = fu.PesquisaUsuario(txtNome.getText());
        //System.out.println(usuario);
        if (usuario == null) {
            JOptionPane.showMessageDialog(null, "Usuario não encontrado", "Alerta", 1);
        }else{
            txtLogin.setText(usuario.getLoginUsuario());
            txtSenha.setText(usuario.getSenhaUsuario());
            jcbTipo.setSelectedItem(usuario.getTipoUsuario());
            btnExcluir.setEnabled(true);
            btnSalvar.setText("Atualizar");
        }
        //PesquisaUsuario(txtNome.getText());
    }//GEN-LAST:event_btnPesqActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
        usuario = fu.PesquisaUsuario(txtNome.getText());
        int excluir = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir esse usuario", "Atenção", JOptionPane.YES_NO_OPTION);
        if (excluir == JOptionPane.YES_OPTION) {
            boolean excluiu = fu.ExcluirUsuario(usuario.getIdUsuario());
            if (excluiu == true) {
                JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso", "Aviso", 1);
                btnSalvar.setText("Salvar");
                btnExcluir.setEnabled(false);
                txtNome.setText("");
                txtLogin.setText("");
                txtSenha.setText("");
            }
        }
        
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesq;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
