

# CategorizationBody


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the transaction. |  |
|**transactionId** | **String** | The unique ID for the transaction in your system. |  |
|**accountHolderType** | **EnumCategorizationAccountHolderType** |  |  |
|**accountHolderId** | **String** | The unique ID for the account holder in your system. |  |
|**accountId** | **String** | The unique ID for the account where the transaction occurred in your system. |  |
|**accountCategory** | **EnumCategorizationAccountCategory** |  |  |
|**valueDate** | **LocalDate** | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**type** | **EnumCategorizationTransactionType** |  |  |
|**amount** | **Float** | The transaction amount. |  |
|**currency** | **String** | The currency of the account, in ISO-4217 format. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) |  |
|**institution** | **String** | The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution.   |  |
|**mcc** | **Integer** | The four-digit ISO 18245 Merchant Category Code (MCC). We only return this value when &#x60;account_type&#x60; &#x3D; &#x60;CREDIT_CARD&#x60;. |  [optional] |
|**category** | **EnumCategorizationTransactionCategory** |  |  |
|**subcategory** | **EnumCategorizationTransactionSubcategory** |  |  [optional] |
|**merchant** | [**CategorizationMerchantData**](CategorizationMerchantData.md) |  |  |



