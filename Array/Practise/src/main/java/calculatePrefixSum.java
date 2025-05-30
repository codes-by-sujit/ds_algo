public class calculatePrefixSum {

    public static void main(String[] args) {
        calculatePrefixSum obj = new calculatePrefixSum();
        int[] arr = new int[]{2,3,-1,4,5};
        int[] ps = obj.calculate(arr);
        System.out.println(ps[2]);
    }

    private int[] calculate(int[] arr){
        int[] ps= new int[arr.length];
        ps[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            ps[i]=ps[i-1]+arr[i];
        }
        return ps;
    }
}
