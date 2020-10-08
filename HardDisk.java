package javadiercishiyan;
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
    int getRead(){
        return read;
    }
    int getWrite(){
        return write;
    }
    float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
            this.amount = amount;
        }

    void setRead(int read) {
            this.read = read;
        }

    protected void setWrite(int write) {
            this.write = write;
        }

    }

