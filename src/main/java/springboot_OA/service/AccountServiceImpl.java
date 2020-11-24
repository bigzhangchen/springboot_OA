package springboot_OA.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import springboot_OA.mapper.AccAndDeptDAO;
import springboot_OA.mapper.AccountDAO;
import springboot_OA.mapper.DeptDAO;
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
    AccAndDeptDAO accAndDeptDAO;
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
}
