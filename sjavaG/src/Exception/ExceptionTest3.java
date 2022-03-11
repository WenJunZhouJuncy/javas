package Exception;

import java.util.Scanner;

public class ExceptionTest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String username = s.next();
        try {
            UserReagser.reagser(username);
        } catch (MyExceptionExe e) {
            e.printStackTrace();
        }
    }
}

class MyExceptionExe extends Exception{
    public MyExceptionExe() {
    }

    public MyExceptionExe(String message) {
        super(message);
    }
}

class UserReagser{
    public static void reagser(String username) throws MyExceptionExe{
        if (username.length() > 14) {
            throw new MyExceptionExe("用户名不能超过14位");
        } else if (username.length() < 6) {
            throw new MyExceptionExe("用户名不能少于6位");
        } else {
            System.out.println("注册成功");
        }
    }
}
