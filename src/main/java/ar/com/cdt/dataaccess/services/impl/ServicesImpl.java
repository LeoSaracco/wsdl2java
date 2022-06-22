package ar.com.cdt.dataaccess.services.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.stereotype.Service;

import ar.com.cdt.dataaccess.services.IServices;
import ar.com.cdt.wsdl2java.NumberConversion;
import ar.com.cdt.wsdl2java.NumberConversionSoapType;

@Service
public class ServicesImpl implements IServices {

	@Override
	public String numberToDollars(BigDecimal valor) {
		NumberConversion service = new NumberConversion();
		NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);	
		return port.numberToDollars(valor);
	}

	@Override
	public String numberToWords(BigInteger valor) {
		NumberConversion service = new NumberConversion();
		NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
		return port.numberToWords(valor);
	}
}
