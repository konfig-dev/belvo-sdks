# belvo_client.model.risk_insights_balance_metrics.RiskInsightsBalanceMetrics

Balance metrics calculated based on the user's balances from checking and savings accounts.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Balance metrics calculated based on the user&#x27;s balances from checking and savings accounts. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**days_balance_below_x_1w** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last week.  | value must be a 32 bit integer
**days_balance_below_0_1m** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to 0 in the last month.  | value must be a 32 bit integer
**days_balance_below_0_3m** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to 0 in the last three months.  | value must be a 32 bit integer
**days_balance_below_0_1w** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to 0 in the last week.  | value must be a 32 bit integer
**min_balance_1w** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The minimum balance in the period (one week).  | value must be a 32 bit float
**max_balance_1m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The maximum balance in the period (one month).  | value must be a 32 bit float
**max_balance_3m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The maximum balance in the period (three months).  | value must be a 32 bit float
**balance_threshold_x** | decimal.Decimal, int, float,  | decimal.Decimal,  | The threshold used to compute &#x60;days_balance_below_x_period&#x60;. Please note, this is value is country specific (both in terms of the amount and the currency).  | value must be a 32 bit float
**max_balance_1w** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The maximum balance in the period (one week).  | value must be a 32 bit float
**min_balance_1m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The minimum balance in the period (one month).  | value must be a 32 bit float
**min_balance_3m** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The minimum balance in the period (three months).  | value must be a 32 bit float
**closing_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The balance of all the accounts at the &#x60;collected_at&#x60; time.  | value must be a 32 bit float
**days_balance_below_x_1m** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last month.  | value must be a 32 bit integer
**days_balance_below_x_3m** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last three months.  | value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

