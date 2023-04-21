# belvo_client.model.recurring_expenses.RecurringExpenses

Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**days_since_last_transaction** | decimal.Decimal, int,  | decimal.Decimal,  | Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur.  | value must be a 32 bit integer
**median_transaction_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The median transaction amount of the recurring expense. | value must be a 32 bit float
**payment_type** | [**EnumRecurringExpensePaymentType**](EnumRecurringExpensePaymentType.md) | [**EnumRecurringExpensePaymentType**](EnumRecurringExpensePaymentType.md) |  | 
**average_transaction_amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The average transaction amount of the recurring expense. | value must be a 32 bit float
**name** | None, str,  | NoneClass, str,  | The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \&quot;Monthly payment to John\&quot;.  | 
**category** | [**EnumRecurringExpenseCategory**](EnumRecurringExpenseCategory.md) | [**EnumRecurringExpenseCategory**](EnumRecurringExpenseCategory.md) |  | 
**[transactions](#transactions)** | list, tuple,  | tuple,  | An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array. | 
**account** | [**Account**](Account.md) | [**Account**](Account.md) |  | 
**frequency** | [**EnumRecurringExpenseFrequency**](EnumRecurringExpenseFrequency.md) | [**EnumRecurringExpenseFrequency**](EnumRecurringExpenseFrequency.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier used to reference the current recurring expense. | [optional] value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# transactions

An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RecurringExpenseSourceTransaction**](RecurringExpenseSourceTransaction.md) | [**RecurringExpenseSourceTransaction**](RecurringExpenseSourceTransaction.md) | [**RecurringExpenseSourceTransaction**](RecurringExpenseSourceTransaction.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

