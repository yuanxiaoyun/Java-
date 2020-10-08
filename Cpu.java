package javadiercishiyan;
public class Cpu {
    int speed;
    int core;

    int getSpeed() {
        return speed;
    }

    int getCore() {
        return core;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setCore(int cnumber) {
        this.core = cnumber;
    }

    Cpu() {
    }

    public void core(int cumber) {
        this.core = cumber;
    }
}