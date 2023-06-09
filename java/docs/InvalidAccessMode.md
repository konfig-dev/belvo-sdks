

# InvalidAccessMode

This error occurs when you try to update a link from single to recurrent, but there are no login credentials stored for the user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;invalid_access_mode_switch&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-invalid_access_mode_switch\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 invalid_access_mode_switch errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;invalid_access_mode_switch&#x60; errors, the description is:      - &#x60;This link doesn&#39;t have stored credentials hence it can&#39;t be switched to recurrent mode\&quot;&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



