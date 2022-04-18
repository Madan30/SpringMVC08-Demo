package com.NepalCode.JavaBasedConfig;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class JavaAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class arr [] = {JavaBaseConfigFile.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String arr [] = {"/testing/*"};
		return arr;
	}

}
