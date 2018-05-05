package com.nitin;

import java.util.*;
import  java.util.Map.Entry;

public class Employee extends Address{
    private int eid;
    private String ename;



    public void setAddress(Address address) {
        this.address1 = address;
    }

    private Address address1;
    private char gender;
    private HashMap<Integer,String> map;

    public HashMap getMap() {
        return map;
    }

    public void setMap(HashMap map) {
        this.map = map;
    }

    public Employee(){System.out.println("Initialized");}

  /*  public Employee(int eid, String ename, Address address, char gender) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
        this.gender = gender;
    }*/

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }



    @Override
       public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", address=" + super.toString() +
                ", gender=" + gender + ", HashMap=" + map +
                '}';
    }
    public void display()
    {
        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<Integer,String> entry = (Map.Entry) itr.next();
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
public void myInit(){
    System.out.println("Object Initialized");
}

    public void myDestroy(){
        System.out.println("Object Destroyed");
    }

}