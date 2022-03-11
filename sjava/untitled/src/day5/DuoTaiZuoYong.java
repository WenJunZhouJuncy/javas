package day5;

import  day5.*;
public class DuoTaiZuoYong {
    public static void main(String[] args) {
        Ren r = new Ren();
        Chongwu c = new Cat();
        Chongwu b = new Brid();

        r.feed(c);
        r.feed(b);
    }
}

class Ren {
    public void feed(Chongwu c) {
        c.eat();
    }
}

class Chongwu {
    public void eat(){}
}

class Cat extends Chongwu{
    public void eat() {
        System.out.println("cat eat food");
    }
}

class Brid extends Chongwu{
    public void eat() {
        System.out.println("brid eat food");
    }
}
