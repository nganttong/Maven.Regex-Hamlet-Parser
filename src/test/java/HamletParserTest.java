import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //given
        String expected = "Leon";
        String input = "Hamlet";
        //when
        String actual = HamletParser.hamletToLeon(input);
        //then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testChangeHoratioToTariq() {
        //given
        String expected = "Tariq";
        String input = "Horatio";
        //when
        String actual = HamletParser.horatioToTariq(input);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
        //when
        Boolean actual = HamletParser.findHoratio(hamletText);
        //then
        Assert.assertTrue(actual);
    }

    @Test
    public void testFindHamlet() {
        //when
        Boolean actual = HamletParser.findHamlet(hamletText);
        //then
        Assert.assertTrue(actual);
    }
}