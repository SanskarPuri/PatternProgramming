import java.util.Arrays;
import java.util.Scanner;
public class SortingAlgos {
    // Bubble sorting algorithm.
    static int[] BubbleSort(int [] nums){
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                   swap(nums, j, j-1);
                }
            }
        }
        return nums;
    }
    static int[] SelectionSort(int[] nums){
        // intialize the first loop
        for(int i=0; i<nums.length-1; i++){
            // store the temporary value in smallest and compare to every element of array.
            int smallest=i;
            for(int j=i+1; j<nums.length; j++){
                if(nums[smallest]>nums[j]){
                    smallest=j;
                }
            }
            swap(nums, i, smallest);

        }
        return nums;
    }
    static int[] insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(nums[j]>nums[j-1]){
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        return nums;
    }
    static void swap(int[] nums, int firstIndex, int lastIndex){
        int temp=nums[firstIndex];
        nums[firstIndex]=nums[lastIndex];
        nums[lastIndex]=temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] nums=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<nums.length; i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("The original array is: "+Arrays.toString(nums));
        int[] result=SelectionSort(nums);
        System.out.println("The sorted array is: "+Arrays.toString(result));
        sc.close();
    }
}
