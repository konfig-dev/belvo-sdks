# belvo_client.model.holder_business_response_pse.HolderBusinessResponsePse

Details regarding the business bank account holder.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the business bank account holder. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**information** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**type** | [**EnumBankAccountHolderTypePse**](EnumBankAccountHolderTypePse.md) | [**EnumBankAccountHolderTypePse**](EnumBankAccountHolderTypePse.md) |  | 
**Information** | [**HolderInformationBusinessPseResponse**](HolderInformationBusinessPseResponse.md) | [**HolderInformationBusinessPseResponse**](HolderInformationBusinessPseResponse.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

