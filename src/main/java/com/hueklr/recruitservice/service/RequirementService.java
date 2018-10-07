package com.hueklr.recruitservice.service;

import java.util.List;

import com.hueklr.recruitservice.model.Requirement;

public interface RequirementService {

	// Requirement
	public Requirement findByReqId(Long reqId);
	public List<Requirement> getAll();

	public boolean save(Requirement req);
	public void update(Requirement req);
	
}
	
	
