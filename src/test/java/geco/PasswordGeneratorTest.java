package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PasswordGeneratorTest {
    PasswordGenerator generator;

    @Before
    public void setUp() throws Exception {
        generator = new PasswordGenerator();
    }

    @Test
    public void testGetRandomPassword() throws Exception {
        assertTrue(generator.getRandomPassword().length() == 8);
    }

    @Test
    public void testGetRandomPassword1() throws Exception {
        int len = 5;
        assertTrue(generator.getRandomPassword(len).length() == len);
    }
}