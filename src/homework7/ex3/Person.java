package homework7.ex3;

public class Person {
    private String name;
    private Integer height;
    private Integer years;

    public Person(String name, Integer height, Integer years) {
        this.name = name;
        this.height = height;
        this.years = years;
    }

    public String getName() {
        return name;
    }

    public Integer getHeight() {
        return height;
    }

    public Integer getYears() {
        return years;
    }
}
