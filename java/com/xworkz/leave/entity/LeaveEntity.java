package com.xworkz.leave.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "leave_application")
public class LeaveEntity {
	@Id
	@Column(name = "L_ID")
	private String id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "LEAVE_FOR")
	private String leave;
	@Column(name = "REASON")
	private String reason;
	@Column(name = "START_L")
	private String start;
	@Column(name = "END_L")
	private String end;
}
