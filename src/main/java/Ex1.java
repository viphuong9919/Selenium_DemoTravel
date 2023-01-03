import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Ex1    {
    public static void main(String[] args) throws ParseException {
        // Định dạng thời gian
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();

        // Định nghĩa 2 mốc thời gian ban đầu
        Date startDate = dateFormat.parse("20170201");
        Date closeDate = dateFormat.parse("20211224");

        c1.setTime(startDate);
        c2.setTime(closeDate);

        // Công thức tính tổng số ngày từ ngày bắt đầu đến ngày kết thúc
        long diff = closeDate.getTime() - startDate.getTime();
        System.out.println ("Tổng số ngày từ ngày bắt đầu đến ngày kết thúc  : " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));

        // Công thức tính ngày closeDate khi đầu vào cho startDate và số tháng muốn cộng thêm
        c1.add(Calendar.MONTH, 1);
        System.out.println("Tháng được tăng thêm 1 tháng (Sử dụng add)  : "
                + dateFormat.format(c1.getTime()));
        System.out.println(c1);
    }
}
