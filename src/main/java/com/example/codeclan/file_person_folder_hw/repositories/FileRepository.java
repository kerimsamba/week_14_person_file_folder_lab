package com.example.codeclan.file_person_folder_hw.repositories;

import com.example.codeclan.file_person_folder_hw.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
