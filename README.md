# Java-
java课程作业项目仓库

# 阅读程序
 
## 实验目的
1.掌握类的设计
2.写出程序并初步学会测试
3.利用github平台写报告设计
···
···

# 实验过程
1.分析要求，该实验具有四个类，其中Test类为主类，在实验工具中创建四个类。  
2.Cpu的返回值设置为getspeed()返回speed的值。  
3.HardDisk类要求getAmount()返回amount的值。  
4.要求show()方法能显示cpu的速度和硬盘的容量。  
5.pc调用show()的方法。  
6.利用对象.get方法来打印对象Cpu和对象HD的属性信息。  
···
···

# 核心方法
下面的两段代码分别体现了使用private关键字，和调用show()的方法打印对象的属性信息。
public class HardDisk
{
    private float amount;
    private int read;
    private int write;
    HardDisk(float amount){
        setAmount(amount);
    }
    HardDisk(int read,int write){
        setRead(read);
        setWrite(write);
    }
    ···
    ···
     void show()
    {
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("CPU内核:"+cpu.getCore());
        System.out.println("硬盘容量:"+HD.getAmount());
        System.out.println("硬盘读取速度:"+HD.getRead());
        System.out.println("硬盘写入速度:"+HD.getWrite());
    }
}
    ···
    ···
  # 实验结果
  
  # 实验感想
  
  
