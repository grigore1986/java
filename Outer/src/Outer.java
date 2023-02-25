public class Outer {
    private String greeting = "Hi";

    protected class Inner {
        public int repeat = 3;

        public void go() {
            for (int i = 0; i < repeat; i++)
                System.out.println(greeting);
        }
    }

        public void callInner() {
            Inner inner = new Inner();
            inner.go();
        }

        public static void main(String[] args) {
            Outer outer = new Outer();
            outer.callInner();

              //   Outer outer2 = new Outer();
              //   Inner inner = outer2.new Inner(); // creză inner class (a doua metoda de chemare)
              //   inner.go();

        }
    }
