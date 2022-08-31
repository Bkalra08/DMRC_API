package com.Apidmrc.DMRC_API.Controller;

import com.Apidmrc.DMRC_API.Entities.PassengerDetails;
import com.Apidmrc.DMRC_API.Services.DETAILSP;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class PassengerController {

	@Autowired
	private DETAILSP DOP;


	//create


	@MutationMapping("createBook")
	public PassengerDetails create(@Argument PassengerInput pinput) {
		PassengerDetails b=new PassengerDetails();
		b.setFROM(pinput.getFROM());
		b.setTO(pinput.getTO());
		b.setFare(pinput.getFare());
		return this.DOP.create(b);
	}

	//get all

	@QueryMapping("allPassengers")
	public List<PassengerDetails> getAll() {
		return this.DOP.getAll();
	}

	//get single book
	@QueryMapping("getDetails")
	public PassengerDetails get(@Argument int bookId) {
		return this.DOP.get(bookId);
	}

}

@Getter
@Setter
class PassengerInput{
	private String FROM;
	private String TO;
	private int Fare;
}
