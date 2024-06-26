import java.util.Scanner;

/**
 * class for testing the resizing array class
 * @author  Huy Nguyen
 * @version 1.0
 */
public class StackTestClient {
    public static void main(String[] args) {
        Stack<String> s = new LinkedStack<>();
        Scanner in = new Scanner("to be or not to - be - - that - - - is");

        while (in.hasNext()) {
            String item = in.next();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                System.out.print(s.pop() + " ");
            }
        }
        System.out.println("(" + s.size() + " left on the stack" + ")");
    }
}
