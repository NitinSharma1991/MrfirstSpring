package com.nitin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.*;
import  java.util.Map.Entry;
@Component
public class Employee {
    private int eid;
    private String ename;
    private int kaka;
    @Autowired() @Qualifier(value = "address2")
    private Address address1;

    public int getKaka() {
        return kaka;
    }

    public void setKaka(int kaka) {
        this.kaka = kaka;
    }

  /*  public void setAddress1(Address address) {
        this.address1 = address;
    } */


 /*   public Address getAddress1() {
        return address1;
    } */

    private char gender;
    private Map<Integer,String> map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

   // public Employee(){System.out.println("Initialized");}

  /*  public Employee(int eid, String ename, Address address, char gender, Map map) {
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
                ", address='" + address1 + '\'' +
 //              ", address=" + super.toString() +
                ", gender=" + gender + ", Map=" + map +
                ", kaka=" + kaka+
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
