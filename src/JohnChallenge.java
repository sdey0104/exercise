import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class JohnChallenge {
    /**
     * An arithmetic string is based on numeric symbols, mathematical operations (+,/,-,*) and brackets
     * ({,},[,],(,))
     * For example :
     * [{3+4}*(8-10)]
     * Write an efficient algorithm wich determines whether the bracket structure is valid.
     * Provide Time / Space complexity
     * Collapse
     */
    private static Scanner scanner = new Scanner(System.in);
    static HashMap<Character, Character> map = new HashMap<Character, Character>();

    public static void main(String[] arg) {
        String expresion = scanner.next();
        expresion = expresion.replace(" ","");
        String t = isGoodParenthesis(expresion);
        boolean checkBrackets = isStructureValid(t);
        System.out.println(checkBrackets);
    }


    public static String isGoodParenthesis(String expression) {

        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        String onlyExpression = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (map.keySet().contains(c)) {
                onlyExpression = onlyExpression.concat(String.valueOf(c)).toString();
            } else if (map.values().contains(c)) {
                onlyExpression = onlyExpression.concat(String.valueOf(c)).toString();
            }
        }
        System.out.println(onlyExpression);
        return onlyExpression;
    }

    public static boolean isStructureValid(String exp) {

        String onlyExpression = "";
        int[] keys = new int[exp.length()];
        int[] value = new int[exp.length()];
        int keyCount = 0;
        int valueCount = 0;
        for (int k = 0; k < exp.length(); k++) {
            char c = exp.charAt(k);
            if (map.keySet().contains(c)) {
                keys[k] = exp.indexOf(c);
                keyCount++;
            }
            if (map.values().contains(c)) {
                value[k] = exp.indexOf(c);
                valueCount++;
            }
        }
        System.out.println(Arrays.toString(keys));
        System.out.println(Arrays.toString(value));


        if (keyCount == valueCount) {
            return true;
        }
        return false;
    }

}

