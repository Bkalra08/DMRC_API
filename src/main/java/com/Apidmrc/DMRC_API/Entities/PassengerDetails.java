package com.Apidmrc.DMRC_API.Entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "dmrcapi")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PassengerDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Pid;
	private String FROM;
	private String TO;
	private int Fare;


}
