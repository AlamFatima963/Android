package com.example.school_app;

class MyListData {

    private String className;
    private String presnt;
    private String absent;
    private String leave;
    private String late;
    private String total;



    public MyListData(String className, String presnt, String absent, String leave, String late, String total) {
        this.className = className;
        this.presnt = presnt;
        this.absent = absent;
        this.leave = leave;
        this.late = late;
        this.total = total;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getPresnt() {
        return presnt;
    }

    public void setPresnt(String presnt) {
        this.presnt = presnt;
    }

    public String getAbsent() {
        return absent;
    }

    public void setAbsent(String absent) {
        this.absent = absent;
    }

    public String getLeave() {
        return leave;
    }

    public void setLeave(String leave) {
        this.leave = leave;
    }

    public String getLate() {
        return late;
    }

    public void setLate(String late) {
        this.late = late;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}
