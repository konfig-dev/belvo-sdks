# belvo_client.model.employment_record_employment_status_updates.EmploymentRecordEmploymentStatusUpdates

Details regarding any employment changes of the individual.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding any employment changes of the individual. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**event** | [**EnumEmploymentRecordStatusUpdateEvents**](EnumEmploymentRecordStatusUpdateEvents.md) | [**EnumEmploymentRecordStatusUpdateEvents**](EnumEmploymentRecordStatusUpdateEvents.md) |  | [optional] 
**base_salary** | decimal.Decimal, int, float,  | decimal.Decimal,  | The base salary of the individual, current as of the &#x60;update_date&#x60;.  | [optional] value must be a 32 bit float
**update_date** | str, date,  | str,  | The date that the employment event occured, in &#x60;YYYY-MM-DD&#x60; format.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

