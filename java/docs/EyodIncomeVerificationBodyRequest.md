

# EyodIncomeVerificationBodyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the income. |  |
|**transactionId** | **String** | Your unique ID for the income. |  |
|**accountHolderType** | **EnumIncomeVerificationAccountHolderType** |  |  |
|**accountHolderId** | **UUID** | Your unique ID for the account holder, in UUID format. |  |
|**accountId** | **String** | Your unique ID for the account where the transaction occurred. |  |
|**accountCategory** | **EnumIncomeVerificationAccountCategory** |  |  |
|**valueDate** | **LocalDate** | The date when the income transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**type** | **EnumIncomeVerificationType** |  |  |
|**amount** | **Float** | The income amount. |  |
|**currency** | **String** | The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)    |  |
|**institution** | **String** | The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution. |  |



