

# RiskInsights


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique ID for the risk insights request. |  |
|**link** | **UUID** | The &#x60;link.id&#x60; the risk insights analysis belongs to. |  |
|**accounts** | **List&lt;UUID&gt;** | An array of Belvo-generated account numbers (UUIDs) that were used during the risk insights analysis. If no accounts were found, we return an empty array. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**transactionsMetrics** | [**RiskInsightsTransactionMetrics**](RiskInsightsTransactionMetrics.md) |  |  |
|**balancesMetrics** | [**RiskInsightsBalanceMetrics**](RiskInsightsBalanceMetrics.md) |  |  |
|**cashflowMetrics** | [**RiskInsightsCashflowMetrics**](RiskInsightsCashflowMetrics.md) |  |  |
|**creditCardsMetrics** | [**RiskInsightsCreditCardMetrics**](RiskInsightsCreditCardMetrics.md) |  |  |
|**loansMetrics** | [**RiskInsightsLoansMetrics**](RiskInsightsLoansMetrics.md) |  |  |



