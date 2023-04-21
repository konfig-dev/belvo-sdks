# belvo_client.model.token_required_response_token_generation_data.TokenRequiredResponseTokenGenerationData

Details on how to generate the token.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details on how to generate the token. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**instructions** | str,  | str,  | Instructions for token generation. | [optional] 
**type** | str,  | str,  | Type of the data to generate the token (QR code, numeric challenge). | [optional] 
**value** | str,  | str,  | Value to use to generate the token. | [optional] 
**expects_user_input** | bool,  | BoolClass,  | Indicates whether the user needs to provide input in order to complete the authentication. When set to &#x60;false&#x60;, your user may need to: - confirm the login on another device - scan a QR code You will still need to make a PATCH call to complete the request. | [optional] if omitted the server will use the default value of True
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

