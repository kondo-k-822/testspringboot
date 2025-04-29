package co.jp.TestSpringBoot;


import co.jp.TestSpringBoot.entity.Users;
import co.jp.TestSpringBoot.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyBatisTestRunner implements CommandLineRunner {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public void run(String... args) throws Exception {
        //users usersobj = new users();
        List<Users> users = usersMapper.findAll();
        users.forEach(user -> System.out.println(user.getName()));
    }
}
