

# Model401UnauthorizedError

This error occurs when you try to make an API call using incorrect Belvo API credentials (either your secret key or secret password, or both, are incorrect).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;authentication_failed&#x60;) that allows you to classify and handle the error programmatically. |  [optional] |
|**message** | **String** | A short description of the error.  For &#x60;authentication_failed&#x60; errors, the description is:    - &#x60;Invalid Secret Keys&#x60;. |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |



