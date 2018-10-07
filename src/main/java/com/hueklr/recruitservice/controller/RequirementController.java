package com.hueklr.recruitservice.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hueklr.recruitservice.model.Requirement;
import com.hueklr.recruitservice.service.RequirementService;

@Controller
@RequestMapping(path = RestUri.REQUIREMENTS)
public class RequirementController {

	@Autowired
	private RequirementService requirementService;

	private static final Logger logger = LoggerFactory.getLogger(RequirementController.class);

	// ---- search by id
	@GetMapping(path = "/{id}")
	public @ResponseBody ResponseEntity<Requirement> getRequirement(@PathVariable("id") Long reqId) {
		logger.info("searching for id: " + reqId);
		if (reqId == null || reqId <= 0L)
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

		Requirement req = requirementService.findByReqId(reqId);
		logger.info("result : " + req);
		return _toResponseEntity(req);
	}
	
	// ---- get all req
	@GetMapping(path = "")
	public @ResponseBody ResponseEntity<List<Requirement>> getRequirement() {
		List<Requirement> reqList = requirementService.getAll();
		logger.info("result : " + reqList);
		return _toResponseEntity(reqList);
	}
	
	// ---- save CustomerProfile
	@RequestMapping(path = "", method = RequestMethod.POST, 
			produces = MediaType.APPLICATION_JSON_UTF8_VALUE, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public @ResponseBody ResponseEntity<Boolean> save(@RequestBody Requirement reqToBeSaved) {

		logger.info("create request {}", reqToBeSaved);
		
		if (reqToBeSaved == null)
			return new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);

		boolean result = requirementService.save(reqToBeSaved);
		logger.info("result {}", result);
		return result ? new ResponseEntity<>(result, HttpStatus.OK)
				: new ResponseEntity<>(false, HttpStatus.BAD_REQUEST);
	}



	// ---- helper methods
	private ResponseEntity<Requirement> _toResponseEntity(Requirement customer) {
		return customer != null ? new ResponseEntity<Requirement>(customer, HttpStatus.OK)
				: new ResponseEntity<Requirement>(HttpStatus.NOT_FOUND);
	}

	private ResponseEntity<List<Requirement>> _toResponseEntity(List<Requirement> customerList) {
		System.out.println("list size : " + customerList.size());
		return !customerList.isEmpty() ? new ResponseEntity<List<Requirement>>(customerList, HttpStatus.OK)
				: new ResponseEntity<List<Requirement>>(HttpStatus.NOT_FOUND);
	}

}
