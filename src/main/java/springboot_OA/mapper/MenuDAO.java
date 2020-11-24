package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Menu;
import springboot_OA.pojo.MenuExample;

/**
 * MenuDAO继承基类
 */
@Repository
public interface MenuDAO extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}