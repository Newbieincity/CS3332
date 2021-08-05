/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs3323;

import Api_call.Lesson_api;
import javax.swing.JOptionPane;
import  Model.Lesson;
import  Model.LessonList;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 *
 * @author duyto
 */
public class EditP extends javax.swing.JFrame {
Lesson lesson =new Lesson();
LessonList lessonList=new LessonList();
private   String selectID;
int length = lessonList.getRowCount();
int position;
int a=0;
boolean updatecheck;
//int j=1;
    /**
     * Creates new form EditP
     */
    public EditP() {
        initComponents();
        
    }
    public void setTarget(int t){
       position=t;
      
   }
    public  void setID (String id){
        selectID= id;
       // System.out.println(selectID);
 for(Lesson lesson : lessonList.getLessons()){
            if(lesson.getLessonID().equals(selectID)){
              //  System.out.println("Lesson #"+(lessonList.getLessons().indexOf(lesson)+1));
              //  System.out.println(lesson);
                a=lessonList.getLessons().indexOf(lesson);
            }
        }
  
    jTitle.setText(lessonList.getLessons().get(a).getTitle().toString());
   
    jDescrip.setText(lessonList.getLessons().get(a).getDescription().toString());
    JContent.setText(lessonList.getLessons().get(a).getContent().toString());
    if(lessonList.getLessons().get(a).getStatus()==1){
        JPost.setSelected(true);
    }
    else{
      JHidePost.setSelected(true);
      }    
    
    JContent.setLineWrap(true);
    jTitle.setEditable(Boolean.FALSE);
     JContent.setEditable(Boolean.FALSE);
      jDescrip.setEditable(Boolean.FALSE);
  
    }

   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTitle = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        JContent = new javax.swing.JTextArea();
        jDescrip = new javax.swing.JTextArea();
        EditBut = new javax.swing.JButton();
        SaveBut = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        JHidePost = new javax.swing.JRadioButton("Hide Post",false);
        JPost = new javax.swing.JRadioButton("Post",false);

        JPost.addItemListener(new RadioButtonHandler( 1 ) );
        JHidePost.addItemListener(new RadioButtonHandler( 0 ) );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTitle.setText("Title");

        JContent.setColumns(20);
        JContent.setRows(5);
        JContent.setText("\t\t\tText Here");
        jScrollPane1.setViewportView(JContent);

        jDescrip.setColumns(20);
        jDescrip.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jDescrip.setRows(5);
        jDescrip.setText("Descriptions");

        EditBut.setText("Edit");
        EditBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButActionPerformed(evt);
            }
        });

        SaveBut.setText("Save");
        SaveBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButActionPerformed(evt);
            }
        });

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(JHidePost);
        JHidePost.setText("Not post");

        buttonGroup1.add(JPost);
        JPost.setText("Post");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SaveBut, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JHidePost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JPost, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EditBut, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EditBut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(SaveBut)
                        .addGap(116, 116, 116)
                        .addComponent(JPost)
                        .addGap(27, 27, 27)
                        .addComponent(JHidePost)
                        .addGap(105, 105, 105)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    int click = JOptionPane.showConfirmDialog(null, "You want to exit?");
        if (click == 0) {
            this.setVisible(false);
            new EditPostFrame().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void EditButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButActionPerformed
       
        jTitle.setEditable(Boolean.TRUE);
     JContent.setEditable(Boolean.TRUE);
      jDescrip.setEditable(Boolean.TRUE);
    }//GEN-LAST:event_EditButActionPerformed

    private void SaveButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButActionPerformed
          jTitle.setEditable(Boolean.FALSE);
     JContent.setEditable(Boolean.FALSE);
      jDescrip.setEditable(Boolean.FALSE);
       // System.out.println(lessonList.getLessons().get(a).getStatus());
        // System.out.println(JContent.getText());
         // System.out.println(jTitle.getText());
          // System.out.println(jDescrip.getText());
            updatecheck= Lesson_api.updateLesson(lessonList.getLessons().get(a).getLessonID(),jTitle.getText(),
                 jDescrip.getText().replace("\n", "\\n"), 
                 JContent.getText().replace("\n", "\\n"),lessonList.getLessons().get(a).getStatus());
        if (updatecheck==false){
            
    JOptionPane.showMessageDialog(this, "Update failed.Please try again !");
         return;}
    else{
            JOptionPane.showMessageDialog(this, "Update successful.");
            this.setVisible(false);
            new EditPostFrame().setVisible(true); 
            return;
      
    }//GEN-LAST:event_SaveButActionPerformed
    }
        private class RadioButtonHandler implements ItemListener{
    private int status;
   public RadioButtonHandler( int s ) {
         
    status=s;
   }
   
   public void itemStateChanged( ItemEvent event )
 {
 lessonList.getLessons().get(a).setStatus(status);
 }
}
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditBut;
    private javax.swing.JTextArea JContent;
    private javax.swing.JRadioButton JHidePost;
    private javax.swing.JRadioButton JPost;
    private javax.swing.JButton SaveBut;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextArea jDescrip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTitle;
    // End of variables declaration//GEN-END:variables
}
