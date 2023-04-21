# belvo_client.model.accounts_receivables_data.AccountsReceivablesData

Additional details regarding the receivables account, if applicable.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Additional details regarding the receivables account, if applicable. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**current** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total sum of all receivables (&#x60;available&#x60; + &#x60;anticipated&#x60;) | value must be a 32 bit float
**available** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount that the owner of the account will receive according to an established date. | value must be a 32 bit float
**anticipated** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount that the owner of the account received earlier than contracted. | value must be a 32 bit float
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

