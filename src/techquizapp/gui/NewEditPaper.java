/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.gui;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import techquizapp.Dao.QuestionDAO;
import techquizapp.Pojo.Exam;
import techquizapp.Pojo.Question;
import techquizapp.Pojo.QuestionStore;
import techquizapp.Pojo.UserProfile;

/**
 *
 * @author Harsh Vyas
 */
public class NewEditPaper extends javax.swing.JFrame {

    private Exam editExam;
    private QuestionStore qstore;
    private int pos=0;
    private HashMap<String,String>options;
    int qno;
    private String question,option1,option2,option3,option4,correctOption;
    
    public NewEditPaper() {
        initComponents();
        this.setLocationRelativeTo(null);
        qstore=new QuestionStore();
        
        lblUsername.setText("Hello "+UserProfile.getUsername());
        
        options=new HashMap();
        options.put("Option 1","answer1");
        options.put("Option 2","answer2");
        options.put("Option 3","answer3");
        options.put("Option 4","answer4");
        qno=1;
        lblQno.setText(lblQno.getText()+" "+qno);
       
    }
    
    public NewEditPaper(Exam editExam)
    {
       this();
       this.editExam=editExam;
       lblTitle.setText("Editing "+editExam.getLanguage().toUpperCase()+" Paper");
       loadQuestions();
       showQuestion();
       
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
        lblTitle = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOption3 = new javax.swing.JTextField();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbCorrect1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        lblTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 204, 0));

        lblQno.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 255, 51));
        lblQno.setText("Question no:");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("            Option 4");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 51));
        jLabel4.setText("Option 1");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("             Option 2");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Option 3");

        txtOption3.setBackground(new java.awt.Color(0, 0, 0));
        txtOption3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtOption3.setForeground(new java.awt.Color(255, 255, 0));
        txtOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption3ActionPerformed(evt);
            }
        });

        txtOption1.setBackground(new java.awt.Color(0, 0, 0));
        txtOption1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtOption1.setForeground(new java.awt.Color(255, 255, 0));
        txtOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption1ActionPerformed(evt);
            }
        });

        txtOption2.setBackground(new java.awt.Color(0, 0, 0));
        txtOption2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtOption2.setForeground(new java.awt.Color(255, 255, 0));
        txtOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        txtOption4.setBackground(new java.awt.Color(0, 0, 0));
        txtOption4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtOption4.setForeground(new java.awt.Color(255, 255, 0));
        txtOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption4ActionPerformed(evt);
            }
        });

        lblUsername.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 0));

        lblLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 0));
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        btnPrevious.setBackground(new java.awt.Color(0, 0, 0));
        btnPrevious.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnPrevious.setForeground(new java.awt.Color(255, 51, 51));
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("Done");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("Back");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("Next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Correct Op:");

        cbCorrect1.setBackground(new java.awt.Color(0, 0, 0));
        cbCorrect1.setForeground(new java.awt.Color(255, 153, 51));
        cbCorrect1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4", "" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(179, 179, 179)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCorrect1, 0, 112, Short.MAX_VALUE))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(btnPrevious)
                .addGap(73, 73, 73)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(132, 132, 132))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(455, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(255, 255, 255)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(jButton3)
                    .addContainerGap(584, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCorrect1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnPrevious)
                    .addComponent(jButton4))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(416, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(88, 88, 88)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(476, Short.MAX_VALUE)
                    .addComponent(jButton3)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption3ActionPerformed

    private void txtOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption1ActionPerformed

    private void txtOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void txtOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption4ActionPerformed

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
       LoginFrame f=new LoginFrame();
       f.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if(validateInput()==false)
       {
       JOptionPane.showMessageDialog(null,"Please enter all the fields","ERROR!",JOptionPane.ERROR_MESSAGE);
       return;
       }
       String optionName=options.get(correctOption);
       Question obj=new Question(editExam.getExamId(),editExam.getLanguage(),qno,question,option1,option2,option3,option4,optionName);
       qstore.removeQuestion(pos);
       qstore.setQuestionAt(pos, obj);
       pos++;
       if(pos>=qstore.getCount())
       {
          JOptionPane.showMessageDialog(null,"Your questions has been Edited successfully!\nPress the done button to save them in our database","Exam Editing Done!",JOptionPane.INFORMATION_MESSAGE);
          System.out.println("Qstore= "+qstore);
          pos=0;
       }
       showQuestion();
       qno++;
       if(qno>qstore.getCount())
       {
         qno=1;
       }
       lblQno.setText(lblQno.getText()+qno);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
         if(validateInput()==false)
       {
       JOptionPane.showMessageDialog(null,"Please enter all the fields","ERROR!",JOptionPane.ERROR_MESSAGE);
       return;
       }
       String optionName=options.get(correctOption);
       Question obj=new Question(editExam.getExamId(),editExam.getLanguage(),qno,question,option1,option2,option3,option4,optionName);
       qstore.removeQuestion(pos);
       qstore.setQuestionAt(pos, obj);
       pos--;
       if(pos<0)
       {
          JOptionPane.showMessageDialog(null,"Your questions has been Edited successfully!\nPress the done button to save them in our database","Exam Editing Done!",JOptionPane.INFORMATION_MESSAGE);
          System.out.println("Qstore= "+qstore);
          pos=qstore.getCount()-1;
       }
       showQuestion();
       qno--;
       if(qno<=0)
       {
         qno=qstore.getCount();
       }
       lblQno.setText(lblQno.getText()+qno);
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
        {
            QuestionDAO.updateQuestions(qstore);
            JOptionPane.showMessageDialog(null, "Paper Edited Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            AdminOptionsFrame adminFrame=new AdminOptionsFrame();
            adminFrame.setVisible(true);
            this.dispose();
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "DB Error","Edit Question Error",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean validateInput()
    {
          question=txtQuestion.getText().trim();
          option1=txtOption1.getText().trim();
          option2=txtOption2.getText().trim();
          option3 =txtOption3.getText().trim();
          option4=txtOption4.getText().trim();
          System.out.println("getters");
          System.out.println(option1);
          System.out.println(option2);
          System.out.println(option3);
          System.out.println(option4);
          System.out.println(question);
          
          correctOption=cbCorrect1.getSelectedItem().toString();
          
          if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty()||correctOption.isEmpty())
          
           return false;
          
          return true;
       
    
    }
   private void loadQuestions()
   {
       
     try{
         ArrayList<Question>questionList=QuestionDAO.getQuestionsByExamId(editExam.getExamId());
         if(questionList.isEmpty())
         {
             System.out.println("Question list is empty!");
         } 
          for(Question q:questionList)
          {
            qstore.addQuestion(q);
          }
          System.out.println("Qstore: "+qstore);
         
     }catch(Exception e)
     {   
          JOptionPane.showMessageDialog(null,"Error in NewEditingPaper","Error!",JOptionPane.INFORMATION_MESSAGE);
          e.printStackTrace();
     }
   
   }
   
   private void showQuestion()
   {
     Question q=qstore.getQuestion(pos);
     txtQuestion.setText(q.getQuestion());
     txtOption1.setText(q.getAnswer1());
     txtOption2.setText(q.getAnswer2());
     txtOption3.setText(q.getAnswer3());
     txtOption4.setText(q.getAnswer4());
     String correctAns=q.getCorrectAnswer();
     String correctOpt=getKeyFromValue(correctAns);
     cbCorrect1.setSelectedItem(correctOpt);
     
   
   }
   private String getKeyFromValue(String value)
   {
     Set<String> keys=options.keySet();
     for(String k:keys)
     {
       String v=options.get(k);
       if(v.equals(value))
       return k;    
     }
     return null;
   
   }
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
            java.util.logging.Logger.getLogger(NewEditPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEditPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEditPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEditPaper.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewEditPaper().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPrevious;
    private javax.swing.JComboBox<String> cbCorrect1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
