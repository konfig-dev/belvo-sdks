# belvo_client.model.tax_return_business.TaxReturnBusiness

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**receipt_pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. | 
**[cifras_cierre_ejercicio](#cifras_cierre_ejercicio)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding key numbers at the end of the fiscal exercise. | 
**pdf** | None, bytes, io.FileIO, io.BufferedReader,  | NoneClass, bytes, FileIO,  | Tax return PDF as a binary. | 
**[determinacion_del_impuesto_sobre_la_renta](#determinacion_del_impuesto_sobre_la_renta)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the final tax return. | 
**[detalle_pago_r1_isr_personas_morales](#detalle_pago_r1_isr_personas_morales)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details of the tax payment. | 
**[estado_posicion_financiera_balance](#estado_posicion_financiera_balance)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding balance sheet of the legal entity. | 
**[informacion_general](#informacion_general)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information regarding the tax return (year, RFC, return type, person/company name, and so on). | 
**[estado_resultados](#estado_resultados)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Detailed information about the legal entity&#x27;s yearly profit and loss. | 
**[conciliacion_entre_resultado_contable_fiscal](#conciliacion_entre_resultado_contable_fiscal)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the accounting reconciliation. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Unique identifier created by Belvo used to reference the current Tax Return. | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**[datos_adicionales](#datos_adicionales)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Additional data regarding the tax return. | [optional] 
**[deducciones_autorizadas](#deducciones_autorizadas)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the legal entity&#x27;s deductions. | [optional] 
**[dividendos_o_utilidades_distribuidos](#dividendos_o_utilidades_distribuidos)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding distributed dividends. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# informacion_general

General information regarding the tax return (year, RFC, return type, person/company name, and so on).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | General information regarding the tax return (year, RFC, return type, person/company name, and so on). | 

# estado_resultados

Detailed information about the legal entity's yearly profit and loss.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Detailed information about the legal entity&#x27;s yearly profit and loss. | 

# estado_posicion_financiera_balance

Details regarding balance sheet of the legal entity.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding balance sheet of the legal entity. | 

# conciliacion_entre_resultado_contable_fiscal

Details regarding the accounting reconciliation.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the accounting reconciliation. | 

# cifras_cierre_ejercicio

Details regarding key numbers at the end of the fiscal exercise.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding key numbers at the end of the fiscal exercise. | 

# determinacion_del_impuesto_sobre_la_renta

Details regarding the final tax return.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the final tax return. | 

# detalle_pago_r1_isr_personas_morales

Details of the tax payment.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details of the tax payment. | 

# datos_adicionales

Additional data regarding the tax return.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Additional data regarding the tax return. | 

# deducciones_autorizadas

Details regarding the legal entity's deductions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the legal entity&#x27;s deductions. | 

# dividendos_o_utilidades_distribuidos

Details regarding distributed dividends.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding distributed dividends. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

