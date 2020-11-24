package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Role;
import springboot_OA.pojo.RoleExample;

/**
 * RoleDAO继承基类
 */
@Repository
public interface RoleDAO extends MyBatisBaseDao<Role, Integer, RoleExample> {
}