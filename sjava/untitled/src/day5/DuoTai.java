package day5;

public class DuoTai {
    public static void main(String[] args) {
        Animas a2 = new Cat();

        a2.move();
        if (a2 instanceof Cat) {
            Cat c2 = (Cat)a2;
            c2.catMouse();
        }
        ((Cat)a2).catMouse();
    }
}

class Animas {
 public void move() {
     System.out.println("anima move");
 }
}

class Cat extends Animas {
    public void move() {
        System.out.println("Cat move");
    }

    public void catMouse(){
        System.out.println("cat mouse");
    }
}

class Brid extends Animas {
    public void move() {
        System.out.println("Brid move");
    }
}

//多态必须存在继承关系