/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author huespave
 */
public class Fuentes extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Fuentes() {
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

        TXTpantalla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        BTN12 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTNcoma = new javax.swing.JButton();
        BTN13 = new javax.swing.JButton();
        BTNpunto = new javax.swing.JButton();
        BTNresta1 = new javax.swing.JButton();
        BTNresta = new javax.swing.JButton();
        BTNmultiplica = new javax.swing.JButton();
        BTNdivide = new javax.swing.JButton();
        BTN10 = new javax.swing.JButton();
        BTNigual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXTpantalla.setForeground(new java.awt.Color(0, 153, 153));
        TXTpantalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TXTpantalla.setCaretColor(new java.awt.Color(0, 102, 255));
        TXTpantalla.setDisabledTextColor(new java.awt.Color(0, 204, 204));
        TXTpantalla.setSelectionColor(new java.awt.Color(255, 102, 102));
        TXTpantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTpantallaActionPerformed(evt);
            }
        });
        getContentPane().add(TXTpantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 40));

        jLabel1.setText("calculator");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 0, -1, -1));

        BTN7.setForeground(new java.awt.Color(102, 153, 0));
        BTN7.setText("7");
        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        BTN8.setForeground(new java.awt.Color(102, 153, 0));
        BTN8.setText("8");
        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        BTN12.setForeground(new java.awt.Color(102, 153, 0));
        BTN12.setText("9");
        BTN12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN12ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        BTN4.setForeground(new java.awt.Color(102, 153, 0));
        BTN4.setText("4");
        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        BTN5.setForeground(new java.awt.Color(102, 153, 0));
        BTN5.setText("5");
        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        BTN6.setForeground(new java.awt.Color(102, 153, 0));
        BTN6.setText("6");
        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        BTN1.setForeground(new java.awt.Color(102, 153, 0));
        BTN1.setText("1");
        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        BTN2.setForeground(new java.awt.Color(102, 153, 0));
        BTN2.setText("2");
        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        BTN3.setForeground(new java.awt.Color(102, 153, 0));
        BTN3.setText("3");
        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        BTNcoma.setForeground(new java.awt.Color(102, 153, 0));
        BTNcoma.setText(",");
        BTNcoma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNcomaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNcoma, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 39, -1));

        BTN13.setForeground(new java.awt.Color(102, 153, 0));
        BTN13.setText("0");
        BTN13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN13ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        BTNpunto.setForeground(new java.awt.Color(102, 153, 0));
        BTNpunto.setText(".");
        BTNpunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNpuntoActionPerformed(evt);
            }
        });
        getContentPane().add(BTNpunto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 40, -1));

        BTNresta1.setForeground(new java.awt.Color(102, 153, 0));
        BTNresta1.setText("+");
        BTNresta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNresta1ActionPerformed(evt);
            }
        });
        getContentPane().add(BTNresta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 50, 31));

        BTNresta.setForeground(new java.awt.Color(102, 153, 0));
        BTNresta.setText("-");
        BTNresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNrestaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNresta, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 51, 32));

        BTNmultiplica.setForeground(new java.awt.Color(102, 153, 0));
        BTNmultiplica.setText("*");
        BTNmultiplica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmultiplicaActionPerformed(evt);
            }
        });
        getContentPane().add(BTNmultiplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 51, 31));

        BTNdivide.setForeground(new java.awt.Color(102, 153, 0));
        BTNdivide.setText("/");
        BTNdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNdivideActionPerformed(evt);
            }
        });
        getContentPane().add(BTNdivide, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 50, 32));

        BTN10.setForeground(new java.awt.Color(102, 153, 0));
        BTN10.setText("Clear");
        BTN10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN10ActionPerformed(evt);
            }
        });
        getContentPane().add(BTN10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 120, 31));

        BTNigual.setForeground(new java.awt.Color(51, 153, 0));
        BTNigual.setText("=");
        BTNigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNigualActionPerformed(evt);
            }
        });
        getContentPane().add(BTNigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 50, 31));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTpantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTpantallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTpantallaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void BTN10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN10ActionPerformed
        TXTpantalla.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_BTN10ActionPerformed

    private void BTN13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN13ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"0");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN13ActionPerformed

    private void BTN12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN12ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"9");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN12ActionPerformed

    private void BTNresta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNresta1ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"+");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNresta1ActionPerformed

    private void BTNigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNigualActionPerformed

        int longitud=0, operador=0;
        double numero1=0,numero2=0,resultado=0;
        String operaciono=TXTpantalla.getText().toString();
        longitud=TXTpantalla.getText().toString().length();
        System.out.println("longitud"+longitud);

        ///*   */-*/

        operador=operaciono.lastIndexOf("+");

        System.out.println("oposop"+operador);

        if(operador!=-1){

            System.out.println("+"+operador);
            numero1=Double.parseDouble(operaciono.substring(0, operador));

            System.out.println("num1: "+numero1);

            numero2=Double.parseDouble(operaciono.substring(operador+1, longitud));

            System.out.println("num2: "+numero2);

            resultado=numero1+numero2;
            System.out.println("resultado: "+resultado);

            TXTpantalla.setText(""+resultado);

            ///*   */-*/

        }
        operador=operaciono.lastIndexOf("-");

        System.out.println("oposop"+operador);

        if(operador!=-1){

            System.out.println("-"+operador);
            numero1=Double.parseDouble(operaciono.substring(0, operador));

            System.out.println("num1: "+numero1);

            numero2=Double.parseDouble(operaciono.substring(operador+1, longitud));

            System.out.println("num2: "+numero2);

            resultado=numero1-numero2;
            System.out.println("resultado: "+resultado);

            TXTpantalla.setText(""+resultado);
        }
        ///*   */-*/

        operador=operaciono.lastIndexOf("*");

        System.out.println("oposop"+operador);

        if(operador!=-1){

            System.out.println("*"+operador);
            numero1=Double.parseDouble(operaciono.substring(0, operador));

            System.out.println("num1: "+numero1);

            numero2=Double.parseDouble(operaciono.substring(operador+1, longitud));

            System.out.println("num2: "+numero2);

            resultado=numero1*numero2;
            System.out.println("resultado: "+resultado);

            TXTpantalla.setText(""+resultado); ///*   */-*/

        }
        operador=operaciono.lastIndexOf("/");

        System.out.println("oposop"+operador);

        if(operador!=-1){

            System.out.println("/"+operador);
            numero1=Double.parseDouble(operaciono.substring(0, operador));

            System.out.println("num1: "+numero1);

            numero2=Double.parseDouble(operaciono.substring(operador+1, longitud));

            System.out.println("num2: "+numero2);

            resultado=numero1/numero2;
            System.out.println("resultado: "+resultado);

            TXTpantalla.setText(""+resultado);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_BTNigualActionPerformed

    private void BTNcomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNcomaActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+",");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNcomaActionPerformed

    private void BTNpuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNpuntoActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+".");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNpuntoActionPerformed

    private void BTNrestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNrestaActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"-");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNrestaActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"8");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN8ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"7");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTNdivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNdivideActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"/");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNdivideActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"6");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"5");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"4");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTNmultiplicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmultiplicaActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"*");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNmultiplicaActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"3");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"2");
        // TODO add your handling code here:
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        TXTpantalla.setText(TXTpantalla.getText()+"1");

        // TODO add your handling code here:
    }//GEN-LAST:event_BTN1ActionPerformed

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
            java.util.logging.Logger.getLogger(Fuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fuentes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fuentes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN10;
    private javax.swing.JButton BTN12;
    private javax.swing.JButton BTN13;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JButton BTNcoma;
    private javax.swing.JButton BTNdivide;
    private javax.swing.JButton BTNigual;
    private javax.swing.JButton BTNmultiplica;
    private javax.swing.JButton BTNpunto;
    private javax.swing.JButton BTNresta;
    private javax.swing.JButton BTNresta1;
    private javax.swing.JTextField TXTpantalla;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
