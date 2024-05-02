package com.defaultpackage.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DefaultQuestion2 implements Question <String> {

    private static String test;

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
