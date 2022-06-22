package ar.com.cdt.dataaccess;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;

import ar.com.cdt.wsdl2java.NumberConversion;
import ar.com.cdt.wsdl2java.NumberConversionSoapType;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		final NumberConversion service = new NumberConversion();
		final NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);
		System.out.println("$12.22 ---> " + port.numberToDollars(BigDecimal.valueOf(12.22)));
		System.out.println("22 ---> " + port.numberToWords(BigInteger.valueOf(22)));
	}
}
