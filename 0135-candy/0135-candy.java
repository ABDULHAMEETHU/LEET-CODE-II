class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies,1);

        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                candies[i]=candies[i-1]+1;
            }
        }
        for(int j=n-2;j>=0;j--){
            if(ratings[j]>ratings[j+1]){
                candies[j]=Math.max(candies[j],candies[j+1]+1);
            }
        }
        int sum=0;
        for(int tot:candies){
            sum+=tot;
        }
        return sum;
    }
}