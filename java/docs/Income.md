

# Income

Income insights

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier for the current income. |  |
|**link** | **UUID** | The &#x60;link.id&#x60; the account belongs to. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was created in Belvo&#39;s database. |  |
|**incomeStreams** | [**List&lt;IncomeStreamsBody&gt;**](IncomeStreamsBody.md) | An array of enriched income stream objects. |  |
|**institution** | **String** | The institution where the account is registered. |  |
|**incomeSourceType** | **EnumIncomeSourceType** |  |  |
|**firstTransactionDate** | **LocalDate** | The date when the first transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.  |  |
|**lastTransactionDate** | **LocalDate** | The date when when the last transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.  |  |
|**numberOfIncomeStreams** | **Integer** | Number of total income streams analized.  |  |
|**monthlyAverage** | **Float** | Average amount of income received per month across all the accounts for the specific user.  |  |
|**monthlyAverageRegular** | **Float** | Average amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, or &#x60;WEEKLY&#x60;) received per month for the specific user.  |  |
|**monthlyAverageIrregular** | **Float** | Average amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) received per month for the specific user.  |  |
|**monthlyAverageLowConfidence** | **Float** | Average amount of income received per month for the specific user with &#x60;LOW&#x60; confidence.  |  |
|**monthlyAverageMediumConfidence** | **Float** | Average amount of income received per month for the specific user with &#x60;MEDIUM&#x60; confidence.  |  |
|**monthlyAverageHighConfidence** | **Float** | Average amount of income received per month for the specific user with &#x60;HIGH&#x60; confidence.  |  |
|**totalIncomeAmount** | **Float** | Total amount of all income received for the specific user.  |  |
|**totalRegularIncomeAmount** | **Float** | Total amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, &#x60;WEEKLY&#x60;) for the specific user.  |  |
|**totalIrregularIncomeAmount** | **Float** | Total amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) for the specific user.  |  [optional] |
|**totalLowConfidence** | **Float** | Total amount of income for the specific user with &#x60;LOW&#x60; confidence.  |  |
|**totalMediumConfidence** | **Float** | Total amount of income for the specific user with &#x60;MEDIUM&#x60; confidence.  |  |
|**totalHighConfidence** | **Float** | Total amount of income for the specific user with &#x60;HIGH&#x60; confidence.  |  |



