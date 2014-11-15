import java.io.*;
import java.util.*;

public class Driver2{
    public static void main(String[]args){
        Random r = new Random();
        Integer[] ai = new Integer[]{0,1,2,3,4,5,6,7,8,9};
        Integer[] fin = new Integer[]{-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
        String print = "";
        for (Integer i=0;i<ai.length;i++){
            print += ai[i] + ", ";
        }
        System.out.println(print);
        print = "";
        for (Integer i=0;i<ai.length;i++){
            print += fin[i] + ", ";
        }
        System.out.println(print);
        
        Integer num;
        Integer ind = r.nextInt(ai.length);
        while (Arrays.asList(fin).indexOf(-1) != -1){
            for (Integer i=0;i<ai.length;i++){
                num = ai[i];
                if (fin[ind] == -1){
                    fin[ind] = num;
                }
                else{
                    while (fin[ind] != -1){
                        ind = r.nextInt(ai.length);
                        if (fin[ind] == -1){
                            fin[ind] = num;
                            break;
                        }
                    }
                }
                ind = r.nextInt(ai.length);
            }
        }
        print = "";
        for (int i=0;i<ai.length;i++){
            print += fin[i] + ", ";
        }
        System.out.println(print);
    }
}