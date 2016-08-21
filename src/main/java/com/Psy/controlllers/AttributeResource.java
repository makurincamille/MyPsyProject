package com.Psy.controlllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/identities"+"/{id}"+"/attribute")
public class AttributeResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getAllUsers(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createUser(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity updateUser(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity deleteUser(@PathVariable("id") String id) {

        return new ResponseEntity(HttpStatus.OK);
    }
}

