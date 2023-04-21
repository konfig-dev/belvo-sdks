# belvo_client.model.risk_insights.RiskInsights

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**credit_cards_metrics** | [**RiskInsightsCreditCardMetrics**](RiskInsightsCreditCardMetrics.md) | [**RiskInsightsCreditCardMetrics**](RiskInsightsCreditCardMetrics.md) |  | 
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; the risk insights analysis belongs to. | value must be a uuid
**transactions_metrics** | [**RiskInsightsTransactionMetrics**](RiskInsightsTransactionMetrics.md) | [**RiskInsightsTransactionMetrics**](RiskInsightsTransactionMetrics.md) |  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**[accounts](#accounts)** | list, tuple, None,  | tuple, NoneClass,  | An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array. | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the risk insights request. | value must be a uuid
**balances_metrics** | [**RiskInsightsBalanceMetrics**](RiskInsightsBalanceMetrics.md) | [**RiskInsightsBalanceMetrics**](RiskInsightsBalanceMetrics.md) |  | 
**loans_metrics** | [**RiskInsightsLoansMetrics**](RiskInsightsLoansMetrics.md) | [**RiskInsightsLoansMetrics**](RiskInsightsLoansMetrics.md) |  | 
**cashflow_metrics** | [**RiskInsightsCashflowMetrics**](RiskInsightsCashflowMetrics.md) | [**RiskInsightsCashflowMetrics**](RiskInsightsCashflowMetrics.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# accounts

An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str, uuid.UUID,  | str,  | The Belvo-generated ID for the account. | value must be a uuid

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

