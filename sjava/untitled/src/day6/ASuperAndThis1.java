public class ASuperAndThis1{
    public static void main(String[] args) {
        new AcceatConsts("张三", 1000.0, "123");
    }
}

class Consts{
    private double yue;
    private String zhanghu;

    public Consts() {

    }

    public Consts(double yue, String zhanghu) {
        this.yue = yue;
        this.zhanghu = zhanghu;
    }

    public double getYue() {
        return this.yue;
    }

    public void setYue(double yue) {
        this.yue = yue;
    }

    public String getZhanghu() {
        return zhanghu;
    }

    public void setZhanghu(String zhanghu) {
        this.zhanghu = zhanghu;
    }
}

class AcceatConsts extends Consts{
    private String zhuren;

    public AcceatConsts() {

    }

    public AcceatConsts(String zhuren, double yue, String zhanghu) {
        super(yue, zhanghu);
        this.zhuren = zhuren;
    }

    public String getZhuren() {
        return zhuren;
    }

    public void setZhuren(String zhuren) {
        this.zhuren = zhuren;
    }
}