package org.lessons.java.christmas;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Importo lo scanner
        Scanner scan = new Scanner(System.in);

        // Lista dove aggiungerò regali
        List<String> gifts = new ArrayList<>();

        // Menu testuale
        boolean stop = false;
        String other;
        do {
            System.out.println("Insert a gift ");
            String gift = scan.nextLine();
            gifts.add(gift);
            System.out.println("List size " + gifts.size());
            System.out.println("Add another gift? (y/n) ");
            other = scan.nextLine();

            if (Objects.equals(other, "n")) {
                System.out.println("You have insert " + gifts.size() + " gifts");
                // Ordino alfabeticamente la lista
                Collections.sort(gifts);
                System.out.println(gifts);
                stop = true;
            }

            // Chiudo lo scanner
        } while (!stop);
        scan.close();
    }
}
