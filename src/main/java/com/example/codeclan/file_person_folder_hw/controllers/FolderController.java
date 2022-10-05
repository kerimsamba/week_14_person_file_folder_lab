package com.example.codeclan.file_person_folder_hw.controllers;

import com.example.codeclan.file_person_folder_hw.models.File;
import com.example.codeclan.file_person_folder_hw.models.Folder;
import com.example.codeclan.file_person_folder_hw.repositories.FileRepository;
import com.example.codeclan.file_person_folder_hw.repositories.FolderRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {
    @Autowired
    FolderRespository folderRepository;


    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){

        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){

        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/folder")
    public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
