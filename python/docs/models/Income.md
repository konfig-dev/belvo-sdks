# belvo_client.model.income.Income

Income insights

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Income insights | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**monthly_average** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of income received per month across all the accounts for the specific user.  | value must be a 32 bit float
**monthly_average_regular** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, or &#x60;WEEKLY&#x60;) received per month for the specific user.  | value must be a 32 bit float
**total_medium_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of income for the specific user with &#x60;MEDIUM&#x60; confidence.  | value must be a 32 bit float
**monthly_average_irregular** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) received per month for the specific user.  | value must be a 32 bit float
**number_of_income_streams** | decimal.Decimal, int,  | decimal.Decimal,  | Number of total income streams analized.  | value must be a 32 bit integer
**total_income_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of all income received for the specific user.  | value must be a 32 bit float
**monthly_average_high_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of income received per month for the specific user with &#x60;HIGH&#x60; confidence.  | value must be a 32 bit float
**total_high_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of income for the specific user with &#x60;HIGH&#x60; confidence.  | value must be a 32 bit float
**income_source_type** | [**EnumIncomeSourceType**](EnumIncomeSourceType.md) | [**EnumIncomeSourceType**](EnumIncomeSourceType.md) |  | 
**link** | str, uuid.UUID,  | str,  | The &#x60;link.id&#x60; the account belongs to. | value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was created in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**first_transaction_date** | None, str, date,  | NoneClass, str,  | The date when the first transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**monthly_average_low_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of income received per month for the specific user with &#x60;LOW&#x60; confidence.  | value must be a 32 bit float
**last_transaction_date** | str, date,  | str,  | The date when when the last transaction occurred, in &#x60;YYYY-MM-DD&#x60; format.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**total_regular_income_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of regular income (with a frequency of &#x60;MONTHLY&#x60;, &#x60;BIWEEKLY&#x60;, &#x60;WEEKLY&#x60;) for the specific user.  | value must be a 32 bit float
**institution** | str,  | str,  | The institution where the account is registered. | 
**total_low_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of income for the specific user with &#x60;LOW&#x60; confidence.  | value must be a 32 bit float
**monthly_average_medium_confidence** | decimal.Decimal, int, float,  | decimal.Decimal,  | Average amount of income received per month for the specific user with &#x60;MEDIUM&#x60; confidence.  | value must be a 32 bit float
**[income_streams](#income_streams)** | list, tuple,  | tuple,  | An array of enriched income stream objects. | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier for the current income. | value must be a uuid
**total_irregular_income_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total amount of irregular income (with a frequency of &#x60;SINGLE&#x60; or &#x60;IRREGULAR&#x60;) for the specific user.  | [optional] value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# income_streams

An array of enriched income stream objects.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of enriched income stream objects. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**IncomeStreamsBody**](IncomeStreamsBody.md) | [**IncomeStreamsBody**](IncomeStreamsBody.md) | [**IncomeStreamsBody**](IncomeStreamsBody.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

