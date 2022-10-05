package com.example.codeclan.file_person_folder_hw;

import com.example.codeclan.file_person_folder_hw.models.File;
import com.example.codeclan.file_person_folder_hw.models.Folder;
import com.example.codeclan.file_person_folder_hw.models.Person;
import com.example.codeclan.file_person_folder_hw.repositories.FileRepository;
import com.example.codeclan.file_person_folder_hw.repositories.FolderRespository;
import com.example.codeclan.file_person_folder_hw.repositories.PersonRespository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ActiveProfiles("test") //Indicates it's a test profile so will not run DataLoader
@SpringBootTest
class FilePersonFolderHwApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRespository folderRespository;

	@Autowired
	PersonRespository personRespository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createFileFolderAndPerson(){
		Person michael = new Person("Micheal Caine");
		Folder topSecret = new Folder("Top Secret", michael);
		File ipcress = new File("The Ipcress Files", "txt", 200, topSecret);
		personRespository.save(michael);
		folderRespository.save(topSecret);
		fileRepository.save(ipcress);
	}

}
