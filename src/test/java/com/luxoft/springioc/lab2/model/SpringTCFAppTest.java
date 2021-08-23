package com.luxoft.springioc.lab2.model;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application-context.xml")
public class SpringTCFAppTest {

    @Autowired
    private UsualPerson person;
    @Autowired
    private Contact contact;
    @Autowired
    private Contact contact1;
    @Autowired
    private Country country;
    @Autowired
    private UsualPerson expectedPerson;

    @Before
    public void setUp() throws Exception {
        expectedPerson = getExpectedPerson();
    }

    @Test
    public void testInitPerson() {
        assertEquals(expectedPerson, person);
        System.out.println(person);
    }

    private UsualPerson getExpectedPerson() {
        //UsualPerson person = new UsualPerson();
        expectedPerson.setAge(35);
        expectedPerson.setHeight(1.78F);
        expectedPerson.setIsProgrammer(true);
        expectedPerson.setName("Ivan Ivanov");

        country.setId(1);
        country.setName("Russia");
        country.setCodeName("RU");

        person.setCountry(country);

        List<Contact> contacts = new ArrayList<>();
        contacts.add(contact);
        contacts.add(contact1);

        person.setContacts(contacts);

        return person;
    }

}
