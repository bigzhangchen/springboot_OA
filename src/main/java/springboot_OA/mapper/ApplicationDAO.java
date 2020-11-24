package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Application;
import springboot_OA.pojo.ApplicationExample;

/**
 * ApplicationDAO继承基类
 */
@Repository
public interface ApplicationDAO extends MyBatisBaseDao<Application, Integer, ApplicationExample> {
}