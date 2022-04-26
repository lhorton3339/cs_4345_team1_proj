package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Paper  extends Model{
    @Id
    public Long pid;

    @Constraints.Required
    public String title;

    @ManyToMany(cascade = CascadeType.MERGE)
    public List<Author> authors;

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
