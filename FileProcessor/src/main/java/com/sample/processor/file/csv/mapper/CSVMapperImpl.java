package com.sample.processor.file.csv.mapper;

import org.springframework.stereotype.Component;

import com.sample.processor.file.csv.entity.FileData;
import com.sample.processor.file.csv.model.CSVDTO;

@Component
public class CSVMapperImpl implements CSVMapper{

	@Override
	public CSVDTO mapCSVdata(FileData fileData) {
	
		CSVDTO csvDTO = new CSVDTO();
		csvDTO.setDuplicateRows(fileData.getDuplicateRows());
		csvDTO.setDuplicateUserIds(fileData.getDuplicateUserIds());
		csvDTO.setUniqueUserIds(fileData.getUniqueUserIds());
		return csvDTO;
	}

}
