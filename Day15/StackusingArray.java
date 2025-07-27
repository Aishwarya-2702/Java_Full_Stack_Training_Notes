class Stack{
    private int maxSize;
    private int top;
    private int[] stackArray;

    Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    //Push operation
    public void push(int d){
        if(top == maxSize-1){
            System.out.println("Stack Overflow");
        }
        else{
            stackArray[++top]=d;
        }
    }

    //Pop operation
    public int pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return -1;
        }
        else{
            return stackArray[top--];
        }
    }

    //to display the peek element
    public int peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else{
            return stackArray[top];
        }
    }

    // for is empty we keep default top as -1
    public boolean isEmpty(){
        return top == -1;
    }

    //to display the elements in an array
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }
        else{
            for(int i=0; i>=0; i++){
                System.out.println(stackArray[i]);
            }
        }
    }
}
public class StackusingArray {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(2);
        s.push(3);
        // s.push(4);
        // s.push(5);
        // s.push(6);
        System.out.println("Popped Stack: "+s.pop());
        System.out.println("Peeked Element: "+s.peek());
        s.display();
    }
}
