# belvo_client.model.bank_account_ofpi_response.BankAccountOfpiResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**institution** | None, str, uuid.UUID,  | NoneClass, str,  | Belvo&#x27;s unique ID for the institution that the bank account is created in. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;. | value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**[details](#details)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**holder** | [**HolderResponseOfpi**](HolderResponseOfpi.md) | [**HolderResponseOfpi**](HolderResponseOfpi.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current bank account. | value must be a uuid
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the bank account. | value must be a uuid
**customer** | None, str, uuid.UUID,  | NoneClass, str,  | Belvo&#x27;s unique ID for the customer associated with the bank account. For &#x60;BUSINESS&#x60; bank accounts, this field is &#x60;null&#x60;. | value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BankAccountDetailsOfpi](BankAccountDetailsOfpi.md) | [**BankAccountDetailsOfpi**](BankAccountDetailsOfpi.md) | [**BankAccountDetailsOfpi**](BankAccountDetailsOfpi.md) |  | 
[BankAccountDetailsOfpiPix](BankAccountDetailsOfpiPix.md) | [**BankAccountDetailsOfpiPix**](BankAccountDetailsOfpiPix.md) | [**BankAccountDetailsOfpiPix**](BankAccountDetailsOfpiPix.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

