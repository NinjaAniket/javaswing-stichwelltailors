/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stichwelltailorsmain;

import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author anike
 */
public class HomeFrame extends javax.swing.JFrame {

    /** Creates new form HomeFrame */
    public HomeFrame() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        january = new javax.swing.JButton();
        march = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        february = new javax.swing.JButton();
        april = new javax.swing.JButton();
        may = new javax.swing.JButton();
        june = new javax.swing.JButton();
        july = new javax.swing.JButton();
        september = new javax.swing.JButton();
        august = new javax.swing.JButton();
        october = new javax.swing.JButton();
        november = new javax.swing.JButton();
        december = new javax.swing.JButton();
        view = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        january.setText("January");
        january.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        january.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                januaryActionPerformed(evt);
            }
        });

        march.setText("March");
        march.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        march.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marchActionPerformed(evt);
            }
        });

        title.setFont(new Font("Serif", Font.PLAIN, 30));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setText("STICHWELL TAILORS(2018)");

        february.setText("Febraury");
        february.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        february.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                februaryActionPerformed(evt);
            }
        });

        april.setText("April");
        april.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        april.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aprilActionPerformed(evt);
            }
        });

        may.setText("May");
        may.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        may.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayActionPerformed(evt);
            }
        });

        june.setText("June");
        june.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        june.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juneActionPerformed(evt);
            }
        });

        july.setText("July");
        july.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        july.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                julyActionPerformed(evt);
            }
        });

        september.setText("September");
        september.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        september.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                septemberActionPerformed(evt);
            }
        });

        august.setText("August");
        august.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        august.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                augustActionPerformed(evt);
            }
        });

        october.setText("October");
        october.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        october.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                octoberActionPerformed(evt);
            }
        });

        november.setText("November");
        november.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        november.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novemberActionPerformed(evt);
            }
        });

        december.setText("December");
        december.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        december.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decemberActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        view.setText("View");
        july.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 20));
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(june, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(may, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(april, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(march, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(135, 135, 135)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(february, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(january, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(august, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(september, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(october, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(november, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(december, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(july, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
            .addGroup(layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(january, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(july, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(february, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(august, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(march, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(september, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(april, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(october, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(may, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(november, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(june, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(december, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void januaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_januaryActionPerformed
        // TODO add your handling code here:
       new january().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_januaryActionPerformed

    private void marchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marchActionPerformed
        // TODO add your handling code here:
        new march().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_marchActionPerformed

    private void februaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_februaryActionPerformed
        // TODO add your handling code here:
         new febraury().setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_februaryActionPerformed

    private void aprilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aprilActionPerformed
        // TODO add your handling code here:
            new april().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_aprilActionPerformed

    private void mayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayActionPerformed
        // TODO add your handling code here:
            new may().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_mayActionPerformed

    private void juneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juneActionPerformed
        // TODO add your handling code here:
            new june().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_juneActionPerformed

    private void julyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_julyActionPerformed
        // TODO add your handling code here:
            new july().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_julyActionPerformed

    private void septemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_septemberActionPerformed
        // TODO add your handling code here:
            new september().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_septemberActionPerformed

    private void augustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_augustActionPerformed
        // TODO add your handling code here
            new august().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_augustActionPerformed

    private void octoberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_octoberActionPerformed
        // TODO add your handling code here:
            new october().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_octoberActionPerformed

    private void novemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novemberActionPerformed
        // TODO add your handling code here:
            new november().setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_novemberActionPerformed

    private void decemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decemberActionPerformed
        // TODO add your handling code here:
                new december().setVisible(true);
                this.setVisible(false);
            
    }//GEN-LAST:event_decemberActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
                new viewAll().setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_viewActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton april;
    private javax.swing.JButton august;
    private javax.swing.JButton december;
    private javax.swing.JButton february;
    private javax.swing.JButton january;
    private javax.swing.JButton july;
    private javax.swing.JButton june;
    private javax.swing.JButton march;
    private javax.swing.JButton may;
    private javax.swing.JButton november;
    private javax.swing.JButton october;
    private javax.swing.JButton september;
    private javax.swing.JLabel title;
    private javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables

}