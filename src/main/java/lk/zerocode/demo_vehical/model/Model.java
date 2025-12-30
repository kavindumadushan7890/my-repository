package lk.zerocode.demo_vehical.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long modelId;

    private String model;



    @ManyToOne
    @JoinColumn(name = "brand_id" , nullable = false)
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "type_id" , nullable = false)
    private Type type;
}
