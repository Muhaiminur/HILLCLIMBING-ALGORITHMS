/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hillclimbing;

/**
 *
 * @author muhaiminur
 */
public class HILLCLIMBING {

    /**
     * @param args the command line arguments
     */
    static int cost=0;
    public static void main(String[] args) {
        int [][] board= new int [3][3];
        board[0][0]= 1;
        board[0][1]=2;
        board[0][2]=3;
        board[1][0]=7;
        board[1][1]=8;
        board[1][2]=4;
        board[2][0]=6;
        board[2][1]=0;
        board[2][2]=5;
        System.out.print("Input:");
        for(int i=0; i<=2; i++){
            
            System.out.println();
            for(int j=0; j<=2; j++){
                System.out.print(board[i][j]);
            }
        }
        hill_climbing(board, 3);
        
    }
    public static void hill_climbing(int [][] board, int heuristic){
       cost=cost+1;
        if(heuristic==0){
           System.out.println();
           System.out.print("Output:");
         for(int i=0; i<=2; i++){
             System.out.println(" ");
            for(int j=0; j<=2; j++){
                System.out.print(board[i][j]+" ");
            }
        }
         System.out.println();
         System.out.println("Cost:"+ cost);
       }else{
           int h1=0;
           int h2=0;
           int h3=0;
           int h4=0;
           int board1 [][]=new int [3][3];
          
           int board2 [][]=new int [3][3];
          
           int board3 [][]=new int [3][3];
           
           int board4 [][]=new int [3][3];
           for(int i= 0; i<=2; i++){
               for(int j=0; j<=2; j++){
                   board1[i][j]=board[i][j];
                   board2[i][j]=board[i][j];
                   board3[i][j]=board[i][j];
               }
           }
           
           
           if(board[0][0]==0){
              board1[0][0]= board1[0][1];
              board1[0][1]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[0][0]= board2[1][0];
              board2[1][0]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              if(h1<h2){
                  hill_climbing(board1, h1);
              }else if(h2<h1){
                  hill_climbing(board2, h2);
              }else{
                  
              }
              
              
           }else if(board[0][1]==0){
             board1[0][1]= board1[0][2];
              board1[0][2]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[0][1]= board2[1][1];
              board2[1][1]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              board3[0][1]= board3[0][0];
              board3[0][0]=0; 
              if(board3[0][0]!=1){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][1]!=2){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][2]!=3){
                  h3=h3+1;
                  
              }else{
                  
              }
              if (board3[1][0]!=8){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][1]!=0){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][2]!=4){
                 h3=h3+1; 
              }else{
                  
              }
              if(board3[2][0]!=7){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][1]!=6){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][2]!=5){
                  h3=h3+1;
              }else{
                  
              }
              if(h1<h2){
                  if(h1<h3){
                      hill_climbing(board1,h1);
                  }else{
                      hill_climbing(board3, h3);
                  }
              }else if(h2<h3){
                  hill_climbing(board2, h2);
              }else if(h3<h2){
                  hill_climbing(board3, h3);
              }else{
                  
              }
           }else if(board[0][2]==0){
               board1[0][2]= board1[0][1];
              board1[0][1]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[0][2]= board2[1][2];
              board2[1][2]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              if(h1<h2){
                  hill_climbing(board1, h1);
              }else if(h2<h1){
                  hill_climbing(board2, h2);
              }else{
                  
              }
           }else if(board[1][0]==0){
               board1[1][0]= board1[0][0];
              board1[0][0]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[1][0]= board2[1][1];
              board2[1][1]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              board3[1][0]= board3[2][0];
              board3[2][0]=0; 
              if(board3[0][0]!=1){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][1]!=2){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][2]!=3){
                  h3=h3+1;
                  
              }else{
                  
              }
              if (board3[1][0]!=8){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][1]!=0){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][2]!=4){
                 h3=h3+1; 
              }else{
                  
              }
              if(board3[2][0]!=7){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][1]!=6){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][2]!=5){
                  h3=h3+1;
              }else{
                  
              }
              if(h1<h2){
                  if(h1<h3){
                      hill_climbing(board1,h1);
                  }else{
                      hill_climbing(board3, h3);
                  }
              }else if(h2<h3){
                  hill_climbing(board2, h2);
              }else if(h3<h2){
                  hill_climbing(board3, h3);
              }else{
                 hill_climbing(board2, h2); 
              }
           }else if(board[1][1]==0){
               
                hill_climbing(board, 0);
           }else if(board[1][2]==0){
               board1[1][2]= board1[1][1];
              board1[1][1]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[1][2]= board2[0][1];
              board2[0][1]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              board3[1][2]= board3[2][2];
              board3[2][2]=0; 
              if(board3[0][0]!=1){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][1]!=2){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[0][2]!=3){
                  h3=h3+1;
                  
              }else{
                  
              }
              if (board3[1][0]!=8){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][1]!=0){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[1][2]!=4){
                 h3=h3+1; 
              }else{
                  
              }
              if(board3[2][0]!=7){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][1]!=6){
                  h3=h3+1;
              }else{
                  
              }
              if(board3[2][2]!=5){
                  h3=h3+1;
              }else{
                  
              }
              if(h1<h2){
                  if(h1<h3){
                      hill_climbing(board1,h1);
                  }else{
                      hill_climbing(board3, h3);
                  }
              }else if(h2<h3){
                  hill_climbing(board2, h2);
              }else if(h3<h2){
                  hill_climbing(board3, h3);
              }else{
                  
              }
           }else if (board[2][0]==0){
               board1[2][0]= board1[2][1];
              board1[2][1]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[2][0]= board2[1][0];
              board2[1][0]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              if(h1<h2){
                  hill_climbing(board1, h1);
              }else if(h2<h1){
                  hill_climbing(board2, h2);
              }else{
                  
              }
           }else if(board[2][1]==0){
          
               board1[2][1]= board1[1][1];
              board1[1][1]=0; 
              
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[2][1]= board2[2][0];
              board2[2][0]=0; 
              
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
           
              board3[2][1]= board3[2][2];
              board3[2][2]=0;
              
         
           
              if(board3[0][0]!=1){
                  h3=h3+1;
                  
              }else{
                  
              }
              if(board3[0][1]!=2){
                  h3=h3+1;
                  
              }else{
                  
              }
              if(board3[0][2]!=3){
                  h3=h3+1;
                 
              }else{
                  
              }
              if (board3[1][0]!=8){
                  h3=h3+1;
                  
              }else{
                  
              }
              if(board3[1][1]==0){
                 
              }else{
                  h3=h3+1;
                  
              }
              if(board3[1][2]!=4){
                 h3=h3+1; 
                
              }else{
                  
              }
              if(board3[2][0]!=7){
                  h3=h3+1;
                  
              }else{
                  
              }
              if(board3[2][1]!=6){
                  h3=h3+1;
                  
              }else{
              }
              if(board3[2][2]!=5){
                  h3=h3+1;
                  
              }else{
                  
              }
              
              
              if(h1<h2){
                  if(h1<h3){
                      hill_climbing(board1,h1);
                  }else{
                      hill_climbing(board3, h3);
                  }
              }else if(h2<h3){
          
                  hill_climbing(board2, h2);
              }else if(h3<h2){
                  hill_climbing(board3, h3);
              }else{
                 hill_climbing(board2, h2); 
              }
       
           }else if(board[2][2]==0){
              board1[2][2]= board1[2][1];
              board1[2][1]=0; 
              if(board1[0][0]!=1){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][1]!=2){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[0][2]!=3){
                  h1=h1+1;
                  
              }else{
                  
              }
              if (board1[1][0]!=8){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][1]!=0){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[1][2]!=4){
                 h1=h1+1; 
              }else{
                  
              }
              if(board1[2][0]!=7){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][1]!=6){
                  h1=h1+1;
              }else{
                  
              }
              if(board1[2][2]!=5){
                  h1=h1+1;
              }else{
                  
              }
              board2[2][2]= board2[1][2];
              board2[1][2]=0; 
              if(board2[0][0]!=1){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][1]!=2){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[0][2]!=3){
                  h2=h2+1;
                  
              }else{
                  
              }
              if (board2[1][0]!=8){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][1]!=0){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[1][2]!=4){
                 h2=h2+1; 
              }else{
                  
              }
              if(board2[2][0]!=7){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][1]!=6){
                  h2=h2+1;
              }else{
                  
              }
              if(board2[2][2]!=5){
                  h2=h2+1;
              }else{
                  
              }
              if(h1<h2){
                  hill_climbing(board1, h1);
              }else if(h2<h1){
                  hill_climbing(board2, h2);
              }else{
                  
              } 
           }
       } 
    }
    
}