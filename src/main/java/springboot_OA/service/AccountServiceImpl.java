package springboot_OA.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import springboot_OA.mapper.*;
import springboot_OA.pojo.*;

import java.util.List;

/**
 * @author liuyang
 * @creats 2020-11-24-14:09
 */
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    AccountDAO accountDAO;
    @Autowired
    ApplicationDAO applicationDAO;
    @Autowired
    AccAndDeptDAO accAndDeptDAO;
    @Autowired
    AccAndAppDAO accAndAppDAO;
    @Autowired
    SalaryDAO salaryDAO;
    @Autowired
    NoticeDAO noticeDAO;
    @Override
    public List<Account> selectAccountAllById(Integer uid) {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.or();
        criteria.andIdEqualTo(uid);
        List<Account> list =  accountDAO.selectByExample(accountExample);
        return list;
    }

    @Override
    public Integer updateAccount(Account account) {
        Integer row = accountDAO.updateByPrimaryKey(account);
        return row;
    }

    @Override
    public Dept selectDeptAll(Integer uid) {

        return accAndDeptDAO.selectDeptAll(uid);

    }

    @Override
    public Application selectApplicationAll(Integer uid) {
        return accAndAppDAO.selectApplicationAll(uid);
    }

    @Override
    public Integer insertApplication(Application application) {
        Integer row = applicationDAO.insertSelective(application);
        return row;
    }

    @Override
    public Salary selectSalary(Integer uid) {
        return salaryDAO.selectSalary(uid);
    }

    @Override
    public PageInfo selectNoticePage(Integer num, Integer size) {
        PageHelper.startPage(num,size);
        List<Notice> noticeList = noticeDAO.selectByExample(null);
        PageInfo pageInfo = new PageInfo(noticeList);
        return pageInfo;
    }

    @Override
    public List<Account> register(Account account) {
        //判断用户名是否存在
        //select * from user where username='admin'
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.or();
        criteria.andLoginNameEqualTo(account.getLoginName());
        List<Account> accountList = accountDAO.selectByExample(accountExample);
        return accountList;
    }

    @Override
    public List<Account> login(String number, String password) {
        AccountExample accountExample = new AccountExample();
        AccountExample.Criteria criteria = accountExample.or();
        criteria.andNumberEqualTo(number);
        criteria.andPasswordEqualTo(password);
        List<Account> accountList = accountDAO.selectByExample(accountExample);
        return accountList;
    }
}
