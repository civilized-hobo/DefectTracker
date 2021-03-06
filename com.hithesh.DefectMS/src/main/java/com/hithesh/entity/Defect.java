package com.hithesh.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Defect")
public class Defect {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="defect_id", updatable = false, nullable = false)
	private Integer defectId;
	
	@Column(name="category")
	private String category;
	
	@Column(name="chgstatus")
	private String chgstatus;
	
	@Column(name="description")
	private String description;
	
	@Column(name="priority")
	private Integer priority;
	
	@Column(name="status")
	private String status;

	public Integer getDefectId() {
		return defectId;
	}

	public void setDefectId(Integer defectId) {
		this.defectId = defectId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getChgstatus() {
		return chgstatus;
	}

	public void setChgstatus(String chgstatus) {
		this.chgstatus = chgstatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Defect(String category, String chgstatus, String description, Integer priority,
			String status) {
		super();
		this.category = category;
		this.chgstatus = chgstatus;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}

	public Defect(Integer defectId, String category, String chgstatus, String description, Integer priority,
			String status) {
		super();
		this.defectId = defectId;
		this.category = category;
		this.chgstatus = chgstatus;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}

	public Defect() {
		super();
	}

	@Override
	public String toString() {
		return "Defect [defectId=" + defectId + ", category=" + category + ", chgstatus=" + chgstatus + ", description="
				+ description + ", priority=" + priority + ", status=" + status + "]";
	}
	
	
	
}
