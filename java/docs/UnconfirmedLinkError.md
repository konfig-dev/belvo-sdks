

# UnconfirmedLinkError

This error occurs when you try to access a link that was paused previously (and as such is not active now). A Link's status is set to `unconfirmed_link` when your user has not completed the Link creation process successfully (for example, they might not provide a valid MFA token).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;unconfirmed_link&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-unconfirmed_link\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 unconfirmed_link errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;unconfirmed_link&#x60; errors, the description is:      - &#x60;The link creation has not been completed yet&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



