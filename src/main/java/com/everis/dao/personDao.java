package com.everis.dao;
import java.util.List;

import com.everis.beans.person;
public interface personDao {
	person get(long id);
    
    List<person> getAll();
     
    void save(person p);
     
    void update(person p, String[] params);
     
    void delete(person p);

}
