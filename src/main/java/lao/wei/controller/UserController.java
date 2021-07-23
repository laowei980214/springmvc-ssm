package lao.wei.controller;

import lao.wei.pojo.User;
import lao.wei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 这里是添加用的postMapping 地址栏不会出现信息
     *
     * @param user
     * @return
     */
    @PostMapping
    public boolean save(User user) {
        System.out.println("我是保存的...");
        System.out.println("我是保存的...22");
        return userService.save(user);
    }

    @PutMapping
    public boolean update(User user) {
        System.out.println("我是修改的...");
        return userService.update(user);
    }

    @DeleteMapping("/{uuid}")
    public boolean delete(@PathVariable("uuid") Integer uuid) {
        System.out.println("我是删除的....");
        return userService.delete(uuid);
    }

    @GetMapping("/{uuid}")
    public User get(@PathVariable("uuid") Integer uuid) {
        System.out.println("我是查询单个的");

        return userService.get(uuid);
    }

    @GetMapping("/{page}/{size}")
    public List<User> getAll(@PathVariable("page") Integer page, @PathVariable("size") Integer size) {
        System.out.println("我分页查询了");
        return userService.getAll(page, size);
    }

    @PostMapping("/login")
    public User login(String userName,String password){
        return userService.login(userName,password);
    }
}
