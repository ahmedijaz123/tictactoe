/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Ahmed Ijaz
 */
public class model {
    int turn;
    int[]  board= new int[9];
    
    model(){
        turn = 1;
        for(int i=0; i<9; i++)
            board[i] = 0;
    }
    
}
