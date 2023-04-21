# belvo_client.model.payment_transaction.PaymentTransaction

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | str,  | str,  | The transaction amount.   **Note**: The amount displayed is always positive as we indicate the direction of the transaction in &#x60;transaction_type&#x60; parameter.  | 
**charge** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**beneficiary** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary&#x27;s bank account. | value must be a uuid
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**description** | str,  | str,  | The description of the payment.  | 
**currency** | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo’s unique ID to reference the transaction. | value must be a uuid
**transaction_type** | [**EnumPaymentTransactionType**](EnumPaymentTransactionType.md) | [**EnumPaymentTransactionType**](EnumPaymentTransactionType.md) |  | 
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the payment. | value must be a uuid
**[payer](#payer)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**payment_intent** | str, uuid.UUID,  | str,  | The unique ID of the payment intent associated with the transaction. | [optional] value must be a uuid
**customer** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the customer asscociated with this transaction. | [optional] value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# payer

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[one_of_0](#one_of_0) | dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the payer&#x27;s bank account information. For OFPI, this field will return an empty object. | 
[TransactionBankAccountPse](TransactionBankAccountPse.md) | [**TransactionBankAccountPse**](TransactionBankAccountPse.md) | [**TransactionBankAccountPse**](TransactionBankAccountPse.md) |  | 

# one_of_0

Object containing the payer's bank account information. For OFPI, this field will return an empty object.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the payer&#x27;s bank account information. For OFPI, this field will return an empty object. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

