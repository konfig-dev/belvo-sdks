# belvo_client.model.validation_error.ValidationError

This error occurs when you try to resume a request session that has already expired. This is usually because the user took too long to provide their authentication token.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This error occurs when you try to resume a request session that has already expired. This is usually because the user took too long to provide their authentication token. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;null&#x60;, &#x60;does_not_exist&#x60;, &#x60;required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle:   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-blank\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 blank errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-null\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 null errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-does_not_exist\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 does_not_exist errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 required errors&lt;/a&gt; | [optional] 
**message** | str,  | str,  | A short description of the error.   For &#x60;session_expired&#x60; errors, the description can be (among others):      - &#x60;This field is required.&#x60;   - &#x60;Object with name&#x3D;narnia does not exist.&#x60;   - &#x60;This field may not be null.&#x60;   - &#x60;This field may not be blank.&#x60; | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**field** | None, str,  | NoneClass, str,  | Name of the field where the error was encountered. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

