package pl.michalPajak.averageNumberOfVowelsInWord;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputOutputOperation {

    public static String readFileToString(Path path) {

        String inputFile = "";

        try {
            inputFile = Files.lines(path).map(Object::toString).collect(Collectors.joining(" "));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputFile;
    }

    public static boolean wrintFileWithString(Path path, String outPutString) {
        try {
            Files.write(path, outPutString.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public static List<String> stringToList(String string) {
        return Arrays.asList(string.split(" "));
    }
}
