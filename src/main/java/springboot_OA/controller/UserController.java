package springboot_OA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot_OA.mapper.AccountDAO;
import springboot_OA.pojo.Account;
import springboot_OA.pojo.AccountExample;
import springboot_OA.pojo.Result;
import springboot_OA.service.AccountService;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-25-9:45
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    AccountService accountService;
    @Autowired
    AccountDAO accountDAO;
    //用户注册
    @RequestMapping("/register")
    public Result register(@RequestBody Account account){
        List<Account> accountList = accountService.register(account);
        Result result = null;
        if(accountList.size()==0){
            //不存在
            String md5Password = DigestUtils.md5DigestAsHex(account.getPassword().getBytes());
            account.setPassword(md5Password);
            int row = accountDAO.insertSelective(account);
            if(row>=1){
                result = new Result(200,"ok","注册成功");
            }else{
                result = new Result(404,"error","添加用户失败");
            }
        }else {
            result = new Result(400,"error","用户名已存在");
        }
        return result;

    }
    @RequestMapping("/login")
    public Result Login(@RequestBody  String number ,@RequestBody String password){
        String md5Password = DigestUtils.md5DigestAsHex(password.getBytes());
        List<Account> accountList = accountService.login(number,md5Password);
        Result result = null;
        if(accountList.size()>=1){
            result = new Result(200,"ok","登录成功");
        }else{
            result = new Result(400,"error","登录失败，账号或密码错误");
        }
        return result;
    }
}
