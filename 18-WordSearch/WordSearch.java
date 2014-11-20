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
    Random rnd = new Random();
    
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
    	int rand = rnd.nextInt(8);
    	while (rand != 0){
    	    rand = rnd.nextInt(8);
    	}
    	if (rand == 0){
    	    addWordH1(w, rnd.nextInt(board.length), rnd.nextInt(board[0].length-w.length()));
    	}
    }
    public boolean matching(int n, String w, int r, int c){
	boolean matching = true;
	char val;
	for (int i=0;i<w.length();i++){
	    val = board[r][c];
	    if (!(val=='.') && !(val==w.charAt(i))){
		matching = false;
		break;
	    }
	    if (n == 0){
		c++;
	    }
	    else if (n == 1){
		c--;
	    }
	    else if (n == 2){
		r++;
	    }
	    else if (n == 3){
		r--;
	    }
	    else if (n == 4){
		r--;
		c++;
	    }
	    else if (n == 5){
		r++;
		c++;
	    }
	    else if (n == 6){
		r++;
		c--;
	    }
	    else if (n == 7){
		r--;
		c--;
	    }
	}
	return matching;
    }

    /* SMALLER CHUNKS */
    public void addWordH1(String w, int r, int c){
    	if (matching(0, w, r, c)){
    	    for (int i=0;i<w.length();i++){
    	        //System.out.println(w.charAt(i));
    	        board[r][c] = w.charAt(i);
        	    c++;
    	    }
    	}
    	else{
    	    addWordH1(w, rnd.nextInt(board.length), rnd.nextInt(board[0].length-w.length()));
    	}
    }
    public void addWordH2(String w, int r, int c){
        if (matching(1, w, r, c)){
            for (int i=0;i<w.length();i++){
                board[r][c] = w.charAt(i);
                c--;
            }
        }
        else{
            addWordH2(w, rnd.nextInt(board.length), rnd.nextInt(board[0].length-w.length())+w.length());
        }
    }
    public void addWordV1(String w, int r, int c){
        for (int i=0;i<w.length();i++){
            board[r][c] = w.charAt(i);
            r++;
        }
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
