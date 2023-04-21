# belvo_client.model.retention_breakdown.RetentionBreakdown

A breakdown of the retained taxes

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A breakdown of the retained taxes | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**retained_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount retained.  | value must be a 32 bit float
**tax_type** | None, str,  | NoneClass, str,  | Optional attribute to indicate the type of tax withheld for the period or year according to the [SAT catalog](https://developers.belvo.com/docs/sat-catalogs#retention-code).  | 
**payment_status** | [**EnumTaxRetentionPaymentStatus**](EnumTaxRetentionPaymentStatus.md) | [**EnumTaxRetentionPaymentStatus**](EnumTaxRetentionPaymentStatus.md) |  | 
**base_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The base amount that was used to calculate the tax retention.  | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

