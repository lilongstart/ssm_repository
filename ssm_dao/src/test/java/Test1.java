import cn.itcast.dao.AccountMapper;
import cn.itcast.domain.Item;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Test1 {
    @Test
    public void test01() throws IOException {
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContextDao.xml");
        Item item = applicationContext.getBean(AccountMapper.class).findOne(1);
        System.out.println(item);
    }
}
