package datamodel;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @since J2SE-1.8
 CREATE TABLE employee (
  id INT NOT NULL AUTO_INCREMENT,    
  name VARCHAR(30) NOT NULL,   
  age INT NOT NULL,    
  PRIMARY KEY (id));
 */
@Entity
@Table(name = "MyTable1021Nelson")
public class Employee {

   @Id  // primary key
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id") // specify the column name. Without it, it will use method name
   private Integer id;

   @Column(name = "first_name")
   private String first_name;

   @Column(name = "last_name")
   private String last_name;
   
   @Column(name = "phone")
   private String phone;
   
   @Column(name = "email")
   private String email;

   public Employee() {
   }

   public Employee(Integer id, String first_nameIn, String last_nameIn, String phoneIn, String emailIn) {
      this.id = id;
      this.first_name = first_nameIn;
      this.last_name = last_nameIn;
      this.phone = phoneIn;
      this.email = emailIn;
      
   }

   public Employee(String first_nameIn, String last_nameIn, String phoneIn, String emailIn) {
	   this.first_name = first_nameIn;
	   this.last_name = last_nameIn;
	   this.phone = phoneIn;
	   this.email = emailIn;
      
   }

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return first_name + ", " + last_name;
   }

   public void setName(String first, String last) {
      this.first_name = first;
      this.last_name = last;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String in) {
      this.phone = in;
   }

   public String getEmail() {
	      return email;
	   }

	   public void setEmail(String in) {
	      this.email = in;
	   }

   @Override
   public String toString() {
      return "Employee: " + this.id + ", " + this.first_name + ", " + this.last_name + ", " + this.phone + ", " + this.email;
   }
}