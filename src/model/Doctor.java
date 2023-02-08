package model;

public class Doctor extends Department {
       String departmentname;
       Double Charge;

    public Doctor(String departmentname, String doctor, String departmentname1, Double charge) {
        super(departmentname, doctor);
        this.departmentname = departmentname1;
        Charge = charge;
    }

    public Doctor(String departmentname, String doctor) {
        super(departmentname, doctor);

    }

    @Override
    public String getDepartmentname() {
        return departmentname;
    }

    @Override
    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public Double getCharge() {
        return Charge;
    }

    public void setCharge(Double charge) {
        Charge = charge;
    }


}



