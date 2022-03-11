public class ExtendsTest {
    public static void main(String[] arge) {
        Animates c = new Cat("呼吸", "嘟嘟", 23);

        if ( c instanceof Cat ) {
            Cat mycat = (Cat)c;
            mycat.getHuxi();
            System.out.println(mycat.getHuxi() + "我的" + mycat.getName() + mycat.getAge());
        }
    }
}

class Animates {
    private String huxi;

    public Animates() {
    }

    public Animates(String huxi) {
        this.huxi = huxi;
    }

    public String getHuxi() {
        return huxi;
    }

    public void setHuxi(String huxi) {
        this.huxi = huxi;
    }
}

class Cat extends Animates {
    private String name;
    private int age;

    public Cat() {
        super();
    }

    public Cat(String huxi, String name, int age) {
        super(huxi);
        this.name = name;
        this.age = age;
    }

    public Cat(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}