import java.util.*;

class scobe_task {
    static boolean isCorrectParentheses (String scobes) {
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put(')', '(');
        map.put('}', '{');
        map.put('>', '<');

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < scobes.length(); i++) {
            if ("({<[".contains(String.valueOf(scobes.charAt(i)))) {
                deque.addFirst(scobes.charAt(i));
            } else {
                if (deque.isEmpty() || map.get(scobes.charAt(i)) != deque.getFirst()) 
                    return false;
                deque.removeFirst();
            }
        }
        return deque.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(isCorrectParentheses("()")); // true
        System.out.println(isCorrectParentheses("(")); // false
        System.out.println(isCorrectParentheses("())")); // false
        System.out.println(isCorrectParentheses("((()))")); // true
        System.out.println(isCorrectParentheses("()[]{}<>")); // true
        System.out.println(isCorrectParentheses("([)]")); // false
        System.out.println(isCorrectParentheses("][]")); // false
        System.out.println(isCorrectParentheses("[]{<<(((<>){()[]{}<>}){})<>>{}><()[]<>>}")); // true
    }
}
