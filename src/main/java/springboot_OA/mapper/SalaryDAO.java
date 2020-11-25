package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Dept;
import springboot_OA.pojo.Salary;

/**
 * @author liuyang
 * @creats 2020-11-24-23:11
 */
@Repository
public interface SalaryDAO extends MyBatisBaseDao{
    public Salary selectSalary(Integer uid);
}