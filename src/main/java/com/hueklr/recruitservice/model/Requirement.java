package com.hueklr.recruitservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requirement")
public class Requirement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "requirement_id")
	private Long requirementId;

	@Column(name = "requirement_code")
	private String requirementCode;

	@Column(name = "client_code")
	private String clientCode;

	@Column(name = "job_source_hub_code")
	private String jobSourceHubCode;

	@Column(name = "location_code")
	private String locationCode;

	@Column(name = "interview_addr")
	private String interviewAddr;

	@Column(name = "role")
	private String role;

	@Column(name = "min_ctc")
	private Integer minCtc;

	@Column(name = "max_ctc")
	private Integer maxCtc;

	@Column(name = "min_exp")
	private Integer minExp;

	@Column(name = "max_exp")
	private Integer maxExp;

	@Column(name = "number_of_positions")
	private Integer numberOfPositions;

	@Column(name = "comment1")
	private String comment1;

	@Column(name = "comment2")
	private String comment2;

	public Long getRequirementId() {
		return requirementId;
	}

	public void setRequirementId(Long requirementId) {
		this.requirementId = requirementId;
	}

	public String getRequirementCode() {
		return requirementCode;
	}

	public void setRequirementCode(String requirementCode) {
		this.requirementCode = requirementCode;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getJobSourceHubCode() {
		return jobSourceHubCode;
	}

	public void setJobSourceHubCode(String jobSourceHubCode) {
		this.jobSourceHubCode = jobSourceHubCode;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getInterviewAddr() {
		return interviewAddr;
	}

	public void setInterviewAddr(String interviewAddr) {
		this.interviewAddr = interviewAddr;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getMinCtc() {
		return minCtc;
	}

	public void setMinCtc(Integer minCtc) {
		this.minCtc = minCtc;
	}

	public Integer getMaxCtc() {
		return maxCtc;
	}

	public void setMaxCtc(Integer maxCtc) {
		this.maxCtc = maxCtc;
	}

	public Integer getMinExp() {
		return minExp;
	}

	public void setMinExp(Integer minExp) {
		this.minExp = minExp;
	}

	public Integer getMaxExp() {
		return maxExp;
	}

	public void setMaxExp(Integer maxExp) {
		this.maxExp = maxExp;
	}

	public Integer getNumberOfPositions() {
		return numberOfPositions;
	}

	public void setNumberOfPositions(Integer numberOfPositions) {
		this.numberOfPositions = numberOfPositions;
	}

	public String getComment1() {
		return comment1;
	}

	public void setComment1(String comment1) {
		this.comment1 = comment1;
	}

	public String getComment2() {
		return comment2;
	}

	public void setComment2(String comment2) {
		this.comment2 = comment2;
	}

	public Requirement(Long requirementId, String requirementCode, String clientCode, String jobSourceHubCode,
			String locationCode, String interviewAddr, String role, Integer minCtc, Integer maxCtc, Integer minExp,
			Integer maxExp, Integer numberOfPositions, String comment1, String comment2) {
		super();
		this.requirementId = requirementId;
		this.requirementCode = requirementCode;
		this.clientCode = clientCode;
		this.jobSourceHubCode = jobSourceHubCode;
		this.locationCode = locationCode;
		this.interviewAddr = interviewAddr;
		this.role = role;
		this.minCtc = minCtc;
		this.maxCtc = maxCtc;
		this.minExp = minExp;
		this.maxExp = maxExp;
		this.numberOfPositions = numberOfPositions;
		this.comment1 = comment1;
		this.comment2 = comment2;
	}

	public Requirement() {
		super();
	}

	@Override
	public String toString() {
		return "Requirement [requirementId=" + requirementId + ", requirementCode=" + requirementCode + ", clientCode="
				+ clientCode + ", jobSourceHubCode=" + jobSourceHubCode + ", locationCode=" + locationCode
				+ ", interviewAddr=" + interviewAddr + ", role=" + role + ", minCtc=" + minCtc + ", maxCtc=" + maxCtc
				+ ", minExp=" + minExp + ", maxExp=" + maxExp + ", numberOfPositions=" + numberOfPositions
				+ ", comment1=" + comment1 + ", comment2=" + comment2 + "]";
	}

	
}