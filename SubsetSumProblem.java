class SubsetSumProblem{
    static Boolean isSubsetSum(int N, int arr[], int sum){
        Boolean dp[][] = new Boolean[N+1][sum+1];
        for(int i=0; i<N+1; i++){
            dp[i][0] = true;
        }
        return util(N, arr, sum, dp);
        
    }
    
    static Boolean util(int N, int arr[], int sum, Boolean dp[][]){
        if(sum == 0)
            return true;
        if(N == 0)
            return false;
        
        if(dp[N][sum]!=null)
            return dp[N][sum];
            
        if(arr[N-1]<=sum && util(N-1, arr, sum-arr[N-1], dp))
            return dp[N][sum] = true;
        
        return dp[N][sum] = util(N-1, arr, sum, dp);
    }
}