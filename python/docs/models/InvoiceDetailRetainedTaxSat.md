# belvo_client.model.invoice_detail_retained_tax_sat.InvoiceDetailRetainedTaxSat

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**retained_tax_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount of retained tax. | value must be a 32 bit float
**tax_percentage** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The percentage of tax retained. | value must be a 32 bit float
**tax** | None, str,  | NoneClass, str,  | The type of retained tax (for example, ISR, IVA or IEPS). | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**tax_type** | None, str,  | NoneClass, str,  | **Note**: This field is not applicable for SAT Mexico and will return &#x60;null&#x60;.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

