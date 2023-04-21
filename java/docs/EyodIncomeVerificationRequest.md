

# EyodIncomeVerificationRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**language** | **String** | Two-letter ISO 639-1 code for the language of the transaction. |  |
|**transactions** | [**List&lt;EyodIncomeVerificationBodyRequest&gt;**](EyodIncomeVerificationBodyRequest.md) | An array of transaction objects that you want enriched.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request. |  |
|**dateFrom** | **String** | The date from which you want to start getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_to&#x60;.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;. |  [optional] |
|**dateTo** | **String** | The date you want to stop getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_from&#x60;.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#39;s date (in other words, no future dates). |  [optional] |
|**allowedIncomeTypes** | **List&lt;EnumInvoiceAllowedIncomeTypesRequest&gt;** |  |  [optional] |
|**minimumConfidenceLevel** | **EnumIncomeMinimumConfidenceLevelRequest** |  |  [optional] |



