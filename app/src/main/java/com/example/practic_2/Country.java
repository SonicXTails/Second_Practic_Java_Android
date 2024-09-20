package com.example.practic_2;

public class Country {
    private String name;
    private int flagResource;
    private String description;  // Добавляем поле для описания

    public Country(String name, int flagResource, String description) {
        this.name = name;
        this.flagResource = flagResource;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getFlagResource() {
        return flagResource;
    }

    public String getDescription() {
        return description;  // Добавляем геттер для описания
    }
}
