package Day8;

class number{
        public void unique(char a[]){
            for(int i=0; i<a.length; i++){
                if((a[i]!='a')&&(a[i]!='e')&&(a[i]!='i')&&(a[i]!='o')&&(a[i]!='u')){
                    System.out.print(a[i]+" ");
                }
            }
        }
    }

public class VowelFrequencyArray {
    public static void main(String[] args) {
        char a[]={'a','b','c','d','e','f','g'};
        number arr = new number();
        arr.unique(a);
    }
}
