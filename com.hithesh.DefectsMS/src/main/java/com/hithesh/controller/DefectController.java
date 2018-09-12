package com.hithesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hithesh.DTO.DefectFormDTO;
import com.hithesh.entity.Defect;
import com.hithesh.service.DefectService;

@RestController
public class DefectController {
	@Autowired
	DefectService defectService;
	
	@RequestMapping(value = "/defects/addDefect", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Defect addDefect(@RequestBody DefectFormDTO defectForm) {
		return defectService.addDefect(defectForm);
	}
	
	@RequestMapping(value="/defects/getAllDefects", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Defect> getAllDefects(){
		return defectService.getAllDefects();
	}
	
	@RequestMapping(value="/defects/updateDefect/{defectId}", method = RequestMethod.PUT)
	public void updateDefect(@PathVariable("defectId") Integer defectId) {
		defectService.closeDefect(defectId);
	}
}
