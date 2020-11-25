package springboot_OA.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liuyang
 * @creats 2020-11-24-23:07
 */
@Data
public class Salary implements Serializable {
    /**
     * 工号
     */
    private String number;

    /**
     * 姓名
     */
    private String loginName;

    /**
     * 薪资
     */
    private Double salary;

    /**
     * 薪资状态
     */
    private Short salarystatus;

    /**
     * 所在部门
     */
    private String dept;
    private static final long serialVersionUID = 1L;
}
