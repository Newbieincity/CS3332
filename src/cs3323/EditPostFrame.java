/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3323;

import Api_call.Lesson_api;
import Model.Lesson;
import Model.LessonList;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.SearchResult;
import javax.swing.JTable;
/**
 *
 * @author duyto
 */
public class EditPostFrame extends javax.swing.JFrame {
 String IDclick="";
 Lesson lesson =new Lesson();
 LessonList lessonList=new LessonList();
 int row;
 int statusChange=3;
 boolean deleteCheck;
 boolean authorCheck,idCheck,statusCheck,nameCheck=true;
 boolean searchCheck=false;
SearchResult searchResult=new SearchResult();

  
    public EditPostFrame() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel7 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        Author = new java.awt.TextField();
        Search = new javax.swing.JButton();
        JDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JOn = new javax.swing.JRadioButton("Availble(1)",false);
        JOff = new javax.swing.JRadioButton("Disable(0)",false);
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        LessonList lessonList=new LessonList();
        jTable1 = new javax.swing.JTable(lessonList);
        jLabel6 = new javax.swing.JLabel();
        Post = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        Jid = new java.awt.TextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        ButMo = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        JRefresh = new javax.swing.JButton();
        jAll = new javax.swing.JRadioButton();
        JBack = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quản lý bài viết");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setText("Tên bài:");

