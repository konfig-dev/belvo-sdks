

# InvoiceDetailSat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the invoice item (an invoice can have one or more items). |  |
|**productIdentification** | **String** | The identification code of the product or the service, as defined by the legal entity in the country. - 🇲🇽 [Mexico](http://200.57.3.89/Pys/catPyS.aspx)  |  |
|**quantity** | **Integer** | The quantity of this invoice item. |  |
|**unitCode** | **String** | The unit of measure, as defined by the legal entity in the country.  - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code)  |  |
|**unitDescription** | **String** | The description of the item, as defined by the legal entity in the country. - 🇲🇽 Mexico [SAT catalog reference](https://developers.belvo.com/docs/sat-catalogs#unit-code)  |  |
|**unitAmount** | **Float** | The price of one a singular item. |  |
|**taxType** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**preTaxAmount** | **Float** | The total price for this item before tax is applied (&#x60;quantity&#x60; x &#x60;unit_amount&#x60;). |  |
|**taxPercentage** | **Float** | The tax percentage to apply. |  |
|**taxAmount** | **Float** | The amount of tax for this invoice item (&#x60;pre_tax_amount&#x60; x &#x60;tax_percentage&#x60;). |  |
|**totalAmount** | **Float** | The total price for this invoice item (&#x60;pre_tax_amount&#x60; + &#x60;tax_amount&#x60;). |  |
|**retainedTaxes** | [**List&lt;InvoiceDetailRetainedTaxSat&gt;**](InvoiceDetailRetainedTaxSat.md) | The retained tax on the invoice item. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  [optional] |



