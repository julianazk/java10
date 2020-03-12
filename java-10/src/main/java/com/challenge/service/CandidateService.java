package com.challenge.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.repository.CandidateRepository;
import com.challenge.service.interfaces.CandidateServiceInterface;
import com.challenge.entity.Candidate;
import com.challenge.entity.CandidateId;

@Service
public class CandidateService implements CandidateServiceInterface{
	
	@Autowired
	private CandidateRepository candidateRepository;

	@Override
	public Candidate save(Candidate object) {
		// TODO Auto-generated method stub
		return candidateRepository.save(object);
	}

	@Override
	public Optional<Candidate> findById(CandidateId id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Candidate> findById(Long userId, Long companyId, Long accelerationId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> findByCompanyId(Long companyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Candidate> findByAccelerationId(Long accelerationId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}