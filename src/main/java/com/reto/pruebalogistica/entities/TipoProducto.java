package com.reto.pruebalogistica.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tipo-producto")
public class TipoProducto {
    @Id
    private Long Id;
    private String nombre;
    private String descripcion;
    @OneToMany(mappedBy = "tipoProducto", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<LogisticaMaritima> logisticaMaritima;
    @OneToMany(mappedBy = "tipoProducto", cascade = CascadeType.ALL,orphanRemoval = true)
    @JsonIgnore
    private List<LogisticaCamiones> logisticaCamiones;
}
