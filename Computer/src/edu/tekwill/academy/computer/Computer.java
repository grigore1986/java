package edu.tekwill.academy.computer;

import edu.tekwill.academy.computer.components.Motherboard;
import edu.tekwill.academy.computer.components.Processor;
import edu.tekwill.academy.computer.peripherals.Keyboard;
import edu.tekwill.academy.computer.peripherals.Monitor;
import edu.tekwill.academy.computer.peripherals.Mouse;
import edu.tekwill.academy.computer.components.HardDrive;


public class Computer {
    private Processor processor;
    private Motherboard motherboard;
    private HardDrive hardDrive;
    private Monitor monitor;
    private Mouse mouse;
    private Keyboard keyboard;

    public Computer(Processor processor, Motherboard motherboard, HardDrive hardDrive,
                    Monitor monitor, Mouse mouse, Keyboard keyboard) {
        this.processor = processor;
        this.motherboard = motherboard;
        this.hardDrive = hardDrive;
        this.monitor = monitor;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    public Processor getprocessor() {
        return processor;
    }
    public  void  setprocessor(Processor processor){
        this.processor= processor;
    }
    public Motherboard getmotherboard() {
        return motherboard;
    }
    public  void  setmotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
    public HardDrive gethardDrive() {
        return hardDrive;
    }
    public  void  sethardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }
    public Monitor getmonitor() {
        return monitor;
    }
    public  void  setmonitor(Monitor monitor) {
        this.monitor = monitor;
    }
    public Mouse getmouse() {
        return mouse;
    }
    public  void  setmousee(Mouse mouse) {
        this.mouse = mouse;
    }
    public Keyboard getkeyboard() {
        return keyboard;
    }
    public  void  setkeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

}
