// GFG Largest element in array
// Language  : Java

class Compute {
    
    public int largest(int arr[], int n){
        int max = arr[0];
        for(int i=1; i<n; i++){
            max = (max < arr[i]) ? arr[i] : max;
        }
        return max;
    }
}