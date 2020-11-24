package springboot_OA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_OA.mapper.AccountDAO;
import springboot_OA.pojo.Account;
import springboot_OA.pojo.Result;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-24-10:06
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    AccountDAO accountDAO;
    @RequestMapping("/login")
    public Result login(){

        List<Account> data = accountDAO.selectByExample(null);
        return new Result(200,"成功",data);
    }
}
