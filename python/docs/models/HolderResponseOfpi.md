# belvo_client.model.holder_response_ofpi.HolderResponseOfpi

Details regarding the bank account holder.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the bank account holder. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[information](#information)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**type** | [**EnumBankAccountHolderTypeOfpi**](EnumBankAccountHolderTypeOfpi.md) | [**EnumBankAccountHolderTypeOfpi**](EnumBankAccountHolderTypeOfpi.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# information

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[HolderInformationBusinessOfpiResponse](HolderInformationBusinessOfpiResponse.md) | [**HolderInformationBusinessOfpiResponse**](HolderInformationBusinessOfpiResponse.md) | [**HolderInformationBusinessOfpiResponse**](HolderInformationBusinessOfpiResponse.md) |  | 
[HolderInformationIndividualOfpiResponse](HolderInformationIndividualOfpiResponse.md) | [**HolderInformationIndividualOfpiResponse**](HolderInformationIndividualOfpiResponse.md) | [**HolderInformationIndividualOfpiResponse**](HolderInformationIndividualOfpiResponse.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

