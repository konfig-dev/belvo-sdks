# belvo_client.model.accounts_funds_data.AccountsFundsData

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | None, str,  | NoneClass, str,  | The pension fund name. | [optional] 
**type** | None, str,  | NoneClass, str,  | Type of pension fund. | [optional] 
**[public_identifications](#public_identifications)** | list, tuple, None,  | tuple, NoneClass,  | The fund&#x27;s public IDs. | [optional] 
**balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount in the fund. | [optional] value must be a 32 bit float
**percentage** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | How much this fund, as a percentage, contributes to the pension account&#x27;s total. | [optional] value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# public_identifications

The fund's public IDs.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | The fund&#x27;s public IDs. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AccountsFundsDataPublicIdentifications**](AccountsFundsDataPublicIdentifications.md) | [**AccountsFundsDataPublicIdentifications**](AccountsFundsDataPublicIdentifications.md) | [**AccountsFundsDataPublicIdentifications**](AccountsFundsDataPublicIdentifications.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

