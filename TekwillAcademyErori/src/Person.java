public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public Person(String firstName, String lastName, int age)throws InvalidNameException , InvalidAgeException{
        if(firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()){
            throw new InvalidNameException("Numele nu poate fi nul sau gol");
        }
        if(age < 0 || age >150 ) {
            throw new InvalidAgeException("Vârsta trebuie să fie între 0 și 150");
        }this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
