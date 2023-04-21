# belvo_client.model.income_streams_body.IncomeStreamsBody

A list of income streams for the account.  For each income stream, we provide additional insights such as: - Frequency, stability, and confidence level of the income transactions. - Key metrics about the transaction amounts. ℹ️ If no income sources are found, we return an empty array. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A list of income streams for the account.  For each income stream, we provide additional insights such as: - Frequency, stability, and confidence level of the income transactions. - Key metrics about the transaction amounts. ℹ️ If no income sources are found, we return an empty array.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**monthly_average** | decimal.Decimal, int, float,  | decimal.Decimal,  | The average amount of income received from the source over &#x60;lookback_periods&#x60;.  | value must be a 32 bit float
**full_periods** | decimal.Decimal, int,  | decimal.Decimal,  | Number of period units (based on *rolling months*) with data to perform calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  | value must be a 32 bit integer
**last_income_date** | str, date,  | str,  | The date when the most recent income from the stream was received, in &#x60;YYYY-MM-DD&#x60; format.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**average_income_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The average income transaction amount from the source.  | value must be a 32 bit float
**number_of_incomes** | decimal.Decimal, int,  | decimal.Decimal,  | Number of income transactions over the &#x60;lookback_periods&#x60;.  | value must be a 32 bit integer
**trend** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The income trend during a period of time calculated between last income and first income received, where:   - a negative float means that the income trend is decreasing during the time period.   - a positive float means that the income trend is increasing during the time period.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  | value must be a 32 bit float
**lookback_periods** | decimal.Decimal, int,  | decimal.Decimal,  | Number of period units (based on *rolling months*) used to generate insights and calculations.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  | value must be a 32 bit integer
**confidence** | [**EnumIncomeStreamConfidence**](EnumIncomeStreamConfidence.md) | [**EnumIncomeStreamConfidence**](EnumIncomeStreamConfidence.md) |  | 
**last_income_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The amount of the most recent income received from the source.  | value must be a 32 bit float
**regularity** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The regularity of the income basde in its frequency, with a range from 0 to 1, where 1 represents perfect regularity.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  | value must be a 32 bit float
**frequency** | [**EnumIncomeStreamFrequency**](EnumIncomeStreamFrequency.md) | [**EnumIncomeStreamFrequency**](EnumIncomeStreamFrequency.md) |  | 
**last_income_description** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO | The description of the most recent income from the steam.  | 
**periods_with_income** | decimal.Decimal, int,  | decimal.Decimal,  | Number of period units (based on *rolling months*) with at least one income available.  **Note:** A *rolling month* is a period of 30 days. For example, 2023-01-15 to 2023-02-2023.  | value must be a 32 bit integer
**account_id** | str,  | str,  | Unique ID for the bank account to be verified for income streams. | 
**income_type** | [**EnumIncomeStreamType**](EnumIncomeStreamType.md) | [**EnumIncomeStreamType**](EnumIncomeStreamType.md) |  | 
**currency** | str,  | str,  | The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)    | 
**stability** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The stability of the income based on its amount, with a range from 0 to 1, where 1 represents perfect stability.  **Note:** For transactions with &#x60;frequency&#x60;&#x3D;&#x60;SINGLE&#x60;, this value returns &#x60;null&#x60;.  | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

