package com.example.springboot.advertisement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvertiserRestController {
	
	@Autowired
	AdvertiserService adService;
	
	@GetMapping("/getadvertiserList")
	public List<Advertiser> getAdvirtiserList()
	{
		return adService.getAdvertiserList();
	}

	@GetMapping("/getAdveriser")
	public Advertiser getAdvertiser(Long id)
	{
		return adService.getAdvertiser(id);
	}
	
	@PostMapping("/createAdvertiser")
	public void createAdvertiser(@RequestBody Advertiser advertiser)
	{
		adService.createAdvertiser(advertiser);
	}
	
	@PutMapping("/updateAdvertiser/{id}")
	public void updateAdvertiser(@RequestBody Advertiser advertiser,@PathVariable Long id)
	{
		adService.updateAdvertiser(advertiser,id);
	}
	
	
	@DeleteMapping("/deleteAdveriser")
	public void deleteAdveriser(@ModelAttribute("id") Long id)
	{
		adService.deleteAdvertiser(id);
	}

}
