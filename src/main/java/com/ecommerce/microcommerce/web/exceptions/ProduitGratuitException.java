package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.OK)
public class ProduitGratuitException extends BeanCreationException {

	public ProduitGratuitException(String s) {
		super(s);
	}
}
