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
      
      
     void show()
    {
        System.out.println("CPU速度:"+cpu.getSpeed());
        System.out.println("CPU内核:"+cpu.getCore());
        System.out.println("硬盘容量:"+HD.getAmount());
        System.out.println("硬盘读取速度:"+HD.getRead());
        System.out.println("硬盘写入速度:"+HD.getWrite());
    }
    ···
    ···
  # 实验结果
  ![image](https://github.com/yuanxiaoyun/Java-/blob/main/%E5%AE%9E%E9%AA%8C%E7%BB%93%E6%9E%9C.png)
  # 实验感想
  在这次实验中，我对类有了更深刻的理解，了解到了类的使用方法和它对成员提供公有，私有，保护等多级访问权限，在实验中，我从一开始的无从下手，经过不断的询问老师和同学，请教老师和同学，才得以一步步的完成实验，Java语言和c语言，python等语言具有很大的区别，在这次实验中我深切的体会到了，但确有着类似的地方，就比如数字类型。但同时我也感受到了学习Java没有那么容易，即使我们有其他的语言基础，但除了老师课上所讲的，课下的自主学习也很重要，多动手写代码，才能真正学明白Java。
  
