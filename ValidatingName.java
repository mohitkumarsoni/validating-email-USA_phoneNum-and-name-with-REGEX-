package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatingName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []nameArray = new String[5];
        System.out.println("enter 5 name");
        for(int i=0; i<nameArray.length; i++){
            nameArray[i] = br.readLine().toUpperCase();
        }

        String regex ="MR\\.?\\s[A-Z]\\w*\\s?\\w*";     //sorting all name that starts with MR

        boolean result = true;

        Pattern pattern = Pattern.compile(regex);
        for (String i: nameArray) {
            Matcher matcher = pattern.matcher(i);
            if(result == matcher.matches()){
                System.out.println(result+" "+i);
            }
        }
    }
}
