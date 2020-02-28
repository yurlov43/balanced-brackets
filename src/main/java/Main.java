public class Main {

    public static void main(String[] args) {
        String [] strings1 = {"())(", "))((", "((())", "(()((())()))", "(()()(()"};

        for (String str : strings1) {
            if (balancedBrackets(str)) {
                System.out.println(String.format("%s\t- Balanced brackets!", str));
            } else {
                System.out.println(String.format("%s\t- Unbalanced brackets!", str));
            }
        }
    }

    public static boolean balancedBrackets(String str) {
        Stack stack = new Stack<Character>();
        for (int i = 0; i < str.length(); i += 1) {
            if (str.charAt(i) == '(') {
                 stack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')' && stack.pop() == null) {
                return false;
            }
        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
