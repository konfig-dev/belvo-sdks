

# RiskInsightsCashflowMetrics

Aggregated metrics calculated based on the user's transactions from checking, savings, credit, and loan accounts.  However, internal transfers (transfers between accounts belonging to the same link) are not used in the calculation. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sumPositive1w** | **Float** | Sum total of all transactions leading to a positive cashflow in the last week (counted from the time of the request).  |  |
|**sumPositive1m** | **Float** | Sum total of all transactions leading to a positive cashflow in the last month (counted from the time of the request).  |  |
|**sumPositive3m** | **Float** | Sum total of all transactions leading to a positive cashflow in the last three months (counted from the time of the request).  |  |
|**sumNegative1w** | **Float** | Sum total of all transactions leading to a negative cashflow in the last week (counted from the time of the request).  |  |
|**sumNegative1m** | **Float** | Sum total of all transactions leading to a negative cashflow in the last month (counted from the time of the request).  |  |
|**sumNegative3m** | **Float** | Sum total of all transactions leading to a negative cashflow in the last three months (counted from the time of the request).  |  |
|**positiveToNegativeRatio1w** | **Float** | The ratio between sum_positive / sum_negative  in the last week (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  **Note**: In the case that there have been no outgoing transactions, the value will be &#x60;null&#x60;.  |  |
|**positiveToNegativeRatio1m** | **Float** | The ratio between sum_positive / sum_negative  in the last month (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  |  |
|**positiveToNegativeRatio3m** | **Float** | The ratio between sum_positive / sum_negative  in the last three months (counted from the time of the request).  ℹ️ If the ratio is greater than &#x60;1&#x60;, it means that the user has more income than outgoing, indicating that they spend less than they earn.  |  |



