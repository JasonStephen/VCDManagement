package com.vcd.dto;

import javax.persistence.criteria.CriteriaBuilder;

public class ViewRes {
    private String[] vtypes;
    private Integer[] rents;
    private Integer[] sells;
    private Integer[] repaids;

    public String[] getVtypes() {
        return vtypes;
    }

    public void setVtypes(String[] vtypes) {
        this.vtypes = vtypes;
    }

    public Integer[] getRents() {
        return rents;
    }

    public void setRents(Integer[] rents) {
        this.rents = rents;
    }

    public Integer[] getSells() {
        return sells;
    }

    public void setSells(Integer[] sells) {
        this.sells = sells;
    }

    public Integer[] getRepaids() {
        return repaids;
    }

    public void setRepaids(Integer[] repaids) {
        this.repaids = repaids;
    }
}
