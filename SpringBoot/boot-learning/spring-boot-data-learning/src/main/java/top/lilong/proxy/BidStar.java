package top.lilong.proxy;

public class BidStar implements Star{
    private String name;

    public BidStar() {
    }

    public BidStar(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 唱歌
     * @return
     */
    public String  sing(){
        System.out.println("唱歌");
        return "谢谢";
    }

    public void dance(){
        System.out.println("跳舞");
    }

    @Override
    public String toString() {
        return "BidStar{" +
                "name='" + name + '\'' +
                '}';
    }
}
