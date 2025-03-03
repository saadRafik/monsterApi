package com.gachaGame.monsterAPI.domain;

public enum ElementsType {
    FIRE("Fire"),
    WATER("Water"),
    WIND("Wind");

    private final String element;

    ElementsType(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
