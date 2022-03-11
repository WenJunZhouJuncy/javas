public class Stu{
  public static void main(String[] args){
    Student s = new Student();
    s.xuehao = "123";
    s.xingming = "李华";
    s.cp = new Computed();
    s.cp.xinhao = "0xx111";
    s.cp.yanse = "黄色";
    System.out.print(s.xingming + "的学号是" + s.xuehao + ";他使用的电脑的型号是" + s.cp.xinhao + ";颜色是" + s.cp.yanse);
  }
}

class Student{
  String xuehao;
  String xingming;
  Computed cp;
}

class Computed{
  String xinhao;
  String yanse;
}