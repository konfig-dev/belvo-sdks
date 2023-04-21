

# RiskInsightsBalanceMetrics

Balance metrics calculated based on the user's balances from checking and savings accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**minBalance1w** | **Float** | The minimum balance in the period (one week).  |  |
|**minBalance1m** | **Float** | The minimum balance in the period (one month).  |  |
|**minBalance3m** | **Float** | The minimum balance in the period (three months).  |  |
|**maxBalance1w** | **Float** | The maximum balance in the period (one week).  |  |
|**maxBalance1m** | **Float** | The maximum balance in the period (one month).  |  |
|**maxBalance3m** | **Float** | The maximum balance in the period (three months).  |  |
|**closingBalance** | **Float** | The balance of all the accounts at the &#x60;collected_at&#x60; time.  |  |
|**daysBalanceBelow01w** | **Integer** | The number of days that the total balance of the account is less than or equal to 0 in the last week.  |  |
|**daysBalanceBelow01m** | **Integer** | The number of days that the total balance of the account is less than or equal to 0 in the last month.  |  |
|**daysBalanceBelow03m** | **Integer** | The number of days that the total balance of the account is less than or equal to 0 in the last three months.  |  |
|**daysBalanceBelowX1w** | **Integer** | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last week.  |  |
|**daysBalanceBelowX1m** | **Integer** | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last month.  |  |
|**daysBalanceBelowX3m** | **Integer** | The number of days that the total balance of the account is less than or equal to the amount specified in &#x60;balance_threshold_x&#x60; in the last three months.  |  |
|**balanceThresholdX** | **Float** | The threshold used to compute &#x60;days_balance_below_x_period&#x60;. Please note, this is value is country specific (both in terms of the amount and the currency).  |  |



