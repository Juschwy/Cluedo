package ch.bbw.jf.cluedo.datamodel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Class: DataService
 *
 * @author: Schules
 * @date: 29.08.2023
 */

@Service
public class DataService {
    private List<Person> people;

    @Autowired
    public DataService(List<Person> people) {
        this.people = people;
        loadObjects();
    }

    private void loadObjects(){
        people.add(new Person("Colonel", "Mustard", 65, "moustache",  1.8, "yellow jacket", "black", "yellow"));
        people.add(new Person("Miss", "Scarlett", 29, "neckband", 1.65, "red dress", "blonde", "red"));
        people.add(new Person("Mrs.", "White", 55, "chef's hat", 1.6, "white chef-dress", "grey", "white"));
        people.add(new Person("Professor", "Plum", 70, "glasses", 1.7, "violet Jacket", "white", "violet"));
        people.add(new Person("Reverend", "Green", 50, "pastor dress", 1.85, "green jacket", "white", "green"));
        people.add(new Person("Mrs.", "Peacock", 67, "necklace", 1.7, "blue dress", "white", "blue"));
    }
}
