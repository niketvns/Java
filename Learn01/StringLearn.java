public class StringLearn {
    public static void main(String[] args) {

        // Ways to Create Strings
        // 1. String name = "Niket"; //? if using this method to create string then it
        // ? will create object automatically
        // 2. String name = new String("Niket");
        // 3. Assign later
        String name = new String();
        name = "Niket";

        // String Methods
        String s = new String("Rajesh ");
        System.out.println(s);
        // 1. length()
        System.out.println(s.length());

        // 2. split(): Split string into Array
        String[] spS = s.split("");
        for (String val : spS) {
            System.out.println(val);
        }

        // 3. trim()
        System.out.println(s.trim());

        // 4. replaceAll(), replace()
        System.out.println(s.replaceAll(" ", "-"));

        // 5. chatAt(index)
        System.out.println(s.charAt(0));

        // 6. concat()
        System.out.println(s.concat("Raju"));

        System.out.println("Hello " + name);

        // ? -- Optimized way to create string is StringBuilder or StringBuffer --
        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Ramu Rajesh");

        System.out.println(sb);

        // ! StringBuffer: is thread-safe
        StringBuffer sf = new StringBuffer();
        sf.append("New String Creation");

        System.out.println(sf);
    }
}
