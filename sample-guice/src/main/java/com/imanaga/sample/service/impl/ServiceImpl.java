package com.imanaga.sample.service.impl;

import com.google.inject.Inject;
import com.imanaga.sample.domain.Domain;
import com.imanaga.sample.service.Service;

public class ServiceImpl implements Service {

	@Inject
	Domain domain;

	@Override
	public void start() {
		System.out.println("start service");

		domain.start();
	}
}
