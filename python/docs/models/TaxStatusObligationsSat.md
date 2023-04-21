# belvo_client.model.tax_status_obligations_sat.TaxStatusObligationsSat

Details regarding a business's obligations.  ℹ️ For non-business accounts, this field will return empty. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding a business&#x27;s obligations.  ℹ️ For non-business accounts, this field will return empty.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**obligation** | None, str,  | NoneClass, str,  | The description of the obligation.  | [optional] 
**expiration** | None, str,  | NoneClass, str,  | The deadline to fulfill the obligation, as imposed by the tax authority.  | [optional] 
**initial_date** | None, str, date,  | NoneClass, str,  | The date when obligation started.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**end_date** | None, str, date,  | NoneClass, str,  | The date when obligation ended.  | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

