package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validatingEmail {
    public static void main(String[] args) {
        String email1 = "CoreyMSchafer@gmail.com";
        String email2 = "mohitkumarsoni135@gmail.edu";
        String email3 = "mohit-135-kumarsoni@my-work.net";

        String regex = "[a-zA-Z0-9.-]+@[a-zA-Z-]+\\.(com|edu|net)";

        Pattern pattern1 = Pattern.compile(regex);              //Pattern class have complie() function which takes regex pattern in its parameter
        Matcher matcher1 = pattern1.matcher(email1);            //Matcher class have matcher() function which compares entered input with regex pattern & return boolean value
        boolean result1 = matcher1.matches();
        if(result1){
            System.out.println("email 1 is valid email");
        }else {
            System.out.println("invalid");
        }


        Pattern pattern2 = Pattern.compile(regex);              //Pattern class have complie() function which takes regex pattern in its parameter
        Matcher matcher2 = pattern2.matcher(email2);            //Matcher class have matcher() function which compares entered input with regex pattern & return boolean value
        boolean result2 = matcher2.matches();
        if(result2){
            System.out.println("email 2 is valid email");
        }else {
            System.out.println("invalid email");
        }

        Pattern pattern3 = Pattern.compile(regex);              //Pattern class have complie() function which takes regex pattern in its parameter
        Matcher matcher3 = pattern3.matcher(email3);            //Matcher class have matcher() function which compares entered input with regex pattern & return boolean value
        boolean result3 = matcher3.matches();
        if(result3){
            System.out.println("email 3 is valid email");
        }else {
            System.out.println("invalid email");
        }
    }
}
/*

explaining regex::

here [a-z] is range of smaller alphabet
here [A-Z] is range of bigger alphabet
here [0-9] is range of numbers
here [._-@] is list of special character which may also include in email address
here (com|edu|net) group is multiple OR statement which user may enter at the end of email

you can write all together like [a-zA-Z0-9.-] this will include range of every character element

 */