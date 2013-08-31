import javax.swing.JOptionPane;
/**
 *
 * @author FatosBediu
 */
public class main extends javax.swing.JFrame {
    
    int vsX; 
    int vsO;
    int isgamerunning;
    
    int scoreyou = 0; 
    int scoreoponent = 0;
    int draws = 0;

    boolean x1; 
    boolean x2;
    boolean x3;
    boolean x4;
    boolean x5;
    boolean x6;
    boolean x7;
    boolean x8;
    boolean x9;
    boolean o1;
    boolean o2; 
    boolean o3;
    boolean o4;
    boolean o5;
    boolean o6;
    boolean o7;
    boolean o8;
    boolean o9;
    
    public main() {
        initComponents();
    }
    void CheckStatus()
    {
            if (vsX == 1)
            { label7.setText("Status: X's turn");
            } else if (vsO == 1)
            { label7.setText("Status: O's turn");
            } else { label7.setText("Status: Idle"); }
    }
     void CleanAll()
    {
        isgamerunning = 0; vsX = 0; vsO = 0;
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton6.setText("");
        jButton5.setText("");
        jButton4.setText("");
        jButton8.setText("");
        jButton7.setText("");
        jButton9.setText("");
        o1 = false;
        o2 = false;
        o3 = false;
        o4 = false;
        o5 = false;
        o6 = false;
        o7 = false;
        o8 = false;
        o9 = false;
        x1 = false; 
        x2 = false; 
        x3 = false; 
        x4 = false; 
        x5 = false; 
        x6 = false; 
        x7 = false; 
        x8 = false; 
        x9 = false; 
    }
    
    
     void DetectWinner() 
    {
    if ((o1 == true || x1 == true) && (o2 == true || x2 == true) && // -> checks if all boxes 
        (o3 == true || x3 == true) && (o4 == true || x4 == true) && //-> have values of either o or x,
        (o5 == true || x5 == true) && (o6 == true || x6 == true) && // if winner hasn't been selected
        (o7 == true || x7 == true) && (o8 == true || x8 == true) && //by then, it promts for a draw
        (o9 == true || x9 == true))
    {JOptionPane.showMessageDialog(null,"It's a draw!"); CleanAll(); 
        draws += 1; label6.setText("Draws: " + draws); }
        
        
          if (x1 == true && x2 == true && x3 == true)
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou); CleanAll();}//win
        else if (x4 == true && x5 == true && x6 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
        else if (x2 == true && x5 == true && x8 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
             else if (x7 == true && x8 == true && x9 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
             else if (x1 == true && x5 == true && x9 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
             else if (x3 == true && x5 == true && x7 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
             else if (x1 == true && x4 == true && x7 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
             else if (x3 == true && x6 == true && x9 == true) 
        { JOptionPane.showMessageDialog(null, "Player 1 won!");
          scoreyou += 1; label5.setText("You: " + scoreyou);CleanAll();}
        else if (o1 == true && o2 == true && o3 == true)//oponent logic
        { JOptionPane.showMessageDialog(null, "Player 2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
        else if (o4 == true && o5 == true && o6 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                else if (o7 == true && o8 == true && o9 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                else if (o1 == true && o5 == true && o9 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                     else if (o3 == true && o5 == true && o7 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                     else if (o1 == true && o4 == true && o7 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                     else if (o3 == true && o6 == true && o9 == true) 
        { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}
                     else if (o2 == true && o5 == true && o7 == true)
         { JOptionPane.showMessageDialog(null, "Player2 won!");CleanAll();
          scoreoponent += 1; label4.setText("Oponent: " + scoreoponent);}                 
      CheckStatus();
    }

//java gui generated code below
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tosi's TicTacToe");
        setMinimumSize(new java.awt.Dimension(466, 312));
        setName("TicTacToe"); // NOI18N
        setResizable(false);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton6.setFocusable(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton5.setFocusable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton4.setFocusable(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton8.setFocusable(false);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton7.setFocusable(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jButton9.setFocusable(false);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton11.setText("New Game");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label2.setText("Score");

        label4.setText("Oponent: ");

        label5.setText("You: ");

        label6.setText("Draws: ");

        label7.setText("Status: Idle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }
     
        else { if ("X".equals(jButton1.getText()) || "O".equals(jButton1.getText())) { }
      // ^ If button contains O or X, it does nothing if re-clicked ^
        
      else { 
           if (vsX == 1) //if x's turn
          {
              x1 = true; 
              o1 = false;
              jButton1.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton1.setLabel("O");
              o1 = true;
              x1 = false;
               vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
     DetectWinner();
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); } 
       else { if ("X".equals(jButton2.getText()) || "O".equals(jButton2.getText())) { }
      else { 
           if (vsX == 1) //if x's turn
          {
              x2 = true; 
              o2 = false;
              jButton2.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton2.setLabel("O");
              o2 = true;
              x2 = false;
               vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
      DetectWinner();  
      }           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }        // TODO add your handling code here:
     else { if ("X".equals(jButton3.getText()) || "O".equals(jButton3.getText())) { }
      else { 
     
           if (vsX == 1) //if x's turn
          {
              x3 = true; 
              o3 = false;
              jButton3.setLabel("X");
            
              vsX = 0; vsO = 1;
             
              //check
          } else if (vsO == 1)
          {
              jButton3.setLabel("O");
              o3 = true;
              x3 = false;
               vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
      }DetectWinner();                 
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); } 
            else { if ("X".equals(jButton4.getText()) || "O".equals(jButton4.getText())) { }
      else { 
           if (vsX == 1) //if x's turn
          {
              x4 = true; 
              o4 = false;
              jButton4.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton4.setLabel("O");
              o4 = true;
              x4 = false;
           vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
       DetectWinner();
      }               
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }        
  else { if ("X".equals(jButton5.getText()) || "O".equals(jButton5.getText())) { }
      else { 
           if (vsX == 1)
          {
              x5 = true; 
              o5 = false;
              jButton5.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton5.setLabel("O");
              o5 = true;
              x5 = false;
              vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
         DetectWinner();
      }             
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }  
 else { if ("X".equals(jButton6.getText()) || "O".equals(jButton6.getText())) { }
      else { 
           if (vsX == 1) //if x's turn
          {
              x6 = true; 
              o6 = false;
              jButton6.setLabel("X");      
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton6.setLabel("O");
              o6 = true;
              x6 = false;
              vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
      DetectWinner();
      }                   
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }  
      else { if ("X".equals(jButton7.getText()) || "O".equals(jButton7.getText())) { }
      else { 
           if (vsX == 1) 
          {
              x7 = true; 
              o7 = false;
              jButton7.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton7.setLabel("O");
              o7 = true;
              x7 = false;
              vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
     DetectWinner();
      }         
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); } 
      else { if ("X".equals(jButton8.getText()) || "O".equals(jButton8.getText())) { }
      else { 
           if (vsX == 1) 
          {
              x8 = true; 
              o8 = false;
              jButton8.setLabel("X");           
              vsX = 0; vsO = 1;

          } else if (vsO == 1)
          {
              jButton8.setLabel("O");
              o8 = true;
              x8 = false;
              vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
       DetectWinner();
      }                      
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if (isgamerunning == 0)
      { JOptionPane.showMessageDialog(null, "Please start a new game!"); }     
       else { if ("X".equals(jButton9.getText()) || "O".equals(jButton9.getText())) { }
      else { 
           if (vsX == 1) 
          {
              x9 = true; 
              o9 = false;
              jButton9.setLabel("X");
              vsX = 0; vsO = 1;
          } else if (vsO == 1)
          {
              jButton9.setLabel("O");
              o9 = true;
              x9 = false;
            vsX = 1; vsO = 0;
          } else {vsX = 0; vsO = 0;} }
      DetectWinner();
      }                        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        isgamerunning = 1; vsX = 1; 
        CheckStatus();
    }//GEN-LAST:event_jButton11ActionPerformed

    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private java.awt.Label label2;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    // End of variables declaration//GEN-END:variables
}
