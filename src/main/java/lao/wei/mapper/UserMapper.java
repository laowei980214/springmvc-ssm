package lao.wei.mapper;

import lao.wei.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    boolean update(User user);

    /**
     * 删除用户
     *
     * @param uuid
     * @return
     */
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
    List<User> getAll();


    /**
     * 根据用户名密码查询个人信息
     * //注意：数据层操作不要和业务层操作的名称混淆，通常数据层仅反映与数据库间的信息交换，不体现业务逻辑
     *
     * @param userName 用户名
     * @param password 密码信息
     * @return
     */
    User getByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);
}
