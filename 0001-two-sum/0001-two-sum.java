class Solution {
    public int[] twoSum(int[] a, int x) {

        int n=a.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}