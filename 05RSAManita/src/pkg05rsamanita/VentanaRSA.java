/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pkg05rsamanita;
import java.math.BigInteger;
import java.util.Arrays;
 import pkg05rsamanita.Main;
/**
 *
 * @author 52736
 */
public class VentanaRSA extends javax.swing.JFrame {
    Main mainObj= new Main(SOMEBITS);
    String mensaje,clavePublica,clavePrivada,texto,cifradoString;
    String[] cifradoArray;
    public VentanaRSA() {
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
        jTextValor1 = new javax.swing.JTextField();
        encriptarBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        clavesBtn = new javax.swing.JButton();
        desencryptarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        jTextValor1.setBackground(new java.awt.Color(0, 255, 51));
        jTextValor1.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N
        jTextValor1.setText("Escribir mensaje");
        jTextValor1.setCaretColor(new java.awt.Color(255, 51, 0));
        jTextValor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextValor1ActionPerformed(evt);
            }
        });

        encriptarBtn.setBackground(new java.awt.Color(51, 102, 255));
        encriptarBtn.setFont(new java.awt.Font("Segoe UI Historic", 3, 14)); // NOI18N
        encriptarBtn.setText("Cifrar");
        encriptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encriptarBtnActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        clavesBtn.setBackground(new java.awt.Color(0, 153, 153));
        clavesBtn.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        clavesBtn.setText("Generar la clave ");
        clavesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clavesBtnActionPerformed(evt);
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
                        .addComponent(jTextValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(encriptarBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clavesBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextValor1)
                    .addComponent(encriptarBtn))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(clavesBtn)))
                .addGap(18, 18, 18))
        );

        desencryptarBtn.setBackground(new java.awt.Color(153, 0, 153));
        desencryptarBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        desencryptarBtn.setText("Descifrar");
        desencryptarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desencryptarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desencryptarBtn)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desencryptarBtn)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void desencryptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desencryptarBtnActionPerformed
         // Validar si las claves han sido generadas antes de descifrar
    if (mainObj.n == null || mainObj.d == null) {
        jTextValor1.setText("Genera las claves antes de descifrar.");
        return; // Salir del método si las claves no están generadas
    }

    cifradoString = jTextValor1.getText();
    cifradoArray = cifradoString.replaceAll("\\[|\\]", "").split(", ");
    BigInteger[] cifrado = new BigInteger[cifradoArray.length];

    try {
        for (int i = 0; i < cifradoArray.length; i++) {
            cifrado[i] = new BigInteger(cifradoArray[i]);
        }

        String mensajeDescifrado = mainObj.descifrar(cifrado);
        jTextArea1.setText(mensajeDescifrado);
    } catch (NumberFormatException e) {
        // Manejar la excepción de formato numérico (por ejemplo, mostrar un mensaje de error)
        jTextValor1.setText("Error: El texto cifrado contiene valores no válidos.");
    }
    }//GEN-LAST:event_desencryptarBtnActionPerformed

    private void clavesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clavesBtnActionPerformed
        mainObj.generarPrimos();
        mainObj.generarClaves();
         clavePublica = "e: " + mainObj.e.toString() + ", n: " + mainObj.n.toString();
         clavePrivada = "d: " + mainObj.d.toString() + ", n: " + mainObj.n.toString();
         jTextValor1.setText("");
        
    }//GEN-LAST:event_clavesBtnActionPerformed

    private void encriptarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encriptarBtnActionPerformed
       // Validar si las claves han sido generadas antes de cifrar
    if (mainObj.n == null || mainObj.e == null) {
        jTextValor1.setText("Genera las claves antes de cifrar.");
        return; // Salir del método si las claves no están generadas
    }
    // Cifrar y mostrar información en la interfaz
    mensaje = jTextValor1.getText();
    if(mensaje.equals("")){
        jTextValor1.setText("Debe de existir texto.");
        return;
    }
    BigInteger[] cifrado = mainObj.cifrar(mensaje);
    jTextArea1.setText(Arrays.toString(cifrado));
    }//GEN-LAST:event_encriptarBtnActionPerformed

    private void jTextValor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextValor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextValor1ActionPerformed
 
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
            java.util.logging.Logger.getLogger(VentanaRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRSA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRSA().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clavesBtn;
    private javax.swing.JButton desencryptarBtn;
    private javax.swing.JButton encriptarBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextValor1;
    // End of variables declaration//GEN-END:variables
}
