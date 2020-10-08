package javadiercishiyan;
public class Test {
    public static void main(String args[]) {
        Cpu cpu = new Cpu();
        cpu.setSpeed(4);
        Cpu core = new Cpu();
        cpu.core(4);
        HardDisk HD=new HardDisk(2931,3458);
        HD.setAmount((float) 931.50);
        Pc pc = new Pc(cpu);
        pc.setHardDisk(HD);
        pc.show();
    }

}