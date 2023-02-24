package VIEW;


import DAO.CadastrarDAO;
import DTO.CadastrarDTO;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Rafael
 */
public class painelcadastro extends javax.swing.JFrame {

    /**
     * Creates new form painelcadastro
     */
    public painelcadastro() {
        initComponents();
        JOptionPane.showMessageDialog(null, "Bem vindo ao Sistema de cadastro");
          listarValores(); 
          
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
        textNome = new javax.swing.JTextField();
        textCpf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textLimite = new javax.swing.JTextField();
        btnSAIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        botaoPesquisar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        btnCarregarCampos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        setSize(new java.awt.Dimension(110, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("NOME:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        textNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 102), new java.awt.Color(153, 255, 51), null, null));
        getContentPane().add(textNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 309, -1));

        textCpf.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 102), new java.awt.Color(153, 255, 51), null, null));
        textCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCpfActionPerformed(evt);
            }
        });
        getContentPane().add(textCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 211, -1));

        jLabel2.setText("CPF:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jButton1.setText("CADASTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jLabel3.setText("RG: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        textRg.setActionCommand("<Not Set>");
        textRg.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 102), new java.awt.Color(153, 255, 51), null, null));
        getContentPane().add(textRg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 135, -1));

        jLabel4.setText("LIMITE:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        textLimite.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 102, 102), new java.awt.Color(153, 255, 51), null, null));
        getContentPane().add(textLimite, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 99, -1));

        btnSAIR.setBackground(new java.awt.Color(255, 51, 102));
        btnSAIR.setText("SAIR");
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        getContentPane().add(btnSAIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 90, 30));

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOME", "CPF", "RG", "LIMITE",
            }
        ));
        jScrollPane1.setViewportView(tabelaPessoa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 335, 590, 240));

        botaoPesquisar.setText("PESQUISAR");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel5.setText("CÓDIGO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        textCodigo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        textCodigo.setEnabled(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(textCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, -1));

        btnCarregarCampos.setText("CARREGAR CAMPOS");
        btnCarregarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarCamposActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarregarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        jButton3.setText("LIMPAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, -1, -1));

        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       CadastrarPessoa(); 
       listarValores();
       LimparCampos();
                
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCpfActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
System.exit(0);              // TODO add your handling code here:
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        listarValores();        // TODO add your handling code here:
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void btnCarregarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarCamposActionPerformed
      CarregarCampos();
    }//GEN-LAST:event_btnCarregarCamposActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       LimparCampos(); // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        try {
            AlterarPessoa();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(painelcadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
        listarValores();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            //Ondevai ser excluido os registros // TODO add your handling code here:
            excluirPessoa();
            listarValores();
            LimparCampos();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(painelcadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(painelcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(painelcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(painelcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(painelcadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new painelcadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCarregarCampos;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPessoa;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textCpf;
    private javax.swing.JTextField textLimite;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRg;
    // End of variables declaration//GEN-END:variables
    private void listarValores(){
        try {
            CadastrarDAO objcadastrardao = new CadastrarDAO(); 
            DefaultTableModel model = (DefaultTableModel)tabelaPessoa.getModel();
            model.setNumRows(0); 
            ArrayList<CadastrarDTO> lista = objcadastrardao.PesquisarPessoa(); 
            
            for (int num = 0; num < lista.size (); num ++) {
                model.addRow(new Object[] {
                    lista.get(num).getId_pessoa(), 
                    lista.get(num).getNome(),
                    lista.get(num).getCpf(),
                    lista.get(num).getRg(),
                    lista.get(num).getLimite()
                });
                
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores VIEW: " + erro);
        }
    }
        private void CarregarCampos() {
            int setar = tabelaPessoa.getSelectedRow(); 
            
            textCodigo.setText(tabelaPessoa.getModel().getValueAt(setar,0).toString());
            textNome.setText(tabelaPessoa.getModel().getValueAt(setar,1).toString());
            textRg.setText(tabelaPessoa.getModel().getValueAt(setar,2).toString());
            textCpf.setText(tabelaPessoa.getModel().getValueAt(setar,3).toString());
            textLimite.setText(tabelaPessoa.getModel().getValueAt(setar,4).toString());
        }
        private void CadastrarPessoa() {
            String nome_cliente, cpf_cliente, rg_cliente;
        Integer limite_cliente; 
        
        nome_cliente = textNome.getText();
        cpf_cliente = textCpf.getText(); 
        rg_cliente = textRg.getText ();
        limite_cliente = Integer.valueOf(textLimite.getText()); 
        
        CadastrarDTO objcadastropessoa = new CadastrarDTO();
        objcadastropessoa.setNome(nome_cliente);
        objcadastropessoa.setCpf(cpf_cliente);
        objcadastropessoa.setRg(rg_cliente);
        objcadastropessoa.setLimite(limite_cliente);
        
        CadastrarDAO objfuncionariodao = new CadastrarDAO();
        try {
            objfuncionariodao.cadastrarPessoa (objcadastropessoa);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(painelcadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        private void LimparCampos() {
            textCodigo.setText(""); 
            textNome.setText("");
            textRg.setText("");
            textCpf.setText("");
            textLimite.setText("");
            textNome.requestFocus(); 
        }
        private void AlterarPessoa() throws ClassNotFoundException {
           String nome,cpf,rg; 
           int limite, id_pessoa;  
           
           id_pessoa = Integer.parseInt(textCodigo.getText()); 
           limite = Integer.parseInt(textLimite.getText());
           nome = textNome.getText(); 
           cpf = textCpf.getText(); 
           rg = textRg.getText(); 
           
           CadastrarDTO  objcadastrardto = new CadastrarDTO(); 
           objcadastrardto.setId_pessoa(id_pessoa);
           objcadastrardto.setNome(nome);
           objcadastrardto.setCpf(cpf);
           objcadastrardto.setRg(rg);
           objcadastrardto.setLimite(limite);
           
           CadastrarDAO objcadastrarDAO = new CadastrarDAO(); 
           objcadastrarDAO.alterarPessoa(objcadastrardto);
        }
        
        private void excluirPessoa() throws ClassNotFoundException {
          
           int  id_pessoa;  
           
           id_pessoa = Integer.parseInt(textCodigo.getText()); 
          
           
           CadastrarDTO  objcadastrardto = new CadastrarDTO(); 
           objcadastrardto.setId_pessoa(id_pessoa);
           
           
           CadastrarDAO objcadastrarDAO = new CadastrarDAO(); 
           objcadastrarDAO.excluirPESSOA(objcadastrardto); 
            
        }
}