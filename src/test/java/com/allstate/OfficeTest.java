package com.allstate;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 03/01/17.
 */
public class OfficeTest {

     @Test
     public void OfficeConstructor(){
         Office office = new Office("Allstate","Bangalore",1000);
         Assert.assertEquals("Allstate",office.getName());
         Assert.assertEquals("Bangalore",office.getLocation());
         Assert.assertEquals(1000,office.getNumberOfEmployees());

     }
    @Test
    public void office_LocationofBangaloreTest(){
        List<Office> officelist = new ArrayList<Office>();
        officelist.add(new Office("Allstate","Bangalore",2000));
        officelist.add(new Office("Cisco","Chennai",4000));
        officelist.add(new Office("Brocade","Delhi",200));
        officelist.add(new Office("WellsFargo","Bangalore",9000));
        officelist.add(new Office("Allstate","Pune",6000));
        List<Office> list = Office.LocationofBangalore(officelist);
        Assert.assertEquals(list.size(),2);
        Assert.assertEquals("Allstate", list.get(0).getName());
        Assert.assertEquals("WellsFargo", list.get(1).getName());

    }
    @Test
    public void office_lessThanthousandEmployeeTest(){
        List<Office> officelist = new ArrayList<Office>();
        officelist.add(new Office("Allstate","Bangalore",1200));
        officelist.add(new Office("Cisco","Chennai",4000));
        officelist.add(new Office("Brocade","Delhi",200));
        officelist.add(new Office("WellsFargo","Bangalore",9000));
        officelist.add(new Office("Allstate","Pune",6000));
        List<Office> list = Office.lessThanthousandEmployee(officelist);
        Assert.assertEquals(list.size(),1);
        Assert.assertEquals("Brocade", list.get(0).getName());

    }

    @Test
    public void office_FindByNameAllstateTest(){
        List<Office> officelist = new ArrayList<Office>();
        officelist.add(new Office("Allstate","Bangalore",1200));
        officelist.add(new Office("Cisco","Chennai",4000));
        officelist.add(new Office("Brocade","Delhi",200));
        officelist.add(new Office("WellsFargo","Bangalore",9000));
        officelist.add(new Office("Allstate","Pune",6000));
        List<Office> list = Office.findByNameAllsate(officelist);
        Assert.assertEquals(list.size(),2);
        Assert.assertEquals("Allstate", list.get(0).getName());
    }

    @Test
    public void office_nameThatBeginsWithAnyOfTheLettersAK(){
        List<Office> officelist = new ArrayList<Office>();
        officelist.add(new Office("Allstate","Bangalore",1200));
        officelist.add(new Office("Cisco","Chennai",4000));
        officelist.add(new Office("Brocade","Delhi",200));
        officelist.add(new Office("WellsFargo","Bangalore",9000));
        officelist.add(new Office("Allstate","Pune",6000));
        List<Office> list = Office.nameThatBeginsWithAnyOfTheLettersAK(officelist);
        Assert.assertEquals(list.size(),4);
        Assert.assertEquals("Allstate", list.get(0).getName());
    }

    @Test
    public void office_nameThatBeginsWithVowelsAndMoreThan1000Emp(){
        List<Office> officelist = new ArrayList<Office>();
        officelist.add(new Office("Allstate","Bangalore",1200));
        officelist.add(new Office("Cisco","Chennai",4000));
        officelist.add(new Office("Univeral","Delhi",200));
        officelist.add(new Office("Indico","Bangalore",9000));
        officelist.add(new Office("Allstate","Pune",6000));
        List<Office> list = Office.nameThatBeginsWithVowelsAndMoreThan1000Emp(officelist);
        Assert.assertEquals(list.size(),3);
        Assert.assertEquals("Allstate", list.get(0).getName());
    }
}