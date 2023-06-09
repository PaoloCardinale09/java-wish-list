package org.lessons.java.christmas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    private final static String FILE_PATH = "./resources/list.txt";

    public static void main(String[] args) {
        // Importo lo scanner
        Scanner scan = new Scanner(System.in);

        // Lista dove aggiungerò regali
        List<String> gifts = new ArrayList<>();

        // vedo se esiste un file di testo con una lista
        try (Scanner reader = new Scanner(new File(FILE_PATH))) {
            //itero sulle righe del file
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                gifts.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // Menu testuale
        boolean stop = false;
        String other;
        do {
            System.out.println("Insert a gift ");
            String gift = scan.nextLine();
            gifts.add(gift);
            System.out.println("List size " + gifts.size());
            System.out.println("Add another gift? (stop to quit) ");
            other = scan.nextLine();

            if (Objects.equals(other, "stop")) {
                System.out.println("You have insert " + gifts.size() + " gifts");
                // Ordino alfabeticamente la lista
                Collections.sort(gifts);
                System.out.println(gifts);
                // apro il file writer
                File file = new File(FILE_PATH);
                try (FileWriter writer = new FileWriter(file)) {
                    for (String g : gifts) {
                        writer.write(g + " ");

                    }

                } catch (IOException e) {
                    System.out.println("Unable to write file");
                }
                stop = true;
            }

            // Chiudo lo scanner
        } while (!stop);
        scan.close();
    }
}
