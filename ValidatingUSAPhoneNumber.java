package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingUSAPhoneNumber {
    public static void main(String[] args) {
        String regex = "^[6-9]\\d{2}[.-]\\d{3}[.-]\\d{4}$";
        String text = "916-138-9845";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        boolean result= matcher.matches();
        System.out.println(result);

    }
}
