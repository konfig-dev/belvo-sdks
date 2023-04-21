# belvo_client.model.invoices_payments_related_documents_sat.InvoicesPaymentsRelatedDocumentsSat

List of all the related deferred invoices affected by the payment.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | List of all the related deferred invoices affected by the payment. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount_paid** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount paid in this installment.  | value must be a 32 bit float
**outstanding_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount remaining to be paid.  | value must be a 32 bit float
**invoice_identification** | None, str,  | NoneClass, str,  | The fiscal institution&#x27;s unique ID for the related deferred invoice.  | 
**currency** | None, str,  | NoneClass, str,  | The currency of the related invoice. For example:      - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)      Please note that other currencies other than in the list above may be returned.  | 
**previous_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The invoice amount before the payment.  | value must be a 32 bit float
**payment_method** | None, str,  | NoneClass, str,  | The payment method of the related invoice.  | 
**partiality_number** | decimal.Decimal, int,  | decimal.Decimal,  | The payment installment number.  | [optional] value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

