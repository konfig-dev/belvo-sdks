# belvo_client.model.employment_record_entitlement.EmploymentRecordEntitlement

Details regarding the benefits the individual is entitled to.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the benefits the individual is entitled to. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**entitled_to_health_insurance** | bool,  | BoolClass,  | Indicated whether or not the individual is entitled to health insurance.  | [optional] 
**entitled_to_company_benefits** | bool,  | BoolClass,  | Indicates whether or not the individual is entitled to company benefits.  | [optional] 
**valid_until** | None, str, date,  | NoneClass, str,  | Date until when the individual is covered by health insurance and/or company benefits. If &#x60;null&#x60; the employee is currently working and no end date is required.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**status** | [**EnumEmploymentRecordStatus**](EnumEmploymentRecordStatus.md) | [**EnumEmploymentRecordStatus**](EnumEmploymentRecordStatus.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

