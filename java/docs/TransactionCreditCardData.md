

# TransactionCreditCardData

Additional data provided by the institution for credit card transactions.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**billName** | **String** | The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:  - diciembre-2021 - dec-2021 - dec-21  |  [optional] |
|**billStatus** | **EnumTransactionBillStatus** |  |  [optional] |
|**billAmount** | **Float** | The aggregate bill amount, as of &#x60;collected_at&#x60;. |  [optional] |
|**previousBillTotal** | **String** | The total amount of the previous month&#39;s bill, if available. |  [optional] |



