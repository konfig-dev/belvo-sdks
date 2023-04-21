# belvo_client.model.last_error_login_error.LastErrorLoginError

Information about the error you ran into in the previous step of the payment intent, if applicable. This error can occur when something unexpected happened in the `pse_display_credentials_required` next step.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Information about the error you ran into in the previous step of the payment intent, if applicable. This error can occur when something unexpected happened in the &#x60;pse_display_credentials_required&#x60; next step. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**error_message** | str,  | str,  | A short description of the error. | 
**error_code** | str,  | str,  | A unique error code (&#x60;login_error&#x60;) that allows you to classify and handle the error programmatically. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

