# belvo_client.model.model401_unauthorized_error.Model401UnauthorizedError

This error occurs when you try to make an API call using incorrect Belvo API credentials (either your secret key or secret password, or both, are incorrect).

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This error occurs when you try to make an API call using incorrect Belvo API credentials (either your secret key or secret password, or both, are incorrect). | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;authentication_failed&#x60;) that allows you to classify and handle the error programmatically. | [optional] 
**message** | str,  | str,  | A short description of the error.  For &#x60;authentication_failed&#x60; errors, the description is:    - &#x60;Invalid Secret Keys&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

