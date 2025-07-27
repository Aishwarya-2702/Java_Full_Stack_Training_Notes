package Day8;
public class FrequencyArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 1, 3, 4, 4, 1, 5};
        int c[] = new int[100];
        for(int i=0; i<a.length; i++){
            c[a[i]]++;
        }
        for(int i=0; i<c.length;i++){
            for(;c[i]>0;c[i]--)
            System.out.print(i+ " ");
        }
    }
}
