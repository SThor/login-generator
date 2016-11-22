package geco;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class LoginServiceTest {
    LoginService serviceVide;
    LoginService service;
    String login = "test";
    String [] logins = {login, "abTest", "cdTest", "abEncore"};

    @Before
    public void setUp() throws Exception {
        serviceVide = new LoginService(new String[0]);
        service = new LoginService(logins);
    }

    @Test
    public void testLoginExists() throws Exception {
        assertFalse(serviceVide.loginExists(login));
        assertTrue(service.loginExists(login));
    }

    @Test
    public void testAddLogin() throws Exception {
        serviceVide.addLogin(login);
        assertTrue(serviceVide.loginExists(login));
    }

    @Test
    public void testFindAllLoginsStartingWith() throws Exception {
        List<String> liste = new ArrayList<String>(Arrays.asList("abTest", "abEncore"));
        List<String> finds = service.findAllLoginsStartingWith("ab");
        assertTrue(liste.containsAll(finds)&&finds.containsAll(liste));
    }

    @Test
    public void testFindAllLogins() throws Exception {
        List<String> liste = Arrays.asList(logins);
        List<String> finds = service.findAllLogins();
        assertTrue(liste.containsAll(finds)&&finds.containsAll(liste));
    }
}