/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed Ijaz
 */
public class View implements ActionListener{

    /**
     * @param args the command line arguments
     */
    
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9;
    JFrame Gameboard;
    controller con;
    
    
    View()
    {
        generateUI();      
        con= new controller(new model(), this);
    }
    
    public void generateUI(){
        
      Gameboard = new JFrame();
      Container objContainer= Gameboard.getContentPane();
      GridLayout objLayout=new GridLayout(3,3);
      objContainer.setLayout(objLayout);
      
      button1=new JButton("-");
      button2=new JButton("-");
      button3=new JButton("-");
      button4=new JButton("-");
      button5=new JButton("-");
      button6=new JButton("-");
      button7=new JButton("-");
      button8=new JButton("-");
      button9=new JButton("-");
      
      objContainer.add(button1);
      objContainer.add(button2);
      objContainer.add(button3);
      objContainer.add(button4);
      objContainer.add(button5);
      objContainer.add(button6);
      objContainer.add(button7);
      objContainer.add(button8);
      objContainer.add(button9);
      
      Gameboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Gameboard.setSize(500,500);
      Gameboard.setVisible(true);
      
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
      
       if(ae.getSource() == button1){
            
            if(button1.getText() == "-"){
                con.actionDone(0);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button2){
            
            if(button2.getText() == "-"){
                con.actionDone(1);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button3){
            
            if(button3.getText() == "-"){
                con.actionDone(2);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button4){
            
            if(button4.getText() == "-"){
                con.actionDone(3);
                
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button5){
            
            if(button5.getText() == "-"){
                con.actionDone(4);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button6){
            
            if(button6.getText() == "-"){
                con.actionDone(5);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button7){
            
            if(button7.getText() == "-"){
                con.actionDone(6);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button8){
            
            if(button8.getText() == "-"){
                con.actionDone(7);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }else if(ae.getSource() == button9){
            
            if(button9.getText() == "-"){
                con.actionDone(8);
            }else{
                JOptionPane.showMessageDialog(Gameboard, "This Box has already been selected!");
            }
            
        }
        
    }
    public void DrawnMessage()
    {
          JOptionPane.showMessageDialog(Gameboard,"Game has been Draw, All the boxes have been filled" );
    }
    
    public void WinningMessage(int a)
    {
        if(a==1)
        JOptionPane.showMessageDialog(Gameboard,"Player 1 Wins" );
        else
        JOptionPane.showMessageDialog(Gameboard,"Player 2 Wins" );
        
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        View v = new View();
    }
    
}
