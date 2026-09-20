import java.util.*;

public class ThreeSum {

    public static ArrayList<ArrayList<Integer>> threeSum(int arr[]) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
       

        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 2; i++) {

            // Skip duplicate values of i
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {

                     ArrayList<Integer> list = new ArrayList<>();

                    list.add(arr[i]);
                    list.add(arr[left]);
                    list.add(arr[right]);

                    result.add(list);

                    left++;
                    right--;

                    // Skip duplicate left values
                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right values
                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }

                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int array[] = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(array));
    }
}