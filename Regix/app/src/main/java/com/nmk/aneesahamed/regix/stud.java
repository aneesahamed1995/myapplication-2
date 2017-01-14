package com.nmk.aneesahamed.regix;

import java.io.Serializable;

public class stud implements Serializable {


    private static final long serialVersionUID = 1L;

    private String name;

    private String emailId;

    private boolean present;
    public boolean absent;
    public boolean od;

    public stud() {

    }

    public stud(String name, String emailId) {

        this.name = name;
        this.emailId = emailId;

    }

    public stud(String name, boolean isSelected,boolean absent,boolean od) {

        this.name = name;
        this.absent=absent;
        this.od=od;

        this.present = isSelected;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean pres() {
        return this.present;
    }
    public boolean abs() {
        return this.absent;
    }
    public boolean ods() {
        return this.od;
    }

    public void present(boolean other) {
        this.present=!this.present;
        this.absent=other;
        this.od=other;
    }
    public void absent (boolean other) {
        this.absent = !this.absent;
        this.present=other;
        this.od=other;
    }
    public void od (boolean other) {
        this.od = !this.od;
        this.present=other;
        this.absent=other;
    }


}
