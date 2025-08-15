package basics.strings;

public class StringBuilder_Demo {
    public static void main(String[] args) {
        String name = "Amrik";
        StringBuilder sb = new StringBuilder(name);

        // sb.append(String);
        sb.append(" Bhadra");
        System.out.println(sb.toString());

        // sb.charAt(index);
        System.out.println(sb.charAt(3));

        // sb.delete(start, end);  delete range
        sb.delete(2, 5);
        System.out.println(sb.toString());

        // sb.reverse();   reverse the string
        sb.reverse();
        System.out.println(sb.toString());

        // sb.length();   get length
        System.out.println(sb.length());

        // sb.substring(start, end);
        System.out.println(sb.substring(2, 5));

        // sb.replace(start, end, String)
        sb.replace(0, 3, "Bissibella");
        System.out.println(sb);

        // sb.insert(offset, String);
        sb.insert(4, "Bob");
        System.out.println(sb);

        // sb.isEmpty();
        System.out.println(sb.isEmpty());

        sb.append("                          ");

        System.out.println("|" + sb + "|");
        sb.trimToSize();
        System.out.println(sb);

    }
}
