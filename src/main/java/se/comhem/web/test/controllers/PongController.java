package se.comhem.web.test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import se.comhem.web.test.domain.PingPong;

/**
 * Copyright (c) 2013 Com Hem AB, Stockholm. All rights reserved.
 *
 * @author Steve Carrigan
 */

@Controller
@EnableWebMvc
@RequestMapping("ping")
public class PongController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String doPong() {

        return "pong";

    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<PingPong> getPong(@PathVariable String id) {

        return new ResponseEntity<PingPong>(new PingPong("pong",id), HttpStatus.OK);

    }

}
