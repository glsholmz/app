package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
@Entity
public class Department extends Model {

  public String Name;
  public String Description; 

  public String toString() {
        return Name;
    }

}