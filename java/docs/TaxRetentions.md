

# TaxRetentions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | The CFDI version of the tax retentions.  |  |
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current tax retention statement. |  [optional] |
|**link** | **UUID** | The &#x60;link.id&#x60; the tax retention belongs to. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was collected.  |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database.  |  [optional] |
|**invoiceIdentification** | **UUID** | The fiscal institution&#39;s unique ID for the invoice that the tax retention relates to.  |  |
|**code** | **Integer** | The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code).  |  |
|**issuedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the tax retention was issued.  |  |
|**certifiedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the tax retention was certified.  |  |
|**cancelledAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the tax retention was canceled (if applicable).  |  |
|**senderId** | **String** | The fiscal ID of the invoice sender.  |  |
|**senderName** | **String** | The name of the invoice sender.  |  |
|**receiverNationality** | **EnumTaxRetentionReceiverNationality** |  |  |
|**receiverId** | **String** | The fiscal ID of the invoice receiver.  |  |
|**receiverName** | **String** | The name of the invoice receiver.  |  |
|**totalInvoiceAmount** | **Float** | The total amount of the invoice that the tax retention relates to.  |  |
|**totalExemptAmount** | **Float** | Total amount that is exempt from taxation.  |  |
|**totalRetainedAmount** | **Float** | Total tax retained.  |  |
|**totalTaxableAmount** | **Float** | The total amount that can be taxed. Calculated as &#x60;total_invoice_amount&#x60; - &#x60;total_exempt_amount&#x60;.  |  |
|**retentionBreakdown** | [**List&lt;RetentionBreakdown&gt;**](RetentionBreakdown.md) | A breakdown of the retained taxes. |  |
|**xml** | **String** | The tax retention document in XML form.  |  |



