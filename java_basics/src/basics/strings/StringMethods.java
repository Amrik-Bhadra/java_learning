package basics.strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        /*
            Strings are immutable in java, so we cant modify a string once created
            so always, string methods returns a new string (modified), not affecting the original one
        */
        String str = "Core Decimals Solution ki jaiii";

        // 1. str.length();
        System.out.println("Length: " + str.length());

        // 2. str.charAt(index);
        System.out.println("Character at index 3: " + str.charAt(3));
        //   System.out.println("Character at index 400: " +   --> array index out of bound


        // 3. str.toUpperCase();
        System.out.println("String in uppercase: " + str.toUpperCase());

        // 4. str.toLowerCase();
        System.out.println("String in lowercase: " + str.toLowerCase());

        String str1 = "Amrik", str2 = "amrik";
        // 5. str1.equals(str2);
        System.out.println(str1.equals(str2));

        // 6. str1.equalsIgnoreCase(str2)
        System.out.println(str1.equalsIgnoreCase(str2));

        // 7. str1.compareTo(str2)  -> returns difference of ascii where characters doesnot matched
        System.out.println(str1.compareTo(str2));

        // 7. str1.compareTo(str2)
        System.out.println(str1.compareToIgnoreCase(str2));

        // 8. str.substring(startIndex, endIndex);  startIndex included, endIndex excluded
        System.out.println(str1.substring(0, 4));
        System.out.println(str1.substring(3));

        String name = "     Amrik Bhadra             ";
        //9. str.trim();
        System.out.println('|' + name.trim() + '|');

        // 10. str.contains(string);
        System.out.println(name.contains("Bhadra"));
        System.out.println(name.contains("bhadra"));

        // 11. str.replace(oldString, newString): replaces all
        System.out.println(name.replace("Amrik", "Koyal"));

        // 12. str.startsWith(string)
        // 13. str.endsWith(string)

        // 14. str.isEmpty(); empty string ("") -> true; blank string -> false
        System.out.println("".isEmpty());

        // 15. str.isBlank();  empty string or blank space -> true
        System.out.println(" ".isBlank());

        // 16. str.indexOf(string)
        // 17. str.lastIndexOf(string)

        int num = 10;
        String x = String.valueOf(num);  // converts integer to string
        String y = Integer.toString(num);
        System.out.println(x.length());
        System.out.println(y.length());


        // format
        String message = String.format("My name is %s, I am graduating in %d", "Amrik", 2026);
        System.out.println(message);

        char[] letterArr = name.trim().toCharArray();
        for(char ch: letterArr){
            System.out.println("ch = " + ch);
        }





    }
}
