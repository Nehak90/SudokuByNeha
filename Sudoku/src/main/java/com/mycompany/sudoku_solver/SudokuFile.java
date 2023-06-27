/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sudoku_solver;
import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.*;
/**
 *
 * @author Nehak
 */
public class SudokuFile extends javax.swing.JFrame {
    private String turn = "1";
    
    private boolean globalFlag = true;
    
     private String SolvedBoard [][] = {
         {"3", "1", "6", "5", "7", "8", "4", "9", "2"},
         {"5", "2", "9", "1", "3", "4", "7", "6", "8"},
         {"4", "8", "7", "6", "2", "9", "5", "3", "1"},
         {"2", "6", "3", "4", "1", "5", "9", "8", "7"},
         {"9", "7", "4", "8", "6", "3", "1", "2", "5"},
         {"8", "5", "1", "7", "9", "2", "6", "4", "3"},
         {"1", "3", "8", "9", "4", "7", "2", "5", "6"},
         {"6", "9", "2", "3", "5", "1", "8", "7", "4"},
         {"7", "4", "5", "2", "8", "6", "3", "1", "9"}
     };
     
     private void AssignTurn(JButton btn){
         Selectionbtn1.setBackground(black);
         Selectionbtn2.setBackground(black);
         Selectionbtn3.setBackground(black);
         Selectionbtn4.setBackground(black);
         Selectionbtn5.setBackground(black);
         Selectionbtn6.setBackground(black);
         Selectionbtn7.setBackground(black);
         Selectionbtn8.setBackground(black);
         Selectionbtn9.setBackground(black);
         
         btn.setBackground(blue);
         
     }
     private void ResetGame(){
         
         JButton predefinedBtns [] = {R1C1,R1C3,R1C4,R1C6,R1C7,R2C1,R2C2,R3C2,R3C3,R3C8,R3C9,R4C3,R4C5,R4C8,R5C1,R5C4,R5C6,R5C5,R5C9,
                                      R6C2,R6C5,R6C7,R7C1,R7C2,R7C7,R7C8,R8C8,R8C9,R9C3,R9C4,R9C6,R9C7};
             
         
                 JButton btns[][] ={
                     {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
                      {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
                      {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
                      {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
                      {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
                      {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
                      {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
                      {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
                      {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}
                   
                 };
                 for(int i=0; i<9;i++){
                      for(int j=0; j<9; j++){
                          boolean flag= true;
                          
                          for(int k=0; k<predefinedBtns.length; k++){
                              if(btns[i][j]== predefinedBtns[k]){
                                  flag=false;
                              }
                          }
                           if(flag==true){
                               btns[i][j].setText("");
                               btns[i][j].setForeground(black);
                               btns[i][j].setBackground(white);
                           }
                        }
                 }
     }
     
     private void SeeSolution(){
         JButton predefinedBtns [] = {R1C1,R1C3,R1C4,R1C6,R1C7,R2C1,R2C2,R3C2,R3C3,R3C8,R3C9,R4C3,R4C5,R4C8,R5C1,R5C4,R5C6,R5C5,R5C9,
                                      R6C2,R6C5,R6C7,R7C1,R7C2,R7C7,R7C8,R8C8,R8C9,R9C3,R9C4,R9C6,R9C7};
             
         
                 JButton btns[][] ={
                     {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
                      {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
                      {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
                      {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
                      {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
                      {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
                      {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
                      {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
                      {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}
                   
                 };
                
                 if(globalFlag==true){
                     globalFlag=false;
                     SOLUTION.setText(" HIDE SOLUTION");
                     for(int i=0; i<9; i++){
                         for(int j=0; j<9; j++){
                           boolean flag= true;
                           
                             for(int k=0; k<predefinedBtns.length; k++){
                              if(btns[i][j]== predefinedBtns[k]){
                                  flag=false;
                               }
                             }
                             if(flag==true){
                               btns[i][j].setText(SolvedBoard [i][j]);
                               btns[i][j].setForeground(black);
                               btns[i][j].setBackground(white);
                           }
                         }
                             
                     }
                     
                 }
                 else{
                     SOLUTION.setText("SOLUTION");
                     globalFlag=true;
                     ResetGame();
                 }
     }
     private void Checkmoves(){
         JButton btns[][] ={
                     {R1C1,R1C2,R1C3,R1C4,R1C5,R1C6,R1C7,R1C8,R1C9},
                      {R2C1,R2C2,R2C3,R2C4,R2C5,R2C6,R2C7,R2C8,R2C9},
                      {R3C1,R3C2,R3C3,R3C4,R3C5,R3C6,R3C7,R3C8,R3C9},
                      {R4C1,R4C2,R4C3,R4C4,R4C5,R4C6,R4C7,R4C8,R4C9},
                      {R5C1,R5C2,R5C3,R5C4,R5C5,R5C6,R5C7,R5C8,R5C9},
                      {R6C1,R6C2,R6C3,R6C4,R6C5,R6C6,R6C7,R6C8,R6C9},
                      {R7C1,R7C2,R7C3,R7C4,R7C5,R7C6,R7C7,R7C8,R7C9},
                      {R8C1,R8C2,R8C3,R8C4,R8C5,R8C6,R8C7,R8C8,R8C9},
                      {R9C1,R9C2,R9C3,R9C4,R9C5,R9C6,R9C7,R9C8,R9C9}
                   
                 };
         for(int i=0; i<9; i++){
             for(int j=0; j<9; j++){
                 if (!btns[i][j].getText().equals(SolvedBoard[i][j]) && !btns[i][j].getText().equals("")) {
                btns[i][j].setBackground(Color.RED);
            }

             }
         }
         
     }
    /**
     * Creates new form SudokuFile
     */
    public SudokuFile() {
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        R4C1 = new javax.swing.JButton();
        R4C2 = new javax.swing.JButton();
        R4C3 = new javax.swing.JButton();
        R5C1 = new javax.swing.JButton();
        R6C1 = new javax.swing.JButton();
        R5C2 = new javax.swing.JButton();
        R6C2 = new javax.swing.JButton();
        R5C3 = new javax.swing.JButton();
        R6C3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        R1C4 = new javax.swing.JButton();
        R1C5 = new javax.swing.JButton();
        R1C6 = new javax.swing.JButton();
        R2C4 = new javax.swing.JButton();
        R3C4 = new javax.swing.JButton();
        R2C5 = new javax.swing.JButton();
        R3C5 = new javax.swing.JButton();
        R2C6 = new javax.swing.JButton();
        R3C6 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        R4C4 = new javax.swing.JButton();
        R4C5 = new javax.swing.JButton();
        R4C6 = new javax.swing.JButton();
        R5C4 = new javax.swing.JButton();
        R6C4 = new javax.swing.JButton();
        R5C5 = new javax.swing.JButton();
        R6C5 = new javax.swing.JButton();
        R5C6 = new javax.swing.JButton();
        R6C6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        R1C1 = new javax.swing.JButton();
        R1C2 = new javax.swing.JButton();
        R1C3 = new javax.swing.JButton();
        R2C1 = new javax.swing.JButton();
        R3C1 = new javax.swing.JButton();
        R2C2 = new javax.swing.JButton();
        R3C2 = new javax.swing.JButton();
        R2C3 = new javax.swing.JButton();
        R3C3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        R7C7 = new javax.swing.JButton();
        R7C8 = new javax.swing.JButton();
        R7C9 = new javax.swing.JButton();
        R8C7 = new javax.swing.JButton();
        R9C7 = new javax.swing.JButton();
        R8C8 = new javax.swing.JButton();
        R9C8 = new javax.swing.JButton();
        R8C9 = new javax.swing.JButton();
        R9C9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        R7C1 = new javax.swing.JButton();
        R7C2 = new javax.swing.JButton();
        R7C3 = new javax.swing.JButton();
        R8C1 = new javax.swing.JButton();
        R9C1 = new javax.swing.JButton();
        R8C2 = new javax.swing.JButton();
        R9C2 = new javax.swing.JButton();
        R8C3 = new javax.swing.JButton();
        R9C3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        R1C7 = new javax.swing.JButton();
        R1C8 = new javax.swing.JButton();
        R1C9 = new javax.swing.JButton();
        R2C7 = new javax.swing.JButton();
        R3C7 = new javax.swing.JButton();
        R2C8 = new javax.swing.JButton();
        R3C8 = new javax.swing.JButton();
        R2C9 = new javax.swing.JButton();
        R3C9 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        R4C7 = new javax.swing.JButton();
        R4C8 = new javax.swing.JButton();
        R4C9 = new javax.swing.JButton();
        R5C7 = new javax.swing.JButton();
        R6C7 = new javax.swing.JButton();
        R5C8 = new javax.swing.JButton();
        R6C8 = new javax.swing.JButton();
        R5C9 = new javax.swing.JButton();
        R6C9 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        R7C4 = new javax.swing.JButton();
        R7C5 = new javax.swing.JButton();
        R7C6 = new javax.swing.JButton();
        R8C4 = new javax.swing.JButton();
        R9C4 = new javax.swing.JButton();
        R8C5 = new javax.swing.JButton();
        R9C5 = new javax.swing.JButton();
        R8C6 = new javax.swing.JButton();
        R9C6 = new javax.swing.JButton();
        Selectionbtn1 = new javax.swing.JButton();
        Selectionbtn2 = new javax.swing.JButton();
        Selectionbtn3 = new javax.swing.JButton();
        Selectionbtn4 = new javax.swing.JButton();
        Selectionbtn5 = new javax.swing.JButton();
        Selectionbtn6 = new javax.swing.JButton();
        Selectionbtn7 = new javax.swing.JButton();
        Selectionbtn8 = new javax.swing.JButton();
        Selectionbtn9 = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        SOLUTION = new javax.swing.JButton();
        CHECKMOVE = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1ActionPerformed(evt);
            }
        });

        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2ActionPerformed(evt);
            }
        });

        R4C3.setBackground(new java.awt.Color(102, 102, 255));
        R4C3.setText("3");
        R4C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C3ActionPerformed(evt);
            }
        });

        R5C1.setBackground(new java.awt.Color(102, 102, 255));
        R5C1.setText("9");
        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1ActionPerformed(evt);
            }
        });

        R6C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C1ActionPerformed(evt);
            }
        });

        R5C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C2ActionPerformed(evt);
            }
        });

        R6C2.setBackground(new java.awt.Color(102, 102, 255));
        R6C2.setText("5");
        R6C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C2ActionPerformed(evt);
            }
        });

        R5C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C3ActionPerformed(evt);
            }
        });

        R6C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R1C4.setBackground(new java.awt.Color(102, 102, 255));
        R1C4.setText("5");
        R1C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C4ActionPerformed(evt);
            }
        });

        R1C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C5ActionPerformed(evt);
            }
        });

        R1C6.setBackground(new java.awt.Color(102, 102, 255));
        R1C6.setText("8");
        R1C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C6ActionPerformed(evt);
            }
        });

        R2C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C4ActionPerformed(evt);
            }
        });

        R3C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C4ActionPerformed(evt);
            }
        });

        R2C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C5ActionPerformed(evt);
            }
        });

        R3C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C5ActionPerformed(evt);
            }
        });

        R2C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C6ActionPerformed(evt);
            }
        });

        R3C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R4C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C4ActionPerformed(evt);
            }
        });

        R4C5.setBackground(new java.awt.Color(102, 102, 255));
        R4C5.setText("1");
        R4C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C5ActionPerformed(evt);
            }
        });

        R4C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C6ActionPerformed(evt);
            }
        });

        R5C4.setBackground(new java.awt.Color(102, 102, 255));
        R5C4.setText("8");
        R5C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C4ActionPerformed(evt);
            }
        });

        R6C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C4ActionPerformed(evt);
            }
        });

        R5C5.setBackground(new java.awt.Color(102, 102, 255));
        R5C5.setText("6");
        R5C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C5ActionPerformed(evt);
            }
        });

        R6C5.setBackground(new java.awt.Color(102, 102, 255));
        R6C5.setText("9");
        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5ActionPerformed(evt);
            }
        });

        R5C6.setBackground(new java.awt.Color(102, 102, 255));
        R5C6.setText("3");
        R5C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C6ActionPerformed(evt);
            }
        });

        R6C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R1C1.setBackground(new java.awt.Color(102, 102, 255));
        R1C1.setText("3");
        R1C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C1ActionPerformed(evt);
            }
        });

        R1C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C2ActionPerformed(evt);
            }
        });

        R1C3.setBackground(new java.awt.Color(102, 102, 255));
        R1C3.setText("6");
        R1C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C3ActionPerformed(evt);
            }
        });

        R2C1.setBackground(new java.awt.Color(102, 102, 255));
        R2C1.setText("5");
        R2C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C1ActionPerformed(evt);
            }
        });

        R3C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C1ActionPerformed(evt);
            }
        });

        R2C2.setBackground(new java.awt.Color(102, 102, 255));
        R2C2.setText("2");
        R2C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C2ActionPerformed(evt);
            }
        });

        R3C2.setBackground(new java.awt.Color(102, 102, 255));
        R3C2.setText("8");
        R3C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C2ActionPerformed(evt);
            }
        });

        R2C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C3ActionPerformed(evt);
            }
        });

        R3C3.setBackground(new java.awt.Color(102, 102, 255));
        R3C3.setText("7");
        R3C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R7C7.setBackground(new java.awt.Color(102, 102, 255));
        R7C7.setText("2");
        R7C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C7ActionPerformed(evt);
            }
        });

        R7C8.setBackground(new java.awt.Color(102, 102, 255));
        R7C8.setText("5");
        R7C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C8ActionPerformed(evt);
            }
        });

        R7C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C9ActionPerformed(evt);
            }
        });

        R8C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C7ActionPerformed(evt);
            }
        });

        R9C7.setBackground(new java.awt.Color(102, 102, 255));
        R9C7.setText("3");
        R9C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C7ActionPerformed(evt);
            }
        });

        R8C8.setBackground(new java.awt.Color(102, 102, 255));
        R8C8.setText("7");
        R8C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C8ActionPerformed(evt);
            }
        });

        R9C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C8ActionPerformed(evt);
            }
        });

        R8C9.setBackground(new java.awt.Color(102, 102, 255));
        R8C9.setText("4");
        R8C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C9ActionPerformed(evt);
            }
        });

        R9C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R7C1.setBackground(new java.awt.Color(102, 102, 255));
        R7C1.setText("1");
        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1ActionPerformed(evt);
            }
        });

        R7C2.setBackground(new java.awt.Color(102, 102, 255));
        R7C2.setText("3");
        R7C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C2ActionPerformed(evt);
            }
        });

        R7C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C3ActionPerformed(evt);
            }
        });

        R8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C1ActionPerformed(evt);
            }
        });

        R9C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C1ActionPerformed(evt);
            }
        });

        R8C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C2ActionPerformed(evt);
            }
        });

        R9C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C2ActionPerformed(evt);
            }
        });

        R8C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C3ActionPerformed(evt);
            }
        });

        R9C3.setBackground(new java.awt.Color(102, 102, 255));
        R9C3.setText("5");
        R9C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R1C7.setBackground(new java.awt.Color(102, 102, 255));
        R1C7.setText("4");
        R1C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C7ActionPerformed(evt);
            }
        });

        R1C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C8ActionPerformed(evt);
            }
        });

        R1C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1C9ActionPerformed(evt);
            }
        });

        R2C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C7ActionPerformed(evt);
            }
        });

        R3C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C7ActionPerformed(evt);
            }
        });

        R2C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C8ActionPerformed(evt);
            }
        });

        R3C8.setBackground(new java.awt.Color(102, 102, 255));
        R3C8.setText("3");
        R3C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C8ActionPerformed(evt);
            }
        });

        R2C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R2C9ActionPerformed(evt);
            }
        });

        R3C9.setBackground(new java.awt.Color(102, 102, 255));
        R3C9.setText("1");
        R3C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R4C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C7ActionPerformed(evt);
            }
        });

        R4C8.setBackground(new java.awt.Color(102, 102, 255));
        R4C8.setText("8");
        R4C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C8ActionPerformed(evt);
            }
        });

        R4C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C9ActionPerformed(evt);
            }
        });

        R5C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C7ActionPerformed(evt);
            }
        });

        R6C7.setBackground(new java.awt.Color(102, 102, 255));
        R6C7.setText("6");
        R6C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C7ActionPerformed(evt);
            }
        });

        R5C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C8ActionPerformed(evt);
            }
        });

        R6C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C8ActionPerformed(evt);
            }
        });

        R5C9.setBackground(new java.awt.Color(102, 102, 255));
        R5C9.setText("5");
        R5C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C9ActionPerformed(evt);
            }
        });

        R6C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        R7C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C4ActionPerformed(evt);
            }
        });

        R7C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C5ActionPerformed(evt);
            }
        });

        R7C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C6ActionPerformed(evt);
            }
        });

        R8C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C4ActionPerformed(evt);
            }
        });

        R9C4.setBackground(new java.awt.Color(102, 102, 255));
        R9C4.setText("2");
        R9C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C4ActionPerformed(evt);
            }
        });

        R8C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C5ActionPerformed(evt);
            }
        });

        R9C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C5ActionPerformed(evt);
            }
        });

        R8C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C6ActionPerformed(evt);
            }
        });

        R9C6.setBackground(new java.awt.Color(102, 102, 255));
        R9C6.setText("6");
        R9C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R9C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R9C6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R9C4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Selectionbtn1.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn1.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn1.setText("1");
        Selectionbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn1ActionPerformed(evt);
            }
        });

        Selectionbtn2.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn2.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn2.setText("2");
        Selectionbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn2ActionPerformed(evt);
            }
        });

        Selectionbtn3.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn3.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn3.setText("3");
        Selectionbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn3ActionPerformed(evt);
            }
        });

        Selectionbtn4.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn4.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn4.setText("4");
        Selectionbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn4ActionPerformed(evt);
            }
        });

        Selectionbtn5.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn5.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn5.setText("5");
        Selectionbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn5ActionPerformed(evt);
            }
        });

        Selectionbtn6.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn6.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn6.setText("6");
        Selectionbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn6ActionPerformed(evt);
            }
        });

        Selectionbtn7.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn7.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn7.setText("7");
        Selectionbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn7ActionPerformed(evt);
            }
        });

        Selectionbtn8.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn8.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn8.setText("8");
        Selectionbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn8ActionPerformed(evt);
            }
        });

        Selectionbtn9.setBackground(new java.awt.Color(0, 0, 0));
        Selectionbtn9.setForeground(new java.awt.Color(255, 255, 255));
        Selectionbtn9.setText("9");
        Selectionbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selectionbtn9ActionPerformed(evt);
            }
        });

        RESET.setBackground(new java.awt.Color(51, 153, 255));
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });

        EXIT.setBackground(new java.awt.Color(204, 0, 51));
        EXIT.setText("EXIT");
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        SOLUTION.setBackground(new java.awt.Color(102, 255, 102));
        SOLUTION.setText("SOLUTION");
        SOLUTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOLUTIONActionPerformed(evt);
            }
        });

        CHECKMOVE.setBackground(new java.awt.Color(255, 255, 0));
        CHECKMOVE.setText("CHECK MOVE");
        CHECKMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKMOVEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(RESET, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EXIT)
                        .addGap(18, 18, 18)
                        .addComponent(SOLUTION)
                        .addGap(18, 18, 18)
                        .addComponent(CHECKMOVE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Selectionbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Selectionbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESET)
                    .addComponent(EXIT)
                    .addComponent(SOLUTION)
                    .addComponent(CHECKMOVE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Selectionbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn2ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn2);
        turn="2";
    }//GEN-LAST:event_Selectionbtn2ActionPerformed

    private void Selectionbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn3ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn3);
        turn="3";
    }//GEN-LAST:event_Selectionbtn3ActionPerformed

    private void Selectionbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn4ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn4);
        turn="4";
    }//GEN-LAST:event_Selectionbtn4ActionPerformed

    private void Selectionbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn7ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn7);
        turn="7";
    }//GEN-LAST:event_Selectionbtn7ActionPerformed

    private void Selectionbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn9ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn9);
        turn="9";
    }//GEN-LAST:event_Selectionbtn9ActionPerformed

    private void R2C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C3ActionPerformed
        // TODO add your handling code here:
        R2C3.setText(turn);
        R2C3.setBackground(Color.white);
    }//GEN-LAST:event_R2C3ActionPerformed

    private void R2C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C9ActionPerformed
        // TODO add your handling code here:
        R2C9.setText(turn);
        R2C9.setBackground(Color.white);
    }//GEN-LAST:event_R2C9ActionPerformed

    private void R9C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C1ActionPerformed
        // TODO add your handling code here:
        R9C1.setText(turn);
        R9C1.setBackground(Color.white);
    }//GEN-LAST:event_R9C1ActionPerformed

    private void CHECKMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKMOVEActionPerformed
        // TODO add your handling code here:
        Checkmoves();
    }//GEN-LAST:event_CHECKMOVEActionPerformed

    private void R3C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C7ActionPerformed
        // TODO add your handling code here:
        R3C7.setText(turn);
        R3C7.setBackground(Color.white);
    }//GEN-LAST:event_R3C7ActionPerformed

    private void R6C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C1ActionPerformed
        // TODO add your handling code here:
        R6C1.setText(turn);
        R6C1.setBackground(Color.white);
    }//GEN-LAST:event_R6C1ActionPerformed

    private void R4C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C9ActionPerformed
        // TODO add your handling code here:
         R4C9.setText(turn);
        R4C9.setBackground(Color.white);
    }//GEN-LAST:event_R4C9ActionPerformed

    private void R6C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C7ActionPerformed

    private void R9C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C9ActionPerformed
        // TODO add your handling code here:
        R9C9.setText(turn);
        R9C9.setBackground(Color.white);
    }//GEN-LAST:event_R9C9ActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Reset");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to reset the game",
                "Sudoku Puzzel", JOptionPane.YES_NO_OPTION )==JOptionPane.YES_NO_OPTION){
            ResetGame();
        }
    }//GEN-LAST:event_RESETActionPerformed

    private void R1C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C1ActionPerformed

    private void R4C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C3ActionPerformed

    private void R4C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C7ActionPerformed
        // TODO add your handling code here:
         R4C7.setText(turn);
        R4C7.setBackground(Color.white);
    }//GEN-LAST:event_R4C7ActionPerformed

    private void R1C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C2ActionPerformed
        // TODO add your handling code here:
        R1C2.setText(turn);
        R1C2.setBackground(Color.white);
        
    }//GEN-LAST:event_R1C2ActionPerformed

    private void R1C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C5ActionPerformed
        // TODO add your handling code here:
        R1C5.setText(turn);
        R1C5.setBackground(Color.white);
    }//GEN-LAST:event_R1C5ActionPerformed

    private void R1C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C8ActionPerformed
        // TODO add your handling code here:
        R1C8.setText(turn);
        R1C8.setBackground(Color.white);
    }//GEN-LAST:event_R1C8ActionPerformed

    private void R1C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C9ActionPerformed
        // TODO add your handling code here:
        R1C9.setText(turn);
        R1C9.setBackground(Color.white);
    }//GEN-LAST:event_R1C9ActionPerformed

    private void R2C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C4ActionPerformed
        // TODO add your handling code here:
        R2C4.setText(turn);
        R2C4.setBackground(Color.white);
    }//GEN-LAST:event_R2C4ActionPerformed

    private void R2C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C5ActionPerformed
        // TODO add your handling code here:
        R2C5.setText(turn);
        R2C5.setBackground(Color.white);
    }//GEN-LAST:event_R2C5ActionPerformed

    private void R2C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C6ActionPerformed
        // TODO add your handling code here:
        R2C6.setText(turn);
        R2C6.setBackground(Color.white);
    }//GEN-LAST:event_R2C6ActionPerformed

    private void R2C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C7ActionPerformed
        // TODO add your handling code here:
        R2C7.setText(turn);
        R2C7.setBackground(Color.white);
    }//GEN-LAST:event_R2C7ActionPerformed

    private void R2C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C8ActionPerformed
        // TODO add your handling code here:
        R2C8.setText(turn);
        R2C8.setBackground(Color.white);
    }//GEN-LAST:event_R2C8ActionPerformed

    private void R3C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C1ActionPerformed
        // TODO add your handling code here:
        R3C1.setText(turn);
        R3C1.setBackground(Color.white);
    }//GEN-LAST:event_R3C1ActionPerformed

    private void R3C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C4ActionPerformed
        // TODO add your handling code here:
         R3C4.setText(turn);
        R3C4.setBackground(Color.white);
    }//GEN-LAST:event_R3C4ActionPerformed

    private void R3C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C5ActionPerformed
        // TODO add your handling code here:
        R3C5.setText(turn);
        R3C5.setBackground(Color.white);
    }//GEN-LAST:event_R3C5ActionPerformed

    private void R3C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C6ActionPerformed
        // TODO add your handling code here:
        R3C6.setText(turn);
        R3C6.setBackground(Color.white);
    }//GEN-LAST:event_R3C6ActionPerformed

    private void R4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1ActionPerformed
        // TODO add your handling code here:
        R4C1.setText(turn);
        R4C1.setBackground(Color.white);
    }//GEN-LAST:event_R4C1ActionPerformed

    private void R4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2ActionPerformed
        // TODO add your handling code here:
         R4C2.setText(turn);
        R4C2.setBackground(Color.white);
    }//GEN-LAST:event_R4C2ActionPerformed

    private void R4C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C4ActionPerformed
        // TODO add your handling code here:
         R4C4.setText(turn);
        R4C4.setBackground(Color.white);
    }//GEN-LAST:event_R4C4ActionPerformed

    private void R4C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C6ActionPerformed
        // TODO add your handling code here:
         R4C6.setText(turn);
        R4C6.setBackground(Color.white);
    }//GEN-LAST:event_R4C6ActionPerformed

    private void R5C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C2ActionPerformed
        // TODO add your handling code here:
        R5C2.setText(turn);
        R5C2.setBackground(Color.white);
    }//GEN-LAST:event_R5C2ActionPerformed

    private void R5C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C3ActionPerformed
        // TODO add your handling code here:
        R5C3.setText(turn);
        R5C3.setBackground(Color.white);
    }//GEN-LAST:event_R5C3ActionPerformed

    private void R5C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C7ActionPerformed
        // TODO add your handling code here:
        R5C7.setText(turn);
        R5C7.setBackground(Color.white);
    }//GEN-LAST:event_R5C7ActionPerformed

    private void R5C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C8ActionPerformed
        // TODO add your handling code here:
        R5C8.setText(turn);
        R5C8.setBackground(Color.white);
    }//GEN-LAST:event_R5C8ActionPerformed

    private void R6C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C3ActionPerformed
        // TODO add your handling code here:
         R6C3.setText(turn);
        R6C3.setBackground(Color.white);
    }//GEN-LAST:event_R6C3ActionPerformed

    private void R6C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C4ActionPerformed
        // TODO add your handling code here:
         R6C4.setText(turn);
        R6C4.setBackground(Color.white);
    }//GEN-LAST:event_R6C4ActionPerformed

    private void R6C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C6ActionPerformed
        // TODO add your handling code here:
         R6C6.setText(turn);
        R6C6.setBackground(Color.white);
    }//GEN-LAST:event_R6C6ActionPerformed

    private void R6C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C8ActionPerformed
        // TODO add your handling code here:
         R6C8.setText(turn);
        R6C8.setBackground(Color.white);
    }//GEN-LAST:event_R6C8ActionPerformed

    private void R6C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C9ActionPerformed
        // TODO add your handling code here:
         R6C9.setText(turn);
        R6C9.setBackground(Color.white);
    }//GEN-LAST:event_R6C9ActionPerformed

    private void R7C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C3ActionPerformed
        // TODO add your handling code here:
        R7C3.setText(turn);
        R7C3.setBackground(Color.white);
    }//GEN-LAST:event_R7C3ActionPerformed

    private void R7C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C4ActionPerformed
        // TODO add your handling code here:
         R7C4.setText(turn);
        R7C4.setBackground(Color.white);
    }//GEN-LAST:event_R7C4ActionPerformed

    private void R7C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C5ActionPerformed
        // TODO add your handling code here:
         R7C5.setText(turn);
        R7C5.setBackground(Color.white);
    }//GEN-LAST:event_R7C5ActionPerformed

    private void R7C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C6ActionPerformed
        // TODO add your handling code here:
         R7C6.setText(turn);
        R7C6.setBackground(Color.white);
    }//GEN-LAST:event_R7C6ActionPerformed

    private void R7C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C9ActionPerformed
        // TODO add your handling code here:
         R7C9.setText(turn);
        R7C9.setBackground(Color.white);
    }//GEN-LAST:event_R7C9ActionPerformed

    private void R8C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C1ActionPerformed
        // TODO add your handling code here:
         R8C1.setText(turn);
        R8C1.setBackground(Color.white);
    }//GEN-LAST:event_R8C1ActionPerformed

    private void R8C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C2ActionPerformed
        // TODO add your handling code here:
        R8C2.setText(turn);
        R8C2.setBackground(Color.white);
    }//GEN-LAST:event_R8C2ActionPerformed

    private void R8C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C3ActionPerformed
        // TODO add your handling code here:
        R8C3.setText(turn);
        R8C3.setBackground(Color.white);
    }//GEN-LAST:event_R8C3ActionPerformed

    private void R8C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C4ActionPerformed
        // TODO add your handling code here:
        R8C4.setText(turn);
        R8C4.setBackground(Color.white);
    }//GEN-LAST:event_R8C4ActionPerformed

    private void R8C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C5ActionPerformed
        // TODO add your handling code here:
        R8C5.setText(turn);
        R8C5.setBackground(Color.white);
    }//GEN-LAST:event_R8C5ActionPerformed

    private void R8C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C6ActionPerformed
        // TODO add your handling code here:
        R8C6.setText(turn);
        R8C6.setBackground(Color.white);
    }//GEN-LAST:event_R8C6ActionPerformed

    private void R8C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C7ActionPerformed
        // TODO add your handling code here:
        R8C7.setText(turn);
        R8C7.setBackground(Color.white);
    }//GEN-LAST:event_R8C7ActionPerformed

    private void R9C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C2ActionPerformed
        // TODO add your handling code here:
         R9C2.setText(turn);
        R9C2.setBackground(Color.white);
    }//GEN-LAST:event_R9C2ActionPerformed

    private void R9C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C5ActionPerformed
        // TODO add your handling code here:
        R9C5.setText(turn);
        R9C5.setBackground(Color.white);
    }//GEN-LAST:event_R9C5ActionPerformed

    private void R9C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C8ActionPerformed
        // TODO add your handling code here:
        R9C8.setText(turn);
        R9C8.setBackground(Color.white);
    }//GEN-LAST:event_R9C8ActionPerformed

    private void R1C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C3ActionPerformed

    private void R1C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C4ActionPerformed

    private void R1C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C6ActionPerformed

    private void R1C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R1C7ActionPerformed

    private void R2C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C1ActionPerformed

    private void R2C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R2C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R2C2ActionPerformed

    private void R3C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C2ActionPerformed

    private void R3C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C3ActionPerformed

    private void R3C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C8ActionPerformed

    private void R3C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R3C9ActionPerformed

    private void R4C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C5ActionPerformed

    private void R4C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R4C8ActionPerformed

    private void R5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C1ActionPerformed

    private void R5C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C4ActionPerformed

    private void R5C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C5ActionPerformed

    private void R5C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C6ActionPerformed

    private void R5C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R5C9ActionPerformed

    private void R6C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C2ActionPerformed

    private void R6C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R6C5ActionPerformed

    private void R7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C1ActionPerformed

    private void R7C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C2ActionPerformed

    private void R7C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C7ActionPerformed

    private void R7C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R7C8ActionPerformed

    private void R8C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C8ActionPerformed

    private void R8C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C9ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R8C9ActionPerformed

    private void R9C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C3ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C3ActionPerformed

    private void R9C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C4ActionPerformed

    private void R9C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C6ActionPerformed

    private void R9C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R9C7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "This place is already allocated","Message", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_R9C7ActionPerformed

    private void Selectionbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn1ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn1);
        turn="1";
        
    }//GEN-LAST:event_Selectionbtn1ActionPerformed

    private void Selectionbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn5ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn5);
        turn="5";
    }//GEN-LAST:event_Selectionbtn5ActionPerformed

    private void Selectionbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn6ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn6);
        turn="6";
    }//GEN-LAST:event_Selectionbtn6ActionPerformed

    private void Selectionbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selectionbtn8ActionPerformed
        // TODO add your handling code here:
        AssignTurn(Selectionbtn8);
        turn="8";
    }//GEN-LAST:event_Selectionbtn8ActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        // TODO add your handling code here:
        JFrame frame=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Sudoku Puzzel", 
                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_EXITActionPerformed

    private void SOLUTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOLUTIONActionPerformed
        // TODO add your handling code here:
        SeeSolution();
    }//GEN-LAST:event_SOLUTIONActionPerformed

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
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SudokuFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKMOVE;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton R1C1;
    private javax.swing.JButton R1C2;
    private javax.swing.JButton R1C3;
    private javax.swing.JButton R1C4;
    private javax.swing.JButton R1C5;
    private javax.swing.JButton R1C6;
    private javax.swing.JButton R1C7;
    private javax.swing.JButton R1C8;
    private javax.swing.JButton R1C9;
    private javax.swing.JButton R2C1;
    private javax.swing.JButton R2C2;
    private javax.swing.JButton R2C3;
    private javax.swing.JButton R2C4;
    private javax.swing.JButton R2C5;
    private javax.swing.JButton R2C6;
    private javax.swing.JButton R2C7;
    private javax.swing.JButton R2C8;
    private javax.swing.JButton R2C9;
    private javax.swing.JButton R3C1;
    private javax.swing.JButton R3C2;
    private javax.swing.JButton R3C3;
    private javax.swing.JButton R3C4;
    private javax.swing.JButton R3C5;
    private javax.swing.JButton R3C6;
    private javax.swing.JButton R3C7;
    private javax.swing.JButton R3C8;
    private javax.swing.JButton R3C9;
    private javax.swing.JButton R4C1;
    private javax.swing.JButton R4C2;
    private javax.swing.JButton R4C3;
    private javax.swing.JButton R4C4;
    private javax.swing.JButton R4C5;
    private javax.swing.JButton R4C6;
    private javax.swing.JButton R4C7;
    private javax.swing.JButton R4C8;
    private javax.swing.JButton R4C9;
    private javax.swing.JButton R5C1;
    private javax.swing.JButton R5C2;
    private javax.swing.JButton R5C3;
    private javax.swing.JButton R5C4;
    private javax.swing.JButton R5C5;
    private javax.swing.JButton R5C6;
    private javax.swing.JButton R5C7;
    private javax.swing.JButton R5C8;
    private javax.swing.JButton R5C9;
    private javax.swing.JButton R6C1;
    private javax.swing.JButton R6C2;
    private javax.swing.JButton R6C3;
    private javax.swing.JButton R6C4;
    private javax.swing.JButton R6C5;
    private javax.swing.JButton R6C6;
    private javax.swing.JButton R6C7;
    private javax.swing.JButton R6C8;
    private javax.swing.JButton R6C9;
    private javax.swing.JButton R7C1;
    private javax.swing.JButton R7C2;
    private javax.swing.JButton R7C3;
    private javax.swing.JButton R7C4;
    private javax.swing.JButton R7C5;
    private javax.swing.JButton R7C6;
    private javax.swing.JButton R7C7;
    private javax.swing.JButton R7C8;
    private javax.swing.JButton R7C9;
    private javax.swing.JButton R8C1;
    private javax.swing.JButton R8C2;
    private javax.swing.JButton R8C3;
    private javax.swing.JButton R8C4;
    private javax.swing.JButton R8C5;
    private javax.swing.JButton R8C6;
    private javax.swing.JButton R8C7;
    private javax.swing.JButton R8C8;
    private javax.swing.JButton R8C9;
    private javax.swing.JButton R9C1;
    private javax.swing.JButton R9C2;
    private javax.swing.JButton R9C3;
    private javax.swing.JButton R9C4;
    private javax.swing.JButton R9C5;
    private javax.swing.JButton R9C6;
    private javax.swing.JButton R9C7;
    private javax.swing.JButton R9C8;
    private javax.swing.JButton R9C9;
    private javax.swing.JButton RESET;
    private javax.swing.JButton SOLUTION;
    private javax.swing.JButton Selectionbtn1;
    private javax.swing.JButton Selectionbtn2;
    private javax.swing.JButton Selectionbtn3;
    private javax.swing.JButton Selectionbtn4;
    private javax.swing.JButton Selectionbtn5;
    private javax.swing.JButton Selectionbtn6;
    private javax.swing.JButton Selectionbtn7;
    private javax.swing.JButton Selectionbtn8;
    private javax.swing.JButton Selectionbtn9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}
