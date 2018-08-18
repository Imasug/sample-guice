package com.imanaga.sample.config;

import com.google.inject.AbstractModule;
import com.imanaga.sample.domain.Domain;
import com.imanaga.sample.domain.impl.DomainImpl;
import com.imanaga.sample.repository.Repository;
import com.imanaga.sample.repository.impl.RepositoryImpl;

public class BeanConfig extends AbstractModule {

	@Override
	protected void configure() {

		bind(Domain.class).to(DomainImpl.class);

		bind(Repository.class).to(RepositoryImpl.class);
	}
}
