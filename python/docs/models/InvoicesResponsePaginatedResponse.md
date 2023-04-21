# belvo_client.model.invoices_response_paginated_response.InvoicesResponsePaginatedResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**count** | decimal.Decimal, int,  | decimal.Decimal,  | The total number of results in your Belvo account. | [optional] value must be a 32 bit integer
**next** | None, str,  | NoneClass, str,  | The URL to next page of results. Each page consists of up to 100 items. If there are not enough results for an additional page, the value is &#x60;null&#x60;.  In our documentation example, we use &#x60;{endpoint}&#x60; as a placeholder value. In production, this value will be replaced by the actual endpoint you are currently using (for example, &#x60;accounts&#x60; or &#x60;owners&#x60;).  | [optional] 
**previous** | None, str,  | NoneClass, str,  | The URL to the previous page of results. If there is no previous page, the value is &#x60;null&#x60;. | [optional] 
**[results](#results)** | list, tuple,  | tuple,  | Array of invoice objects. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# results

Array of invoice objects.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Array of invoice objects. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[InvoiceWithIdSat](InvoiceWithIdSat.md) | [**InvoiceWithIdSat**](InvoiceWithIdSat.md) | [**InvoiceWithIdSat**](InvoiceWithIdSat.md) |  | 
[InvoiceDian](InvoiceDian.md) | [**InvoiceDian**](InvoiceDian.md) | [**InvoiceDian**](InvoiceDian.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

