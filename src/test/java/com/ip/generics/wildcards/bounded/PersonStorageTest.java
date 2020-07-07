package com.ip.generics.wildcards.bounded;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * This test class is used to test
 * some functions of Personaloader and PersonSaver classes
 * which uses wildcards.
 */
public class PersonStorageTest {

    private static final Partner DON_DRAPER = new Partner("Don Draper", 89);
    private static final Partner BERT_COOPER = new Partner("Bert Cooper", 100);
    private static final Employee PEGGY_OLSON = new Employee("Peggy Olson", 65);

    private static File file;
    private static PersonSaver saver;
    private static PersonLoader loader;

    @BeforeTest
    public void init() throws IOException {
        file = File.createTempFile("tmp", "people");
        saver = new PersonSaver(file);
        loader = new PersonLoader(file);
    }

    @Test
    public void cannotLoadFromEmptyFile() throws FileNotFoundException, ClassNotFoundException {
        PersonLoader loader = new PersonLoader(file);
        assertThat(loader.load()).isNull();
    }

    @Test
    public void savesAndLoadsPerson() throws IOException, ClassNotFoundException {
        PersonSaver saver = new PersonSaver(file);
        PersonLoader loader = new PersonLoader(file);

        saver.save(DON_DRAPER);

        assertThat(loader.load()).isEqualTo(DON_DRAPER);
    }

    @Test
    public void savesAndLoadsTwoPeople() throws IOException, ClassNotFoundException {
        saver.save(DON_DRAPER);
        saver.save(PEGGY_OLSON);

        assertThat(loader.load()).isEqualTo(DON_DRAPER);
        assertThat(loader.load()).isEqualTo(PEGGY_OLSON);
    }

    @Test
    public void savesArraysOfPeople() throws IOException, ClassNotFoundException {
        /*Employee[] employees = new Employee[2];
        Person[] people = employees;*/
        Partner[] people = new Partner[2];
        people[0] = DON_DRAPER;
        people[1] = BERT_COOPER;

        saver.saveAll(people);

        assertThat(loader.load()).isEqualTo(DON_DRAPER);
        assertThat(loader.load()).isEqualTo(BERT_COOPER);
    }

    @Test
    public void savesListsOfPeople() throws IOException, ClassNotFoundException {
        List<Partner> people = new ArrayList<>();
        people.add(DON_DRAPER);
        people.add(BERT_COOPER);

        saver.saveAll(people);

        assertThat(loader.load()).isEqualTo(DON_DRAPER);
        assertThat(loader.load()).isEqualTo(BERT_COOPER);
    }

    @Test
    public void loadsListsOfPeople() throws IOException, ClassNotFoundException {
        saver.save(DON_DRAPER);
        saver.save(BERT_COOPER);

        List<Object> people = new ArrayList<>();
        loader.loadAll(people);

        assertThat(people).containsExactly(DON_DRAPER, BERT_COOPER);
    }

    @AfterTest
    public void terminate() {
        if (file.exists()) {
            file.delete();
        }
    }
}
