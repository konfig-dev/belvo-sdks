

# ValidationError

This error occurs when you try to resume a request session that has already expired. This is usually because the user took too long to provide their authentication token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;null&#x60;, &#x60;does_not_exist&#x60;, &#x60;required&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle:   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-blank\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 blank errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-null\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 null errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-does_not_exist\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 does_not_exist errors&lt;/a&gt;   - &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-required\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 required errors&lt;/a&gt; |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;session_expired&#x60; errors, the description can be (among others):      - &#x60;This field is required.&#x60;   - &#x60;Object with name&#x3D;narnia does not exist.&#x60;   - &#x60;This field may not be null.&#x60;   - &#x60;This field may not be blank.&#x60; |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |
|**field** | **String** | Name of the field where the error was encountered. |  [optional] |



