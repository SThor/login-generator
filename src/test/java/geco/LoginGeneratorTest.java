package geco;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginGeneratorTest {
    LoginService service;
    LoginGenerator generator;

    @Before
    public void setUp() throws Exception {
        service = new LoginService(new String[] {"JROL","BPER","CGUR","JDUP","JRAL","JRAL1"});
        generator = new LoginGenerator(service);
    }

    @Test
    public void testGenerateLogin1() throws Exception {
        generator.generateLoginForNomAndPrenom("Durand","Paul");
        assertTrue(service.loginExists("PDUR"));
    }

    @Test
    public void testGenerateLogin2() throws Exception {
        generator.generateLoginForNomAndPrenom("Rolling","Jean");
        assertTrue(service.loginExists("JROL1"));
    }

    @Test
    public void testGenerateLogin3() throws Exception {
        generator.generateLoginForNomAndPrenom("Dùrand","Paul");
        assertTrue(service.loginExists("PDUR"));
    }

    @Test
    public void testGenerateLoginIncrement() throws Exception {
        generator.generateLoginForNomAndPrenom("Ralling","John");
        assertTrue(service.loginExists("JRAL2"));
    }
}