package s049;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t));
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3)); //...voglio la sottostringa di t a partire da 3

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2)); //...false perché non sto operando su due interi ma su due oggetti i cui reference sono diversi

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x')); //...mi ritorna -1 perché non c'è un indice x, indice non valido
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll")); //... \"ll\" serve per stampare "ll"
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'q');
        System.out.println("Replacing 'l' with 'q': " + s + " -> " + s2);

        String[] splits = "one for me, one for you".split(" "); // mi prende una stringa me la splitta come se fosse un array. In questo caso lo splitter è lo spazio bianco
        System.out.println("Splitting: ");
        for (String token : splits) { //...token è riga dell'array
            System.out.println(token);
        }
        String joined = String.join(" ", splits);
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]");
        
        String x = null;
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
    }
}
