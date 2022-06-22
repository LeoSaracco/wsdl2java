package ar.com.cdt.dataaccess.services;

import java.math.BigDecimal;
import java.math.BigInteger;

public interface IServices {

	public String numberToDollars(BigDecimal valor);
	
	public String numberToWords(BigInteger valor);
}
