package com.allstate;

import java.lang.reflect.Array;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by localadmin on 03/01/17.
 */
public class Office {

    private String name;
    private String location;
    private int numberOfEmployees;

    public Office(String name, String location, int numberOfEmployees) {
        this.name = name;
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public static List<Office> LocationofBangalore(List<Office> officeList){
        List<Office> locationBasedList = officeList.stream().filter(office -> office.getLocation() =="Bangalore").collect(Collectors.toList());
        return locationBasedList;
    }

    public static List<Office> lessThanthousandEmployee(List<Office> officeList){
        List<Office> OfficeList = officeList.stream().filter(office -> office.getNumberOfEmployees() < 1000).collect(Collectors.toList());
        return OfficeList;
    }

    public static List<Office> moreThanthousandEmployee(List<Office> officeList){
        List<Office> OfficeList = officeList.stream().filter(office -> office.getNumberOfEmployees() > 1000).collect(Collectors.toList());
        return OfficeList;
    }

    public static List<Office> findByNameAllsate(List<Office> officeList){
        List<Office> OfficeList = officeList.stream().filter(office -> office.getName() == "Allstate").collect(Collectors.toList());
        return OfficeList;
    }


    public static List<Office> nameThatBeginsWithAnyOfTheLettersAK(List<Office> officeList){
        List<Office> OfficeList = officeList.stream().filter(office -> office.getName().charAt(0)>='A' && office.getName().charAt(0)<='K').collect(Collectors.toList());
        return OfficeList;
    }

    public static List<Office> nameThatBeginsWithVowelsAndMoreThan1000Emp(List<Office> officeList){
        String vowel ="AEIOU";
        List<Office> OfficeList = officeList.stream().filter(office -> vowel.indexOf(office.getName().charAt(0)) != -1 && office.getNumberOfEmployees() > 1000).collect(Collectors.toList());
        return OfficeList;
    }



}
