public class Array{
    public int sum67(int[] nums) {
        boolean start = false;
        int ans = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 6){
                start = true;
            }
            else if (start == true && nums[i] == 7){
                start = false;
            }
            else if (start == false){
                ans = ans + nums[i];
            }
        }
        return ans;
    }
    public boolean more14(int[] nums){
        int onecount = 0;
        int fourcount = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 1){
                onecount = onecount + 1;
            }
            else if (nums[i] == 4){
                fourcount = fourcount + 1;
            }
        }
        if (onecount > fourcount){
            return true;
        }
        else{
            return false;
        }
    }
    public int[] tenRun(int[] nums){
        int[] intArray = new int[nums.length];
        boolean ten = false;
        int num = 1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%10 == 0){
                num = nums[i];
                ten = true;
                intArray[i] = num;
            }
            else if (ten == true){
                intArray[i] = num;
            }
            else{
                intArray[i] = nums[i];
            }
        }
        return intArray;
    }
    public boolean tripleUp(int[] nums){
        boolean result = false;
        int start = 0;
        if (nums.length < 3){
            return result;
        }
        for(int i=0;i<nums.length;i++){
            start = nums[i];
            if (nums.length > i + 2){
                if (nums[i+1] == start + 1 && nums[i+2] == start + 2){
                    result = true;
                }
            }
        }
        return result;
    }
    public boolean canBalance(int[] nums){
        int sum = 0;
        for (int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        int half = 0;
        if (sum%2 == 0){
            half = sum/2;
        }
        else{
            return false;
        }
        sum = 0;
        int count = 0;
        while (sum < half){
            sum = sum + nums[count];
            count = count + 1;
        }
        if (sum == half){
            return true;
        }
        else{
            return false;
        }
    }
    public int[] seriesUp(int n){
        int len = (n*(n+1))/2;
        int[] intArray = new int[len];
        int num = 1;
        int end = 1;
        int count = 0;
        while (end <= n){
            while (num <= end){
                intArray[count] = num;
                count = count + 1;
                num = num + 1;
            }
            end = end + 1;
            num = 1;
        }
        return intArray;
    }
    public int freq(int[] nums, int n){
        int num = nums[n];
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == num){
                count = count + 1;
            }
        }
        return count;
    }
    /*doesn't work*/
    public int maxMirror(int[] nums) {
        int[] reversed = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            reversed[i] = nums[nums.length - 1 - i];
        }
        int ans = 0;
        int count = 0;
        int num = -1;
        for (int i = 0;i<nums.length;i++){
            num = reversed[i];
            //System.out.println("num is:" + num);
            while (count<nums.length){
                //System.out.println("c is:" + count);
                if (num == nums[count]){
                    //System.out.println("nums[c] is: " + nums[count]);
                    ans = ans + 1;
                    count = count + 1;
                    break;
                }
                else{
                    count = count + 1;
                }
            }
        }
    return ans;
    }
    public int mode(int[] nums){
	int result = nums[0];
	int compare = freq(nums, 0);
	for (int i = 1;i<nums.length;i++){
	    if (compare < freq(nums, i)){
	        result = nums[i];
	    }
	}
	return result;
    }
    public int maxVal(int[] nums){
	int result = nums[0];
	for (int i=1;i<nums.length;i++){
	    if (nums[i] > result){
		result = nums[i];
	    }
	}
	return result;
    }
    public int mode2(int[] nums){
	int total = maxVal(nums);
	int[] count = new int[total+1];
	for (int i=0;i<nums.length;i++){
	    count[nums[i]] = count[nums[i]] + 1;
	}
	int result = -1;
	for (int i=0;i<count.length;i++){
	    if (count[i]>result){
		result = i;
	    }
	}
	return result;
    }
    public static void main(String[] args){
	int[] test = new int[]{1,1,2,3,4,5,7,8,9,1,1,5,2,4,5,1,1,4,5,4,8,1,1,4};
	Array as = new Array();
	System.out.println(as.mode2(test));
    }
}
