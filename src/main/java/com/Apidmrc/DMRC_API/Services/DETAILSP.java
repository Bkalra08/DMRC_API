package com.Apidmrc.DMRC_API.Services;

import com.Apidmrc.DMRC_API.Entities.PassengerDetails;

import java.util.List;

public interface DETAILSP {

	//create
	PassengerDetails create(PassengerDetails pdetails);

	//get all
	List<PassengerDetails> getAll();

	//get single book
	PassengerDetails get(int Pid);

}
