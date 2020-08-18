package us.codecraft.webmagic.formatter;

import org.apache.commons.lang3.time.DateFormatUtils;   // Not possible with guava options
import org.apache.commons.lang3.time.DateUtils;         // Not possible with guava options
import org.junit.Test;
import us.codecraft.webmagic.model.formatter.DateFormatter;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author code4crafter@gmail.com
 */
public class DateFormatterTest {

    @Test
    public void testDateFormatter() throws Exception {
        DateFormatter dateFormatter = new DateFormatter();
        String pattern = "yyyy-MM-dd HH:mm";
        Date date = DateUtils.parseDate("2013-09-10 22:11", new String[]{pattern});     // Not possible with guava options
        dateFormatter.initParam(new String[]{pattern});
        Date format = dateFormatter.format(DateFormatUtils.format(date, pattern));      // Not possible with guava options
        assertThat(format).isEqualTo(date);
    }
}
