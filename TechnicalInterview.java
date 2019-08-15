import java.util.Scanner;
import java.util.HashMap;

public class VeevaTechnicalInterview{
    public static void main(String... args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = keyboard.nextLine();

        System.out.println(reverse(input));
        System.out.println(occurrences(input));

        System.exit(0);
    }

    private static String reverse(String str){
        StringBuilder strb = new StringBuilder(str);
        return strb.reverse().toString();
    }

    private static String occurrences(String str){
        String[] tokens = str.split(",");
        HashMap<String, Integer> map = new HashMap<>();

        for (String token: tokens){
            map.put(token, map.containsKey(token) ?
                    map.get(token) + 1 : 1);
        }

        return map.toString();
    }
}
