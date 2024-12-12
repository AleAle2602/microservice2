package com.microservice.drivers.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
@Table(name = "tc_drivers")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uniqueId;

    @Getter
    @Setter
    @Column(name = "driver_name")
    @JsonProperty("driver_name")
    private String driverName;

}
