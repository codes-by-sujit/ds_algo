package revision.aug_22;

import com.strivers.util.ArrayUtil;
import org.junit.jupiter.api.Test;

public class SortArrayWith012 {

    private void sort(int[] arr){
        int l=0;
        int m=0;
        int h=arr.length-1;
        while(m<h){
            if(arr[m]==0){
                swap(arr,m,l);
                l++;
                m++;
            } else if(arr[m]==1){
                m++;
            } else {
                swap(arr,m,h);
                h--;
            }
        }
    }

    private void swap(int[] arr, int i, int j){
        int t= arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }

    @Test
    public void tc(){
        int[] arr= new int[]{0,1,1,0,0,2,2,1};
        this.sort(arr);
        ArrayUtil.print(arr);
    }
    @Test
    public void tc2(){
        int[] arr= new int[]{0};
        this.sort(arr);
        ArrayUtil.print(arr);
    }
}
