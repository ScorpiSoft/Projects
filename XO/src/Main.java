
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saeed
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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
        jPanel1 = new javax.swing.JPanel();
        tcBtn = new javax.swing.JButton();
        dlBtn = new javax.swing.JButton();
        tlBtn = new javax.swing.JButton();
        mlBtn = new javax.swing.JButton();
        mcBtn = new javax.swing.JButton();
        trBtn = new javax.swing.JButton();
        dcBtn = new javax.swing.JButton();
        drBtn = new javax.swing.JButton();
        mrBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        resetBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        playertxt = new javax.swing.JLabel();
        pointtxt = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Welcome to My X-O");

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tcBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        tcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tcBtnActionPerformed(evt);
            }
        });

        dlBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        dlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dlBtnActionPerformed(evt);
            }
        });

        tlBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        tlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tlBtnActionPerformed(evt);
            }
        });

        mlBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        mlBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mlBtnActionPerformed(evt);
            }
        });

        mcBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        mcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcBtnActionPerformed(evt);
            }
        });

        trBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        trBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trBtnActionPerformed(evt);
            }
        });

        dcBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        dcBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcBtnActionPerformed(evt);
            }
        });

        drBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        drBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drBtnActionPerformed(evt);
            }
        });

        mrBtn.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        mrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(drBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(trBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dlBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(trBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("Points");

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        playertxt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        playertxt.setText("Player 1 Tern");

        pointtxt.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        pointtxt.setText("0 - 0");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetBtn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pointtxt)
                                .addComponent(jLabel2)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(playertxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(playertxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pointtxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resetBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitBtn)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public int tern = 0 , p1 = 0 , p2 = 0;
    public String play (String x)
    {
        if ( !x.equals("") )
            return x;
        if (tern%2==1)
        { 
            x =  "O";
            playertxt.setText("Player 1 Tern");
        }
        else
        { x =  "X";playertxt.setText("Player 2 Tern");}
        
        tern++;
       
        return x;
    }
    private void tlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tlBtnActionPerformed
        // TODO add your handling code here:
        tlBtn.setText(play(tlBtn.getText()));chackwan();
    }//GEN-LAST:event_tlBtnActionPerformed

    private void tcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tcBtnActionPerformed
        // TODO add your handling code here:
        tcBtn.setText(play(tcBtn.getText()));chackwan();
    }//GEN-LAST:event_tcBtnActionPerformed

    private void trBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trBtnActionPerformed
        // TODO add your handling code here:
        trBtn.setText(play(trBtn.getText()));chackwan();
    }//GEN-LAST:event_trBtnActionPerformed

    private void mlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mlBtnActionPerformed
        // TODO add your handling code here:
        mlBtn.setText(play(mlBtn.getText()));chackwan();
    }//GEN-LAST:event_mlBtnActionPerformed

    private void mcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcBtnActionPerformed
        // TODO add your handling code here:
        mcBtn.setText(play(mcBtn.getText()));chackwan();
    }//GEN-LAST:event_mcBtnActionPerformed

    private void mrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mrBtnActionPerformed
        // TODO add your handling code here:
        mrBtn.setText(play(mrBtn.getText()));chackwan();
    }//GEN-LAST:event_mrBtnActionPerformed

    private void dlBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dlBtnActionPerformed
        // TODO add your handling code here:
        dlBtn.setText(play(dlBtn.getText()));chackwan();
    }//GEN-LAST:event_dlBtnActionPerformed

    private void dcBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcBtnActionPerformed
        // TODO add your handling code here:
        dcBtn.setText(play(dcBtn.getText()));chackwan();
    }//GEN-LAST:event_dcBtnActionPerformed

    private void drBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drBtnActionPerformed
        // TODO add your handling code here:
        drBtn.setText(play(drBtn.getText()));chackwan();
    }//GEN-LAST:event_drBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        // TODO add your handling code here:
         reset();
         p1 = p2 = 0;
    }//GEN-LAST:event_resetBtnActionPerformed

    public void reset()
    {
        tlBtn.setText("");
         tcBtn.setText("");
         trBtn.setText("");
         mlBtn.setText("");
         mcBtn.setText("");
         mrBtn.setText("");
         dlBtn.setText("");
         dcBtn.setText("");
         drBtn.setText("");
         playertxt.setText("Player 1 Tern");
         pointtxt.setText("0 - 0");
         tern = 0;
    }
    public void chackwan()
    {
        int a = 0 , b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0;
        if (tlBtn.getText().equals("X"))
            a = 1;
        else if (tlBtn.getText().equals("O"))
            a = 10;
        if (tcBtn.getText().equals("X"))
            b = 1;
        else if (tcBtn.getText().equals("O"))
            b = 10;
        if (trBtn.getText().equals("X"))
            c = 1;
        else if (trBtn.getText().equals("O"))
            c = 10;
        if (mlBtn.getText().equals("X"))
            d = 1;
        else if (mlBtn.getText().equals("O"))
            d = 10;
        if (mcBtn.getText().equals("X"))
            e = 1;
        else if (mcBtn.getText().equals("O"))
            e = 10;
        if (mrBtn.getText().equals("X"))
            f = 1;
        else if (mrBtn.getText().equals("O"))
            f = 10;
        if (dlBtn.getText().equals("X"))
            g = 1;
        else if (dlBtn.getText().equals("O"))
            g = 10;
        if (dcBtn.getText().equals("X"))
            h = 1;
        else if (dcBtn.getText().equals("O"))
            h = 10;
        if (drBtn.getText().equals("X"))
            i = 1;
        else if (drBtn.getText().equals("O"))
            i = 10;
        
        if (a+b+c == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (d+e+f == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (g+h+i == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (a+d+g == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (b+e+h == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (c+f+i == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (a+e+i == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (c+e+g == 3)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p1++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        
        //Player 2 Loop
        else if (a+b+c == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (d+e+f == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (g+h+i == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (a+d+g == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (b+e+h == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (c+f+i == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (a+e+i == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 2 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        else if (c+e+g == 30)
        {
            JOptionPane.showMessageDialog(rootPane, "Player 1 Won");
            p2++;
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
        
        else if (tern == 9)
        {
            JOptionPane.showMessageDialog(rootPane, "Sorry Now Winner");
            reset();
            pointtxt.setText(p1 + " - " + p2);
        }
    }
    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        // TODO add your handling code here:
       this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dcBtn;
    private javax.swing.JButton dlBtn;
    private javax.swing.JButton drBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton mcBtn;
    private javax.swing.JButton mlBtn;
    private javax.swing.JButton mrBtn;
    private javax.swing.JLabel playertxt;
    private javax.swing.JLabel pointtxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton tcBtn;
    private javax.swing.JButton tlBtn;
    private javax.swing.JButton trBtn;
    // End of variables declaration//GEN-END:variables

}
