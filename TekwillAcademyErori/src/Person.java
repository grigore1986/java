public class Person {
    private String firstName; // numele persoanei
    private String lastName;// prenumele persoanei
    private int age;// varsta persoanei
    // Constructorul clasei Person cu 3 parametri
    public Person(String firstName, String lastName, int age)throws InvalidNameException , InvalidAgeException{
        // Daca unul din parametri este null sau gol, arunca o exceptie InvalidNameException
        if(firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()){
            throw new InvalidNameException("Numele nu poate fi nul sau gol");
        }
        // Daca varsta este in afara intervalului [0, 150], arunca o exceptie InvalidAgeException
        if(age < 0 || age >150 ) {
            throw new InvalidAgeException("Vârsta trebuie să fie între 0 și 150");
        }
        // Initializeaza campurile clasei cu valorile primite ca parametri
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    // Metodele get si set
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
