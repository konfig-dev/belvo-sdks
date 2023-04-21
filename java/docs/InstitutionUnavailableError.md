

# InstitutionUnavailableError

This error occurs when the institution's website that you're trying to access is down due to maintenance or other issues, which means Belvo is unable to create new links or retrieve new data.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;institution_unavailable&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-institution_unavailable\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 institution_unavailable errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.  For &#x60;institution_unavailable&#x60; errors, the description is:      - &#x60;The financial institution is unavailable&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



