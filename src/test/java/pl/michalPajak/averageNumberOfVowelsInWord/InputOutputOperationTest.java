package pl.michalPajak.averageNumberOfVowelsInWord;


import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class InputOutputOperationTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shoutdReadFileToString() {

        String expestString = new String("Test string. \n With two lines.");

        List<String> inputStrings = new ArrayList<String>();
        inputStrings.add("Test string.");
        inputStrings.add("With two lines.");

        Path somePath = Mockito.mock(Path.class);
        PowerMockito.mockStatic(Files.class);
        PowerMockito.mockStatic(InputOutputOperation.class);

        try {
            Mockito.when(Files.lines(somePath)).thenReturn(inputStrings.stream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assertions.assertEquals(expestString, InputOutputOperation.readFileToString(somePath));
    }


    @Test
    public void shouldWriteOutPutFile() {
        String outPutString = new String("outPutString");

        Path somePath = Mockito.mock(Path.class);
        PowerMockito.mockStatic(Files.class);
        PowerMockito.mockStatic(InputOutputOperation.class);

        try {
            Mockito.when(Files.write(somePath, outPutString.getBytes())).thenReturn(somePath);
        } catch (IOException e) {
            e.printStackTrace();

        }

        Assertions.assertTrue(InputOutputOperation.wrintFileWithString(somePath, outPutString));
    }
}
