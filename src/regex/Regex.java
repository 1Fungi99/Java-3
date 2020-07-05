package regex;

import java.util.regex.*;

class Regex {
    public static void main(String[] args) {

        // 1. What does the following pattern match? (\d){36} explain in a println() statement.
        System.out.println("Problem 1 Start");
        System.out.println(
                "=========================================================================================================");
        System.out.println("The following pattern ('\\d'){36} matches : ...");
        System.out.println("Matches \"\\\" or \"d\" 36 times");
        System.out.println("Problem 1 End");
        System.out.println(
                "=========================================================================================================");

        String[] TEKmentors = { "Amir Yunas", "Mark Bennet", "Rosa Garcia", "Desaree Byers", "Abram Jablonski",
                "Dylan Fellows", "Emilios Papas", "Jonathan Diamond" };

        // 2. Create a new array of the first names of the TEKmentors.  Use Regex to only grab the first name of every TEKmentor.  Push the values to a new array
        System.out.println("Problem 2 Start");
        System.out.println(
                "=========================================================================================================");
        String[] tekMentors = new String[TEKmentors.length];
        for (int i = 0; i < TEKmentors.length; i++) {
            final String string = TEKmentors[i];
            final String regex = "^[^\\s]+";
            final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(string);
            while (matcher.find()) {
                System.out.println("Match: " + matcher.group(0));
                tekMentors[i] = matcher.group(0);
            }
        }
        for (int i = 0; i < tekMentors.length; i++) {
            System.out.println(i + ". : " + tekMentors[i]);
        }
        System.out.println("Problem 2 End");
        System.out.println(
                "=========================================================================================================");

        // 3. Find all the occurences of any form of 'book' in the following paragraph. use regex to match the occurences and store the count of books in an int.
        System.out.println("Problem 3 Start");
        System.out.println(
                "=========================================================================================================");
        int bookCount = 0;
        String bookText = "Books are the keys to knowledge.  I didn't like to read books as a child, but in college I started enjoying learning and reading books. You can borrows books from the library, or you can buy them from the bookstore. I'm not sure if I prefer paperback books or hardcover books.  I'm such a nerd that I even like textbooks.  With the advent of technology, you can even buy digital books, such as kindle-books, nook-books, or other e-books. My personal favorite book format are pdf-books, because I don't have to carry so many books around wherever I go.  All the books are on my ipad or laptop.  When I lived abroad, they would give books to students absolutely free.  Free books for a student of knowledge is like a kid in a candy store.  So wipe the dust off of your books, and remember the slogan from 'reading rainbow' : 'Take a look! It's in a book! Reading Rainbow!";
        System.out.println(bookText);
        final String regex = "(book)";
        final Pattern bookPattern = Pattern.compile(regex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        final Matcher bookMatcher = bookPattern.matcher(bookText);
        while (bookMatcher.find()) {
            bookCount++;
        }
        System.out.println(bookCount);
        System.out.println("Problem 3 End");
        System.out.println(
                "=========================================================================================================");

        // 4.a Create an array of all the words besides the word 'sleepy'.  Each word does not have to be a separate element, although you can split it that way if you wish.  We just want an array that everything that is not 'sleepy'.  

        String sleepy = "I felt sleepy because I saw the others were sleepy and because I knew I should feel sleepy, but I wasn't really sleepy. If you're sleepy and you know it, clap your hands. Keep on being sleepy until you actually become sleepy";
        final String sleepyRegex = "(sleepy)";
        final Pattern sleepyPattern = Pattern.compile(sleepyRegex, Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        final Matcher sleepyMatcher = sleepyPattern.matcher(sleepy);

        // 4.b combine the array that you just created into a string
        System.out.println("Problem 4b Start");
        System.out.println(
                "=========================================================================================================");
        String not_sleepy = sleepyMatcher.replaceAll(""); //punctuation marks will be here
        System.out.println(not_sleepy);
        System.out.println("Problem 4b End");
        System.out.println(
                "=========================================================================================================");

        //4.c remove the punctuation marks from the notSleepy string.
        System.out.println("Problem 4c Start");
        System.out.println(
                "=========================================================================================================");
        String notSleepy; //no punctuation marks should be here.
        final String punctuationRemove = "(sleepy)|[.',]";
        final Pattern punctuationRemovePattern = Pattern.compile(punctuationRemove,
                Pattern.MULTILINE | Pattern.CASE_INSENSITIVE);
        final Matcher punctuationRemoveMatcher = punctuationRemovePattern.matcher(sleepy);
        notSleepy = punctuationRemoveMatcher.replaceAll("");
        System.out.println(notSleepy);
        System.out.println("Problem 4c End");
        System.out.println(
                "=========================================================================================================");

        //4.d Now replace all the occurences of 'sleepy' with the word 'happy'.  Call the new string happy.  
        System.out.println("Problem 4d Start");
        System.out.println(
                "=========================================================================================================");
        final String subst2 = "happy";
        final String happy = sleepyMatcher.replaceAll(subst2);
        System.out.println(happy);
        System.out.println("Problem 4d End");
        System.out.println(
                "=========================================================================================================");

        //BONUS : 
        //5. You are looking for unicode arrow symbols in a string.  https://jrgraphix.net/r/Unicode/2190-21FF is a selection of unicode arrow symbols to aid you in your search.  Match all the codes that are arrows, and then print them out to the console.  They should be printing out as the arrow images.

        // String[] arrows = { "\u21FD", "\u26F7", "\u21FF", "\u21EF", "\u21EC", "\u26F9", "\u26FD", "\u26D4", "\u26A5",
        //         "\u21FD", "\u2190", "\u26A1", "\u21BA", "\u2196", "\u2603", "\u21FD" };
    }
}
