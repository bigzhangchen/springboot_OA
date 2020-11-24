package springboot_OA.pojo;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class Account implements Serializable {
    private Integer id;

    /**
     * 工号
     */
    private String number;

    /**
     * 姓名
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 地址
     */
    private String address;

    /**
     * 出勤天数
     */
    private String date;

    /**
     * 薪资
     */
    private Double salary;

    /**
     * 薪资状态
     */
    private Short salarystatus;

    /**
     * 在职状态
     */
    private Short personstatus;

    /**
     * 所在部门
     */
    private String dept;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Short getSalarystatus() {
        return salarystatus;
    }

    public void setSalarystatus(Short salarystatus) {
        this.salarystatus = salarystatus;
    }

    public Short getPersonstatus() {
        return personstatus;
    }

    public void setPersonstatus(Short personstatus) {
        this.personstatus = personstatus;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Account other = (Account) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getNumber() == null ? other.getNumber() == null : this.getNumber().equals(other.getNumber()))
            && (this.getLoginName() == null ? other.getLoginName() == null : this.getLoginName().equals(other.getLoginName()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getSalary() == null ? other.getSalary() == null : this.getSalary().equals(other.getSalary()))
            && (this.getSalarystatus() == null ? other.getSalarystatus() == null : this.getSalarystatus().equals(other.getSalarystatus()))
            && (this.getPersonstatus() == null ? other.getPersonstatus() == null : this.getPersonstatus().equals(other.getPersonstatus()))
            && (this.getDept() == null ? other.getDept() == null : this.getDept().equals(other.getDept()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getNumber() == null) ? 0 : getNumber().hashCode());
        result = prime * result + ((getLoginName() == null) ? 0 : getLoginName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getSalary() == null) ? 0 : getSalary().hashCode());
        result = prime * result + ((getSalarystatus() == null) ? 0 : getSalarystatus().hashCode());
        result = prime * result + ((getPersonstatus() == null) ? 0 : getPersonstatus().hashCode());
        result = prime * result + ((getDept() == null) ? 0 : getDept().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", number=").append(number);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", email=").append(email);
        sb.append(", age=").append(age);
        sb.append(", address=").append(address);
        sb.append(", date=").append(date);
        sb.append(", salary=").append(salary);
        sb.append(", salarystatus=").append(salarystatus);
        sb.append(", personstatus=").append(personstatus);
        sb.append(", dept=").append(dept);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}