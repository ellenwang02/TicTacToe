
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//imports statements to make drawing classes ready to use
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** 
 * Project Name: TicTac
 * Name: Ellen Wang
 * Date: May 7th, 2020
 * Description: Tic-Tac-Toe game that uses 2D arrays and nested if statements, loops and user defined functions
 */
public class TicTacToe_1 extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int tiedCount = 0;
    private int clicks = 0; 
    //initializes the private methods

    
    /**
     * Creates new form TicTacToe_1
     */
    public TicTacToe_1() {
        initComponents();
        setSize(1200,600); 
        setLocationRelativeTo(null);
        //sets size and centres it
    }

    private void gameScore(){
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
        jlblTied.setText("Tied Count: " + String.valueOf(tiedCount));}
    //creates method to track the score and prints it on the screen 
    
    private void choose_A_Player(){
    if (startGame.equals("X")){
        startGame = "O";}
    else{
    startGame = "X"; }}
    //method determines with player goes first
    
    private void  winningGame(){
    String b1 = jButton1.getText();
    String b2 = jButton2.getText();
    String b3 = jButton3.getText();
    
    String b4 = jButton4.getText();
    String b5 = jButton5.getText();
    String b6 = jButton6.getText();
    
    String b7 = jButton7.getText();
    String b8 = jButton8.getText();
    String b9 = jButton9.getText();    
    //determines the string on the jbuttons
    
    //checks for X's
    //checks vertically
    if(b1 == ("X") && b2 == ("X") && b3 == ("X")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton2.setBackground(Color.GREEN);
        jButton3.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b4 == ("X") && b5 == ("X") && b6 == ("X")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton4.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b7 == ("X") && b8 == ("X") && b9 == ("X")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton7.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    
    //checks horizontally    
    if(b1 == ("X") && b4 == ("X") && b7 == ("X")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton4.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);}//sets the jbutton background colours
    

    if(b2 == ("X") && b5 == ("X") && b8 == ("X")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton2.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b3 == ("X") && b6 == ("X") && b9 == ("X")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton3.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    
    //checks diagonally
    if(b1 == ("X") && b5 == ("X") && b9 == ("X")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b3 == ("X") && b5 == ("X") && b7 == ("X")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player X wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        xCount++;//adds xcount score by 1
        gameScore();//calls game score method
        jButton3.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    
    //checks for O's
    //checks vertically
    if(b1 == ("O") && b2 == ("O") && b3 == ("O")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton2.setBackground(Color.GREEN);
        jButton3.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b4 == ("O") && b5 == ("O") && b6 == ("O")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton4.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b7 == ("O") && b8 == ("O") && b9 == ("O")){//checks to see if x wins vertically
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton7.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    
    //checks horizontally    
    if(b1 == ("O") && b4 == ("O") && b7 == ("O")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton4.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);}//sets the jbutton background colours
    

    if(b2 == ("O") && b5 == ("O") && b8 == ("O")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton2.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton8.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b3 == ("O") && b6 == ("O") && b9 == ("O")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton3.setBackground(Color.GREEN);
        jButton6.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    
    //checks diagonally
    if(b1 == ("O") && b5 == ("O") && b9 == ("O")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton1.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton9.setBackground(Color.GREEN);}//sets the jbutton background colours
    
    if(b3 == ("O") && b5 == ("O") && b7 == ("O")){//checks to see if x wins horizontally
        JOptionPane.showMessageDialog(this, "Player O wins", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
        oCount++;//adds ocount score by 1
        gameScore();//calls game score method
        jButton3.setBackground(Color.GREEN);
        jButton5.setBackground(Color.GREEN);
        jButton7.setBackground(Color.GREEN);}//sets the jbutton background colours
    

            if (clicks == 8){
            JOptionPane.showMessageDialog(this, "Its a Tie", "TicTacToe", JOptionPane.INFORMATION_MESSAGE); //output statement
            tiedCount++;//adds one to tie amount when a game is tied
            gameScore(); //calls the game score method

            jButton1.setBackground(Color.RED);
            jButton2.setBackground(Color.RED);
            jButton3.setBackground(Color.RED);
            jButton4.setBackground(Color.RED);
            jButton5.setBackground(Color.RED);
            jButton6.setBackground(Color.RED);            
            jButton7.setBackground(Color.RED);
            jButton8.setBackground(Color.RED);
            jButton9.setBackground(Color.RED);
            //sets the jbutton background colours
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jlblTied = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, java.awt.Color.lightGray, java.awt.Color.lightGray, null));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TicTacToe");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("X Wins:");
        jPanel6.add(jLabel2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jlblPlayerX.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jPanel7.add(jlblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("O Wins:");
        jPanel11.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        jlblPlayerO.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jPanel12.add(jlblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Lucida Grande", 1, 99)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(204, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        jbtnReset.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel16.add(jbtnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        jbtnExit.setFont(new java.awt.Font("Lucida Grande", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel17.add(jbtnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jlblTied.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jlblTied.setText("Tied Count: ");
        jPanel1.add(jlblTied, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
//creates private jframe

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit"); 
        //creates new jframe
        
        if(JOptionPane.showConfirmDialog(frame, "Confirm Exit", "TicTacToe", 
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){//asks user if they would like to exit
        System.exit(0);}//closes system
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    jButton1.setText(startGame);
        
    if (startGame.equals("X")){
        jButton1.setForeground(Color.ORANGE);}
    else{
        jButton1.setForeground(Color.BLUE); }   
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    jButton3.setText(startGame);
        
    if (startGame.equals("X")){
        jButton3.setForeground(Color.ORANGE);}
    else{
        jButton3.setForeground(Color.BLUE); } 
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
   
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    jButton2.setText(startGame);
        
    if (startGame.equals("X")){
        jButton2.setForeground(Color.ORANGE);}
    else{
        jButton2.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o 

    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    jButton4.setText(startGame);
        
    if (startGame.equals("X")){
        jButton4.setForeground(Color.ORANGE);}
    else{
        jButton4.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o    
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    jButton5.setText(startGame);
        
    if (startGame.equals("X")){
        jButton5.setForeground(Color.ORANGE);}
    else{
        jButton5.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    jButton6.setText(startGame);
        
    if (startGame.equals("X")){
        jButton6.setForeground(Color.ORANGE);}
    else{
        jButton6.setForeground(Color.BLUE); } 
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    jButton7.setText(startGame);
        
    if (startGame.equals("X")){
        jButton7.setForeground(Color.ORANGE);}
    else{
        jButton7.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    jButton8.setText(startGame);
        
    if (startGame.equals("X")){
        jButton8.setForeground(Color.ORANGE);}
    else{
        jButton8.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
    jButton9.setText(startGame);
        
    if (startGame.equals("X")){
        jButton9.setForeground(Color.ORANGE);}
    else{
        jButton9.setForeground(Color.BLUE); }
    //changes the colour and determines whether its an x or o 
    
    choose_A_Player(); 
    winningGame(); 
    //calls the methods 
    
    clicks = clicks + 1;//adds one to clicks
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jButton1.setText(null);
        jButton2.setText(null);
        jButton3.setText(null);
        jButton4.setText(null);
        jButton5.setText(null);
        jButton6.setText(null);
        jButton7.setText(null);
        jButton8.setText(null);
        jButton9.setText(null);
        //resets the buttons
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        //resets the background colour
        
        clicks = 0; 
        //resets clicks
    }//GEN-LAST:event_jbtnResetActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JLabel jlblTied;
    // End of variables declaration//GEN-END:variables
}
