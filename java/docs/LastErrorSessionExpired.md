

# LastErrorSessionExpired

Information about the error you ran into in the previous step of the payment intent, if applicable. This error occurs when you try to send a PATCH request after the session has already expired (the session expires after 10 minutes).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errorCode** | **String** | A unique error code (&#x60;session_expired&#x60;) that allows you to classify and handle the error programmatically. |  |
|**errorMessage** | **String** | A short description of the error. |  |



