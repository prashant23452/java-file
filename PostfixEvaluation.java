// Stack class for integer operations
class Stack {
    private int[] stackArray;
    private int top;
    private int maxSize;

    // Constructor to initialize the stack
    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow!");
        } else {
            stackArray[++top] = value;
        }
    }

    // Method to pop an element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow!");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check the top element without removing it
    public int peek() {
        return stackArray[top];
    }
}

// Postfix class to evaluate a postfix expression
class Postfix {
    // Method to evaluate a postfix expression
    public int evaluatePostfix(String expression) {
        Stack stack = new Stack(expression.length()); // Create a stack

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // If the character is a digit, push it onto the stack
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }
            // If the character is an operator, pop two elements and perform the operation
            else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                switch (ch) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                    default:
                        System.out.println("Invalid operator: " + ch);
                        break;
                }
            }
        }

        // The final result will be the last element in the stack
        return stack.pop();
    }
}

// Main class to demonstrate postfix evaluation
public class PostfixEvaluation {
    public static void main(String[] args) {
        Postfix postfix = new Postfix();
        String expression = "53+82-*"; // Example postfix expression: (5 + 3) * (8 - 2)

        System.out.println("Postfix Expression: " + expression);
        int result = postfix.evaluatePostfix(expression);
        System.out.println("Result: " + result);
    }
}
