# belvo_client.model.invoices_payments_sat.InvoicesPaymentsSat

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**date** | None, str, datetime,  | NoneClass, str,  | ISO-8601 timestamp when the payment was made.  | value must conform to RFC-3339 date-time
**[related_documents](#related_documents)** | list, tuple,  | tuple,  | A list of all the related deferred invoices affected by the payment.  | 
**amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The invoice amount, in the currency of the original invoice.  | value must be a 32 bit float
**payment_type** | None, str,  | NoneClass, str,  | Payment type code used for this invoice, as defined by the country&#x27;s legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type)  | 
**exchange_rate** | None, str,  | NoneClass, str,  | The &#x60;currency&#x60; to MXN currency exchange rate when the payment was made.  | 
**payer_account_number** | None, str,  | NoneClass, str,  | The bank account number of the payment issuer.  | 
**payer_rfc** | None, str,  | NoneClass, str,  | The fiscal ID of the payment issuer.  | 
**currency** | None, str,  | NoneClass, str,  | The currency of the payment. For example:  - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)  Please note that other currencies other than in the list above may be returned.  | 
**beneficiary_account_number** | None, str,  | NoneClass, str,  | The bank account number of the payment beneficiary.  | 
**operation_number** | None, str,  | NoneClass, str,  | The fiscal institution&#x27;s internal identifier for the operation.  | 
**payer_bank_name** | None, str,  | NoneClass, str,  | The banking institution that was used by the payment issuer.  | 
**beneficiary_rfc** | None, str,  | NoneClass, str,  | The fiscal ID of the payment beneficiary.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# related_documents

A list of all the related deferred invoices affected by the payment. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of all the related deferred invoices affected by the payment.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoicesPaymentsRelatedDocumentsSat**](InvoicesPaymentsRelatedDocumentsSat.md) | [**InvoicesPaymentsRelatedDocumentsSat**](InvoicesPaymentsRelatedDocumentsSat.md) | [**InvoicesPaymentsRelatedDocumentsSat**](InvoicesPaymentsRelatedDocumentsSat.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

