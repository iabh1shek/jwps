import java.util.Arrays;

class Solution {
    public int[] duplicateArray (int[] array) {
        int[] result = new int[array.length * 2 ] ; 
        for(int i =0 ; i<array.length ; i++){ 
            result[i] = array[i]; 
            result[i + array.length] = array[i]; 

        }
        return result ; 
    }


    public static void main(String[] args) { 
        int[] newarray = {1,2,3,4}; 
        Solution object1 = new Solution() ; 
        int[] output = object1.duplicateArray(newarray); 

        System.out.println(Arrays.toString(output));
       
    }
}
