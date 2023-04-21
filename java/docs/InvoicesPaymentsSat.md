

# InvoicesPaymentsSat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | **OffsetDateTime** | ISO-8601 timestamp when the payment was made.  |  |
|**paymentType** | **String** | Payment type code used for this invoice, as defined by the country&#39;s legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type)  |  |
|**currency** | **String** | The currency of the payment. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)  Please note that other currencies other than in the list above may be returned.  |  |
|**exchangeRate** | **String** | The &#x60;currency&#x60; to MXN currency exchange rate when the payment was made.  |  |
|**amount** | **Float** | The invoice amount, in the currency of the original invoice.  |  |
|**operationNumber** | **String** | The fiscal institution&#39;s internal identifier for the operation.  |  |
|**beneficiaryRfc** | **String** | The fiscal ID of the payment beneficiary.  |  [optional] |
|**beneficiaryAccountNumber** | **String** | The bank account number of the payment beneficiary.  |  |
|**payerRfc** | **String** | The fiscal ID of the payment issuer.  |  |
|**payerAccountNumber** | **String** | The bank account number of the payment issuer.  |  |
|**payerBankName** | **String** | The banking institution that was used by the payment issuer.  |  |
|**relatedDocuments** | [**List&lt;InvoicesPaymentsRelatedDocumentsSat&gt;**](InvoicesPaymentsRelatedDocumentsSat.md) | A list of all the related deferred invoices affected by the payment.  |  |



