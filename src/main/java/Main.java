public class Main {

    public static void main(String[] args) {
        String [] strings = {"())(", "))((", "((())", "(()((())()))", "(()()(()"};

        for (String str : strings) {
            if (balancedBrackets(str)) {
                System.out.println(String.format("%s\t- Balanced brackets!", str));
            } else {
                System.out.println(String.format("%s\t- Unbalanced brackets!", str));
            }
        }
    }

    public static boolean balancedBrackets(String str) {
        Stack stack = new Stack<Character>();
        int result = 0;
        for (int i = str.length() - 1; i >= 0; i -= 1) {
            stack.push(str.charAt(i));
        }

        while (stack.size() != 0) {
            char ch = (char) stack.pop();
            if (ch == '(') {
                result += 1;
            }
            if (ch == ')') {
                result -= 1;
            }
            if (result < 0) {
                break;
            }
        }
        if (result != 0) {
            return false;
        }
        return true;
    }
}
