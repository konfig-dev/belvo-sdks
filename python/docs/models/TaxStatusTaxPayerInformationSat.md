# belvo_client.model.tax_status_tax_payer_information_sat.TaxStatusTaxPayerInformationSat

Details regarding the taxpayer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the taxpayer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**status_padron** | None, str,  | NoneClass, str,  | Status of the taxpayer in the Federal Register of Taxpayers (RFC). Can be &#x60;ACTIVO&#x60; or &#x60;INACTIVO&#x60;. | 
**last_status_change_date** | None, str, date,  | NoneClass, str,  | Date when &#x60;status_padron&#x60; was most recently updated.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**rfc** | None, str,  | NoneClass, str,  | The tax payers&#x27;s identification number (For Mexico, this is the RFC).  | 
**start_operations_date** | None, str, date,  | NoneClass, str,  | Date when the tax payer commenced taxable commercial activities.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**curp** | None, str,  | NoneClass, str,  | The tax payers&#x27;s *Clave Única de Registro de Población* (CURP) number.  | [optional] 
**name** | None, str,  | NoneClass, str,  | The tax payers&#x27;s first name. | [optional] 
**first_last_name** | None, str,  | NoneClass, str,  | The tax payers&#x27;s first last name. | [optional] 
**second_last_name** | None, str,  | NoneClass, str,  | The tax payers&#x27;s second last name. | [optional] 
**commercial_name** | None, str,  | NoneClass, str,  | The name of the business designated for consumers and the general public.  **Note**: Only applicable for businesses.  | [optional] 
**social_name** | None, str,  | NoneClass, str,  | The unique and exclusive name within the national territory that companies receive for legal or administrative purposes. **Note**: Only applicable for businesses. | [optional] 
**email** | None, str,  | NoneClass, str,  | Contact email address for the tax payer. | [optional] 
**phone** | None, str,  | NoneClass, str,  | Contact phone number for the tax payer. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

