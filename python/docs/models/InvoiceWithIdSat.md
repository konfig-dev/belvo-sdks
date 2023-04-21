# belvo_client.model.invoice_with_id_sat.InvoiceWithIdSat

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**tax_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount of tax for this invoice (sum of each item&#x27;s &#x60;tax_amount&#x60;).  | value must be a 32 bit float
**discount_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount discounted in this invoice.  | value must be a 32 bit float
**receiver_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice receiver. | 
**[payments](#payments)** | list, tuple,  | tuple,  | A list detailing all the invoice payments.  | 
**invoice_identification** | None, str,  | NoneClass, str,  | The fiscal institution&#x27;s unique ID for the invoice. | 
**sender_name** | None, str,  | NoneClass, str,  | The name of the invoice sender. | 
**type** | [**EnumInvoiceType**](EnumInvoiceType.md) | [**EnumInvoiceType**](EnumInvoiceType.md) |  | 
**sender_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice sender | 
**invoice_date** | None, str, date,  | NoneClass, str,  | The date of the invoice. | value must conform to RFC-3339 full-date YYYY-MM-DD
**receiver_name** | None, str,  | NoneClass, str,  | The name of the invoice receiver. | 
**currency** | None, str,  | NoneClass, str,  | The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar)  | 
**invoice_type** | [**EnumInvoiceSatInvoiceType**](EnumInvoiceSatInvoiceType.md) | [**EnumInvoiceSatInvoiceType**](EnumInvoiceSatInvoiceType.md) |  | 
**[invoice_details](#invoice_details)** | list, tuple,  | tuple,  | A list of descriptions for each item (purchased product or service provided) in the invoice.  | 
**exchange_rate** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The exchange rate used in this invoice for the currency.  | value must be a 32 bit float
**certification_authority** | None, str,  | NoneClass, str,  | The fiscal ID of the certification provider.  | 
**cancelation_status** | None, str,  | NoneClass, str,  | If the invoice is cancelled, this field indicates the status of the cancellation. | 
**subtotal_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The pretax amount of this invoice (sum of each item&#x27;s &#x60;pre_tax_amount&#x60;).  | value must be a 32 bit float
**cancelation_update_date** | None, str, date,  | NoneClass, str,  | The date of the invoice cancelation.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**payment_type** | None, str,  | NoneClass, str,  | The payment type code used for this invoice, as defined by the country legal entity.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payment-type)  | 
**total_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;) | value must be a 32 bit float
**payroll** | [**InvoicesPayrollSat**](InvoicesPayrollSat.md) | [**InvoicesPayrollSat**](InvoicesPayrollSat.md) |  | 
**payment_type_description** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  | 
**certification_date** | None, str, date,  | NoneClass, str,  | The date of the fiscal certification.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**status** | None, str,  | NoneClass, str,  | The status of the invoice. Can be either *Vigente* (valid) or *Cancelado* (cancelled). | 
**version** | None, str,  | NoneClass, str,  | The CFDI version of the invoice.  | [optional] 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier used to reference the current invoice. | [optional] value must be a uuid
**link** | str,  | str,  | The &#x60;link.id&#x60; the invoice belongs to. | [optional] 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**sender_tax_fraud_status** | None, str,  | NoneClass, str,  | Indicates whether or not the sender is on SAT&#x27;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#x27;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#x27;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#x27;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#x27;s regulations). | [optional] 
**receiver_tax_fraud_status** | None, str,  | NoneClass, str,  | Indicates whether or not the receiver is on SAT&#x27;s tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#x27;s regulations.&lt;br&gt;&lt;br&gt; SAT updates the tax fraud list every three months. &lt;br&gt;&lt;br&gt; For more information regarding the reason&#x27;s a taxpayer can be put on the tax fraud list, please see [Article 69](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69.html) and [Article 69-B](http://omawww.sat.gob.mx/cifras_sat/Paginas/datos/vinculo.html?page&#x3D;ListCompleta69B.html) of Mexico&#x27;s Código Fiscal de la Federación. &lt;br&gt;&lt;br&gt; Possible statuses are: - &#x60;INVESTIGATING&#x60; &lt;br&gt; The fiscal institution has identified irregularities and open an investigation regarding the taxpayer. &lt;br&gt; - &#x60;DISMISSED&#x60; &lt;br&gt; The fiscal institution has investigated the taxpayer and declared them innocent. &lt;br&gt; - &#x60;CONFIRMED&#x60; &lt;br&gt; The fiscal institution has confirmed that the taxpayer is guilty. &lt;br&gt; - &#x60;OVERTURNED&#x60; &lt;br&gt; The fiscal institution has reassessed a previously confirmed taxpayer and, based on new evidence, has taken the taxpayer off the tax fraud list. &lt;br&gt; - &#x60;NO_TAX_FRAUD_STATUS&#x60; &lt;br&gt; The receiver or sender is not found in the list (in other words, they are complying with the fiscal institution&#x27;s regulations). | [optional] 
**payment_method** | [**EnumInvoiceSatPaymentMethod**](EnumInvoiceSatPaymentMethod.md) | [**EnumInvoiceSatPaymentMethod**](EnumInvoiceSatPaymentMethod.md) |  | [optional] 
**payment_method_description** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The description of the payment method used for this invoice.*  | [optional] 
**usage** | None, str,  | NoneClass, str,  | The invoice&#x27;s usage code, as defined by the legal entity of the country.   - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#usage)  | [optional] 
**place_of_issue** | None, str,  | NoneClass, str,  | The postcode of where the invoice was issued.  | [optional] 
**folio** | None, str,  | NoneClass, str,  | The internal control number that the taxpayer assigns to the invoice.  | [optional] 
**xml** | None, str,  | NoneClass, str,  | XML of the invoice document.  | [optional] 
**warnings** | [**InvoiceWarningsSat**](InvoiceWarningsSat.md) | [**InvoiceWarningsSat**](InvoiceWarningsSat.md) |  | [optional] 
**sender_blacklist_status** | None, str,  | NoneClass, str,  | This field has been deprecated. Please use &#x60;sender_tax_fraud_status&#x60; instead.  | [optional] 
**receiver_blacklist_status** | None, str,  | NoneClass, str,  | This field has been deprecated. Please use &#x60;receiver_tax_fraud_status&#x60; instead.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# invoice_details

A list of descriptions for each item (purchased product or service provided) in the invoice. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of descriptions for each item (purchased product or service provided) in the invoice.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoiceDetailSat**](InvoiceDetailSat.md) | [**InvoiceDetailSat**](InvoiceDetailSat.md) | [**InvoiceDetailSat**](InvoiceDetailSat.md) |  | 

# payments

A list detailing all the invoice payments. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list detailing all the invoice payments.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoicesPaymentsSat**](InvoicesPaymentsSat.md) | [**InvoicesPaymentsSat**](InvoicesPaymentsSat.md) | [**InvoicesPaymentsSat**](InvoicesPaymentsSat.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

