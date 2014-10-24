import java.util.*;

public class Array{
    public int[] frontPiece(int[] nums){
	if (nums.length <= 2){
	    return nums;
	}
	else{
	    int[] array;
	    array = new int[2];
	    array[0] = nums[0];
	    array[1] = nums[1];
	    return array;
	}
    }
    public int sum13(int[] nums){
	if (nums.length == 0){
	    return 0;
	}
	else{
	    int x = 1;
	    int sum = 0;
	    while (x <= nums.length){
		if (nums[x - 1] != 13){
		    sum = sum + nums[x - 1];
		}
		else{
		    x = x + 1;
		}
		x = x + 1;
	    }
	    return sum;
	}
    }
}