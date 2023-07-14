package com.api.pruebaptm.apiPrueba.service;

import com.api.pruebaptm.apiPrueba.dto.productoDTO;
import com.api.pruebaptm.apiPrueba.model.producto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class traduceObjeto {
    public producto crearProducto(productoDTO productoDTO){

        return new producto(productoDTO);
    }

    public productoDTO crearProductoDTO(producto producto){

        return new productoDTO(producto);
    }


    public List<productoDTO> crearProductosDTO(List<producto> listaProductos){
        List<productoDTO> listProductosDTO = new ArrayList<>();

        listaProductos.stream().forEach(
                Producto ->{
                    listProductosDTO.add((productoDTO) crearProductosDTO((List<producto>) Producto));
                }

        );
        return listProductosDTO;
    }





}
