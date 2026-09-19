
class ContainerWithMostWater{
    public static int maxWater(int arr[]){
        int low=0;
        int high=arr.length-1;
        int maxArea=0;
        while(low<high){
            int height=Math.min(arr[low],arr[high]);
            int width=high-low;
            int area=height*width;
            maxArea=Math.max(maxArea,area);
            if(arr[low]<arr[high]){
                low++;
            }
            else{
                high--;
            }


        }
        return maxArea;

    }
    

    public  static void main(String args[]){
        int array[]={1,8, 6,2,5,4,8,3,7};
        System.out.println(maxWater(array));

    }
}
