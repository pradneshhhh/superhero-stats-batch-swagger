package com.superhero.stats.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.superhero.stats.dto.SuperheroStats;

@Repository
public class SuperheroStatsRepo {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public SuperheroStats getByName(String name) {
		SuperheroStats bean = null;
		try {
			bean = jdbcTemplate.queryForObject("select * from superhero_stats_new where lower(name)=?", new Object[] {name.toLowerCase()},
					new BeanPropertyRowMapper<SuperheroStats>(SuperheroStats.class));
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		return bean;
	}

	public List<SuperheroStats> getByGender(String gender) {
		List<SuperheroStats> list = null;
		try {
		list = jdbcTemplate.query(
                "select * from superhero_stats_new where lower(gender)=?",
                new Object[]{gender.toLowerCase()},
                (rs, rowNum) ->
                        new SuperheroStats(
                               rs.getInt("ID"),
                               rs.getString("NAME"),
                               rs.getString("GENDER"),
                               rs.getString("EYECOLOR"),
                               rs.getString("RACE"),
                               rs.getString("HAIRCOLOR"),
                               rs.getString("HEIGHT"),
                               rs.getString("PUBLISHER"),
                               rs.getString("SKINCOLOR"),
                               rs.getString("ALIGNMENT"),
                               rs.getString("WEIGHT")
                        )
        );}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
