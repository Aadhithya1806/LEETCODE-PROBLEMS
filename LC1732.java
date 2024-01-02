// Solution For problem 

class Solution {
    public int largestAltitude(int[] gain) {
        int result [] = new int [gain.length + 1];
        result[0] = 0; 
        int gainIndex = 0;
        int resultIndex = 1;
        while (gainIndex < gain.length){
            result[resultIndex] = (gain[gainIndex] + result[gainIndex]);
            resultIndex++;
            gainIndex++;
        }
        int ans = maxValue(result);
        return ans;        
    }

    static int maxValue(int arr[]){
        int maxValue = arr[0];
        for(int alt : arr){
            if(alt > maxValue)
                maxValue = alt;
        }
        return maxValue;  
    }
}