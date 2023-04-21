# belvo_client.model.receivables_transaction_account.ReceivablesTransactionAccount

Basic information about the account associated with the transaction.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Basic information about the account associated with the transaction. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**institution** | [**InstitutionAccount**](InstitutionAccount.md) | [**InstitutionAccount**](InstitutionAccount.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the account associated with the transaction. | value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

