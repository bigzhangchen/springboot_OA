package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Dept;
import springboot_OA.pojo.DeptExample;

/**
 * DeptDAO继承基类
 */
@Repository
public interface DeptDAO extends MyBatisBaseDao<Dept, Integer, DeptExample> {
}