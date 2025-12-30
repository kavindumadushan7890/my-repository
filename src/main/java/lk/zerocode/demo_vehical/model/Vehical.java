package lk.zerocode.demo_vehical.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Vehical {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vehicalId;

    private String colour;
    private String capacity;

    @ManyToOne
    @JoinColumn(name = "model_id" , nullable = false)
    private Model model;
}
