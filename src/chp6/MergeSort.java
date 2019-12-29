package chp6;

import java.util.Arrays;

class MergeSort{
    public static void main(String[] args) {
        int[] testArr = new int[]{8,2,5,23,9,12,16,7};
        System.out.println(Arrays.toString(testArr));
        mergeSort(testArr, 0, testArr.length-1);
        System.out.println(Arrays.toString(testArr));
    }
    public static int[] mergeSort(int[] arr, int start, int end){
        if (start < end){
            // Recursively call merge sort
            int middle  = Math.floorDiv(start+end,2);
            mergeSort(arr, start, middle);
            mergeSort(arr, middle+1, end);
            // merge the sorted subarrays
            merge(arr, start, middle, end);
        }
        return arr;
    }

    public static int[] merge(int[] arr, int start, int middle, int end){
        int n1 = middle - start +1;
        int n2 = end - middle;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for (int i = 0; i<n1; i++){
            left[i] = arr[start+i];
        }
        for (int j = 0; j<n2; j++){
            right[j] = arr[middle+1+j];
        }
        int i = 0;
        int j = 0;
        for (int k=start; k<=end; k++){
            if ((j >= n2) || (i < n1 && left[i] <= right[j]) ){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}