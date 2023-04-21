# belvo_client.model.institution_unavailable_error.InstitutionUnavailableError

This error occurs when the institution's website that you're trying to access is down due to maintenance or other issues, which means Belvo is unable to create new links or retrieve new data.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | This error occurs when the institution&#x27;s website that you&#x27;re trying to access is down due to maintenance or other issues, which means Belvo is unable to create new links or retrieve new data. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;institution_unavailable&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-institution_unavailable\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 institution_unavailable errors&lt;/a&gt;. | [optional] 
**message** | str,  | str,  | A short description of the error.  For &#x60;institution_unavailable&#x60; errors, the description is:      - &#x60;The financial institution is unavailable&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

