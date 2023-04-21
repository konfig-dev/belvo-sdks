# belvo_client.model.tax_return_personal.TaxReturnPersonal

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**receipt_pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. | 
**[dividendos](#dividendos)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding dividends. | 
**pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | Tax return PDF as a binary. | 
**[servicios_profesionales](#servicios_profesionales)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the income and tax information from professional services provided. | 
**[determinacion_impuesto](#determinacion_impuesto)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the final tax return. | 
**[informacion_general](#informacion_general)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information on the tax return (year, RFC, return type, person/company name, and so on). | 
**[deducciones_personales](#deducciones_personales)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | List of all personal tax deductions. | 
**[retenciones](#retenciones)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details on the already withheld taxes. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**[sueldos_salarios](#sueldos_salarios)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the income information together combined with withheld taxes. | 
**id** | str, uuid.UUID,  | str,  | Unique identifier created by Belvo used to reference the current Tax Return. | [optional] value must be a uuid
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; the statement belongs to | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**[datos_informativos](#datos_informativos)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Extra informative data on the tax return. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# informacion_general

General information on the tax return (year, RFC, return type, person/company name, and so on).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information on the tax return (year, RFC, return type, person/company name, and so on). | 

# sueldos_salarios

Details regarding the income information together combined with withheld taxes.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the income information together combined with withheld taxes. | 

# servicios_profesionales

Details regarding the income and tax information from professional services provided.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the income and tax information from professional services provided. | 

# deducciones_personales

List of all personal tax deductions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | List of all personal tax deductions. | 

# determinacion_impuesto

Details regarding the final tax return.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the final tax return. | 

# retenciones

Details on the already withheld taxes.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details on the already withheld taxes. | 

# dividendos

Details regarding dividends.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding dividends. | 

# datos_informativos

Extra informative data on the tax return.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Extra informative data on the tax return. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

