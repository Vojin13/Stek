package Stack_as_Array;

public class Test {
    public static void main(String[] args){

        Stack stack = new Stack(4);

        stack.push(2);
        stack.push(10);
        stack.push(3);
        stack.push(5);

        System.out.println(stack.toString());

        stack.pop();

        System.out.println(stack.toString());

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
