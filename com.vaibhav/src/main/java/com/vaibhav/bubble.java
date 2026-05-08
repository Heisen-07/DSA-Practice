import java.util.*;
public class bubble {
    public static void main(String[] args) {
        int[] arr={1,5,3,6,7};
        swapp(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swapp(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            boolean flag = true;
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }

            }
            if (flag) {
                break;
            }
        }
    }
}