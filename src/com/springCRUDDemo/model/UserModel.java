package com.springCRUDDemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="user")
public class UserModel {

	@Id
	@GeneratedValue
	@Column(name = "id", length = 11 )
	private String Id;
	@Column(name="Code")
	private String Code;
	@Column(name="FirstName")
	private String FirstName;
	@Column(name="MiddleName")
	private String MiddleName;
	@Column(name="LastName")
	private String LastName;
	@Column(name="Name")
	private String Name;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
	@Column(name="Role")
	private String Role;
	@Column(name="DeviceID")
	private String DeviceID;
	@Column(name="JSON")
	private String JSON;
	@Column(name="Status")
	private String Status;
	@Column(name="CreatedBy")
	private String CreatedBy;
	@Column(name="DateCreated")
	@JsonFormat(pattern = "yyyy-MM-dd,HH:00", timezone = JsonFormat.DEFAULT_TIMEZONE)
	public Date  DateCreated;
	@Column(name="ModifiedBy")
	private String ModifiedBy;
	@Column(name="DateModified")
	@JsonFormat(pattern = "yyyy-MM-dd,HH:00", timezone = JsonFormat.DEFAULT_TIMEZONE)
	public Date DateModified;
	@Column(name="UpdateCount")
	private String UpdateCount;
	@Column(name="fkCompanyCode")
	private String fkCompanyCode;
	@Column(name="ResetPassword")
	private boolean ResetPassword;
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String id, String code, String firstName,
			String middleName, String lastName, String name, String email,
			String password, String role, String deviceID, String jSON,
			String status, String createdBy, Date dateCreated,
			String modifiedBy, Date dateModified, String updateCount,
			String fkCompanyCode, boolean resetPassword) {
		super();
		Id = id;
		Code = code;
		FirstName = firstName;
		MiddleName = middleName;
		LastName = lastName;
		Name = name;
		Email = email;
		Password = password;
		Role = role;
		DeviceID = deviceID;
		JSON = jSON;
		Status = status;
		CreatedBy = createdBy;
		DateCreated = dateCreated;
		ModifiedBy = modifiedBy;
		DateModified = dateModified;
		UpdateCount = updateCount;
		this.fkCompanyCode = fkCompanyCode;
		ResetPassword = resetPassword;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getDeviceID() {
		return DeviceID;
	}

	public void setDeviceID(String deviceID) {
		DeviceID = deviceID;
	}

	public String getJSON() {
		return JSON;
	}

	public void setJSON(String jSON) {
		JSON = jSON;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCreatedBy() {
		return CreatedBy;
	}

	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}

	public Date getDateCreated() {
		return DateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		DateCreated = dateCreated;
	}

	public String getModifiedBy() {
		return ModifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		ModifiedBy = modifiedBy;
	}

	public Date getDateModified() {
		return DateModified;
	}

	public void setDateModified(Date dateModified) {
		DateModified = dateModified;
	}

	public String getUpdateCount() {
		return UpdateCount;
	}

	public void setUpdateCount(String updateCount) {
		UpdateCount = updateCount;
	}

	public String getFkCompanyCode() {
		return fkCompanyCode;
	}

	public void setFkCompanyCode(String fkCompanyCode) {
		this.fkCompanyCode = fkCompanyCode;
	}

	public boolean isResetPassword() {
		return ResetPassword;
	}

	public void setResetPassword(boolean resetPassword) {
		ResetPassword = resetPassword;
	}
	
	
}
