

# RiskInsightsTransactionMetrics

Aggregated metrics calculated band on the user's transactions from checking, savings, credit card, and loan accounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**numTransactions1w** | **Integer** | The total number of transactions analyzed to determine the risk insights for the last week (incoming and outgoing).  |  |
|**numTransactions1m** | **Integer** | The total number of transactions analyzed to determine the risk insights for the last month (incoming and outgoing).  |  |
|**numTransactions3m** | **Integer** | The total number of transactions analyzed to determine the risk insights for the last three months (incoming and outgoing).  |  |
|**numIncomingTransactions1w** | **Integer** | The total number of inflow transactions for the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**numIncomingTransactions1m** | **Integer** | The total number of inflow transactions for the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**numIncomingTransactions3m** | **Integer** | The total number of inflow transactions for the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**numOutgoingTransactions1w** | **Integer** | To total number of outflow transactions in the last week.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**numOutgoingTransactions1m** | **Integer** | To total number of outflow transactions in the last month.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**numOutgoingTransactions3m** | **Integer** | To total number of outflow transactions in the last three months.  ℹ️ **Note**: If there are no transactions between the request date and the last seven or thirty days, the value is &#x60;0&#x60;.  If the account has not been open long enough to have the transaction data for a given period, we return &#x60;null&#x60;. For example, if the account has only been open for five days, we return values for &#x60;_1w&#x60; and &#x60;_1m&#x60;, however, the value for &#x60;_3m&#x60; will be &#x60;null&#x60;.  |  |
|**sumIncomingAmount1w** | **Float** | The total sum of all inflow transactions for the last week.  |  |
|**sumIncomingAmount1m** | **Float** | The total sum of all inflow transactions for the last month.  |  |
|**sumIncomingAmount3m** | **Float** | The total sum of all inflow transactions for the last three months.  |  |
|**sumOutgoingAmount1w** | **Float** | The total sum of all outflow transactions for the last week.  |  |
|**sumOutgoingAmount1m** | **Float** | The total sum of all outflow transactions for the last month.  |  |
|**sumOutgoingAmount3m** | **Float** | The total sum of all outflow transactions for the last three months.  |  |
|**maxIncomingAmount1w** | **Float** | The highest value inflow transaction in the last week.  |  |
|**maxIncomingAmount1m** | **Float** | The highest value inflow transaction in the last month.  |  |
|**maxIncomingAmount3m** | **Float** | The highest value inflow transaction in the last three months.  |  |
|**maxOutgoingAmount1w** | **Float** | The highest value outflow transaction in the last week.  |  |
|**maxOutgoingAmount1m** | **Float** | The highest value outflow transaction in the last month.  |  |
|**maxOutgoingAmount3m** | **Float** | The highest value outflow transaction in the last three months.  |  |
|**meanIncomingAmount1w** | **Float** | The mean incoming value of all transactions in the last week.  |  |
|**meanIncomingAmount1m** | **Float** | The mean incoming value of all transactions in the last month.  |  |
|**meanIncomingAmount3m** | **Float** | The mean incoming value of all transactions in the last three months.  |  |
|**meanOutgoingAmount1w** | **Float** | The mean outgoing value of all transaction in the last week.  |  |
|**meanOutgoingAmount1m** | **Float** | The mean outgoing value of all transaction in the last month.  |  |
|**meanOutgoingAmount3m** | **Float** | The mean outgoing value of all transaction in the last three months.  |  |



