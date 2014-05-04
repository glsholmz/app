package models;
 
import play.*;
import play.db.jpa.*;
 
import javax.persistence.*;
import java.util.*;
 
import play.data.validation.*;
 
@Entity
public class Employee extends Model {
 	
    @Required
    @MinSize(8)
    public String Name;
	
    @Required
    @Email
    public String Email;
	
    @Required
    @MaxSize(1000)
    public String Address;

    public Integer Salary;
    
    public Date DateOfHire;

    @ManyToOne
    public Department Department;
 
    public String toString() {
        return Name;
    }
	
}