# belvo_client.model.risk_insights_loans_metrics.RiskInsightsLoansMetrics

Aggregated metrics calculated based on the user's loan accounts.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Aggregated metrics calculated based on the user&#x27;s loan accounts. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**sum_loans_monthly_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of the monthly payments for all the link&#x27;s loan accounts.  | value must be a 32 bit float
**sum_loans_principal** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of the principal for all of the link&#x27;s loan accounts.  | value must be a 32 bit float
**sum_loans_outstanding_principal** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of the outstanding principal for all the link&#x27;s loan accounts.  | value must be a 32 bit float
**num_accounts** | decimal.Decimal, int,  | decimal.Decimal,  | Number of loan accounts associated with the link.  | value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

