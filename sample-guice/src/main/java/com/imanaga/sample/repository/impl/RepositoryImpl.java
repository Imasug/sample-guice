package com.imanaga.sample.repository.impl;

import com.imanaga.sample.repository.Repository;

public class RepositoryImpl implements Repository {

	@Override
	public void start() {
		System.out.println("start repository");
	}
}
