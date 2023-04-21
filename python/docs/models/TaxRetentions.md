# belvo_client.model.tax_retentions.TaxRetentions

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**cancelled_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the tax retention was canceled (if applicable).  | value must conform to RFC-3339 date-time
**code** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The tax retention code. For more information, see our [SAT Catalogs DevPortal article](https://developers.belvo.com/docs/sat-catalogs#retention-code).  | value must be a 32 bit integer
**receiver_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice receiver.  | 
**invoice_identification** | None, str, uuid.UUID,  | NoneClass, str,  | The fiscal institution&#x27;s unique ID for the invoice that the tax retention relates to.  | value must be a uuid
**[retention_breakdown](#retention_breakdown)** | list, tuple, None,  | tuple, NoneClass,  | A breakdown of the retained taxes. | 
**sender_name** | None, str,  | NoneClass, str,  | The name of the invoice sender.  | 
**certified_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the tax retention was certified.  | value must conform to RFC-3339 date-time
**issued_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the tax retention was issued.  | value must conform to RFC-3339 date-time
**version** | None, str,  | NoneClass, str,  | The CFDI version of the tax retentions.  | 
**sender_id** | None, str,  | NoneClass, str,  | The fiscal ID of the invoice sender.  | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the data point was collected.  | value must conform to RFC-3339 date-time
**total_invoice_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount of the invoice that the tax retention relates to.  | value must be a 32 bit float
**receiver_nationality** | [**EnumTaxRetentionReceiverNationality**](EnumTaxRetentionReceiverNationality.md) | [**EnumTaxRetentionReceiverNationality**](EnumTaxRetentionReceiverNationality.md) |  | 
**total_exempt_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Total amount that is exempt from taxation.  | value must be a 32 bit float
**xml** | None, str,  | NoneClass, str,  | The tax retention document in XML form.  | 
**receiver_name** | None, str,  | NoneClass, str,  | The name of the invoice receiver.  | 
**total_retained_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Total tax retained.  | value must be a 32 bit float
**total_taxable_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total amount that can be taxed. Calculated as &#x60;total_invoice_amount&#x60; - &#x60;total_exempt_amount&#x60;.  | value must be a 32 bit float
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier used to reference the current tax retention statement. | [optional] value must be a uuid
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; the tax retention belongs to. | [optional] value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database.  | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# retention_breakdown

A breakdown of the retained taxes.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | A breakdown of the retained taxes. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RetentionBreakdown**](RetentionBreakdown.md) | [**RetentionBreakdown**](RetentionBreakdown.md) | [**RetentionBreakdown**](RetentionBreakdown.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

