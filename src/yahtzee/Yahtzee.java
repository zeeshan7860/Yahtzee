
package yahtzee;

import javax.swing.JOptionPane;

/**
 * In this program I have used Jframe form to make a yahtzee game. In this game
 * I have covered the upper section (Aces to Sixes). I have used 5 dices
 * textfields and used a random values for each dice roll. User can roll up to 3
 * times in a single turn. User can click on turn again button for the next turn
 * after that the Throw Dice button will be editable and user can roll the dice
 * again. after putting each score value in the six textfields will become
 * uneditable user will not be allowed to enter the score again in the same
 * category.At the bottom I have used three textfields Total textfield will sum
 * up the score values in each round bonus textfield will be filled with 35 if
 * user gets the score greater or equal to 63 after that user can click on the
 * calculate button to calculate the total score for the game
 *
 */
public class Yahtzee extends javax.swing.JFrame {
    
    private static final int NUM_DICE = 5;  // No of Dice
    private int[] dice = new int[NUM_DICE];  // Array of size 5 dice
    private int rollCount = 3;  // Max rollCount

    /**
     * Creates new form NewJFrame
     */
    public Yahtzee() {
        initComponents();
        
    }

    private void rollDice() {
        for (int i = 0; i < 5; i++) {
            //Generate random dices from 1-6
            dice[i] = (int) (Math.random() * 6) + 1;
        }
    }

    private void updateDiceLabels() {
        //put the random values in the textfields
        dice1.setText(Integer.toString(dice[0]));
        dice2.setText(Integer.toString(dice[1]));
        dice3.setText(Integer.toString(dice[2]));
        dice4.setText(Integer.toString(dice[3]));
        dice5.setText(Integer.toString(dice[4]));

    }
    
    
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        s4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        s5 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        s6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bonus = new javax.swing.JTextField();
        dice3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dice4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        dice5 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        s1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        s2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        throwBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dice1 = new javax.swing.JTextField();
        dice2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        turnAgain = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        totalTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalScore = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jButton8 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yahtzee");

