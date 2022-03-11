package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest1 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();

        System.out.println(date1);

//        格式化时间类
//        yyyy年
//        MM月
//        dd日
//        HH时
//        mm分
//        ss秒
//        SSS毫秒
        String dateStr = "yyyy-MM-dd HH:mm:ss SSS";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(dateStr);

        String dateToStr = simpleDateFormat1.format(date1);
        System.out.println(dateToStr);

        Date strToDate = simpleDateFormat1.parse(dateToStr);
        System.out.println(strToDate);

//        获取1970 01 01 到 现在 总毫秒数
        long currenttm = System.currentTimeMillis();
        System.out.println(currenttm);


        Date csDate = new Date(1);   //毫秒数  1970 01 01 00:00:00 001
        System.out.println(csDate);
        Date ytDate = new Date(System.currentTimeMillis() - 1000 * 60 * 60 * 24);  //昨天的现在时间
        System.out.println(ytDate);
        String ytDateToStr = simpleDateFormat1.format(ytDate);
        System.out.println(ytDateToStr);
    }
}


class TestDate1{
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");

        String s1 = simpleDateFormat1.format(date);
        System.out.println(s1);

        try {
            Date d1 = simpleDateFormat1.parse(s1);
            System.out.println(d1);
        } catch (Exception e) {

        }

        long l1 = System.currentTimeMillis();


    }
}