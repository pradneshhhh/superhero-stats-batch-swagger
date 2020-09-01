package com.superhero.stats.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.superhero.stats.dto.SuperheroStats;
import com.superhero.stats.exception.NameNotFoundException;
import com.superhero.stats.service.SuperheroStatsService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SuperheroStatsController {
	
	@Autowired
	private SuperheroStatsService service;
	
	@GetMapping("/api/stats/byname/{name}")
	@ApiOperation(value = "Find Superhero Stats by Superhero Name")
	public SuperheroStats getStatsByName(@PathVariable (name="name") String name){
		SuperheroStats superheroStats = service.getByName(name);
		if(superheroStats==null) {
			throw new NameNotFoundException("Stats not found for Marvel character : "+name);
		}
		return superheroStats;
	}
	
	@GetMapping("/api/stats/bygender/{gender}")
	@ApiOperation(value = "Find Superhero Stats list by Superhero Gender")
	public List<SuperheroStats> getStatsByGender(@PathVariable (name="gender") String gender){
		return service.getByGender(gender);
	}
		
}
