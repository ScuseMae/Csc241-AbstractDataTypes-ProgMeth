/*
 * This program's intent is to read a file containing lyrics to a song and 
 * compute the frequency of occurance of each word in a file storing 
 * word/frequency pairs within a HashMap Object. Additionally, a interpreter 
 * method will allow repeated commands from the user to either count the 
 * occurances of each word, print all words and frequencies, or exit the 
 * program. 
 */
package src.hashing;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeSet;


public class HashingFrequencyCounter {
    private static final HashMap<String,Integer> hashMap = new HashMap<>();
            
    public static void main(String[] args) throws FileNotFoundException {
        establishFrequencyCounts();
        dump();
        interpret();
    }

    private static void establishFrequencyCounts() throws FileNotFoundException {
        ArrayList<String> words = getAndCopyFile();
        words.stream().forEach((s) -> {
            if (hashMap.containsKey(s)) {
                hashMap.put(s, hashMap.get(s) + 1);
            }
            else {
                hashMap.put(s, 1);
            }
        });
    }

    private static ArrayList<String> getAndCopyFile() throws FileNotFoundException {
        File file = new File("SongTextFile.txt");
        Scanner scan = new Scanner(file);
        
        ArrayList<String> words = new ArrayList<>();
        int sum = 0;
        
        while (scan.hasNext()) {
            String token = scan.next().toLowerCase();
            words.add(token);
        }
        return words;   
    }

    private static void dump() {
        System.out.println("Word & Frequency Pairs ... ");
        hashMap.keySet().stream().forEach((s) -> {
            System.out.println("<" + s + ":" + hashMap.get(s).byteValue() + ">");
        });
        System.out.println();
    }

    private static void interpret() {
        Scanner scan = new Scanner(System.in);
        String command = ">>>";
        
        while (!command.equalsIgnoreCase("exit")) {
            System.out.print(">>>");
            command = scan.next();
            switch (command.toLowerCase()) {
                case "count" :
                    System.out.print("Word?");
                     System.out.println(hashMap.get(scan.next()).byteValue());
                     break;
                     
                case "print" :
                    TreeSet<String> treeSet = new TreeSet<>();
                    hashMap.keySet().stream().forEach((s) -> {
                        treeSet.add(s);
            });
                    treeSet.stream().forEach((s) -> {
                        System.out.println("<" + s + ":" + hashMap.get(s).byteValue() + ">");
            });
            }
        }
    }
}