package Model;

import java.time.LocalDate;

public class MessageModel {
    
    private String fromName; //who sended the message
    private String toName; //mensage destination
    private String payload; //message content   
    
    private LocalDate date;
    
    private ClassModel classMsg;
}
