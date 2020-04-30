package com.company.vehicle;

public enum Color
{
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    GREY("Grey"),
    BLUE("Blue");

    private String txt;

    Color(String txt) {
        this.txt = txt;
    }

    public String getText() {
        return txt;
    }
}
