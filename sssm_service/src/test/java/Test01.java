import cn.itcast.dao.AccountMapper;
import cn.itcast.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public  void test0(){
        ApplicationContext applicationContext= new  ClassPathXmlApplicationContext("applicationContext-service.xml","applicationContextDao.xml");
        applicationContext.getBean(AccountService.class).findOne(1);
    }
}
