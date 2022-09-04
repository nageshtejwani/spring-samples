package com.sample.processor.file.csv.mapper;

import com.sample.processor.file.csv.entity.FileData;
import com.sample.processor.file.csv.model.CSVDTO;

public interface CSVMapper {

	CSVDTO mapCSVdata(FileData fileData);
}
