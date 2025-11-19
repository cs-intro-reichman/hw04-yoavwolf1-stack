public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowCase = "";
        char ch;
        for(int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(ch >= 65 && ch <= 90) ch = (char)(ch + 32);
            lowCase += ch;
        }
        return lowCase;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        char ch;
        int start = 0;
        boolean in = false;
        if(str2.length() == 0) return true;
        
        for(int i = 0; i < str1.length(); i++) { 
            in = false;
            start = i;
            while((i < str1.length()) && (i - start < str2.length()) && 
                    (str1.charAt(i) == str2.charAt(i - start))) {
                in = true;
                i++;
            }
            if(in == true) {
                if(i - start == str2.length()) return true;
                else i--;
            }
        }
        return false;
    }
}