# belvo_client.model.bank_account_information_pse.BankAccountInformationPse

Information about the payer's bank account. Belvo returns this object when the payer's bank account information is not saved in the Belvo database. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Information about the payer&#x27;s bank account. Belvo returns this object when the payer&#x27;s bank account information is not saved in the Belvo database.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**bank_account_information** | [**BankAccountInformationContentPse**](BankAccountInformationContentPse.md) | [**BankAccountInformationContentPse**](BankAccountInformationContentPse.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

