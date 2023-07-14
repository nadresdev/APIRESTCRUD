package com.api.pruebaptm.apiPrueba.dto;


import com.api.pruebaptm.apiPrueba.model.producto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class productoDTO {
   private Integer id;
    private String nombre;
    private String descripcion;

    private Double precio;

    public productoDTO(producto producto) {
        this.id = producto.getId();
        this.nombre = producto.getNombre();
        this.descripcion = producto.getDescripcion();
        this.precio = producto.getPrecio();
    }
}
