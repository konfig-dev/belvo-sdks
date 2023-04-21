# belvo_client.model.request_timeout_error.RequestTimeoutError

Belvo has a limit regarding the time it takes to log in, retrieve account data, and log out. A timeout occurs when there is a very high amount of data and everything could not be obtained within the allotted time.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Belvo has a limit regarding the time it takes to log in, retrieve account data, and log out. A timeout occurs when there is a very high amount of data and everything could not be obtained within the allotted time. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;request_timeout&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#408-request_timeout\&quot; target&#x3D;\&quot;_blank\&quot;&gt;408 request_timeout errors&lt;/a&gt;. | [optional] 
**message** | str,  | str,  | A short description of the error.   For &#x60;request_timeout&#x60; errors, the description is:      - &#x60;The request timed out, you can retry asking for less data by changing your query parameters&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

