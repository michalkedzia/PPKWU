package com.mk.rev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/rev")
public class ReverseAPI {

    @GetMapping("/{stringToReverse}/")
    public String reverseString(@PathVariable("stringToReverse") String stringToReverse) {
        StringBuilder stringBuilder = new StringBuilder(stringToReverse);
        return stringBuilder.reverse().toString();
    }
}
