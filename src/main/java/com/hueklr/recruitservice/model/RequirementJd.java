package com.hueklr.recruitservice.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="requirement_jd")
public class RequirementJd implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7303230527070001366L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "requirement_jd_id")
	private Long requirementJdId;

	@Column(name = "req_jd_type")
	private String reqJdType;

	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name="requirement_id", nullable=false)
	private Requirement requirement;

	// Constructors
	public RequirementJd() {
		super();
	}

	// Getter / Setter

	public Long getRequirementJdId() {
		return requirementJdId;
	}

	public void setRequirementJdId(Long requirementJdId) {
		this.requirementJdId = requirementJdId;
	}

	public String getReqJdType() {
		return reqJdType;
	}

	public void setReqJdType(String reqJdType) {
		this.reqJdType = reqJdType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Requirement getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}

	@Override
	public String toString() {
		return "RequirementJd [reqJdType=" + reqJdType + ", description=" + description + ", requirement=" + requirement
				+ "]";
	}

		
}
