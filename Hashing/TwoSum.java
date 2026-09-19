import java.util.*;
class TwoSum{
    public static ArrayList<Integer>twoSum(int array[],int target){
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();

        for( int i=0;i<array.length;i++){
            int num=target-array[i];
            if(map.containsKey(num)){
                 list.add(map.get(num));
                list.add(i);
               
                return list;
            }
            else{
                map.put(array[i],i);
            }

        }
        list.add(-1);
        list.add(-1);

        return list;

    }
    public static void main(String args[]){
        int array[]={2,-1,6,3};
        int target=5;

        
        System.out.println(twoSum(array,target));
    }
}