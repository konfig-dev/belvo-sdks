# belvo_client.model.investments_portfolio_instrument_interest_rate.InvestmentsPortfolioInstrumentInterestRate

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**index** | None, str,  | NoneClass, str,  | If applicable, the index type that the &#x60;interest_rates.value&#x60; is calculated against. | 
**type** | str,  | str,  | How often the interest rate is calculated on the instrument. | 
**value** | decimal.Decimal, int, float,  | decimal.Decimal,  | The interest rate for the instrument, in percent.   ℹ️  **Note:** If the &#x60;interest_rate.index&#x60; is present, this value is a percentage of the index. For example, if &#x60;interest_rate.index&#x60; &#x3D; &#x60;CDI&#x60; and &#x60;interest_rate.value&#x60; &#x3D; &#x60;90&#x60;, then the total interest rate applied is 90% of the CDI.  | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

