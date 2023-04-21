

# InvoiceDian


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**id** | **UUID** | Belvo&#39;s unique identifier for the current invoice. |  [optional] |
|**link** | **String** | The &#x60;link.id&#x60; the invoice belongs to. |  [optional] |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  [optional] |
|**invoiceIdentification** | **String** | The fiscal institution&#39;s unique ID for the invoice. |  |
|**invoiceDate** | **LocalDate** | The date of the invoice. |  |
|**status** | **String** | The status of the invoice. Can be one of:    - *Vigente* (valid)   - *Cancelado* (cancelled)   - *Aprobado* (approved) |  |
|**expirationDate** | **LocalDate** | Indicates when the invoice is set to expire.  For example: If the invoice is paid in installments, this field indicates the date when the installment is to be paid.  |  [optional] |
|**invoiceType** | **EnumInvoiceDianInvoiceType** |  |  |
|**type** | **EnumInvoiceType** |  |  |
|**senderId** | **String** | The fiscal ID of the invoice sender. |  |
|**senderName** | **String** | The name of the invoice sender. |  |
|**senderDetails** | [**InvoiceSenderDetailsDian**](InvoiceSenderDetailsDian.md) |  |  [optional] |
|**senderTaxFraudStatus** | **String** | Indicates whether or not the sender is on a tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#39;s regulations. **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. |  [optional] |
|**receiverId** | **String** | The fiscal ID of the invoice receiver. |  |
|**receiverName** | **String** | The name of the invoice receiver. |  |
|**receiverDetails** | [**InvoicesReceiverDetailsDian**](InvoicesReceiverDetailsDian.md) |  |  [optional] |
|**receiverTaxFraudStatus** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. |  [optional] |
|**cancelationStatus** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. |  |
|**cancelationUpdateDate** | **LocalDate** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**certificationDate** | **LocalDate** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**certificationAuthority** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**paymentType** | **String** | The payment type code used for this invoice, as defined by the country legal entity.  For detailed information regarding DIAN&#39;s payment types, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   |  |
|**paymentTypeDescription** | **String** | The description of the payment method used for this invoice.  |  |
|**paymentMethod** | **EnumInvoiceDianPaymentMethod** |  |  [optional] |
|**paymentMethodDescription** | **String** | The description of the payment method used for this invoice.  |  [optional] |
|**usage** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**placeOfIssue** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**invoiceDetails** | [**List&lt;InvoiceDetailDian&gt;**](InvoiceDetailDian.md) | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**currency** | **String** | The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar)  |  |
|**subtotalAmount** | **Float** | The pretax amount of this invoice (sum of each item&#39;s &#x60;pre_tax_amount&#x60;).  |  |
|**exchangeRate** | **Float** | The exchange rate used in this invoice for the currency.  |  |
|**taxAmount** | **Float** | The amount of tax for this invoice (sum of each item&#39;s &#x60;tax_amount&#x60;).  |  |
|**discountAmount** | **Float** | The total amount discounted in this invoice.  |  |
|**totalAmount** | **Float** | The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;) |  |
|**payments** | [**List&lt;InvoicesPaymentsDian&gt;**](InvoicesPaymentsDian.md) | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  |
|**payroll** | [**InvoicesPayrollDian**](InvoicesPayrollDian.md) |  |  |
|**folio** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**xml** | **String** | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  |  [optional] |
|**warnings** | [**InvoiceWarningsDian**](InvoiceWarningsDian.md) |  |  [optional] |



