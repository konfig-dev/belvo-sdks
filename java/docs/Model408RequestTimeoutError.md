

# Model408RequestTimeoutError

Belvo has a limit regarding the time it takes to log in, retrieve account data, and log out. A timeout occurs when there is a very high amount of data and everything could not be obtained within the allotted time.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;request_timeout&#x60;) that allows you to classify and handle the error programmatically. |  [optional] |
|**message** | **String** | A short description of the error.  For &#x60;request_timeout&#x60; errors, the description is:    - &#x60;The request timed out, you can retry asking for less data by changing your query parameters&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



