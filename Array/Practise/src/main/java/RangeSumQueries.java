public class RangeSumQueries {

    public static void main(String[] args) {
        int[] arr = new int[]{-2, 0, 3, -5, 2, -1};
        RangeSumQueries obj = new RangeSumQueries(arr);
        int param_1 = obj.sumRange(0,2);
        System.out.println(param_1);
        System.out.println(obj.sumRange(2,5));
        System.out.println(obj.sumRange(0,5));
    }

    int[] ps ;
    int[] arr;
    public RangeSumQueries(int[] nums) {
        arr = nums;
        ps = new int[arr.length];
        calculatePs();
    }

    public int sumRange(int left, int right) {
        if(left==0){
            return ps[right];
        } else{
            return ps[right]-ps[left-1];
        }
    }

    private void calculatePs(){
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
        }
    }
}
