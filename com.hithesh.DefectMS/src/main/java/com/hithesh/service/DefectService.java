package com.hithesh.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hithesh.DTO.DefectFormDTO;
import com.hithesh.entity.Defect;
import com.hithesh.repository.DefectRepository;

@Service
public class DefectService {

	@Autowired
	DefectRepository defectRepository;

	public List<Defect> getAllDefects() {
		return defectRepository.findAll();
	}

	public void closeDefect(Integer defectId) {
		Optional<Defect> opDefect = defectRepository.findById(defectId);
		if (opDefect.isPresent()) {
			Defect defect = opDefect.get();
			defect.setStatus("Closed");
			defectRepository.saveAndFlush(defect);
		}
	}

	public Defect addDefect(DefectFormDTO defectForm) {
		Defect defect = new Defect(defectForm.getDefectCategory(), defectForm.getChgStatus(), defectForm.getDesc(),
				defectForm.getPriority(), defectForm.getStatus());
		defectRepository.saveAndFlush(defect);
		return defect;
	}

}