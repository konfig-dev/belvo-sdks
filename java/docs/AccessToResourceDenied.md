

# AccessToResourceDenied

This error occurs when you try to access Belvo's resource without the correct permissions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;access_to_resource_denied&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#403-access_to_resource_denied\&quot; target&#x3D;\&quot;_blank\&quot;&gt;403 access_to_resource_denied&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;access_to_resource_denied&#x60; errors, the description is:      - &#x60;You don&#39;t have access to this resource.&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



