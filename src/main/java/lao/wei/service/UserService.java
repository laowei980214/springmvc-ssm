package lao.wei.service;

import lao.wei.pojo.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = true)
public interface UserService {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @Transactional(readOnly = false)
    boolean save(User user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    @Transactional(readOnly = false)
    boolean update(User user);

    /**
     * 删除用户
     *
     * @param uuid
     * @return
     */
    @Transactional(readOnly = false)
    boolean delete(Integer uuid);

    /**
     * 查询单个用户信息
     *
     * @param uuid
     * @return
     */
    User get(Integer uuid);

    /**
     * 查询全部用户信息
     *
     * @return
     */
    List<User> getAll(int page,int size);

    /**
     * 根据用户名密码进行登录
     *
     * @param userName
     * @param password
     * @return
     */
    User login(String userName, String password);
}
