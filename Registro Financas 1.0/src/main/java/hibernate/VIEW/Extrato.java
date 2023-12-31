/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hibernate.VIEW;

import hibernate.CONTROLLER.DAO;
import hibernate.MODEL.Entrada;
import hibernate.MODEL.Saida;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author Unicesumar
 */
public class Extrato extends javax.swing.JFrame {

    /**
     * Creates new form Extrato
     */
    
    private DAO dao;
    public Extrato() {
        initComponents();
        this.setLocationRelativeTo(null);
        dao = DAO.getInstace();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TaExtrato = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        BtDeletarExtrato = new javax.swing.JButton();
        BtAtualizarExtrato = new javax.swing.JButton();
        BtVoltar = new javax.swing.JButton();
        BtGerarExtrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TaExtrato.setColumns(20);
        TaExtrato.setRows(5);
        TaExtrato.setEnabled(false);
        jScrollPane1.setViewportView(TaExtrato);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Extrato");

        BtDeletarExtrato.setText("Deletar extrato");
        BtDeletarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtDeletarExtratoActionPerformed(evt);
            }
        });

        BtAtualizarExtrato.setText("Atualizar extrato");
        BtAtualizarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtAtualizarExtratoActionPerformed(evt);
            }
        });

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });

        BtGerarExtrato.setText("Gerar extrato");
        BtGerarExtrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtGerarExtratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtVoltar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtGerarExtrato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtDeletarExtrato)
                                        .addGap(26, 26, 26)
                                        .addComponent(BtAtualizarExtrato)))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtVoltar)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtDeletarExtrato)
                    .addComponent(BtAtualizarExtrato)
                    .addComponent(BtGerarExtrato))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        RegistroFinancas registrofinancas = new RegistroFinancas();
        registrofinancas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void BtGerarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtGerarExtratoActionPerformed
        List<Entrada> entradas = dao.listarEntradas();
        List<Saida> saidas = dao.listarSaidas();
        float totalEntradas = 0;
        float totalSaidas = 0;
        
        for (Entrada entrada : entradas) {
            TaExtrato.append("Entrada de: R$" + entrada.getValor() + " registrado na categoria: " + entrada.getCategoria() + "\n");
            totalEntradas += entrada.getValor();
        }

        for (Saida saida : saidas) {
            TaExtrato.append("Saída de: R$" + saida.getValor() + " registrado na categoria: " + saida.getCategoria() + "\n");
            totalSaidas += saida.getValor();
        }

        TaExtrato.append("\nTotal de Entradas: R$" + totalEntradas + "\n");
        TaExtrato.append("Total de Saídas: R$" + totalSaidas + "\n");
        TaExtrato.append("Saldo: R$" + (totalEntradas - totalSaidas) + "\n");
    }//GEN-LAST:event_BtGerarExtratoActionPerformed

    private void BtDeletarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtDeletarExtratoActionPerformed

        if(TaExtrato.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há nenhum extrato gerado!");
        }else{
            String tabela = "Entrada";
            String tabela2 = "Saida";
            dao.limparTabela(tabela);
            dao.limparTabela(tabela2);
            TaExtrato.setText("Extrato apagado com sucesso!");
        }
    }//GEN-LAST:event_BtDeletarExtratoActionPerformed

    private void BtAtualizarExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtAtualizarExtratoActionPerformed
        
        if(TaExtrato.getText().trim().isEmpty()){
    JOptionPane.showMessageDialog(null, "Você primeiro deve gerar o extrato antes de atualizar!");
} else {
    String tipo = JOptionPane.showInputDialog("Qual tipo de registro você deseja atualizar? (entrada/saida)");
    if (tipo.equals("entrada")) {
        String idStr = JOptionPane.showInputDialog("Insira o ID do item a ser atualizado:");
        String valorNovo = JOptionPane.showInputDialog("Informe o novo valor:");
        String novaCategoria = JOptionPane.showInputDialog("Informe a nova categoria:");
        
        int identificador = Integer.parseInt(idStr);
        float novoValor = Float.parseFloat(valorNovo);
        
        DAO dao = DAO.getInstace();
        
        try {
            List<Entrada> entradas = dao.listarEntradas();
            Entrada registro = null; 
            
            for (Entrada entrada : entradas) {
                if (entrada.getId() == identificador) {
                    registro = entrada;
                    break;
                }
            }
            
            if (registro != null) {
                registro.setValor(novoValor);
                registro.setCategoria(novaCategoria);
                
                dao.inserirEntrada(registro);
                
                JOptionPane.showMessageDialog(null, "Registro de entrada atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro de entrada não encontrado com o ID fornecido.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o registro de entrada.");
        }
    } else if (tipo.equals("saida")) {
        String idStr = JOptionPane.showInputDialog("Insira o ID do item a ser atualizado:");
        String valorNovo = JOptionPane.showInputDialog("Informe o novo valor:");
        String novaCategoria = JOptionPane.showInputDialog("Informe a nova categoria:");
        
        int identificador = Integer.parseInt(idStr);
        float novoValor = Float.parseFloat(valorNovo);
        
        DAO dao = DAO.getInstace();
        
        try {
            List<Saida> saidas = dao.listarSaidas();
            Saida registro = null; 
            
            for (Saida saida : saidas) {
                if (saida.getId() == identificador) {
                    registro = saida;
                    break;
                }
            }
            
            if (registro != null) {
                registro.setValor(novoValor);
                registro.setCategoria(novaCategoria);
                
                dao.inserirSaida(registro);
                
                JOptionPane.showMessageDialog(null, "Registro de saída atualizado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Registro de saída não encontrado com o ID fornecido.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao atualizar o registro de saída.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha 'entrada' ou 'saida'.");
    }

        }
    }//GEN-LAST:event_BtAtualizarExtratoActionPerformed
    
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
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Extrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Extrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtAtualizarExtrato;
    private javax.swing.JButton BtDeletarExtrato;
    private javax.swing.JButton BtGerarExtrato;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JTextArea TaExtrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
