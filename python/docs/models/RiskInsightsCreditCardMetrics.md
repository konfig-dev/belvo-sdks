# belvo_client.model.risk_insights_credit_card_metrics.RiskInsightsCreditCardMetrics

Aggregated metrics calculated based on the link's credit card accounts.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Aggregated metrics calculated based on the link&#x27;s credit card accounts. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**sum_credit_limit** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all credit cards&#x27; limits.  | value must be a 32 bit float
**num_accounts** | decimal.Decimal, int,  | decimal.Decimal,  | Number of credit cards accounts associated to the link.  | value must be a 32 bit integer
**sum_credit_used** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all credit used.  | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

