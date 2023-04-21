# belvo_client.model.token_required_response.TokenRequiredResponse

MFA Token Required

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | MFA Token Required | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**code** | str,  | str,  | A unique error code (&#x60;token_required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#428-token_required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;428 token_required errors&lt;/a&gt;. | [optional] 
**message** | str,  | str,  | A short description of the error.   For &#x60;token_required&#x60; errors, the description is:      - &#x60;A MFA token is required by the institution to login&#x60;. | [optional] 
**request_id** | str,  | str,  | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. | [optional] 
**session** | str,  | str,  | A 32-character unique ID of the login session (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). | [optional] 
**expiry** | decimal.Decimal, int,  | decimal.Decimal,  | Session duration time in seconds. | [optional] value must be a 32 bit integer
**link** | str, uuid.UUID,  | str,  | Unique identifier created by Belvo, used to reference the current Link. | [optional] value must be a uuid
**token_generation_data** | [**TokenRequiredResponseTokenGenerationData**](TokenRequiredResponseTokenGenerationData.md) | [**TokenRequiredResponseTokenGenerationData**](TokenRequiredResponseTokenGenerationData.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

