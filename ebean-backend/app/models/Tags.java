package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Tags extends Model {
    @Id
    public long tid;

    @Constraints.Required
    public String tag;

    @ManyToMany(mappedBy = "tags")
    @JsonBackReference
    List<Paper> papers;

    public List<Paper> getPapers(){return papers;};

    public static Model.Find<String, Tags> find = new Model.Find<String, Tags>(){};

    public static List<Tags> getByTag(String tag){
        return Tags.find
                .where()
                .like("tag", "%"+tag+"%")
                .findList();
    }
}
