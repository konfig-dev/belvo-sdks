

# TokenRequiredResponse

MFA Token Required

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;token_required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#428-token_required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;428 token_required errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;token_required&#x60; errors, the description is:      - &#x60;A MFA token is required by the institution to login&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |
|**session** | **String** | A 32-character unique ID of the login session (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). |  [optional] |
|**expiry** | **Integer** | Session duration time in seconds. |  [optional] |
|**link** | **UUID** | Unique identifier created by Belvo, used to reference the current Link. |  [optional] |
|**tokenGenerationData** | [**TokenRequiredResponseTokenGenerationData**](TokenRequiredResponseTokenGenerationData.md) |  |  [optional] |



