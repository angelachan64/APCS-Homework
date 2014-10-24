import java.util.*;

public class Driver{
    public static void main(String[] args){
	Array array = new Array();
	System.out.println(array.frontPiece({1,2}));
	System.out.println(array.frontPiece({6,5,0}));
	System.out.println(array.sum13({1,2,2,1}));
	System.out.println(array.sum13({1,3,1,2,13,2,1,13}));
    }
}