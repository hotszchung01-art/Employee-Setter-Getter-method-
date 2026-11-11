class Employee {
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return " name=" + name + ", salary= " + salary;
    }

    // raise money
    public void raiseSalary(double percent) {
        salary = (int) (salary * (1 + percent / 100));

    }

}

