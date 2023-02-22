public interface Animal {
    String getName();
    int getAge();
    void setName(String name);
    void setAge(int age);
    default String getType() {
        return "unknown";
    }
    static String getInfo() {
        return "Aceasta este interfata la animal";
    }
    int picioare = 4;
}
