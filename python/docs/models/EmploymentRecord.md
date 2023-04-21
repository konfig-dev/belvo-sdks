# belvo_client.model.employment_record.EmploymentRecord

Emploment record response payload

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Emploment record response payload | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | The unique identifier created by Belvo for the current IMSS statement. | [optional] value must be a uuid
**link** | str, uuid.UUID,  | str,  | The unique identifier created by Belvo for the current user. | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was initially created in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**report_date** | str, date,  | str,  | The date when the employment record report was generated, in &#x60;YYYY-MM-DD&#x60; format. | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**internal_identification** | str,  | str,  | Unique ID for user according to the institution. For IMSS Mexico, this is the CURP. | [optional] 
**personal_data** | [**EmploymentRecordPersonalData**](EmploymentRecordPersonalData.md) | [**EmploymentRecordPersonalData**](EmploymentRecordPersonalData.md) |  | [optional] 
**social_security_summary** | [**EmploymentRecordSocialSecuritySummary**](EmploymentRecordSocialSecuritySummary.md) | [**EmploymentRecordSocialSecuritySummary**](EmploymentRecordSocialSecuritySummary.md) |  | [optional] 
**[employment_records](#employment_records)** | list, tuple,  | tuple,  | Details regarding the individual&#x27;s employment history. | [optional] 
**[files](#files)** | list, tuple,  | tuple,  | Additional PDF binary files relating to the individual&#x27;s employment. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# employment_records

Details regarding the individual's employment history.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Details regarding the individual&#x27;s employment history. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EmploymentRecordDetail**](EmploymentRecordDetail.md) | [**EmploymentRecordDetail**](EmploymentRecordDetail.md) | [**EmploymentRecordDetail**](EmploymentRecordDetail.md) |  | 

# files

Additional PDF binary files relating to the individual's employment.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Additional PDF binary files relating to the individual&#x27;s employment. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EmploymentRecordFile**](EmploymentRecordFile.md) | [**EmploymentRecordFile**](EmploymentRecordFile.md) | [**EmploymentRecordFile**](EmploymentRecordFile.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

