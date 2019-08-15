public class Strung{
    public static String reverse(String str){
        StringBuilder strb = new StringBuilder(str.trim());
        return strb.reverse().toString();
    }

    public static String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static char[] extractVowels(String str){
        StringBuilder strb = new StringBuilder(str.trim());
        String vowels = "";

        for (int i = 0; i < strb.length(); i++){
            switch (Character.toUpperCase(strb.charAt(i))){
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    vowels += strb.charAt(i);
                    break;
                default:
                    break;
            }
        }

        return vowels.toCharArray();
    }

    public static long vowelCount(String str){
        long num = 0;

        for (int i = 0; i < str.length(); i++){
            switch (Character.toUpperCase(str.charAt(i))){
                case 'A': case 'E': case 'I': case 'O': case 'U':
                    num++;
                    break;
                default:
                    break;
            }
        }

        return num;
    }

    public static String removeConsonants(String str){
        return str.replaceAll("[bcdfghjklmnpqrstvwxyzABCDFGHJKLMNPQRSTVWXYZ]", "");
    }

    public static char[] extractConsonants(String str){
        StringBuilder strb = new StringBuilder(str.trim());
        String consonants = "";

        for(int i = 0; i < strb.length(); i++){
            switch (Character.toUpperCase(strb.charAt(i))){
                case 'B': case 'C': case 'D':
                case 'F': case 'G': case 'H':
                case 'J': case 'K': case 'L':
                case 'M': case 'N': case 'P':
                case 'Q': case 'R': case 'S':
                case 'T': case 'V': case 'W':
                case 'X': case 'Y': case 'Z':
                    consonants += strb.charAt(i);
                    break;
                default:
            }
        }

        return consonants.toCharArray();
    }

    public static long consonantCount(String str){
        long num = 0;

        for (int i = 0; i < str.length(); i++){
            switch (Character.toUpperCase(str.charAt(i))){
                case 'B': case 'C': case 'D':
                case 'F': case 'G': case 'H':
                case 'J': case 'K': case 'L':
                case 'M': case 'N': case 'P':
                case 'Q': case 'R': case 'S':
                case 'T': case 'V': case 'W':
                case 'X': case 'Y': case 'Z':
                    num++;
                    break;
                default:
                    break;
            }
        }

        return num;
    }

    public static long wordCount(String str){
        String[] words = str.trim().split("[ ]");
        return words.length;
    }

    public static String removeExtraSpaces(String str){
        StringBuilder strb = new StringBuilder(str.trim());
        int position = strb.indexOf(" ");

        while (position != -1){
            while (strb.charAt(++position) == ' '){
                strb.deleteCharAt(position);
                --position;
            }

            position = strb.indexOf(" ", position + 1);
        }

        return strb.toString();
    }

    public static String capitalizeSentence(String str){
        StringBuilder strb = new StringBuilder(str.trim());

        strb.setCharAt(0, Character.toUpperCase(strb.charAt(0)));

        for (int i = 1; i < strb.length() - 1; i++){
            switch (strb.charAt(i)){
                case '.':
                case '?':
                case '!':
                    strb.setCharAt(i + 2, Character.toUpperCase(strb.charAt(i + 2)));
                    break;
                default:
                    break;
            }
        }

        return strb.toString();
    }

    public static boolean isPalindrome(String str){
        boolean flag = true;
        int min = 0;
        int max = str.length() - 1;

        while (flag && min <= max){
            if (str.charAt(min) != str.charAt(max)){
                flag = false;
            }
            min++;
            max--;
        }

        return flag;
    }

    public static String replaceSubstring(String str1, String str2, String str3){
        StringBuilder strb = new StringBuilder(str1.trim());
        int position = strb.indexOf(str2);

        while (position != -1){
            strb.delete(position, position + str2.length());
            strb.insert(position, str3);
            position = strb.indexOf(str2, position + 1);
        }

        return strb.toString();
    }

    public static String decimalToBinary(int decimal){
        return Integer.toBinaryString(decimal);
    }
}