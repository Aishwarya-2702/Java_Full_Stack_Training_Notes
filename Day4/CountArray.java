package Day4;

public class CountArray {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,1,0,1,0,0};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            count = (arr[i]==1)?count+1 : count-1;
            // if(arr[i]==1) count++;
            // if(arr[i]==0) count--;
        }
        System.out.println((count>0)?true:false);
    }
}
