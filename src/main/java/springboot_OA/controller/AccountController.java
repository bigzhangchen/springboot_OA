package springboot_OA.controller;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springboot_OA.mapper.AccountDAO;
import springboot_OA.mapper.RoleDAO;
import springboot_OA.pojo.*;
import springboot_OA.service.AccountService;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    //职工请假查询
    @RequestMapping("selectapplication")
    public Result findApplicationAll(Integer uid){
        if(!StringUtils.isEmpty(accountService.selectApplicationAll(uid))){
            return new Result(200,"ok",accountService.selectApplicationAll(uid));
        }else{
            return new Result(404,"error","数据查询失败");
        }
    }
    //职工请假添加 status：0是未审核
    @RequestMapping("insertapplication")
    public Result insertApplication(Application application){
        if(accountService.insertApplication(application)==1){
            return new Result(200,"ok","修改成功");
        }else{
            return new Result(404,"error","修改失败");
        }
    }
    //用户查看薪资
    @RequestMapping("/salary")
    public Result findSalaryAll(Integer uid){
        if(!StringUtils.isEmpty(accountService.selectSalary(uid))){
            return new Result(200,"ok",accountService.selectSalary(uid));
        }else{
            return new Result(404,"error","数据查询失败");
        }
    }
    //职工查看公告
    @RequestMapping("/notice")
    public PageResult findNoticeAll(Integer num,Integer size){
        PageInfo pageInfo = accountService.selectNoticePage(num,size);
        try {
            return new PageResult(200,"ok",pageInfo);
        }catch (Exception e){
            return new PageResult(404,"error","用户查询公告失败");
        }
    }
}
