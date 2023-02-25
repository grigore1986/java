public class Main {
    public static void main(String[] args) {

        CPU cpu = new CPU();
        System.out.print(cpu.name);
        System.out.println(" voltajul lui este " + cpu.voltagekw);

        CPU.Processor process = cpu.new Processor();
        System.out.print(process.name);
        System.out.println(" numarul de nuclee " + process.nuclee);

        CPU.Processor.Ram ram = process.new Ram();
        System.out.print(ram.name);
        System.out.println(" capacitatea lui este " + ram.capacity);

        MotherBoard.USB usb = new MotherBoard.USB();
        System.out.print(usb.name);
        System.out.println(" Capacitatea lui este " + usb.memoriGB);

        MotherBoard.USB usb1 = new MotherBoard.USB();
        System.out.print(usb1.name);
        System.out.println(" memoria lui este de " + usb1.memoriGB);

        //     MotherBoard.USB usb1 = new MotherBoard.USB("Ashika", 8);
        //     System.out.println("USB 2: Marca = " + usb2.name + ",memoriGB = " + usb2.memoriGB);

    }
}


