package lao.wei.service.impl;

import com.github.pagehelper.PageHelper;
import lao.wei.mapper.UserMapper;
import lao.wei.pojo.User;
import lao.wei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean save(User user) {
        return userMapper.save(user);
    }

    @Override
    public boolean update(User user) {
        return userMapper.update(user);
    }

    @Override
    public boolean delete(Integer uuid) {
        return userMapper.delete(uuid);
    }

    @Override
    public User get(Integer uuid) {
        return userMapper.get(uuid);
    }

    @Override
    public List<User> getAll(int page, int size) {
        PageHelper.startPage(page, size);
        List<User> all = userMapper.getAll();
        return all;
    }

    @Override
    public User login(String userName, String password) {
        return userMapper.getByUserNameAndPassword(userName,password);
    }
}
