# belvo_client.model.beneficiary_bank_account_pse.BeneficiaryBankAccountPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the beneficiary bank account. | [optional] value must be a uuid
**institution** | None, str, uuid.UUID,  | NoneClass, str,  | Belvo&#x27;s unique ID for the institution that the bank account is created in. | [optional] value must be a uuid
**number** | None, str,  | NoneClass, str,  | The bank account number. | [optional] 
**holder** | [**HolderBusinessResponsePse**](HolderBusinessResponsePse.md) | [**HolderBusinessResponsePse**](HolderBusinessResponsePse.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

