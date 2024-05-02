package com.defaultpackage.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DefaultQuestion implements Question<String> {
    private static String name;

    @Override
    public String answeredBy(Actor actor) {
        return null;
    }
}
