

# Model400ValidationError

This error occurs when the parameters provided did not match the expected fields or the item you are trying to create is already in our database, leading to a field validation errors.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | A unique error code (&#x60;null&#x60;, &#x60;does_not_exist&#x60;, &#x60;required&#x60;, &#x60;already_registered&#x60;) that allows you to classify and handle the error programmatically. |  [optional] |
|**message** | **String** | A short description of the error.  For &#x60;session_expired&#x60; errors, the description can be (among others):    - &#x60;This field is required.&#x60;   - &#x60;Object with name&#x3D;narnia does not exist.&#x60;   - &#x60;This field may not be null.&#x60;   - &#x60;This field may not be blank.&#x60;   - &#x60;This customer is already registered&#x60; |  [optional] |
|**requestId** | **String** | A 32-character unique ID of the request (matching a regex pattern of: &#x60;[a-f0-9]{32}&#x60;). Provide this ID when contacting the Belvo support team to accelerate investigations. |  [optional] |
|**field** | **String** | Name of the field where the error was encountered. |  [optional] |



