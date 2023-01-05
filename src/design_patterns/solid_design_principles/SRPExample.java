/*
 * Copyright (c) 2023.
 * Author : Kushal Shrestha
 * LinkedIn : https://www.linkedin.com/in/kushal-shrestha/
 * Email : kushalshr@gmail.com
 */

package design_patterns.solid_design_principles;

import java.io.File;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class SRPExample {
    public static void main(String[] args) throws Exception {

        Journal j = new Journal();
        j.addEntry("We all live in a yellow submarine.");
        j.addEntry("Wish you were here.");
        System.out.println(j);


        Persistence p = new Persistence();
        String currentWorkingDir = System.getProperty("user.dir");
        String filename = currentWorkingDir + "/src/design_patterns/solid_design_principles/resources/journal.txt";
        System.out.println("Try opening file : " + filename);
        p.saveToFile(j, filename, true);

    }
}

class Journal {
    private final List<String> entries = new ArrayList<String>();

    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(), entries);
    }

    // let's not create these functions inside this class - violates SRP -> create seperate class i.e class Persistence created
    public void save(String filename) {
    }

    public void load(String filename) {
    }

    ;

}

class Persistence {
    public void saveToFile(Journal journal,
                           String filename, boolean overwrite) throws Exception {
        if (overwrite || new File(filename).exists())
            try (PrintStream ps = new PrintStream(filename)) {
                ps.println(journal.toString());
            }
    }

    public void load(Journal journal, String filename) {
    }

    public void load(Journal journal, URL url) {
    }
}
