import java.util.Objects;

public class Employee {
    private boolean isPayedPerHour;// variabila pentru tipul de plata a angajatului
    private int age;// variabila pentru ani angajatului
    private String name;// variabila pentru numa angajatului
    private String department; // variabila pentru departamentul angajatului

//Crearea constructurului
     Employee (String name, String department, int age, boolean isPayedPerHour){
        this.name = name;// setam numele angajatului
        this.department = department;// setam departamentul angajatului
        this.age =age; // setam ani angajatului
        this.isPayedPerHour = isPayedPerHour;// setam tipul de plata a angajatului
    }
// metode getter și setter pentru variabile
    public boolean isPayedPerHour() {
        return isPayedPerHour;
    }

    public void setPayedPerHour(boolean payedPerHour) {
        isPayedPerHour = payedPerHour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }


    public void setDepartment(String department) {
        this.department = department;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "isPayedPerHour=" + isPayedPerHour +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
    // metode care verifică dacă un angajat îndeplinește criteriile pentru a putea conduce interviul
    public boolean isCanLeadInterviews() {

         return department.equals("Management") || department.equals("Software");
    }
    // metoda care verifica daca participa la training-uri, în funcție de departament și vârstă.
    public boolean isCanAttendTraining() {

         return  department.equals("Software") && age >= 18;
    }
}
