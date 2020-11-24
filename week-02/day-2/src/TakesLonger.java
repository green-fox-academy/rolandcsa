//public class TakesLonger {
//    public static void main(String... args) {
//        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
//
//        // When saving this quote a disk error has occurred. Please fix it.
//        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
//        // Using pieces of the quote variable (instead of just redefining the string)
//
//        System.out.println(quote);
//    }
//}

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String mid = "always takes longer than";
        mid = mid.concat(" ");
        String beginning = quote.substring(0, quote.indexOf("you"));
        String ending = quote.substring(quote.indexOf("you"));
        quote = beginning + mid + ending;

        System.out.println(quote);
    }
}
