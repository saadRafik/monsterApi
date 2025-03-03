package com.gachaGame.monsterAPI.domain;

public enum ElementsType {
    FIRE("Fire"),
    Earth("Earth"),
    WATER("Water");
    

    private final String element;

    ElementsType(String element) {
        this.element = element;
    }

    public String getElement() {
        return element;
    }
}
