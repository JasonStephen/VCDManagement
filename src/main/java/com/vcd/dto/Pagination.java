package com.vcd.dto;

import lombok.Data;

@Data
public class Pagination {

    //当前页码
    private int currentPage;

    //每页大小
    private int size;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
