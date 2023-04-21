

# InvalidLinkError

This error occurs when you try to access an account but the user credentials are no longer valid, prompting an error from the institution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;invalid_link&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-invalid_link\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 invalid_link errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;invalid_link&#x60; errors, the description is:      - &#x60;The link has been invalidated. You may need to update link credentials&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



