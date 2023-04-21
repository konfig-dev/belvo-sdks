# belvo_client.model.employment_record_personal_data.EmploymentRecordPersonalData

Details regarding the personal information of the individual.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the personal information of the individual. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**official_name** | None, str,  | NoneClass, str,  | The legal name of the individual  | [optional] 
**first_name** | None, str,  | NoneClass, str,  | The first name of the individual.  | [optional] 
**last_name** | None, str,  | NoneClass, str,  | The last name of the individual.  | [optional] 
**email** | None, str,  | NoneClass, str,  | The email address of the individual (as provided in the initial POST request).  | [optional] 
**birth_date** | None, str, date,  | NoneClass, str,  | The date of the birth of the individual, in &#x60;YYYY-MM-DD&#x60; format.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**entitlements** | [**EmploymentRecordEntitlement**](EmploymentRecordEntitlement.md) | [**EmploymentRecordEntitlement**](EmploymentRecordEntitlement.md) |  | [optional] 
**[document_ids](#document_ids)** | list, tuple,  | tuple,  | Details regarding the individual&#x27;s ID documents. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# document_ids

Details regarding the individual's ID documents.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Details regarding the individual&#x27;s ID documents. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EmploymentRecordDocumentId**](EmploymentRecordDocumentId.md) | [**EmploymentRecordDocumentId**](EmploymentRecordDocumentId.md) | [**EmploymentRecordDocumentId**](EmploymentRecordDocumentId.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

