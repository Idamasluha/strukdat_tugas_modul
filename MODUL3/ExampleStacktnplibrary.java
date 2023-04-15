package latihan.modul3;
public class ExampleStacktnplibrary {
    static int MAX = 1000;
    static int top = -1;
    static String[] stack = new String[MAX];

    static void push(String data) {
        if (top == MAX - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = data;
        }
    }

    static String pop() {
        String data = "";
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            data = stack[top];
            top--;
        }
        return data;
    }

    static String peek() {
        String data = "";
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            data = stack[top];
        }
        return data;
    }

    static boolean empty() {
        return (top == -1);
    }

    static int search(String data) {
        int position = -1;
        for (int i = top; i >= 0; i--) {
            if (stack[i].equals(data)) {
                position = top - i + 1;
                break;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        push("Aku");
        push("Anak");
        push("Indonesia");

        System.out.println("next : " + peek());
        push("Raya");
        System.out.println(pop());
        push("!");

        int count = search("Aku");
        while (count != -1 && count > 1) {
            pop();
            count--;
        }
        System.out.println(pop());
        System.out.println(empty());
    }
}