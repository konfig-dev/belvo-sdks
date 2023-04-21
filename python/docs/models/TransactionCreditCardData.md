# belvo_client.model.transaction_credit_card_data.TransactionCreditCardData

Additional data provided by the institution for credit card transactions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Additional data provided by the institution for credit card transactions. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**bill_name** | None, str,  | NoneClass, str,  | The title of the monthly credit card bill the transaction belongs to. The format of the returned value is institution specific, however, some common examples are:  - diciembre-2021 - dec-2021 - dec-21  | [optional] 
**bill_status** | [**EnumTransactionBillStatus**](EnumTransactionBillStatus.md) | [**EnumTransactionBillStatus**](EnumTransactionBillStatus.md) |  | [optional] 
**bill_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The aggregate bill amount, as of &#x60;collected_at&#x60;. | [optional] value must be a 32 bit float
**previous_bill_total** | None, str,  | NoneClass, str,  | The total amount of the previous month&#x27;s bill, if available. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

