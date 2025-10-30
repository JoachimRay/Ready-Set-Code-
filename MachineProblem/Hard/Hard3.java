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
