package Stack_as_Array;

public class Stack {
    private int [] stack;
    private int brojac;

    public Stack(int size_stack){
        this.stack = new int[size_stack];
        this.brojac = 0;
    }

    public int pop(){
        if(brojac > 0){
            int copy = stack[brojac-1];
            stack[brojac-1] = 0;
            brojac--;
            return stack[brojac-1];
        }else{
            System.out.println("Stek je prazan");
            return 0;
        }
    }

    public void push(int element){
        if(stack.length < brojac) {
            stack[brojac] = element;
            brojac++;
        }else{
            System.out.println("Stek je pun");
        }
    }

    public boolean isEmpty(){
        return false;
    }

    public void peek(){

    }


}
