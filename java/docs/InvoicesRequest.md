

# InvoicesRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | **UUID** | The fiscal &#x60;link.id&#x60; to use. |  |
|**dateFrom** | **String** | The date from which you want to start getting invoices for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;.  |  |
|**dateTo** | **String** | The date you want to stop getting invoices for, in &#x60;YYYY-MM-DD&#x60; format.  ⚠️ The number of days between &#x60;date_from&#x60; and &#x60;date_to&#x60; cannot be over 365.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#39;s date (in other words, no future dates).  |  |
|**type** | **EnumInvoiceType** |  |  |
|**attachXml** | **Boolean** | When set to &#x60;true&#x60;, you will receive the XML invoice in the response. |  [optional] |
|**saveData** | **Boolean** | Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#39;t be persisted and we return a 200 OK response. |  [optional] |



