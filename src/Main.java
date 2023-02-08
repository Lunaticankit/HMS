import model.Department;
import model.Patients;
import model.Test;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patients> p1 = new ArrayList<>();
        Patients patients1 = new Patients("Ankit", 18, "Ankit.@.gmail.com");
        Patients patients2 = new Patients("Sushant", 19, "Sushant.@.gmail.com");
        Patients patients3 = new Patients("Ishan", 20, "Ishan.@.gmail.com");
        Patients patients4 = new Patients("Aayush", 17, "Ishan.@.gmail.com");
        Patients patients5 = new Patients("Avarna", 20, "Ishan.@.gmail.com");
        p1.add(patients1);
        p1.add(patients2);
        p1.add(patients3);
        p1.add(patients4);
        p1.add(patients5);

        ArrayList<Test> t1 = new ArrayList<>();
        Test test1 = new Test("ecg", 2000);
        Test test2 = new Test("echo", 2500);
        Test test3 = new Test("x-ray", 1000);
        Test test4 = new Test("bloodtest", 500);
        t1.add(test1);
        t1.add(test2);
        t1.add(test3);
        t1.add(test4);

        ArrayList<Department> d1 = new ArrayList<>();
        Department Department1 = new Department("ENT", "RAM");
        Department Department2 = new Department("Cardio", "Sita");
        Department Department3 = new Department("Bone", "Hari");
        Department Department4 = new Department("OPD", "Sam");
        d1.add(Department1);
        d1.add(Department2);
        d1.add(Department3);
        d1.add(Department4);

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
    }
}