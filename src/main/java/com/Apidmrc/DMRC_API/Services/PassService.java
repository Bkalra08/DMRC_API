package com.Apidmrc.DMRC_API.Services;

import com.Apidmrc.DMRC_API.Entities.PassengerDetails;
import com.Apidmrc.DMRC_API.Repositories.Details;
import com.Apidmrc.DMRC_API.Services.DETAILSP;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassService implements DETAILSP {

	@Autowired
	private Details detailRepo;


	public PassService(Details detailRepo) {
		this.detailRepo = detailRepo;
	}

	@Override
	public PassengerDetails create(PassengerDetails pdetails) {
		return this.detailRepo.save(pdetails);
	}
//
//    @Override
//    public PassengerDetails create(PassengerDetails pdetails) {
//        return null;
//    }

	@Override
	public List<PassengerDetails> getAll() {
		return this.detailRepo.findAll();
	}

	@Override
	public PassengerDetails get(int Pid) {
		return this.detailRepo.findById(Pid).orElseThrow(() -> new RuntimeException("Book you are looking for not found on server !!"));
	}
}
