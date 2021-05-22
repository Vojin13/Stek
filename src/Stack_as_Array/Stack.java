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

            return stack[--brojac];
        }else{
            System.out.println("Stek je prazan");
            return 0;
        }
    }

    public void push(int element){
        if(stack.length > brojac) {
            stack[brojac] = element;
            brojac++;
        }else{
            System.out.println("Stek je pun");
        }
    }

    public boolean isEmpty(){
        if(stack[0] == 0){
            return true;
        }else{
            return false;
        }
    }

    public int peek(){
        if(brojac > 0) {
            return stack[brojac - 1];
        }else{
            return 0;
        }
    }

    @Override
    public String toString(){
        StringBuilder output = new StringBuilder();

        for(int i= stack.length-1;i>=0;i--){
            if(stack[i] != 0) {
                output.append(stack[i]);
                output.append(i == 0 ? "" : ", ");
            }
        }
        return output.toString();
    }

}
