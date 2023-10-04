import java.util.*;
class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    char board[][] = new char[3][3];
    for(int row = 0 ; row < board.length; row++){
      for(int col = 0; col < board[row].length; col++){
        board[row][col] = ' ';
      }
    }

    char player = 'X';
    boolean gameOver = false;
    Scanner sc = new Scanner(System.in);

    
    while(!gameOver){
      display(board);
      System.out.println("Player "+ player + " Enter your Move");
      int row = sc.nextInt();
      int col = sc.nextInt();
 System.out.println();
      if(board[row][col] == ' '){
        board[row][col] = player;
        gameOver = playerWon(board, player);
        if(gameOver){
          System.out.println("Player " + player+ " Won");
        }else{
          if(player == 'X'){
            player = 'O';
          }else{
            player = 'X';
          }
        }
      }else{
        System.out.println("Wrong Move");
      }
      // truing to push main files
      
    }
    display(board);
    }
  
// just adding github fies 
static boolean isDraw(char[][]  board){
 boolean  gameOver = false;
      
    for(int row = 0; row < board.length; row++){
    for(  int col = 0; col < board[row].length; col++){
      if(board[row][col] != ' '){
        gameOver = false;
      }
    }
    
}
      gameOver = true;
    return gameOver;
}
  
  static void display(char[][] board){
    for(int row = 0; row < board.length; row++){
    for(  int col = 0; col < board[row].length; col++){
      System.out.print(board[row][col] + " | ");
    }
       System.out.println();
    }
  }

  static boolean playerWon(char[][] board, char player){
    // checking the rows 
    for(int row = 0; row < board.length; row++){
      if(board[row][0] == player && board[row][1] == player && board[row][2]== player ){
        return true;
      }
    }

    // checking the columns 
    for(int col = 0; col < board.length; col++){
      if(board[0][col] == player && board[1][col] == player && board[2][col]== player ){
        return true;
      }
    }

    // checking the diagonal
    for(int row = 0; row < board.length; row++){
      if(board[0][0] == player && board[1][1] == player && board[2][2]== player ){
        return true;
      }
    }
 // checking the diagonal second
    for(int row = 0; row < board.length; row++){
      if(board[0][2] == player && board[1][1] == player && board[2][0]== player ){
        return true;
      }
    }
    return false;
  }
}