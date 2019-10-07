package com.github.josecxsta.di.domain;

import java.util.function.Supplier;

public class Itambe implements Supplier<Leite> {

    public Leite get() {
        return new Leite("Itambe");
    }

}
