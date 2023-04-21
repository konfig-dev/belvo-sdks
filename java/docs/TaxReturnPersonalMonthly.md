

# TaxReturnPersonalMonthly


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier created by Belvo used to reference the current Tax Return. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**informacionGeneral** | **Object** | General information regarding the tax return (year, RFC, return type, person/company name, and so on). |  |
|**isr** | **Object** | Information used to calculate the monthly provisional payments of the income tax. |  |
|**iva** | **Object** | Information used to calculate the monthly provisional payments of the VAT tax. |  |
|**pdf** | **File** | Tax return PDF as a binary. |  |
|**receiptPdf** | **File** | The acknowledgement receipt from the fiscal institution confirming that they received the tax return. |  [optional] |
|**type** | **String** | The type of tax return. Can be either monthly or annual. |  |



