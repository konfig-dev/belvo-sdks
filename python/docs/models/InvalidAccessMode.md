# belvo_client.model.invalid_access_mode.InvalidAccessMode

This error occurs when you try to update a link from single to recurrent, but there are no login credentials stored for the user.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This error occurs when you try to update a link from single to recurrent, but there are no login credentials stored for the user. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;invalid_access_mode_switch&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-invalid_access_mode_switch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 invalid_access_mode_switch errors&lt;/a&gt;. | [optional] 
**message** | str,  | str,  | A short description of the error.   For &#x60;invalid_access_mode_switch&#x60; errors, the description is:      - &#x60;This link doesn&#x27;t have stored credentials hence it can&#x27;t be switched to recurrent mode\&quot;&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

