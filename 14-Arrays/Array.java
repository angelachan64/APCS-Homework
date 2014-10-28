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
}