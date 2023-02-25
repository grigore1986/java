public class MotherBoard {
    static class USB {
        public String name = "Ashika";
        public int memoriGB = 8;

        void method() {
            System.out.println(name);
            System.out.println(memoriGB);

            //    public USB(String name , int memoriGB) {
            //      this.name = name;
            //     this.memoriGB = memoriGB;

        }
    }

    public static void myMethod() {
        USB usb = new USB();
        usb.method();
    }
}


