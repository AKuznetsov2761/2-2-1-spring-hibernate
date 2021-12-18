package hiber.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Users")
@Getter
@Setter
@NoArgsConstructor
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;

   @OneToOne
   @JoinColumn(name = "car_Id")
   private Car car;

   @Column(name = "email")
   private String email;

   @Column(name = "name")
   private String firstName;

   @Column(name = "last_name")
   private String lastName;


   public User (String firstName, String lastName, String email) {
      this.firstName = firstName;
      this.lastName = lastName;
      this.email = email;
   }


   @Override
   public String toString () {
      return car != null ? "id=" + id +
              "\nfirstName='" + firstName + '\'' +
              "\nlastName='" + lastName + '\'' +
              "\nemail='" + email + '\'' +
              "\ncar=" + car +
              "\n\n" :
              "id=" + id +
                      "\nfirstName='" + firstName + '\'' +
                      "\nlastName='" + lastName + '\'' +
                      "\nemail='" + email + '\'' +
                      "\nNO Car" +
                      "\n\n";
   }
}