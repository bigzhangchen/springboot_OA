package springboot_OA.pojo;

import com.github.pagehelper.PageInfo;

/**
 * @author liuyang
 * @creats 2020-11-25-9:22
 */
public class PageResult extends Result{
    PageInfo pageInfo;
    public PageResult(Integer state, String msg) {
        super(state, msg);
    }

    public PageResult(Integer state, String msg, Object data) {
        super(state, msg, data);
    }
    public PageResult(Integer state, String msg, PageInfo pageInfo) {
        super(state, msg);
        this.pageInfo = pageInfo;
    }

    public PageResult(Integer state, String msg, Object data, PageInfo pageInfo) {
        super(state, msg, data);
        this.pageInfo = pageInfo;
    }
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }


}
