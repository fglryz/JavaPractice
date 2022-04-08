package Day36.planet;

public class Planet {
    public String name;
    public int mass;
    public int population;
    public double radius;
    public double surfaceGravity;
    public double volume;

    public Planet(String name, int mass, int population, double radius, double surfaceGravity, double volume) {
        this.name = name;
        this.mass = mass;
        this.population = population;
        this.radius = radius;
        this.surfaceGravity = surfaceGravity;
        this.volume = volume;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass=" + mass +
                ", population=" + population +
                ", radius=" + radius +
                ", surfaceGravity=" + surfaceGravity +
                ", volume=" + volume +
                '}';
    }
}
