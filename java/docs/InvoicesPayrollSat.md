

# InvoicesPayrollSat

Details regarding the payroll payment. Only applicable for payroll invoices. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The version of the payroll object.  |  |
|**days** | **Integer** | The number of days covered by the payment.  |  |
|**type** | **String** | The payroll type, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payroll-type)  |  |
|**amount** | **Float** | The total amount of the payroll payment.  |  |
|**dateFrom** | **LocalDate** | The start date of the payment period.  |  |
|**dateTo** | **LocalDate** | The end date of the payment period.  |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |
|**paymentDate** | **LocalDate** | The payment date.  |  |



