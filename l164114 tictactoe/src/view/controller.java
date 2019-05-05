/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed Ijaz
 */
public class controller {
    
    model m;
    View v;
    
    controller(model md, View vw){
        m = md;
        v = vw;
    }
    public int Gamecompletion(int a) // a is player number
    {
        int x=0;
        
        if(m.board[0]==m.board[1] && m.board[1]==m.board[2] && m.board[0]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[0]==m.board[3] && m.board[3]==m.board[6] && m.board[0]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[1]==m.board[4] && m.board[4]==m.board[7]&& m.board[1]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[2]==m.board[5] && m.board[5]==m.board[8]&& m.board[2]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[0]==m.board[4] && m.board[4]==m.board[8]&& m.board[0]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[2]==m.board[4] && m.board[4]==m.board[6]&& m.board[2]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[3]==m.board[4] && m.board[4]==m.board[5]&& m.board[3]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[6]==m.board[7] && m.board[7]==m.board[8]&& m.board[6]!=0)
        {
            v.WinningMessage(a);
            x=1;
        }
        else if(m.board[0]!=0 && m.board[1]!=0 && m.board[2]!=0 && m.board[3]!=0 && m.board[4]!=0 && m.board[5]!=0 && m.board[6]!=0 && m.board[7]!=0 && m.board[8]!=0)
        {
            x=1;
            v.DrawnMessage();
        }
        return x;
    }
    public void actionDone(int a)
    {
        
        if(m.turn == 1)
        {
            if(a==0)
            {
                v.button1.setText("x");
                m.board[a]=1;
            }
            else if(a==1)
            {
                v.button2.setText("x");
                m.board[a]=1;
            }
            else if(a==2)
            {
                v.button3.setText("x");
                m.board[a]=1;
            }
            else if(a==3)
            {
                v.button4.setText("x");
                m.board[a]=1;
            }
            else if(a==4)
            {
                v.button5.setText("x");
                m.board[a]=1;
            }
            else if(a==5)
            {
                v.button6.setText("x");
                m.board[a]=1;
            }
            else if(a==6)
            {
                v.button7.setText("x");
                m.board[a]=1;
            }
            else if(a==7)
            {
                v.button8.setText("x");
                m.board[a]=1;
            }
            else if(a==8)
            {
                v.button9.setText("x");
                m.board[a]=1;
            }
            int x = Gamecompletion(1);
            if(x==0)
            {
                m.turn=2;
            }
            
        }
        else if(m.turn == 2)
        {
            if(a==0)
            {
                v.button1.setText("0");
                m.board[a]=2;
            }
            else if(a==1)
            {
                v.button2.setText("0");
                m.board[a]=2;
            }
            else if(a==2)
            {
                v.button3.setText("0");
                m.board[a]=2;
            }
            else if(a==3)
            {
                v.button4.setText("0");
                m.board[a]=2;
            }
            else if(a==4)
            {
                v.button5.setText("0");
                m.board[a]=2;
            }
            else if(a==5)
            {
                v.button6.setText("0");
                m.board[a]=2;
            }
            else if(a==6)
            {
                v.button7.setText("0");
                m.board[a]=2;
            }
            else if(a==7)
            {
                v.button8.setText("0");
                m.board[a]=2;
            }
            else if(a==8)
            {
                v.button9.setText("0");
                m.board[a]=2;
            }
            int x = Gamecompletion(2);
            if(x==0)
            {
                m.turn=1;
            }
       }
        
        }
    }
 