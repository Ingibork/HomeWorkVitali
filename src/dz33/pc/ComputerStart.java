package dz33.pc;

public class ComputerStart {
    public static void main(String[] args) {
        Computer computer = new Computer(true, true, true,
                true,true,false,true,true);

        computer.test();
        computer.run();

    }
}
