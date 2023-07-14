package com.api.pruebaptm.apiPrueba.service;

import com.api.pruebaptm.apiPrueba.dto.productoDTO;
import com.api.pruebaptm.apiPrueba.model.producto;
import com.api.pruebaptm.apiPrueba.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private traduceObjeto traduceObjeto;
    @Autowired
    private ProductoRepository productoRepository;
    public productoDTO save(productoDTO productoDTO){

           return traduceObjeto.crearProductoDTO(productoRepository.save(traduceObjeto.crearProducto(productoDTO)));
    }


    public List<productoDTO> findAll(){

      return  traduceObjeto.crearProductosDTO(productoRepository.findAll());
    }



    public productoDTO findById(Integer id){

       return traduceObjeto.crearProductoDTO(productoRepository.findById(id).get());
    }

    public void deleteById(Integer id){
productoRepository.deleteById(id);

    }

    public productoDTO updateById(productoDTO productoDTO, int id){

        productoDTO actualizarProducto = traduceObjeto.crearProductoDTO(productoRepository.findById(id).get());

        if (!actualizarProducto.equals("null")){
        actualizarProducto.setNombre(productoDTO.getNombre());
        actualizarProducto.setDescripcion(productoDTO.getDescripcion());
        actualizarProducto.setPrecio(productoDTO.getPrecio());
        return traduceObjeto.crearProductoDTO(productoRepository.save(traduceObjeto.crearProducto(productoDTO)));}else
            return actualizarProducto;

    }


}

