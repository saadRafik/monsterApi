package com.gachaGame.monsterAPI.domain;

public enum MonsterCategory {
    ASSASSIN("Assassin"),
    TANK("Tank"),
    SUPPORT("Support");

    private final String description;

    MonsterCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
