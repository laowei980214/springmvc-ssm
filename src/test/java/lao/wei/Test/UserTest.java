package lao.wei.Test;


import lao.wei.pojo.User;
import lao.wei.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private UserService userService;

    //private User user = new User();

    @Test
    public void testSave() {
        User user = new User();
        user.setUserName("Jock");
        user.setPassword("root");
        user.setReakName("Jockme");
        user.setGender(1);
        user.setBirthday(new Date(333333000000L));
        userService.save(user);

    }

    @Test
    public void testupdate() {
    }

    @Test
    public void testdelete() {

    }


    @Test
    public void testget() {

    }

    @Test
    public void testgetAll() {

    }

    @Test
    public void testlogin() {

    }
}
