import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack {
    private List<Integer> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(int item) {
        items.add(item);
    }

    public int pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            throw new EmptyStackException();
        }
    }

    public int size() {
        return items.size();
    }

    // Example usage:
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());  // Output: 30
        System.out.println(stack.peek()); // Output: 20
        System.out.println(stack.isEmpty()); // Output: false
    }
}
