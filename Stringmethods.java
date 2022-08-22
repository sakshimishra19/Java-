public class Stringmethods {
    public static void main(String[] args) {
        String name = "Sakshi";
        int value = name.length();
        System.out.println(value);
         System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(0,4));
        System.out.println(name.replace('k','f'));
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("hi"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('i'));
        System.out.println(name.indexOf('s',3));
        System.out.println(name.equals("sakshi"));
        System.out.println(name.equalsIgnoreCase("sakshi"));
    }
}
