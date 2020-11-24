package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Permission;
import springboot_OA.pojo.PermissionExample;

/**
 * PermissionDAO继承基类
 */
@Repository
public interface PermissionDAO extends MyBatisBaseDao<Permission, Integer, PermissionExample> {
}