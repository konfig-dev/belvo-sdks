# belvo_client.model.unsupported_operation_error.UnsupportedOperationError

This error occurs when you try to access some data operation that Belvo does not support for an institution. For example, trying to access the Balances resource for fiscal institutions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This error occurs when you try to access some data operation that Belvo does not support for an institution. For example, trying to access the Balances resource for fiscal institutions. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;unsupported_operation&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-unsupported_operation\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 unsupported_operation errors&lt;/a&gt;. | [optional] 
**message** | str,  | str,  | A short description of the error.   For &#x60;unsupported_operation&#x60; errors, the description is:      - &#x60;The resource you are trying to access is not supported by this institution&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

