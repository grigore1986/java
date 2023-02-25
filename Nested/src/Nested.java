public class Nested {
   private int x = 10;
   class Nested1{
       private  int x = 20;
       class Nested2{
           private int x = 30;

           public  void allThex() {
               System.out.println(x);
               System.out.println(this.x);
               System.out.println(Nested1.this.x);
               System.out.println(Nested.this.x);
           }
       }
   }

    public static void main(String[] args) {
        Nested nested = new Nested();
        Nested.Nested1 nested1 = nested.new Nested1();
        Nested.Nested1.Nested2 nested2 = nested1. new Nested2();
        nested2.allThex();

    }
}