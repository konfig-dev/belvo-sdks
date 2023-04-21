

# InvoicesPaymentsRelatedDocumentsSat

List of all the related deferred invoices affected by the payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**invoiceIdentification** | **String** | The fiscal institution&#39;s unique ID for the related deferred invoice.  |  |
|**currency** | **String** | The currency of the related invoice. For example:      - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)      Please note that other currencies other than in the list above may be returned.  |  |
|**paymentMethod** | **String** | The payment method of the related invoice.  |  |
|**partialityNumber** | **Integer** | The payment installment number.  |  [optional] |
|**previousBalance** | **Float** | The invoice amount before the payment.  |  |
|**amountPaid** | **Float** | The amount paid in this installment.  |  |
|**outstandingBalance** | **Float** | The amount remaining to be paid.  |  |



