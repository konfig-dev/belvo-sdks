# belvo_client.model.tax_return_business_monthly.TaxReturnBusinessMonthly

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[detalle_pago_isr](#detalle_pago_isr)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information on the monthly provisional payments for the income tax. | 
**pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | Tax return PDF as a binary. | 
**[informacion_general](#informacion_general)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information regarding the tax return (year, RFC, return type, person/company name, and so on). | 
**[determinacion_iva](#determinacion_iva)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information used to calculate the provisional VAT tax for the period. | 
**[determinacion_isr](#determinacion_isr)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information used to calculate the provisional income tax for the period. | 
**type** | None, str,  | NoneClass, str,  | The type of tax return. Can be either monthly or annual. | 
**[detalle_pago_iva](#detalle_pago_iva)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information on the monthly provisional payments for the VAT tax. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Unique identifier created by Belvo used to reference the current Tax Return. | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**receipt_pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# informacion_general

General information regarding the tax return (year, RFC, return type, person/company name, and so on).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information regarding the tax return (year, RFC, return type, person/company name, and so on). | 

# determinacion_isr

Information used to calculate the provisional income tax for the period.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information used to calculate the provisional income tax for the period. | 

# detalle_pago_isr

Information on the monthly provisional payments for the income tax.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information on the monthly provisional payments for the income tax. | 

# determinacion_iva

Information used to calculate the provisional VAT tax for the period.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information used to calculate the provisional VAT tax for the period. | 

# detalle_pago_iva

Information on the monthly provisional payments for the VAT tax.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Information on the monthly provisional payments for the VAT tax. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

