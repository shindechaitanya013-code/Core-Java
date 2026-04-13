import java.util.Scanner;

class StackDemo
{
    int stack[];
    int top;
    int size;

    StackDemo(int s)
    {
        size = s;
        stack = new int[size];
        top = -1;
    }

    void push(int value)
    {
        if(top == size - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println(stack[top] + " popped from stack");
            top--;
        }
    }

    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are:");
            for(int i = top; i >= 0; i--)
            {
                System.out.println(stack[i]);
            }
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StackDemo s = new StackDemo(5);
        int choice, value;

        do
        {
            System.out.println("\n1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    s.push(value);
                    break;

                case 2:
                    s.pop();
                    break;

                case 3:
                    s.display();
                    break;

                case 4:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 4);
    }
}
