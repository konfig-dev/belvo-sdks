# belvo_client.model.employment_record_detail.EmploymentRecordDetail

Details regarding the individual's employment history.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the individual&#x27;s employment history. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**employer** | str,  | str,  | The official name of the employer.  | [optional] 
**employer_id** | str,  | str,  | The official ID of the employer, according to the country.  | [optional] 
**start_date** | str, date,  | str,  | Date when employment started, in &#x60;YYYY-MM-DD&#x60; format.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**end_date** | str, date,  | str,  | Date when employment finished, in &#x60;YYYY-MM-DD&#x60; format.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**weeks_employed** | decimal.Decimal, int,  | decimal.Decimal,  | Number of weeks that the individual was employed.  | [optional] value must be a 32 bit integer
**state** | str,  | str,  | In what geographical state the individual was employed, according to the country.  | [optional] 
**most_recent_base_salary** | decimal.Decimal, int, float,  | decimal.Decimal,  | The most recent base salary the individual earned.  For Mexico, this is the *daily* rate that the individual earned, including the perks that the individual is entitled to throughout the year.  | [optional] value must be a 32 bit float
**monthly_salary** | decimal.Decimal, int, float,  | decimal.Decimal,  | The monthly salary of the individual, including any additional perks.  | [optional] value must be a 32 bit float
**currency** | str,  | str,  | The three-letter currency code in which the salary is paid.  | [optional] 
**[employment_status_updates](#employment_status_updates)** | list, tuple,  | tuple,  | Details regarding any employment changes of the individual. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# employment_status_updates

Details regarding any employment changes of the individual.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Details regarding any employment changes of the individual. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EmploymentRecordEmploymentStatusUpdates**](EmploymentRecordEmploymentStatusUpdates.md) | [**EmploymentRecordEmploymentStatusUpdates**](EmploymentRecordEmploymentStatusUpdates.md) | [**EmploymentRecordEmploymentStatusUpdates**](EmploymentRecordEmploymentStatusUpdates.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

