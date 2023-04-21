

# IncomeStreamsBody

A list of income streams for the account.  For each income stream, we provide additional insights such as: - Frequency, stability, and confidence level of the income transactions. - Key metrics about the transaction amounts. ℹ️ If no income sources are found, we return an empty array. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Unique ID for the bank account to be verified for income streams. |  |
|**incomeType** | **EnumIncomeStreamType** |  |  |
|**frequency** | **EnumIncomeStreamFrequency** |  |  |
|**monthlyAverage** | **Float** | The average amount of income received from the source over &#x60;lookback_periods&#x60;.  |  |
|**averageIncomeAmount** | **Float** | The average income transaction amount from the source.  |  |
|**lastIncomeAmount** | **Float** | The amount of the most recent income received from the source.  |  |
|**currency** | **String** | The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)    |  |
|**lastIncomeDescription** | **Object** | The description of the most recent income from the steam.  |  |
|**lastIncomeDate** | **LocalDate** | The date when the most recent income from the stream was received, in &#x60;YYYY-MM-DD&#x60; format.  |  |
|**stability** | **Float** | The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  |  |
|**regularity** | **Float** | The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  |  |
|**trend** | **Float** | The income trend during a period of time calculated between last income and first income received, where:   - a negative float means that the income trend is decreasing during the time period.   - a positive float means that the income trend is increasing during the time period.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  |  |
|**lookbackPeriods** | **Integer** | Number of period units (based on *rolling months*) used to generate insights and calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  |  |
|**fullPeriods** | **Integer** | Number of period units (based on *rolling months*) with data to perform calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  |  |
|**periodsWithIncome** | **Integer** | Number of period units (based on *rolling months*) with at least one income available.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  |  |
|**numberOfIncomes** | **Integer** | Number of income transactions over the &#x60;lookback_periods&#x60;.  |  |
|**confidence** | **EnumIncomeStreamConfidence** |  |  |