        s4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s4FocusLost(evt);
            }
        });

        jButton6.setText("Fives");

        s5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s5FocusLost(evt);
            }
        });

        jButton7.setText("Sixes");

        s6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s6FocusLost(evt);
            }
        });

        jLabel6.setText("Bonus : ");

        bonus.setEditable(false);
        bonus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bonus.setForeground(new java.awt.Color(255, 51, 51));

        dice3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dice3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Dice");

        dice4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dice4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dice");

        dice5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dice5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton2.setText("Ones");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        s1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s1FocusLost(evt);
            }
        });
        s1.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                s1InputMethodTextChanged(evt);
            }
        });
        s1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s1ActionPerformed(evt);
            }
        });
        s1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                s1PropertyChange(evt);
            }
        });

        jButton3.setText("Twos");

        s2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s2FocusLost(evt);
            }
        });

        jButton4.setText("Threes");

        throwBtn.setText("Throw Dice (3)");
        throwBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                throwBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dice");

        dice1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dice1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dice2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dice2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Dice");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Dice");

        s3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                s3FocusLost(evt);
            }
        });

        jButton5.setText("Fours");

        turnAgain.setText("Turn Again?");
        turnAgain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnAgainActionPerformed(evt);
            }
        });

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Total : ");

        totalTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jLabel8.setText("Total Score : ");

        totalScore.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jButton8.setText("Reset Game");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" Lower Section Here");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bonus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                    .addComponent(totalTxt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(throwBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(turnAgain))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dice4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dice5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(s6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(s5)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(s3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(s2)))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(throwBtn)
                    .addComponent(turnAgain))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dice1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dice2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dice3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dice4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dice5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bonus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void s1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s1ActionPerformed

    private void throwBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_throwBtnActionPerformed
        
        if (rollCount == 0) {
            JOptionPane.showMessageDialog(this, "You have reached the maximum number of rolls.");
            throwBtn.setEnabled(false);
        } else {
            rollCount--;
            throwBtn.setText("Rerole (" + rollCount + ")");
            rollDice(); // generate random dices
            updateDiceLabels(); //put the random values in the textfields
        }


    }//GEN-LAST:event_throwBtnActionPerformed

    private void turnAgainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnAgainActionPerformed
        throwBtn.setEnabled(true);
        rollCount = 3;
        throwBtn.setText("Throw Dice (" + rollCount + ")");
    }//GEN-LAST:event_turnAgainActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (s1.getText().equals("") || s2.getText().equals("") || s3.getText().equals("") || s4.getText().equals("") || s5.getText().equals("") || s6.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Textfileds are empty!!!.");
        } else {
            int total = 0;
            total = Integer.parseInt(s1.getText()) + Integer.parseInt(s2.getText()) + Integer.parseInt(s3.getText()) + Integer.parseInt(s4.getText()) + Integer.parseInt(s5.getText()) + Integer.parseInt(s6.getText());
            if (total >= 63) {
                total += 35;
                JOptionPane.showMessageDialog(this, "Congratulations!!! 35 Bonus has been added.");
                bonus.setText("" + 35);
            }
            totalScore.setText("" + total);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void s1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_s1PropertyChange

    }//GEN-LAST:event_s1PropertyChange

    private void s1InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_s1InputMethodTextChanged


    }//GEN-LAST:event_s1InputMethodTextChanged

    private void s1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s1FocusLost

            if(s1.isEditable())
            {
                if (s1.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s1.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s1.setEditable(false);
                }
            }
    }//GEN-LAST:event_s1FocusLost

    private void s2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s2FocusLost
       if(s2.isEditable())
            {
                if (s2.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s2.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s2.setEditable(false);
                }
            }
    }//GEN-LAST:event_s2FocusLost

    private void s3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s3FocusLost
         if(s3.isEditable())
            {
                if (s3.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s3.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s3.setEditable(false);
                }
            }
    }//GEN-LAST:event_s3FocusLost

    private void s4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s4FocusLost
         if(s4.isEditable())
            {
                if (s4.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s4.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s4.setEditable(false);
                }
            }
    }//GEN-LAST:event_s4FocusLost

    private void s5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s5FocusLost
         if(s5.isEditable())
            {
                if (s5.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s5.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s5.setEditable(false);
                }
            }
    }//GEN-LAST:event_s5FocusLost

    private void s6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_s6FocusLost
         if(s6.isEditable())
            {
                if (s6.getText().equals("")) {

                } else {
                    int total = 0;
                    total = Integer.parseInt(s6.getText());
                    int chk = (!(totalTxt.getText()).equals("")) ? Integer.parseInt(totalTxt.getText()) : 0;
                    total += chk;
                    totalTxt.setText("" + total);
                    s6.setEditable(false);
                }
            }
    }//GEN-LAST:event_s6FocusLost

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dice1.setText("");
        dice2.setText("");
        dice3.setText("");
        dice4.setText("");
        dice5.setText("");
        s1.setText("");
        s2.setText("");
        s3.setText("");
        s4.setText("");
        s5.setText("");
        s6.setText("");
        totalTxt.setText("");
        bonus.setText("");
        totalScore.setText("");
        throwBtn.setEnabled(true);
        s1.setEditable(true);
        s2.setEditable(true);
        s3.setEditable(true);
        s4.setEditable(true);
        s5.setEditable(true);
        s6.setEditable(true);
        rollCount = 3;
        throwBtn.setText("Throw Dice (" + rollCount + ")");
    }//GEN-LAST:event_jButton8ActionPerformed

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
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Yahtzee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Yahtzee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bonus;
    private javax.swing.JTextField dice1;
    private javax.swing.JTextField dice2;
    private javax.swing.JTextField dice3;
    private javax.swing.JTextField dice4;
    private javax.swing.JTextField dice5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JButton throwBtn;
    private javax.swing.JTextField totalScore;
    private javax.swing.JTextField totalTxt;
    private javax.swing.JButton turnAgain;
    // End of variables declaration//GEN-END:variables
}
