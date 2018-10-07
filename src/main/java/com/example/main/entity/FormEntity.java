package com.example.main.entity;

public class FormEntity {
	private Integer formId;
	private Integer userId;
	private String formName;
	private String formDesc;
	public Integer getFormId() {
		return formId;
	}
	public void setFormId(Integer formId) {
		this.formId = formId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getFormName() {
		return formName;
	}
	public void setFormName(String formName) {
		this.formName = formName;
	}
	public String getFormDesc() {
		return formDesc;
	}
	public void setFormDesc(String formDesc) {
		this.formDesc = formDesc;
	}
	@Override
	public String toString() {
		return "FormEntity [formId=" + formId + ", userId=" + userId + ", formName=" + formName + ", formDesc="
				+ formDesc + "]";
	}
	
}
