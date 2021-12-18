package hiber.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "Car")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @Column()
    private String model;

    @Column()
    private int series;

    public Car (String model, int series) {
        this.model = model;
        this.series = series;
    }

}