        Search.setText("Tìm kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        JDelete.setText("Xóa");
        JDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JDeleteActionPerformed(evt);
            }
        });

        jLabel5.setText("Status");

        JOn.addItemListener(new RadioButtonHandler( 1 ) );
        buttonGroup1.add(JOn);
        JOn.setText("Available");
        JOn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOnActionPerformed(evt);
            }
        });

        JOff.addItemListener(new RadioButtonHandler( 0 ) );
        buttonGroup1.add(JOff);
        JOff.setText("Disable");
        JOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JOffActionPerformed(evt);
            }
        });

        jTable1.updateUI();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel6.setText("Tác giả");

        Post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        Jid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JidActionPerformed(evt);
            }
        });

        jButton6.setText("<<");

        jButton7.setText("<");

        jButton8.setText(">");

        jButton9.setText(">>");

        ButMo.setText("Mở");
        ButMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButMoActionPerformed(evt);
            }
        });

        AddBut.setText("Add Post");
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });

        JRefresh.setText("Refresh");
        JRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRefreshActionPerformed(evt);
            }
        });

        buttonGroup1.add(jAll);
        jAll.setText("ALL");
        jAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAllActionPerformed(evt);
            }
        });

        JBack.setText("Back");
        JBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(131, 131, 131)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Author, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(Post, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                            .addComponent(Jid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(jAll, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JOn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(JOff, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(AddBut, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButMo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JRefresh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JBack, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(JBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Author, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(Jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButMo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddBut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JDelete)
                        .addGap(0, 7, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JOn)
                    .addComponent(JOff)
                    .addComponent(JRefresh)
                    .addComponent(jAll))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        boolean update=true;
        if((Author.getText().equals(""))&&(Post.getText().isBlank())&&(Jid.getText().isBlank())&&statusChange==3){
            JOptionPane.showMessageDialog(this,"Empty Information to find");  
            searchCheck=false;
            return;
    }//GEN-LAST:event_SearchActionPerformed
    if(Author.getText().isBlank()) authorCheck=false;
    else authorCheck=true;
    if(Post.getText().isBlank()) nameCheck=false;
    else nameCheck=true;
    if(Jid.getText().isBlank()) idCheck=false;
    else idCheck=true;
    if(statusChange==3) statusCheck=false;
    else statusCheck=true;
        try {
 
    for (Lesson lesson : lessonList.getLessons()){
        int exsit=1;
        int hay=1;
        if(authorCheck){
           if(lesson.getCreated_by().toLowerCase().contains(Author.getText().toLowerCase())||
              lesson.getCreated_by().toUpperCase().contains(Author.getText().toUpperCase()))  hay=0;
           else exsit=0;
        }
        if (nameCheck){
           if(lesson.getTitle().toLowerCase().contains(Post.getText().toLowerCase())||
              lesson.getTitle().toUpperCase().contains(Post.getText().toUpperCase()))  hay=0;
           else exsit=0;
        }
         if (idCheck){
           if(lesson.getLessonID().toLowerCase().contains(Jid.getText().toLowerCase())||
              lesson.getLessonID().toUpperCase().contains(Jid.getText().toUpperCase()))  hay=0;
           else exsit=0;
        }
        if (statusCheck){
 
           if(lesson.getStatus()==statusChange)  hay=0;
           else exsit=0;
        }
        if(exsit==1&&hay==0) {
         searchResult.getLessons().add(lesson);
         searchCheck=true;
        }
        else update=false;
    }
    if(searchCheck){
     jTable1.setModel(searchResult);
     
    }
    if(searchResult.getLessons().isEmpty()&&update==false) JOptionPane.showMessageDialog(this,"Not exist.Please try again" );    
     } catch (Exception e) {
         e.printStackTrace();
        }
      update=true; 
      
      
    }
    private void JOnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOnActionPerformed
        System.out.println("JON get selected");
        statusChange=1;
    }//GEN-LAST:event_JOnActionPerformed

    private void PostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PostActionPerformed

    private void ButMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButMoActionPerformed
     // if(searchCheck==false)
      //  IDclick= lessonList.getLessons().get(row).getLessonID();
     //  else IDclick= searchResult.getLessons().get(row).getLessonID();
        int click = JOptionPane.showConfirmDialog(null, "You want to open this document?");
        if (click == 0) {
            this.setVisible(false);
            EditP newpost = new EditP();
            newpost.setVisible(true);
            newpost.setID(IDclick);
            newpost.setTarget(row);
            
    }//GEN-LAST:event_ButMoActionPerformed
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       row= jTable1.getSelectedRow();
       if(searchCheck==false)
        IDclick= lessonList.getLessons().get(row).getLessonID();
       else IDclick= searchResult.getLessons().get(row).getLessonID();
     //   System.out.println(IDclick);
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "You want to create new post?");
        if (click == 0) {
            this.setVisible(false);
            new AddPost().setVisible(true);        // TODO add your handling code here:
    }   
    }//GEN-LAST:event_AddButActionPerformed

    private void JDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JDeleteActionPerformed
      //  row= jTable1.getSelectedRow();
        //if(searchCheck==false)
       // IDclick= lessonList.getLessons().get(row).getLessonID();
       //else IDclick= searchResult.getLessons().get(row).getLessonID();
        int click = JOptionPane.showConfirmDialog(null, "You want to delete this post?");
        if (click == 0) {
        deleteCheck=Lesson_api.deleteLesson(IDclick);
        if(deleteCheck){
        JOptionPane.showMessageDialog(this, "Delete successful.");
            this.setVisible(false);
            new EditPostFrame().setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_JDeleteActionPerformed
        }
         else{
          JOptionPane.showMessageDialog(this,IDclick,"Delete failed .Please try again",JOptionPane.ERROR_MESSAGE);  
        }
        
    }
    private void JidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JidActionPerformed

    private void JRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRefreshActionPerformed
         jTable1.setModel(lessonList);
         searchResult.getLessons().removeAllElements();
         searchCheck=false;
         
        //this.setVisible(false);
       //new EditPostFrame().setVisible(true);
    }//GEN-LAST:event_JRefreshActionPerformed

    private void JOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JOffActionPerformed
     
        statusChange=0;
    }//GEN-LAST:event_JOffActionPerformed

    private void jAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAllActionPerformed
        statusChange=3;
    }//GEN-LAST:event_jAllActionPerformed

    private void JBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBackActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "You want go to the menu?");
        if (click == 0) {
            this.setVisible(false);
            new MenuFrame().setVisible(true);
        }
    }//GEN-LAST:event_JBackActionPerformed
       
   private class RadioButtonHandler implements ItemListener{
    private int status;
   public RadioButtonHandler( int s ) {
         
    status=s;
   }
   
   public void itemStateChanged( ItemEvent event )
 {
 statusChange=status;
    
 }
}
   
    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     /*   try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditPostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPostFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditPostFrame().setVisible(true);
            }
        });
    }*/
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBut;
    private java.awt.TextField Author;
    private javax.swing.JButton ButMo;
    private javax.swing.JButton JBack;
    private javax.swing.JButton JDelete;
    private javax.swing.JRadioButton JOff;
    private javax.swing.JRadioButton JOn;
    private javax.swing.JButton JRefresh;
    private java.awt.TextField Jid;
    private java.awt.TextField Post;
    private javax.swing.JButton Search;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton jAll;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}