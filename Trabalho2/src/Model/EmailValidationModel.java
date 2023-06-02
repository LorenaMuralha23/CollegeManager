package Model;

import java.util.regex.Pattern;

public class EmailValidationModel {
    
    //patterns for emails that will be used to validate
    private String regexPattern1 = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
    private String regexPattern2 = "^(?=.{1,64}@)[\\p{L}0-9_-]+(\\.[\\p{L}0-9_-]+)*@" + "[^-][\\p{L}0-9-]+(\\.[\\p{L}0-9-]+)*(\\.[\\p{L}]{2,})$";
    private String regexPattern3 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    private String regexPattern4 = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@" + "[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private String regexPattern5 = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    private String regexPattern6 = "^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@" + "[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$";

    public boolean patternMatches(String emailAddress) {
        boolean emailMatches;

        emailMatches = (Pattern.compile(regexPattern1).matcher(emailAddress).matches())
                && (Pattern.compile(regexPattern2).matcher(emailAddress).matches())
                && (Pattern.compile(regexPattern3).matcher(emailAddress).matches())
                && (Pattern.compile(regexPattern4).matcher(emailAddress).matches())
                && (Pattern.compile(regexPattern5).matcher(emailAddress).matches())
                && (Pattern.compile(regexPattern6).matcher(emailAddress).matches());
        
        return emailMatches;
    }

}
