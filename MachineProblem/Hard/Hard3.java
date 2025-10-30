/*
    HARD 3 – Word Frequency Counter
    Goal: Count occurrences of each word from input and print them in alphabetical order.
    Input: a sequence of words separated by whitespace (EOF-terminated)
    Output: lines of "word: count" sorted by word
    Example:
        Input: apple banana apple mango banana apple
        Output:
        apple: 3
        banana: 2
        mango: 1
*/
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> freq = new TreeMap<>();
        while(sc.hasNext()){
            String w = sc.next();
            freq.put(w, freq.getOrDefault(w, 0) + 1);
        }
        for(Map.Entry<String,Integer> e : freq.entrySet()){
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
