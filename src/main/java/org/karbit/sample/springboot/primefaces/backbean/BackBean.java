package org.karbit.sample.springboot.primefaces.backbean;

import javax.annotation.PostConstruct;

import org.karbit.sample.springboot.primefaces.config.scope.ViewScoped;

import org.springframework.stereotype.Component;

@Component
@ViewScoped
public class BackBean {

	private String value;

	@PostConstruct
	public void doAfterConstruction() {
		System.out.println("doAfterConstruction");
	}

	public void buttonAction() {
		System.out.println("buttonAction");
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
