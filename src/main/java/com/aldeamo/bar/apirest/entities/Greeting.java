package com.aldeamo.bar.apirest.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Greeting {

    private final long id;
    private final String content;

}
