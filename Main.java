public class Main {
    public static void main(String[] args) {
        String str = "tennis";
        String str2 = "tacocat";

       // Practice Problem #1
        String reversed = "";
        for(int i = 0; i < str.length(); i++) {
            reversed = str.substring(i, i+1) + reversed;
        }
        System.out.println(reversed);

        //Practice Problem #2
        String palindrome = "";
        palindrome = str + reversed;
        System.out.println(palindrome);

        //Practice Problem #3
        boolean works = true;
        for(int i = 0; i < str.length()/2; i++) {
            if (str.substring(i, i+1) != str.substring(str.length()-i, str.length())) {
                works = false;
            } 
        }
        if (works == true) {
            System.out.println(str + " is a palindrome!");
        }
        if (works == false) {
            System.out.println(str + " is not a palindrome");
        }

        boolean works2 = true;
        for(int i = 0; i < str2.length()/2; i++) {
            String str3 = "";
            str3 = str2.substring(i, i+1);
            String str4 = "";
            str4 = str2.substring(str2.length()-i-1, str2.length()-i);
            if (!str3.equals(str4)) {
                works2 = false;
            } 
        }
        if (works2 == true) {
            System.out.println(str2 + " is a palindrome!");
        }
        if (works2 == false) {
            System.out.println(str2 + " is not a palindrome");
        }
    }
}