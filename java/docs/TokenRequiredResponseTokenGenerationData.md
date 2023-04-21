

# TokenRequiredResponseTokenGenerationData

Details on how to generate the token.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**instructions** | **String** | Instructions for token generation. |  [optional] |
|**type** | **String** | Type of the data to generate the token (QR code, numeric challenge). |  [optional] |
|**value** | **String** | Value to use to generate the token. |  [optional] |
|**expectsUserInput** | **Boolean** | Indicates whether the user needs to provide input in order to complete the authentication. When set to &#x60;false&#x60;, your user may need to: - confirm the login on another device - scan a QR code You will still need to make a PATCH call to complete the request. |  [optional] |



