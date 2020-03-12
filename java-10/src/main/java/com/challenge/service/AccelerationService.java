package com.challenge.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.repository.AccelerationRepository;
import com.challenge.service.interfaces.AccelerationServiceInterface;
import com.challenge.entity.Acceleration;

@Service
public class AccelerationService implements AccelerationServiceInterface{
	
	@Autowired
	private AccelerationRepository accelerationRepository;
	
	@Override
	public Acceleration save(Acceleration object) {
		// TODO Auto-generated method stub
		return accelerationRepository.save(object);
	}

	@Override
	public Optional<Acceleration> findById(Long id) {
		// TODO Auto-generated method stub
		return accelerationRepository.findById(id);
	}

	@Override
	public List<Acceleration> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		//return accelerationRepository.findById(companyId);
		return null;
	}

}