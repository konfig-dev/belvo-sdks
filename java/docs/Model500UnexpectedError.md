

# Model500UnexpectedError

This error occurs when we (Belvo) have encountered an internal system error (sorry about that) or due to an unsupported response from the institution.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;unexpected_error&#x60;) that allows you to classify and handle the error programmatically. |  [optional] |
|**message** | **String** | A short description of the error.  For &#x60;unexpected_error&#x60; errors, the description is:    - &#x60;Belvo is unable to process the request due to an internal system issue or to an unsupported response from an institution&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



