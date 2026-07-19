import java.util.HashSet;
import java.util.Set;

public class containsDuplicates {
    // brute force 
    public boolean output(int[] array) { 
        for(int i=0; i<array.length; i++){ 
            boolean flag = false ; 

            for(int j = i ; j< array.length; j++){ 
                if(i != j) { 
                    if(array[i] == array[j]){ 
                        return true ; 
                    }
                }
                else{ 
                    continue ; 
                }
            }
        }

        return false; 
    }


    // optimal solution 
    
    public boolean optimalSolution(int[] nums) { 

        Set<Integer> set = new HashSet<>(); 
        for(int i=0; i<nums.length; i++){ 

            if(set.contains(nums[i])) { 
                return true; 
            }
            set.add(nums[i]); 


        }
        return false; 
    }
}
