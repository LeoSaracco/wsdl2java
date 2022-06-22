package ar.com.cdt.dataaccess.controller;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.cdt.dataaccess.services.IServices;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/converter")
public class NumberConverterController {

	@Autowired
	IServices services;

	@GetMapping("/numberToDollars/{valor}")
	public String numberToDollars(@PathVariable("valor") BigDecimal valor) {
		return services.numberToDollars(valor);
	}

	@GetMapping("/numberToWords/{valor}")
	public String numberToWords(@PathVariable("valor") BigInteger valor) {
		return services.numberToWords(valor);
	}
}
