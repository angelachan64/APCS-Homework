import java.util.*;

public class Driver{
    public static void main(String[] args){
        Array as = new Array();
	Random r = new Random();
        int[] array1 = new int[]{1,6,2,6,2,7,1,6,99,99,7};
        int[] array2 = new int[]{1,4,1,4,1,6};
        int[] array3 = new int[]{1,20,50,50};
        int[] array4 = new int[]{10,9,8,-100,-99,-98,100};
        int[] array5 = new int[]{1,1,1,2,3,4,5,6,1,4};
        int[] array6 = new int[]{1, 2, 3, 1, 0, 1, 3};
        int[] array7 = new int[4];
        int[] array8 = new int[21];
        int[] array9 = new int[]{1,1,2,1,2,3,1,2,3,4,1,2,3,4,5,1,2,3,4,5,6};
	int[] array10 = new int[]{7,1,2,9,7,2,1};
	int[] array11 = new int[10];
	for (int i = 0;i<array11.length;i++){
	    array11[i] = r.nextInt(11);
	}
        array7 = as.tenRun(array3);
        array8 = as.seriesUp(6);
        String s = "";
        if (Arrays.equals(array7,array3)){
            s = "true";
        }
        else{
            s = "false";
        }
        String s2 = "";
        if (Arrays.equals(array8, array9)){
            s2 = "true";
        }
        else{
            s2 = "false";
        }
        System.out.println(as.sum67(array1));
        System.out.println(as.more14(array2));
        System.out.println(s);
        System.out.println(as.tripleUp(array4));
        System.out.println(as.canBalance(array6));
        System.out.println(s2);
        System.out.println(as.freq(array11, 2));
	System.out.println(as.maxMirror(array10));
	System.out.println(as.mode(array11));
    }
}
