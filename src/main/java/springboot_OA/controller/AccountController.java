package springboot_OA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot_OA.mapper.AccountDAO;
import springboot_OA.mapper.RoleDAO;
import springboot_OA.pojo.Account;
import springboot_OA.pojo.AccountExample;
import springboot_OA.pojo.Dept;
import springboot_OA.pojo.Result;
import springboot_OA.service.AccountService;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-24-13:17
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;
    //用户个人信息
    @RequestMapping("/personMessage")
    public Result findAccountAll(Integer uid){

        if(!StringUtils.isEmpty(accountService.selectAccountAllById(uid))){
            return new Result(200,"ok",accountService.selectAccountAllById(uid));
        }else{
            return new Result(404,"error","数据查询失败");
        }
    }
    //用户个人信息修改
    @RequestMapping("/updateInfo")
    public Result updateAccount(@RequestBody Account account){
        if(accountService.updateAccount(account)==1){
            return new Result(200,"ok","修改成功");
        }else{
            return new Result(404,"error","修改失败");
        }
    }
    //用户查看部门
    @RequestMapping("/deptMessage")
    public Result findDeptAll(Integer uid){
        if(!StringUtils.isEmpty(accountService.selectDeptAll(uid))){
            return new Result(200,"ok",accountService.selectDeptAll(uid));
        }else{
            return new Result(404,"error","数据查询失败");
        }
    }

}
