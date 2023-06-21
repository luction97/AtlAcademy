package com.example.demo.entidades;

public class Categoria {
    private String category;
    private String description;


    public Categoria(String category, String description) {
        this.category = category;
        this.description = description;
    }

    public Categoria() {

    }

    public String getCategory(String category) {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}