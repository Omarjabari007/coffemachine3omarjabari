package com.mycompany.coffemachine;

public class MachineException extends Exception {
    
    private String message;

public MachineException(String message) {
super(message);
this.message = message;
}

public String getMessage() {
return "Input string was: " + message;
}

    
    
}
