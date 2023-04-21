# belvo_client.model.create_bank_account_ofpi.CreateBankAccountOfpi

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**institution** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the institution that the bank account is created in. | value must be a uuid
**[details](#details)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Information regarding the bank account. | 
**[holder](#holder)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Information regarding the individual bank account holder. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# holder

Information regarding the individual bank account holder.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Information regarding the individual bank account holder. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BankAccountHolderRequestOfpi](BankAccountHolderRequestOfpi.md) | [**BankAccountHolderRequestOfpi**](BankAccountHolderRequestOfpi.md) | [**BankAccountHolderRequestOfpi**](BankAccountHolderRequestOfpi.md) |  | 

# details

Information regarding the bank account.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | Information regarding the bank account. | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BankAccountDetailsOfpi](BankAccountDetailsOfpi.md) | [**BankAccountDetailsOfpi**](BankAccountDetailsOfpi.md) | [**BankAccountDetailsOfpi**](BankAccountDetailsOfpi.md) |  | 
[BankAccountDetailsOfpiPix](BankAccountDetailsOfpiPix.md) | [**BankAccountDetailsOfpiPix**](BankAccountDetailsOfpiPix.md) | [**BankAccountDetailsOfpiPix**](BankAccountDetailsOfpiPix.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

