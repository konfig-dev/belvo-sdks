

# CategorizationBodyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the transaction. |  |
|**transactionId** | **String** | Your unique ID for the transaction. |  |
|**accountHolderType** | **EnumCategorizationAccountHolderType** |  |  |
|**accountHolderId** | **String** | Your unique ID for the account holder. |  |
|**accountId** | **String** | Your unique ID for the account where the transaction occurred. |  |
|**accountCategory** | **EnumCategorizationAccountCategory** |  |  |
|**valueDate** | **LocalDate** | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**type** | **EnumCategorizationTransactionType** |  |  |
|**amount** | **Float** | The transaction amount. |  |
|**currency** | **String** | The currency of the account, in ISO-4217 format. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) |  |
|**institution** | **String** | The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution. |  |
|**mcc** | **Integer** | The four-digit ISO 18245 Merchant Category Code (MCC). Only required when &#x60;account_category&#x60; &#x3D; &#x60;CREDIT_CARD&#x60;. |  [optional] |



