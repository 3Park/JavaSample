package test.jgpark.first.Head03.ex6;

public enum Planet
{
    EARTH("earth",1.0);

    private final String name;
    private final double mass;

    Planet(String name, double mass)
    {
        this.name = name;
        this.mass = mass;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                '}';
    }
}
