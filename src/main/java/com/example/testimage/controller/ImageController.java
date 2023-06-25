package com.example.testimage.controller;

import com.example.testimage.entity.Image;
import com.example.testimage.repository.ImageRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;

@RequiredArgsConstructor
@Api(value = "UPLOAD IMAGE")
@RestController
@RequestMapping("images")
public class ImageController {

    private final ImageRepository imageRepository;


    @PostMapping
    public ResponseEntity<?> insert(@RequestPart("image") MultipartFile file) {

        try {

            Image img = new Image();
            img.setImage(file.getBytes());

            imageRepository.save(img);

            return ResponseEntity.noContent().build();
        }catch (Exception e){
            throw new RuntimeException("Erro ao salvar imagem na base de dados: "+e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resource> findById(Long id) {

        try {

            Image img = imageRepository.findById(id).get();
            HttpHeaders headers = new HttpHeaders();
            headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
            headers.add("Pragma", "no-cache");
            headers.add("Expires", "0");

            ByteArrayResource resource = new ByteArrayResource(img.getImage());
            return ResponseEntity.ok().headers(headers).contentType(MediaType
                    .parseMediaType("application/octet-stream")).body(resource);
        }catch (Exception e){
            throw new RuntimeException("Erro ao buscar imagem na base de dados: "+e.getMessage());
        }
    }

}

