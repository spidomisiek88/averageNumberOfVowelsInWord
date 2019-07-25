package pl.michalPajak.averageNumberOfVowelsInWord;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VoiwesTest {

    private Voiwes voiwes;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        voiwes = new Voiwes();
    }

    @Test
    public void shoutTrueIsVoiwe() {
        char character = 'A';

        Assertions.assertTrue(voiwes.isVoiwe(character));
    }

    @Test
    public void shoutFalseIsVoiwe() {
        char character = 'B';

        Assertions.assertFalse(voiwes.isVoiwe(character));
    }

    @Test
    public void shoutCountVoiwes() {
        String testString = "AAAaaaBBB";

        Assertions.assertEquals(6, voiwes.countVowels(testString));
    }

    @Test
    public void shoutCountAverageVoiwes() {
        String testString = "AAAaaaBBB";

        Assertions.assertEquals(1.5, voiwes.averageVowels(testString));
    }

    @Test
    public void shouldReturnVowelsInWord() {
        String testString = "AAAaaaOOOBBB";
        Set<String> expectedSet = new HashSet<String>(Arrays.asList("a", "o"));

        Assertions.assertEquals(expectedSet, voiwes.vowelsInWord(testString));
    }
}
