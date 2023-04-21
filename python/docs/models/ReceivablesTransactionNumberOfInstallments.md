# belvo_client.model.receivables_transaction_number_of_installments.ReceivablesTransactionNumberOfInstallments

Details regarding the number of installments for the transaction, if applicable.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the number of installments for the transaction, if applicable. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**total** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of payments required to pay the cost of the transaction. | value must be a 32 bit integer
**paid** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of payments already made to pay the cost of the transaction. | value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

