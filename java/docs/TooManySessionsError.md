

# TooManySessionsError

This error occurs when:    - a user is attempting to log in to their institution via Belvo while also already being logged in to their institution on a web browser or mobile app.   - you make a request for information while Belvo is scraping data from the institution for that user.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;too_many_sessions&#x60;) that allows you to classify and handle the error programmatically.  ℹ️ Check our DevPortal for more information on how to handle &lt;a href&#x3D;\&quot;https://developers.belvo.com/docs/belvo-api-errors#400-too_many_sessions\&quot; target&#x3D;\&quot;_blank\&quot;&gt;400 too_many_sessions errors&lt;/a&gt;. |  [optional] |
|**message** | **String** | A short description of the error.   For &#x60;too_many_sessions&#x60; errors, the description is:      - &#x60;Impossible to login, a session is already opened with the institution for these credentials&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



