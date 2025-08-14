import java.util.*;
interface Stack
{
    void push(String item);
    String pop();
    String peek();
    boolean isEmpty();
}
class ArrayStack implements Stack
{
    private String[] elements = new String[10];
    private int top = -1;
    public void push(String item)
    {
        if (top == elements.length -1){
            System.out.println("Stack Overflow. Cannot push");
            return;
        }
        elements[++top] = item;
    }
    
    public String pop()
    {
        if (isEmpty()){
            System.out.println("Stack Underflow. Cannot pop");
            return null;
        }
        return elements[top--];
    }

    public String peek()
    {
        if (isEmpty()) return null;
        return elements[top];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }
}
public class TextEditor
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Stack obj = new ArrayStack();
        while(true){
            System.out.println("\n----- Text Editor -----");
            System.out.println("1.Enter text");
            System.out.println("2.Undo");
            System.out.println("3.View current text");
            System.out.println("4.Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Enter text: ");
                    String input = sc.nextLine();
                    obj.push(input);
                    break;
                case 2:
                    String poppedEle = obj.pop();
                    if (poppedEle != null){
                        System.out.println("Undo: "+poppedEle);
                    }
                    break;
                case 3:
                    String front = obj.peek();
                    System.out.println("Current text: "+(front != null ? front : "No text"));
                    break;
                case 4:
                    System.out.println("Exiting application...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again");
            }
        }
    }
}