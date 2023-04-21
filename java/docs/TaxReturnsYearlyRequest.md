

# TaxReturnsYearlyRequest

Request body for yearly tax returns

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**link** | **UUID** | The fiscal &#x60;link.id&#x60; you want specific tax return information for. |  |
|**attachPdf** | **Boolean** | When this is set to &#x60;true&#x60;, you will receive the PDF as a binary string in the response. |  [optional] |
|**saveData** | **Boolean** | Indicates whether or not to persist the data in Belvo. By default, this is set to &#x60;true&#x60; and we return a 201 Created response. When set to &#x60;false&#x60;, the data won&#39;t be persisted and we return a 200 OK response. |  [optional] |
|**type** | **String** | The type of tax return to return. For yearly tax returns this must be set to &#x60;yearly&#x60;.  By default, Belvo returns the yearly (annual) tax returns.  |  |
|**yearFrom** | **String** | The starting year you want to get tax returns for, in &#x60;YYYY&#x60; format.  |  |
|**yearTo** | **String** | The year you want to stop getting tax returns for, in &#x60;YYYY&#x60; format.  |  |



