# belvo_client.model.customer_ofpi.CustomerOfpi

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
**name** | str,  | str,  | The full name of the customer.  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current customer. | value must be a uuid
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the customer. | value must be a uuid
**email** | str,  | str,  | The customer&#x27;s email address.  | 
**address** | None, str,  | NoneClass, str,  | The customers physical address.  | [optional] 
**phone** | None, str,  | NoneClass, str,  | The customer&#x27;s phone number.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

