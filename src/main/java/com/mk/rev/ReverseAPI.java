package com.mk.rev;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseAPI {

    @RequestMapping(path = "/{stringToReverse}/")
    public String reverseString(@PathVariable("stringToReverse") String stringToReverse) {
        StringBuilder stringBuilder = new StringBuilder(stringToReverse);
        return stringBuilder.reverse().toString();
    }
}
