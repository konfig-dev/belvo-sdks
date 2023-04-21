# belvo_client.model.recurring_expense_source_transaction.RecurringExpenseSourceTransaction

An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The transaction amount. | value must be a 32 bit float
**description** | None, str,  | NoneClass, str,  | The description of the transaction provided by the institution. Usually, this is the text that the end user would see in the bank statement. The description can be an empty string. | 
**value_date** | str, date,  | str,  | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. | value must conform to RFC-3339 full-date YYYY-MM-DD
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

