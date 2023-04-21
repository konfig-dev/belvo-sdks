# belvo_client.model.transaction_bank_account_body_pse.TransactionBankAccountBodyPse

Information about the payer's bank account. Belvo returns the bank account ID when the account is already saved in the Belvo database.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Information about the payer&#x27;s bank account. Belvo returns the bank account ID when the account is already saved in the Belvo database. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier for the payer’s bank account. | [optional] value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

