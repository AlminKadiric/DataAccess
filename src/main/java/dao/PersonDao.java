package dao;

import model.Person;

import java.util.List;

public abstract class PersonDao implements Dao<Person> {
private String mediaFileName;
 public PersonDao(String mediaFileName){
     this.mediaFileName=mediaFileName;

 }

    public String getMediaFileName() {
        return mediaFileName;
    }
}
