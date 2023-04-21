# belvo_client.model.categorization_request.CategorizationRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**language** | str,  | str,  | Two-letter ISO 639-1 code for the language of the transaction. | 
**[transactions](#transactions)** | list, tuple,  | tuple,  | An array of transaction objects that you want categorized.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# transactions

An array of transaction objects that you want categorized.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of transaction objects that you want categorized.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**CategorizationBodyRequest**](CategorizationBodyRequest.md) | [**CategorizationBodyRequest**](CategorizationBodyRequest.md) | [**CategorizationBodyRequest**](CategorizationBodyRequest.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

