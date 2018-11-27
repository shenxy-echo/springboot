package com.shenxy.springboot.pojo;

import java.util.List;
public class PageBean<T> {

    private Long total; // 总条数
    private List<T> rows; // 显示的数据集合

    public PageBean() {
    }

    public PageBean(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "PageBean{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
