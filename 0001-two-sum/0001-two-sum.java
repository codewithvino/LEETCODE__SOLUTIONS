class Solution {
    public int[] twoSum(int[] a, int x) {

        int n=a.length;
        int arr[] = new int[2];
        arr[0]=0;
        arr[1]=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==x){
                   arr[0]=i;
                   arr[1]=j;
                }
            }
        }
        return arr;
    }
}