# belvo_client.model.create_customer_ofpi.CreateCustomerOfpi

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**customer_type** | [**EnumCustomerType**](EnumCustomerType.md) | [**EnumCustomerType**](EnumCustomerType.md) |  | 
**country** | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) | [**EnumPaymentsCountry**](EnumPaymentsCountry.md) |  | 
**identifier** | str,  | str,  | The document number of the customer&#x27;s ID.  | 
**identifier_type** | [**EnumCustomerIdentifierTypeOfpi**](EnumCustomerIdentifierTypeOfpi.md) | [**EnumCustomerIdentifierTypeOfpi**](EnumCustomerIdentifierTypeOfpi.md) |  | 
**name** | str,  | str,  | The full name of the customer you want to create.  | 
**email** | str,  | str,  | The customer&#x27;s email address.  | 
**address** | None, str,  | NoneClass, str,  | The customer&#x27;s physical address.  | [optional] 
**phone** | None, str,  | NoneClass, str,  | The customer&#x27;s phone number.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

