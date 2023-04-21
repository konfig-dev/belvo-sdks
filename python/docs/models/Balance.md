# belvo_client.model.balance.Balance

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the balance request. | [optional] value must be a uuid
**account** | [**Account**](Account.md) | [**Account**](Account.md) |  | [optional] 
**value_date** | str, date,  | str,  | The date when the &#x60;balance&#x60; was available, in &#x60;YYYY-MM-DD&#x60; format. | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**balance** | decimal.Decimal, int, float,  | decimal.Decimal,  | The funds available in the account by the end of the &#x60;value_date&#x60;. | [optional] value must be a 32 bit float
**current_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | *This field has been deprecated. Please use the &#x60;balance&#x60; field instead.*  | [optional] 
**statement** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The ID of the banking statement used to extract the &#x60;balance&#x60;.*  | [optional] 
**collected_at** | None, str, datetime,  | NoneClass, str,  | This field has been deprecated.  The ISO-8601 timestamp when the data point was collected.  | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

