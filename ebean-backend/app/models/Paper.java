package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.*;
import java.util.List;

@Entity
public class Paper  extends Model{
    @Id
    public Long pid;

    @Constraints.Required
    public String title;

    @ManyToMany(cascade = CascadeType.MERGE)
    public List<Author> authors;

    @ManyToMany(cascade = CascadeType.MERGE)
    public List<Tags> tags;

    public String year;

    public String pages;
    public static Find<Long, Paper> find = new Find<Long, Paper>(){};

    public static Paper getByTitle(String title) {
        return Paper.find
                .where()
                .eq("title", title)
                .findUnique();
    }

    public static List<Paper> getByYear(String year){
        return Paper.find
                .where()
                .eq("year", year)
                .findList();
    }

}
