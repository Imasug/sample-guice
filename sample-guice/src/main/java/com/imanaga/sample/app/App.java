package com.imanaga.sample.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.imanaga.sample.config.BeanConfig;
import com.imanaga.sample.service.Service;
import com.imanaga.sample.service.impl.ServiceImpl;

public class App {

	public static void main(String[] args) {

		Injector injector = Guice.createInjector(new BeanConfig());
		Service service = injector.getInstance(ServiceImpl.class);
		service.start();
	}
}
