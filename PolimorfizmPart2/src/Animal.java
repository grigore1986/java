public class Animal  implements Info {
//    public int id;    Folosim la interfata
//
//    public Animal(int id) {
//        this.id = id;
//    }

    public void sleep(){
        System.out.println("I am spleeping");
    }
    @Override   // Folosim la interfata
    public void showInfo() {
        System.out.println("Id is ");// +this.id);
    }
}
