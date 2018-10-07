package com.hueklr.recruitservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hueklr.recruitservice.model.Requirement;
import com.hueklr.recruitservice.repo.RequirementRepo;

@Component
public class RequirementServiceImpl implements RequirementService {
	
	@Autowired
	private RequirementRepo reqRepo;

	@Override
	public Requirement findByReqId(Long reqId) {
		Optional<Requirement> result = reqRepo.findById(reqId);
		return result.isPresent() ? result.get() : null; 
	}

	@Override
	public boolean save(Requirement req) {
		reqRepo.save(req);
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
