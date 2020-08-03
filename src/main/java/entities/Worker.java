package entities;

public class Worker {

    private Integer id;
    private String name;
    private Double salary;

    public Worker() {
    }

    public Worker(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += ((percentage/100) * salary);
    }
    
    @Override
    public String toString(){
        return id + ", " + name + ", " + salary;
    }
}
