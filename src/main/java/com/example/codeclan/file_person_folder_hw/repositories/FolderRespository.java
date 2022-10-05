package com.example.codeclan.file_person_folder_hw.repositories;

import com.example.codeclan.file_person_folder_hw.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRespository extends JpaRepository<Folder, Long> {
}
