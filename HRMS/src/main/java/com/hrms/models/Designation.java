package com.hrms.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="designation_id")
	private	int id;
	@Column(name="designation_name")
	private String designationName;
	@Column(name="created_at")
	private Timestamp createdAt;
	@Column(name="modified_at")
	private Timestamp modifiedAt;
	@Column(name="deleted_at")
	private Timestamp deletedAt;
	@Column(name="is_delete")
	private int isDelete;
    @ManyToOne
	@JoinColumn(name="department_id", nullable=false)
	@Column(name="department_id")
	private Department department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignationName() {
		return designationName;
	}
	public void setDesignationName(String designationName) {
		this.designationName = designationName;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public Timestamp getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}
	public int getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(int isDelete) {
		this.isDelete = isDelete;
	}
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Designation [id=" + id + ", designationName=" + designationName + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + ", deletedAt=" + deletedAt + ", isDelete=" + isDelete + ", department="
				+ department + "]";
	}
	
}
