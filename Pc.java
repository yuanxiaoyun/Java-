package javadiercishiyan;
public class Pc
{
    private Cpu cpu;
    private HardDisk HD;
    Pc(Cpu cpu){
        setCPU(cpu);
    }
    Pc(HardDisk HD){
        setHardDisk(HD);
    }
    protected void setCPU(Cpu cpu)
    {
        this.cpu = cpu;
    }
    void setHardDisk(HardDisk HD)
    {
        this.HD = HD;
    }
    void show()
    {
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("CPU内核:"+cpu.getCore());
        System.out.println("硬盘容量:"+HD.getAmount());
        System.out.println("硬盘读取速度:"+HD.getRead());
        System.out.println("硬盘写入速度:"+HD.getWrite());
    }
}
