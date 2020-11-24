package springboot_OA.mapper;


import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Account;
import springboot_OA.pojo.AccountExample;

/**
 * AccountDAO继承基类
 */
@Repository
public interface AccountDAO extends MyBatisBaseDao<Account, Integer, AccountExample> {
}