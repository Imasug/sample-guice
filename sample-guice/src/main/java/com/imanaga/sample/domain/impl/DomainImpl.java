package com.imanaga.sample.domain.impl;

import com.google.inject.Inject;
import com.imanaga.sample.domain.Domain;
import com.imanaga.sample.repository.Repository;

public class DomainImpl implements Domain {

	@Inject
	Repository repository;

	@Override
	public void start() {
		System.out.println("start domain");

		repository.start();
	}
}
