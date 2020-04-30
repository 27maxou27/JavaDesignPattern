package com.company.engine;

public enum Metric {
    HORSEPOWER("hp"),
    CUBIC_CM("cc"),
    KILOWATT("Kw");

    private String txt;

    Metric(String txt) {
        this.txt = txt;
    }

    public String getText() {
        return txt;
    }

}
