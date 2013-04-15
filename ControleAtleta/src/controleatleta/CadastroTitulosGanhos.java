package controleatleta;

import ValidaDados.ValidaDados;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CadastroTitulosGanhos extends javax.swing.JDialog {

    private HashMap<String, Integer> nomeQntdTitulosGanhos;
    private String nomeTitulo;
    private int qntd;
    
    public CadastroTitulosGanhos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public String getNomeTitulo(){
        return nomeTitulo;
    }
    public int getQuantidadeTitulo(){
        return qntd;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNomeTitulo = new javax.swing.JLabel();
        jLabelQuantidadeTitulo = new javax.swing.JLabel();
        jTextFieldNomeTitulo = new javax.swing.JTextField();
        jTextFieldQuantidadeTitulo = new javax.swing.JTextField();
        jButtonSalvarTitulos = new javax.swing.JButton();
        jButtonCancelarTitulos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelNomeTitulo.setText("Nome:");

        jLabelQuantidadeTitulo.setText("Quantidade:");

        jButtonSalvarTitulos.setText("Salvar");
        jButtonSalvarTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarTitulosActionPerformed(evt);
            }
        });

        jButtonCancelarTitulos.setText("Cancelar");
        jButtonCancelarTitulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarTitulosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelQuantidadeTitulo)
                    .addComponent(jLabelNomeTitulo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldNomeTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSalvarTitulos, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                        .addComponent(jButtonCancelarTitulos))
                    .addComponent(jTextFieldQuantidadeTitulo, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelNomeTitulo)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextFieldNomeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQuantidadeTitulo)
                    .addComponent(jTextFieldQuantidadeTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarTitulos)
                    .addComponent(jButtonCancelarTitulos))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarTitulosActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarTitulosActionPerformed

    private void jButtonSalvarTitulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarTitulosActionPerformed
        
        ValidaDados dados = null;
        String nome;
        int quantidade;
        
        try {
            
            dados.validarNome(jTextFieldNomeTitulo.getText());
            dados.validarQuantidade(jTextFieldQuantidadeTitulo.getText());       
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        nome = jTextFieldNomeTitulo.getText();
        quantidade = Integer.parseInt(jTextFieldQuantidadeTitulo.getText());
        
        nomeQntdTitulosGanhos = new HashMap<String, Integer>();
        nomeQntdTitulosGanhos.put(nome, quantidade);
       
        this.setVisible(false); 
        
    }//GEN-LAST:event_jButtonSalvarTitulosActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroTitulosGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroTitulosGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroTitulosGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroTitulosGanhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroTitulosGanhos dialog = new CadastroTitulosGanhos(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelarTitulos;
    private javax.swing.JButton jButtonSalvarTitulos;
    private javax.swing.JLabel jLabelNomeTitulo;
    private javax.swing.JLabel jLabelQuantidadeTitulo;
    private javax.swing.JTextField jTextFieldNomeTitulo;
    private javax.swing.JTextField jTextFieldQuantidadeTitulo;
    // End of variables declaration//GEN-END:variables
}
