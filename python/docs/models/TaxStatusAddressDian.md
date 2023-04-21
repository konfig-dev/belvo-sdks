# belvo_client.model.tax_status_address_dian.TaxStatusAddressDian

The tax payer's address details.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | The tax payer&#x27;s address details. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**postal_code** | None, str,  | NoneClass, str,  | The postcode of the address.  | 
**street_type** | None, str,  | NoneClass, str,  | The &#x60;street&#x60; type. | [optional] 
**street** | None, str,  | NoneClass, str,  | The tax payers street. | [optional] 
**exterior_number** | None, str,  | NoneClass, str,  | The street number. | [optional] 
**interior_number** | None, str,  | NoneClass, str,  | Additional address information. | [optional] 
**suburb** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**locality** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**municipality** | None, str,  | NoneClass, str,  | The municipality of the address. | [optional] 
**state** | None, str,  | NoneClass, str,  | The state that the address is in. | [optional] 
**[between_street](#between_street)** | list, tuple, None,  | tuple, NoneClass,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# between_street

**Note**: This field is not applicable for DIAN Colombia and will return `null`. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TaxStatusAddressBetweenStreetDian**](TaxStatusAddressBetweenStreetDian.md) | [**TaxStatusAddressBetweenStreetDian**](TaxStatusAddressBetweenStreetDian.md) | [**TaxStatusAddressBetweenStreetDian**](TaxStatusAddressBetweenStreetDian.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

