package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Notice;
import springboot_OA.pojo.NoticeExample;

/**
 * NoticeDAO继承基类
 */
@Repository
public interface NoticeDAO extends MyBatisBaseDao<Notice, Integer, NoticeExample> {
}