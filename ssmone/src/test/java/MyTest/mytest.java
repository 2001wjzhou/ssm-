package MyTest;

import com.zhou.dao.UserMapper;
import com.zhou.pojo.User;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class mytest {

    @Autowired
    UserMapper userMapper;

    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        UserMapper userMapper = context.getBean ( "userMapper",UserMapper.class );
        for (User user : userMapper.findAll()) {
            System.out.println(user);
        }
    }
}
