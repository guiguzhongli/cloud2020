import java.time.ZonedDateTime;

/**
 * @ClassName T1
 * @Description TODO
 * @Author Administrator
 * @Date 2021/11/22 0022 20:49
 * @Version 1.0
 **/
public class T1 {
    public static void main(String[] args)
    {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
//        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York")); // 用指定时区获取当前时间
//        System.out.println(zny);
    }



}
