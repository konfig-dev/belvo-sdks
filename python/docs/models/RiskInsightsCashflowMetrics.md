# belvo_client.model.risk_insights_cashflow_metrics.RiskInsightsCashflowMetrics

Aggregated metrics calculated based on the user's transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Aggregated metrics calculated based on the user&#x27;s transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**positive_to_negative_ratio_1w** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be &#x60;null&#x60;.  | value must be a 32 bit float
**sum_negative_1w** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request).  | value must be a 32 bit float
**sum_negative_1m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request).  | value must be a 32 bit float
**positive_to_negative_ratio_1m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  | value must be a 32 bit float
**sum_positive_1w** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request).  | value must be a 32 bit float
**sum_negative_3m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request).  | value must be a 32 bit float
**sum_positive_3m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request).  | value must be a 32 bit float
**positive_to_negative_ratio_3m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  | value must be a 32 bit float
**sum_positive_1m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request).  | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

