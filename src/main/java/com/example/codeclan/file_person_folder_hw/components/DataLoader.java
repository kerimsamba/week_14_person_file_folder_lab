package com.example.codeclan.file_person_folder_hw.components;

import com.example.codeclan.file_person_folder_hw.models.File;
import com.example.codeclan.file_person_folder_hw.models.Folder;
import com.example.codeclan.file_person_folder_hw.models.Person;
import com.example.codeclan.file_person_folder_hw.repositories.FileRepository;
import com.example.codeclan.file_person_folder_hw.repositories.FolderRespository;
import com.example.codeclan.file_person_folder_hw.repositories.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test") //Run every time EXCEPT Tests
@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRespository folderRespository;

    @Autowired
    PersonRespository personRespository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {

        Person michael = new Person("Micheal Caine");
        Folder topSecret = new Folder("Top Secret", michael);
        File ipcress = new File("The Ipcress Files", "txt", 200, topSecret);
        personRespository.save(michael);
        folderRespository.save(topSecret);
        fileRepository.save(ipcress);


    }
}
