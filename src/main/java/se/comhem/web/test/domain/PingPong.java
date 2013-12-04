package se.comhem.web.test.domain;

import java.io.Serializable;

public class PingPong implements Serializable {

    private String message;
    private String input;

    public PingPong(String name, String surname) {
        this.message = name;
        this.input = surname;
    }

    public String getMessage() {
        return message;
    }

    public String getInput() {
        return input;
    }
}
