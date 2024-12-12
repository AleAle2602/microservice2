package com.microservice.permissions.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashMap;
import java.util.Map;


@Data
@Entity
@Builder
@Table(name = "permissions") // Nombre de la tabla en la base de datos
@AllArgsConstructor
@NoArgsConstructor
public class Permission {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Clave primaria auto-generada
    private Long id;

    @Transient
    private final LinkedHashMap<String, Long> data = new LinkedHashMap<>();

    @Setter
    @Getter
    @Column(name = "owner_class")
    @JsonProperty("owner_class")
    private String ownerClassName;

    @Setter
    @Getter
    @Column(name = "owner_id")
    @JsonProperty("owner_id")
    private long ownerId;

    @Setter
    @Getter
    @Column(name = "property_class")
    @JsonProperty("property_class")
    private String propertyClassName;

    @Setter
    @Getter
    @Column(name = "property_id")
    @JsonProperty("property_id")
    private long propertyId;

/*    public Permission(
            String ownerClassName, long ownerId,
            String propertyClassName, long propertyId) {
        this.ownerClassName = ownerClassName;
        this.ownerId = ownerId;
        this.propertyClassName = propertyClassName;
        this.propertyId = propertyId;
        data.put(ownerClassName, ownerId);
        data.put(propertyClassName, propertyId);
    }*/

    @JsonAnyGetter
    public Map<String, Long> getData() {
        return data;
    }

    @JsonAnySetter
    public void setData(String key, Long value) {
        data.put(key, value);
    }

    
}
