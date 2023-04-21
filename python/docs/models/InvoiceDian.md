# belvo_client.model.invoice_dian.InvoiceDian

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**tax_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount of tax for this invoice (sum of each item&#x27;s &#x60;tax_amount&#x60;).  | value must be a 32 bit float
**discount_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount discounted in this invoice.  | value must be a 32 bit float
**receiver_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice receiver. | 
**[payments](#payments)** | list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**invoice_identification** | None, str,  | NoneClass, str,  | The fiscal institution&#x27;s unique ID for the invoice. | 
**sender_name** | None, str,  | NoneClass, str,  | The name of the invoice sender. | 
**type** | [**EnumInvoiceType**](EnumInvoiceType.md) | [**EnumInvoiceType**](EnumInvoiceType.md) |  | 
**sender_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice sender. | 
**invoice_date** | None, str, date,  | NoneClass, str,  | The date of the invoice. | value must conform to RFC-3339 full-date YYYY-MM-DD
**receiver_name** | None, str,  | NoneClass, str,  | The name of the invoice receiver. | 
**currency** | None, str,  | NoneClass, str,  | The currency of the invoice. For example:    - 🇧🇷 BRL (Brazilian Real)  - 🇨🇴 COP (Colombian Peso)  - 🇲🇽 MXN (Mexican Peso)  - 🇺🇸 USD (United States Dollar)  | 
**invoice_type** | [**EnumInvoiceDianInvoiceType**](EnumInvoiceDianInvoiceType.md) | [**EnumInvoiceDianInvoiceType**](EnumInvoiceDianInvoiceType.md) |  | 
**[invoice_details](#invoice_details)** | list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**exchange_rate** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The exchange rate used in this invoice for the currency.  | value must be a 32 bit float
**certification_authority** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 
**cancelation_status** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. | 
**subtotal_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The pretax amount of this invoice (sum of each item&#x27;s &#x60;pre_tax_amount&#x60;).  | value must be a 32 bit float
**cancelation_update_date** | None, str, date,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**payment_type** | None, str,  | NoneClass, str,  | The payment type code used for this invoice, as defined by the country legal entity.  For detailed information regarding DIAN&#x27;s payment types, please see their [official PDF](https://www.dian.gov.co/impuestos/factura-electronica/Documents/Anexo_tecnico_factura_electronica_vr_1_7_2020.pdf).   | 
**total_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount of the invoice (&#x60;subtotal_amount&#x60; + &#x60;tax_amount&#x60; - &#x60;discount_amount&#x60;) | value must be a 32 bit float
**payroll** | [**InvoicesPayrollDian**](InvoicesPayrollDian.md) | [**InvoicesPayrollDian**](InvoicesPayrollDian.md) |  | 
**payment_type_description** | None, str,  | NoneClass, str,  | The description of the payment method used for this invoice.  | 
**certification_date** | None, str, date,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**status** | None, str,  | NoneClass, str,  | The status of the invoice. Can be one of:    - *Vigente* (valid)   - *Cancelado* (cancelled)   - *Aprobado* (approved) | 
**version** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier for the current invoice. | [optional] value must be a uuid
**link** | str,  | str,  | The &#x60;link.id&#x60; the invoice belongs to. | [optional] 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**expiration_date** | None, str, date,  | NoneClass, str,  | Indicates when the invoice is set to expire.  For example: If the invoice is paid in installments, this field indicates the date when the installment is to be paid.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**sender_details** | [**InvoiceSenderDetailsDian**](InvoiceSenderDetailsDian.md) | [**InvoiceSenderDetailsDian**](InvoiceSenderDetailsDian.md) |  | [optional] 
**sender_tax_fraud_status** | None, str,  | NoneClass, str,  | Indicates whether or not the sender is on a tax fraud list for having submitted incorrect data, having outstanding payments, or having conducted business that is in violation of the fiscal institution&#x27;s regulations. **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. | [optional] 
**receiver_details** | [**InvoicesReceiverDetailsDian**](InvoicesReceiverDetailsDian.md) | [**InvoicesReceiverDetailsDian**](InvoicesReceiverDetailsDian.md) |  | [optional] 
**receiver_tax_fraud_status** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;. | [optional] 
**payment_method** | [**EnumInvoiceDianPaymentMethod**](EnumInvoiceDianPaymentMethod.md) | [**EnumInvoiceDianPaymentMethod**](EnumInvoiceDianPaymentMethod.md) |  | [optional] 
**payment_method_description** | None, str,  | NoneClass, str,  | The description of the payment method used for this invoice.  | [optional] 
**usage** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**place_of_issue** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**folio** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**xml** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | [optional] 
**warnings** | [**InvoiceWarningsDian**](InvoiceWarningsDian.md) | [**InvoiceWarningsDian**](InvoiceWarningsDian.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# invoice_details

**Note**: This field is not applicable for DIAN Colombia and will return `null`. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoiceDetailDian**](InvoiceDetailDian.md) | [**InvoiceDetailDian**](InvoiceDetailDian.md) | [**InvoiceDetailDian**](InvoiceDetailDian.md) |  | 

# payments

**Note**: This field is not applicable for DIAN Colombia and will return `null`. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | **Note**: This field is not applicable for DIAN Colombia and will return &#x60;null&#x60;.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**InvoicesPaymentsDian**](InvoicesPaymentsDian.md) | [**InvoicesPaymentsDian**](InvoicesPaymentsDian.md) | [**InvoicesPaymentsDian**](InvoicesPaymentsDian.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

