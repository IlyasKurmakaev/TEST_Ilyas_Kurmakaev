import Function.Factorial;
import Function.Fibonachi;
import Function.Funktion;

import java.io.*;

public class Utils {
    public Utils() throws FileNotFoundException, UnsupportedEncodingException {
    }

    public static void executeText() throws IOException {
        FileReader input = null;
        try {
            input = new FileReader("src/main/resources/input.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufRead = new BufferedReader(input);
        String line = null;

        while ((line = bufRead.readLine()) != null) {
            String[] array = line.split(" ");

            Funktion funktion;
            switch (array[0]) {
                case "F":
                    funktion = new Factorial();
                    writeInFile("F", false);
                    writeInFile(String.valueOf(funktion.apply(Integer.parseInt(array[1]))), true);
                    break;

                case "FIB":
                    funktion = new Fibonachi();
                    writeInFile("FIB", false);
                    writeInFile(String.valueOf(funktion.apply(Integer.parseInt(array[1]))), true);
                    funktion.apply(Integer.parseInt(array[1]));
                    break;
            }
        }
        writer.close();

    }

    public static PrintWriter writer;

    static {
        try {
            writer = new PrintWriter("src/main/resources/output.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static void writeInFile(String str, boolean newLine) throws FileNotFoundException, UnsupportedEncodingException {
        if (newLine == false) {
            writer.print(str + " ");
        } else {
            writer.println(str);
        }

//        writer.println("The first line");
//        writer.println("The second line");
//        writer.close();
    }
}
