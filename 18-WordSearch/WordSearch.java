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
    Random r = new Random();
    
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
    public void addWord(String w){
	int rand = r.nextInt(8);
	while (rand != 0){
	    rand = r.nextInt(8);
	}
	if (rand == 0){
	    addWordH1(w, r.nextInt(board.length-1), r.nextInt(board[0].length-w.length()));
	}
    }
    public void addWordH1(String w, int r, int c){
	System.out.println(w + " " + r + " " + c);
	for (int i=0;i<w.length();i++){
	    System.out.println(w.charAt(i));
	    board[r][c] = w.charAt(i);
	    c++;
	}
    }
    public void addWordH2(String w, int r, int c){

    }
    public void addWordV1(String w, int r, int c){

    }
    public void addWordV2(String w, int r, int c){

    }
    public void addWordD1(String w, int r, int c){

    }
    public void addWordD2(String w, int r, int c){

    }
    public void addWordD3(String w, int r, int c){

    }
    public void addWordD4(String w, int r, int c){

    }
}
