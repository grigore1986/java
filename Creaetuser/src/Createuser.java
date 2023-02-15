public class Createuser {

    String name;
    short age;
    int height;


    public Createuser(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Createuser(String name,int height, short age){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Createuser(short age,String name,int height){
        this.age = age;
        this.name = name;
        this.height=height;
    }

    public Createuser(short age, int height,String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public Createuser( int height,short age,String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }
    public Createuser(int height,String name,short age){
        this.height = height;
        this.name = name;
        this.age = age;
    }



    public static void main (String[]args){
        Createuser user1 = new Createuser("Alice", (short) 25, 170);
        Createuser user2 = new Createuser(190, "Bob", (short) 30);
        Createuser user3 = new Createuser((short) 35, 180, "Charlie");
    }
}