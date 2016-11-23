package geco;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by 21301646 on 23/11/2016.
 */
public class PasswordGeneration {
    /**
     * Default password length
     */
    public static final int DEFAULT_LEN = 8;

    /**
     * Generates a random password of default length
     * @return a random password of default length
     */
    public String getRandomPassword(){
        return getRandomPassword(DEFAULT_LEN);
    }

    /**
     * Generates a random password of specified length
     * @param len length of the desired password
     * @return a random password of specified length
     */
    public String getRandomPassword(int len){
        String chars = "abcdefghijklmnopqrstuvwxyz123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> shuffle = Arrays.asList((chars+chars+chars).split(""));
        Collections.shuffle(shuffle);
        String password = "";
        for (int i = 0; i < len; i++) {
            password+=shuffle.get(i);
        }
        return password;
    }
}
