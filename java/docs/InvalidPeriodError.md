

# InvalidPeriodError

This error occurs when you request incomes for a link within a given date range, however, the period between `date_from` and `date_to` is less than 90 days.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;invalid_period&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-invalid_period\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 invalid_period errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;invalid_period&#x60; errors, the description is:      - &#x60;The number of days between date_from and date_to must be at least 90 days&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



