package com.challenge.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.challenge.entity.Submission;
import com.challenge.repository.SubmissionRepository;
import com.challenge.service.interfaces.SubmissionServiceInterface;

public class SubmissionService implements SubmissionServiceInterface{

	@Autowired
	private SubmissionRepository submissionRepository;
	
	@Override
	public Submission save(Submission object) {
		// TODO Auto-generated method stub
		return submissionRepository.save(object);
	}

	@Override
	public BigDecimal findHigherScoreByChallengeId(Long challengeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Submission> findByChallengeIdAndAccelerationId(Long challengeId, Long accelerationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
