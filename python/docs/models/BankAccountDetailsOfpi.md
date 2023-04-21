# belvo_client.model.bank_account_details_ofpi.BankAccountDetailsOfpi

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**country** | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) |  | 
**number** | str,  | str,  | The bank account number. | 
**account_type** | [**EnumBankAccountPixAccountTypeOfpi**](EnumBankAccountPixAccountTypeOfpi.md) | [**EnumBankAccountPixAccountTypeOfpi**](EnumBankAccountPixAccountTypeOfpi.md) |  | 
**agency** | str,  | str,  | The agency (branch number) of the institution where the account was created. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

