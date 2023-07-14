package com.api.pruebaptm.apiPrueba.controller;

import com.api.pruebaptm.apiPrueba.dto.productoDTO;
import com.api.pruebaptm.apiPrueba.model.producto;
import com.api.pruebaptm.apiPrueba.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/producto")
public class productoController {

    @Autowired
    private ProductoService productoService;

    @PostMapping("/save")
    public ResponseEntity<productoDTO> save(@RequestBody productoDTO productoDTO){

        return  new ResponseEntity<>(productoService.save(productoDTO), HttpStatus.CREATED);
    }



    @GetMapping("findById/{id}")
    public ResponseEntity<productoDTO> findById(@PathVariable  Integer id){

        try {
            return  new ResponseEntity<>(productoService.findById(id),HttpStatus.OK) ;
        }catch (Exception ex){

            return  new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
        }

    }
@DeleteMapping("/deleteById/{id}")
    public ResponseEntity<productoDTO> deleteById(@PathVariable  Integer id){

        try {
           productoService.deleteById(id);
           return new ResponseEntity<>(HttpStatus.OK) ;
        }catch (Exception ex){

            return  new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
        }

    }


    @PutMapping("/updateById/{id}")
    public ResponseEntity<productoDTO> updateById(@RequestBody productoDTO productoDTO, @PathVariable int id){


        try {
            productoService.updateById(productoDTO,id);
            return  new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception ex){

            return  new ResponseEntity<>(HttpStatus.NOT_FOUND) ;
        }
    }
}
