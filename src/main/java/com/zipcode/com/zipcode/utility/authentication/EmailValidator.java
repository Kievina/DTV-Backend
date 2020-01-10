package com.zipcode.utility.authentication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

    public static Boolean validateEmail (String email) {
        String regex = "^[a-zA-Z0-9._%$!#+\\-]+@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            return true;
        }
        else return false;
    }
}
