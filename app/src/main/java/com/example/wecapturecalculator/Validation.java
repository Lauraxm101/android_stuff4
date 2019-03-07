package com.example.wecapturecalculator;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validation {
    private static final String CREDENTIALS_PATTERN = "^[a-zA-Z0-9]{3,20}$";

    public boolean isValidCredentials(String credentials){
        Pattern pattern = Pattern.compile(CREDENTIALS_PATTERN);
        Matcher matcher = pattern.matcher(credentials);
        return matcher.find();
    }
}
