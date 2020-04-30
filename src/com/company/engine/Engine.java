package com.company.engine;

public abstract class Engine {

    public enum EngineType {
        ELECTRIC("Electric"),
        GAS("Gas");

        private String txt;

        EngineType(String txt) {
            this.txt = txt;
        }

        public String getText() {
            return txt;
        }
    }

    protected float power;
    protected EngineType type;
    protected Metric metric;

    public Engine(float power, EngineType type, Metric metric) {
        this.power = power;
        this.type = type;
        this.metric = metric;
    }

    public void display() {
        System.out.println("Engine ------");
        System.out.println("Type:\t" + this.type.getText());
        System.out.println("Power:\t" + this.power + " " + this.metric.getText());
    }
}
