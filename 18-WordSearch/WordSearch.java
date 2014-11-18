import java.io.*;
import java.util.*;

/* Creates a word search puzzle */
/*
  makes a 2D array of characters
  have a word list that we're going to draw from
  choose words randomly from the word list
*/

public class WordSearch{
    /* DECLARATIONS */
    private char[][] board;
    
    /* CONSTRUCTORS */
    public WordSearch(int r,int c){
	board = new char[r][c];
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[i].length;j++){
		board [i][j] = '.';
	    }
	}
    }

    /* METHODS */
    public WordSearch(){
	this(30,20);
    }
    public String toString(){
	String s = "";
	for (int i=0;i<board.length;i++){
	    for (int j=0;j<board[i].length;j++){
		s = s + board[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
}
