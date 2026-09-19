
import java.util.*;
public class TwoSumII{
    public static  ArrayList<Integer> twoSum(int[] arr, int target){
        ArrayList<Integer>list=new ArrayList<>();
        int low= 0;
        int high=arr.length-1;
        while(low<high){
            if(arr[low]+arr[high]==target){
                list.add(low+1);    
                // +1 is added because the que is asking for 1 based indexing
                list.add(high+1);
                return list;
            }
            else if(arr[low]+arr[high]<target){
                low++;
            }
            else{
                high--;
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
    }
    public static void main(String[] args){
        int array[]={2,7,11,15};
        int Target=9;
        System.out.println(twoSum(array,Target));

    }
}