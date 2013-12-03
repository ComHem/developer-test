package se.comhem.web.test;

import java.io.Serializable;

/**
 * Copyright (c) 2013 Com Hem AB, Stockholm. All rights reserved.
 *
 * @author Steve Carrigan
 */
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
