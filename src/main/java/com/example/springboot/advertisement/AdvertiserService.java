package com.example.springboot.advertisement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AdvertiserService {

	@Autowired
	AdvertiserRepository adRepo;
	
	public List<Advertiser> getAdvertiserList()
	{
		return (List<Advertiser>) adRepo.findAll();
	}
	
	public Advertiser getAdvertiser(Long id) {
		// TODO Auto-generated method stub
		return adRepo.findById(id).get();
	}
	
	
	public void createAdvertiser(Advertiser adertiser)
	{
		adRepo.save(adertiser);
	}


	public void updateAdvertiser(Advertiser adertiser, Long id) {
		adertiser.setId(id);
		adRepo.save(adertiser);
		
	}


	public void deleteAdvertiser(Long id) {
		adRepo.deleteById(id);
		
	}


	
	
	
}
