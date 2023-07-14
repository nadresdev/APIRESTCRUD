package com.api.pruebaptm.apiPrueba.model;




import com.api.pruebaptm.apiPrueba.dto.productoDTO;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
@Table(name="productos")
public class producto {

   @Id  //para que mysql genere automaticamente el id
   @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;
    private String nombre;
    private String descripcion;

    private Double precio;

    public producto(productoDTO productoDTO) {
        this.id = productoDTO.getId();
        this.nombre = productoDTO.getNombre();
        this.descripcion = productoDTO.getDescripcion();
        this.precio = productoDTO.getPrecio();
    }
}
