package controleatleta;

import ValidaDados.ValidaDados;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CadastroVitoriasDerrotasAno extends javax.swing.JDialog {

    private HashMap<Integer, Integer> vitoriasAno;
    private HashMap<Integer, Integer> derrotasAno;
    private int ano;
    private int vitorias;
    private int derrotas;
    
    public int getAno(){
        return ano;
    }
    
    public int getVitoriasAno(){
        return vitorias;
    }
    
    public int getDerrotasAno(){
        return derrotas;
    }
    public CadastroVitoriasDerrotasAno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAno = new javax.swing.JLabel();
        jLabelNumVitorias = new javax.swing.JLabel();
        jLabelNumDerrotas = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jTextFieldNumVitorias = new javax.swing.JTextField();
        jTextFieldNumDerrotas = new javax.swing.JTextField();
        jButtonSalvarVitoriasDerrotasAno = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelAno.setText("Ano:");

        jLabelNumVitorias.setText("Número de Vitórias:");

        jLabelNumDerrotas.setText("Número de Derrotas:");

        jButtonSalvarVitoriasDerrotasAno.setText("Salvar");
        jButtonSalvarVitoriasDerrotasAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarVitoriasDerrotasAnoActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(139, Short.MAX_VALUE)
                        .addComponent(jButtonSalvarVitoriasDerrotasAno, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNumVitorias)
                            .addComponent(jLabelNumDerrotas)
                            .addComponent(jLabelAno))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldNumVitorias)
                            .addComponent(jTextFieldNumDerrotas, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jTextFieldAno))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAno)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumVitorias)
                    .addComponent(jTextFieldNumVitorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumDerrotas)
                    .addComponent(jTextFieldNumDerrotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvarVitoriasDerrotasAno)
                    .addComponent(jButtonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarVitoriasDerrotasAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarVitoriasDerrotasAnoActionPerformed
        
        ValidaDados dados = null;
        int vitorias;
        int derrotas;
        int ano;
        
        try {
            
            dados.validarAno(jTextFieldAno.getText());       
            dados.validarQuantidade(jTextFieldNumVitorias.getText());
            dados.validarQuantidade(jTextFieldNumDerrotas.getText());       
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        
        ano = Integer.parseInt(jTextFieldAno.getText());
        vitorias = Integer.parseInt(jTextFieldNumVitorias.getText());
        derrotas = Integer.parseInt(jTextFieldNumDerrotas.getText());
        
        vitoriasAno = new HashMap<Integer, Integer>();
        derrotasAno = new HashMap<Integer, Integer>();
        vitoriasAno.put(ano, vitorias);
        derrotasAno.put(ano, derrotas);
      
        this.setVisible(false);
        
    }//GEN-LAST:event_jButtonSalvarVitoriasDerrotasAnoActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroVitoriasDerrotasAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroVitoriasDerrotasAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroVitoriasDerrotasAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroVitoriasDerrotasAno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroVitoriasDerrotasAno dialog = new CadastroVitoriasDerrotasAno(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSalvarVitoriasDerrotasAno;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelNumDerrotas;
    private javax.swing.JLabel jLabelNumVitorias;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldNumDerrotas;
    private javax.swing.JTextField jTextFieldNumVitorias;
    // End of variables declaration//GEN-END:variables
}
