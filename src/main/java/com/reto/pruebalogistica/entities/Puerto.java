package com.reto.pruebalogistica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "puerto")
public class Puerto {
    @Id
    private Long Id;
    @NotBlank
    private String nombre;
    @NotBlank
    private Long telefono;
    @NotBlank
    private String ubicacion;
    @OneToMany(mappedBy = "puerto", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<LogisticaMaritima> logisticaMaritima;
}
