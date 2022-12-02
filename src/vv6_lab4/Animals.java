package bys6_lab4;

public class Animals {

    private Integer id;
    private Classifications classifications;
    private String name;
    private String color;

    public Animals() {
    }

    public Animals(Integer id) {
        this.id = id;
    }

    public Animals(Integer id, Classifications classifications, String name, String color) {
        this.id = id;
        this.classifications = classifications;
        this.name = name;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setClassifications(Classifications classifications) {
        this.classifications = classifications;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Classifications getClassifications() {
        return classifications;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "Animal=" + id + ", " + classifications + ", name=" + name + ", color=" + color;
    }

}
