package com.sample.processor.file.csv.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sample.processor.file.csv.entity.FileData;

@Repository
public interface FileRepostory extends CrudRepository<FileData,Long>  {

}
