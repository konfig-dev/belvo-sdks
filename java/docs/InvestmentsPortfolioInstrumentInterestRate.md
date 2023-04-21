

# InvestmentsPortfolioInstrumentInterestRate


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | **String** | How often the interest rate is calculated on the instrument. |  |
|**value** | **Float** | The interest rate for the instrument, in percent.   ℹ️  **Note:** If the &#x60;interest_rate.index&#x60; is present, this value is a percentage of the index. For example, if &#x60;interest_rate.index&#x60; &#x3D; &#x60;CDI&#x60; and &#x60;interest_rate.value&#x60; &#x3D; &#x60;90&#x60;, then the total interest rate applied is 90% of the CDI.  |  |
|**index** | **String** | If applicable, the index type that the &#x60;interest_rates.value&#x60; is calculated against. |  |



