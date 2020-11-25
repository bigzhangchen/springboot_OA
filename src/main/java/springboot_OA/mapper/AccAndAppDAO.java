package springboot_OA.mapper;

import org.springframework.stereotype.Repository;
import springboot_OA.pojo.Application;

/**
 * @author liuyang
 * @creats 2020-11-24-19:08
 */
@Repository
public interface AccAndAppDAO {
    public Application selectApplicationAll(Integer uid);
}
