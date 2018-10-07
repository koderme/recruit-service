package com.hueklr.recruitservice.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hueklr.recruitservice.model.Requirement;
import com.hueklr.recruitservice.model.RequirementJd;
import com.hueklr.recruitservice.repo.RequirementJdRepo;
import com.hueklr.recruitservice.repo.RequirementRepo;

@Component
public class RequirementServiceImpl implements RequirementService {

	private static final Logger logger = LoggerFactory.getLogger(RequirementServiceImpl.class);

	@Autowired
	private RequirementRepo reqRepo;
	@Autowired
	private RequirementJdRepo reqJdRepo;

	@Override
	public Requirement findByReqId(Long reqId) {
		Optional<Requirement> result = reqRepo.findById(reqId);
		return result.isPresent() ? result.get() : null; 
	}

	@Override
	public boolean save(Requirement req) {
		req.setRequirementCode();
		reqRepo.save(req);
		
		for (RequirementJd reqJd : req.getRequirementJdList()) {
			reqJd.setRequirement(req);
			reqJdRepo.save(reqJd);	
		}
		
		
		return true;
	}

	@Override
	public void update(Requirement req) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Requirement> getAll() {
		return (List<Requirement>) reqRepo.findAll();
	}

}
