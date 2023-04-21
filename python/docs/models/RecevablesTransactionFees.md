# belvo_client.model.recevables_transaction_fees.RecevablesTransactionFees

Details regarding the fees applied to the transaction.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details regarding the fees applied to the transaction. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**type** | [**EnumReceivableTransactionFeeType**](EnumReceivableTransactionFeeType.md) | [**EnumReceivableTransactionFeeType**](EnumReceivableTransactionFeeType.md) |  | 
**value** | decimal.Decimal, int, float,  | decimal.Decimal,  | The value of &#x60;fees.type&#x60;. | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

