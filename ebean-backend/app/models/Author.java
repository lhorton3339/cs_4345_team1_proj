package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.Constraint;
import java.util.List;

@Entity
public class Author extends Model {
    @Id
    public long aid;

    @Constraints.Required
    public String name;

    @ManyToMany(mappedBy = "authors")
    @JsonBackReference
    List<Paper> papers;

    public List<Paper> getPapers(){return papers;};

    public static Find<String, Author> find = new Find<String, Author>(){};

    public static List<Author> getByName(String name){
        return Author.find.where().like("name", "%"+name+"%").findList();
    }
}
