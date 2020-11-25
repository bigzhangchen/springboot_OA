package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Dept;

/**
 * @author liuyang
 * @creats 2020-11-24-16:50
 */
@Repository
public interface AccAndDeptDAO extends MyBatisBaseDao{
    public Dept selectDeptAll(Integer uid);
}
