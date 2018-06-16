package java8.strings;

public class StringIterator {

    public static void main(String[] args) {

        final String str = "w00t";
        str.chars().forEach(ch -> System.out.println(ch));
        str.chars().forEach(System.out::println);
        System.out.println("will print characters not their integer values------------------------>");
        str.chars().forEach(StringIterator::printChar);
        System.out.println("\nprint chars using map function---------------------------------------->");
        str.chars()
                .mapToObj(ch -> Character.valueOf((char) ch))
                .forEach(ch -> System.out.print(ch + " "));

        // we can also filter out only digits from the given string
        System.out.println("");
        str.chars()
                .filter(ch -> Character.isDigit(ch))
                .forEach(ch -> printChar(ch));
    }

    private static void printChar(int n) {
        System.out.print((char) n + " ");
    }
}
