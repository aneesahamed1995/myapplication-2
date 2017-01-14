package com.nmk.aneesahamed.regix;

import java.io.Serializable;

public class Student implements Serializable {

  
    private static final long serialVersionUID = 1L;

    private String name;

    private String emailId;

    private boolean present;
    private boolean absent;
    private boolean od;

    public Student() {

    }

    public Student(String name, String emailId) {

        this.name = name;
        this.emailId = emailId;

    }

    public Student(String name, boolean present,boolean absent,boolean od) {

        this.name = name;

        this.present = present;
        this.absent=absent;
        this.od=od;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean present() {
        return present;
    }
    public boolean absent() {
        return absent;
    }
    public boolean ods() {
        return od;
    }

    public void setpresent(boolean isSelected) {
        this.present = isSelected;
    }
    public void setabsent(boolean isSelected) {
        this.absent = isSelected;
    }
    public void setod(boolean isSelected) {
        this.od = isSelected;
    }

}
