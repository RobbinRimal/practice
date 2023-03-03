package org.example.collective;

public class Crickter {
    private String name;
    private  int runs;
    private  Type type;

    public Crickter(String name, int runs, Type type) {
        this.name = name;
        this.runs = runs;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
