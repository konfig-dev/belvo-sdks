# belvo_client.model.employment_record_social_security_summary.EmploymentRecordSocialSecuritySummary

Details regarding the individual's social security contributions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the individual&#x27;s social security contributions. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**weeks_redeemed** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Number of weeks the individual needed to take out of their pension.  | [optional] value must be a 32 bit integer
**weeks_reinstated** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Number of weeks the individual has paid back into their pension (*AFORE*), after having redeemed them previously.  | [optional] value must be a 32 bit integer
**weeks_contributed** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | Number of weeks the individual has contributed to their social security, based on the number of weeks the individual has worked according to IMSS.  | [optional] value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

