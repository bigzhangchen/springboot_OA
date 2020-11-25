package springboot_OA.service;

import com.github.pagehelper.PageInfo;
import springboot_OA.pojo.*;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-24-14:10
 */
public interface AccountService {
    public List<Account> selectAccountAllById(Integer uid);
    public Integer updateAccount(Account account);
    public Dept selectDeptAll(Integer uid);
    public Application selectApplicationAll(Integer uid);
    public Integer insertApplication(Application application);
    public Salary selectSalary(Integer uid);
    public PageInfo selectNoticePage(Integer num, Integer size);
}
