package springboot_OA.service;

import springboot_OA.pojo.Account;
import springboot_OA.pojo.Dept;
import springboot_OA.pojo.Result;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-24-14:10
 */
public interface AccountService {
    public List<Account> selectAccountAllById(Integer uid);
    public Integer updateAccount(Account account);
    public Dept selectDeptAll(Integer uid);
}
