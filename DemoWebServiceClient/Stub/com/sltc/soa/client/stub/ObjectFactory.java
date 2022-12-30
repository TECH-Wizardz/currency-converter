
package com.sltc.soa.client.stub;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sltc.soa.client.stub package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ExchangeRate_QNAME = new QName("http://soa.sltc.com/", "exchangeRate");
    private final static QName _CurrencyConverter_QNAME = new QName("http://soa.sltc.com/", "currencyConverter");
    private final static QName _ExchangeRateResponse_QNAME = new QName("http://soa.sltc.com/", "exchangeRateResponse");
    private final static QName _CurrencyConverterResponse_QNAME = new QName("http://soa.sltc.com/", "currencyConverterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sltc.soa.client.stub
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExchangeRateResponse }
     * 
     */
    public ExchangeRateResponse createExchangeRateResponse() {
        return new ExchangeRateResponse();
    }

    /**
     * Create an instance of {@link CurrencyConverter }
     * 
     */
    public CurrencyConverter createCurrencyConverter() {
        return new CurrencyConverter();
    }

    /**
     * Create an instance of {@link ExchangeRate }
     * 
     */
    public ExchangeRate createExchangeRate() {
        return new ExchangeRate();
    }

    /**
     * Create an instance of {@link CurrencyConverterResponse }
     * 
     */
    public CurrencyConverterResponse createCurrencyConverterResponse() {
        return new CurrencyConverterResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "exchangeRate")
    public JAXBElement<ExchangeRate> createExchangeRate(ExchangeRate value) {
        return new JAXBElement<ExchangeRate>(_ExchangeRate_QNAME, ExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverter }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverter")
    public JAXBElement<CurrencyConverter> createCurrencyConverter(CurrencyConverter value) {
        return new JAXBElement<CurrencyConverter>(_CurrencyConverter_QNAME, CurrencyConverter.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "exchangeRateResponse")
    public JAXBElement<ExchangeRateResponse> createExchangeRateResponse(ExchangeRateResponse value) {
        return new JAXBElement<ExchangeRateResponse>(_ExchangeRateResponse_QNAME, ExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConverterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soa.sltc.com/", name = "currencyConverterResponse")
    public JAXBElement<CurrencyConverterResponse> createCurrencyConverterResponse(CurrencyConverterResponse value) {
        return new JAXBElement<CurrencyConverterResponse>(_CurrencyConverterResponse_QNAME, CurrencyConverterResponse.class, null, value);
    }

}
