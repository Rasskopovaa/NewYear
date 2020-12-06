package app.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Entity
@Data
@Table(name = "WISHES")
@NoArgsConstructor

@Accessors(chain = true)
public class Wish {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "title")
    private String title;

}
