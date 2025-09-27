package revision._27_sep;

public class _45_JumpGame_II {
    public int jump(int[] nums) {
        int totalJumps=0;

        //How far I can go from the current index
        int coverage=0;

        //After Checking all index under my coverage, where should I jump next ?
        int nextJump=0;

        int destination=nums.length-1;

        //Base Case: If array length is 1 that means I am already at the destination
        //Hence need 0 step to reach  the destination
        if(nums.length==1) return 0;

        //let's apply greedy and check for each index till last
        for(int i=0;i<nums.length;i++){

            //Coverage is the farthest distance I can go from the current index
            coverage=Math.max(coverage,i+nums[i]);

            //Did I check the coverage of all my discovered indexes (under my coverage)
            //If yes then I am at the last index of my coverage
            if(i==nextJump){
                //Where can i go next ?
                // The farthest I can go that I have discovered from my recent covered indexes
                //Which is nothing but the coverage
                nextJump= coverage;
                totalJumps++; // I am jumping to next discovery

                //Did I reach the destination or passed the destination ?
                if(coverage>=destination){
                    return totalJumps;
                }
            }
        }
        return totalJumps;
    }
}
