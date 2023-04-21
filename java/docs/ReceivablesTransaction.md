

# ReceivablesTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the current receivable transaction. |  [readonly] |
|**account** | [**ReceivablesTransactionAccount**](ReceivablesTransactionAccount.md) |  |  |
|**createdAt** | **OffsetDateTime** | The ISO timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**collectedAt** | **OffsetDateTime** | The ISO timestamp when the data point was collected. |  |
|**valueHour** | **String** | The time that the transaction occurred, according to the institution, in &#x60;HH:MM&#x60; format. |  |
|**valueDate** | **LocalDate** | The date that the transactions occurred, according to the institution, in &#x60;YYYY-MM-DD&#x60; format. |  |
|**institutionTransactionId** | **String** | Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU. |  |
|**currency** | **String** | The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned. |  |
|**type** | **EnumReceivableTransactionType** |  |  |
|**grossAmount** | **Float** | The total gross amount of the transaction. |  |
|**netAmount** | **Float** | The net amount of the transaction. |  |
|**fees** | [**List&lt;RecevablesTransactionFees&gt;**](RecevablesTransactionFees.md) |  |  |
|**status** | **EnumReceivableTransactionStatus** |  |  |
|**numberOfInstallments** | [**ReceivablesTransactionNumberOfInstallments**](ReceivablesTransactionNumberOfInstallments.md) |  |  |



