/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gambar;

import javax.swing.JFileChooser;

/**
 *
 * @author tami
 */
public class classgambar extends javax.swing.JFrame {

    /**
     * Creates new form classgambar
     */
    public ClassGambarr gambar;
    public classgambar() {
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

        jLabel1 = new javax.swing.JLabel();
        jSlider1 = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        miBuka = new javax.swing.JMenuItem();
        miSimpan = new javax.swing.JMenuItem();
        miKeluar = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        miGrayscale = new javax.swing.JMenuItem();
        miBiner = new javax.swing.JMenuItem();
        miDefault = new javax.swing.JMenuItem();
        miBrightness = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PCD 1");

        jLabel1.setText("jLabel1");

        jSlider1.setOrientation(javax.swing.JSlider.VERTICAL);
        jSlider1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider1StateChanged(evt);
            }
        });

        jLabel2.setText("jLabel2");

        mnFile.setText("File");

        miBuka.setText("Buka");
        miBuka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBukaActionPerformed(evt);
            }
        });
        mnFile.add(miBuka);

        miSimpan.setText("Simpan");
        miSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSimpanActionPerformed(evt);
            }
        });
        mnFile.add(miSimpan);

        miKeluar.setText("Keluar");
        miKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miKeluarActionPerformed(evt);
            }
        });
        mnFile.add(miKeluar);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Edit");

        miGrayscale.setText("Grayscale");
        miGrayscale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGrayscaleActionPerformed(evt);
            }
        });
        mnEdit.add(miGrayscale);

        miBiner.setText("Biner");
        miBiner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBinerActionPerformed(evt);
            }
        });
        mnEdit.add(miBiner);

        miDefault.setText("Default");
        miDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miDefaultActionPerformed(evt);
            }
        });
        mnEdit.add(miDefault);

        miBrightness.setText("Brightness");
        miBrightness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBrightnessActionPerformed(evt);
            }
        });
        mnEdit.add(miBrightness);

        jMenuBar1.add(mnEdit);

        jMenu1.setText("Op. Geometri");

        jMenuItem1.setText("Zoom In");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Zoom Out");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Flip Vertikal");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Flip Horisontal");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Rotasi 180'");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Rotasi Right 90'");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Rotasi Left 90'");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Free Rotate");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(356, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void miSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSimpanActionPerformed
        JFileChooser IDialog = new JFileChooser();
        if(IDialog.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
            gambar.SaveImage(IDialog.getSelectedFile().getAbsolutePath());
        }
    }//GEN-LAST:event_miSimpanActionPerformed

    private void miBukaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBukaActionPerformed
        JFileChooser IDialog= new JFileChooser();
        if(IDialog.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            gambar=new ClassGambarr(IDialog.getSelectedFile().getAbsolutePath(),355,355);
            jLabel1.setIcon(gambar.Geticon());
        }
    }//GEN-LAST:event_miBukaActionPerformed

    private void miKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_miKeluarActionPerformed

    private void miGrayscaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGrayscaleActionPerformed
        gambar.Grayscale();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miGrayscaleActionPerformed

    private void miBinerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBinerActionPerformed
        gambar.Biner();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miBinerActionPerformed

    private void miDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miDefaultActionPerformed
        gambar.Default();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miDefaultActionPerformed

    private void miBrightnessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBrightnessActionPerformed
        gambar.brightness();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_miBrightnessActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        gambar.zoomin();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        gambar.flipV();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        gambar.flipH();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        gambar.zoomout();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        gambar.rotate180();
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        gambar.rotasiCitra(90, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        gambar.rotasiCitra(-90, this);
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jSlider1.setEnabled(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jSlider1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider1StateChanged
        gambar.rotasiCitra((double)jSlider1.getValue(), this);
        int a = jSlider1.getValue();
        jLabel2.setText(Integer.toString(a));
        jLabel1.setIcon(gambar.ScaleResultIcon);
    }//GEN-LAST:event_jSlider1StateChanged

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
            java.util.logging.Logger.getLogger(classgambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(classgambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(classgambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(classgambar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new classgambar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JMenuItem miBiner;
    private javax.swing.JMenuItem miBrightness;
    private javax.swing.JMenuItem miBuka;
    private javax.swing.JMenuItem miDefault;
    private javax.swing.JMenuItem miGrayscale;
    private javax.swing.JMenuItem miKeluar;
    private javax.swing.JMenuItem miSimpan;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenu mnFile;
    // End of variables declaration//GEN-END:variables
}
