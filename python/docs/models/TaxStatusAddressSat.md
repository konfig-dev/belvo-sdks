# belvo_client.model.tax_status_address_sat.TaxStatusAddressSat

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
**suburb** | None, str,  | NoneClass, str,  | The suburb of the tax payer.  | [optional] 
**locality** | None, str,  | NoneClass, str,  | The locality of the address.  | [optional] 
**municipality** | None, str,  | NoneClass, str,  | The municipality of the address. | [optional] 
**state** | None, str,  | NoneClass, str,  | The state that the address is in. | [optional] 
**[between_street](#between_street)** | list, tuple, None,  | tuple, NoneClass,  | Additional information about where the &#x60;street&#x60; is located.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# between_street

Additional information about where the `street` is located. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Additional information about where the &#x60;street&#x60; is located.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**TaxStatusAddressBetweenStreetSat**](TaxStatusAddressBetweenStreetSat.md) | [**TaxStatusAddressBetweenStreetSat**](TaxStatusAddressBetweenStreetSat.md) | [**TaxStatusAddressBetweenStreetSat**](TaxStatusAddressBetweenStreetSat.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

