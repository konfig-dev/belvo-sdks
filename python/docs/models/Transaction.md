# belvo_client.model.transaction.Transaction

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The transaction amount. ℹ️ The amount displayed is always positive as we indicate the direction of the transaction in the &#x60;type&#x60; parameter.  | value must be a 32 bit float
**description** | None, str,  | NoneClass, str,  | The description of transaction provided by the institution. Usually this is the text that the end user sees in the online platform. | 
**merchant** | [**TransactionMerchantData**](TransactionMerchantData.md) | [**TransactionMerchantData**](TransactionMerchantData.md) |  | 
**type** | [**EnumTransactionType**](EnumTransactionType.md) | [**EnumTransactionType**](EnumTransactionType.md) |  | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**reference** | None, str,  | NoneClass, str,  | The reference number of the transaction, provided by the bank. | 
**balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The balance at the end of the transaction. | value must be a 32 bit float
**observations** | None, str,  | NoneClass, str,  | Additional observations provided by the institution on the transaction. | 
**currency** | None, str,  | NoneClass, str,  | The three-letter currency code (ISO-4217).  | 
**category** | [**EnumTransactionCategory**](EnumTransactionCategory.md) | [**EnumTransactionCategory**](EnumTransactionCategory.md) |  | 
**account** | [**Account**](Account.md) | [**Account**](Account.md) |  | 
**accounting_date** | None, str, datetime,  | NoneClass, str,  | The ISO timestamp when the transaction was processed and accounted for by the institution. | value must conform to RFC-3339 date-time
**status** | [**EnumTransactionStatus**](EnumTransactionStatus.md) | [**EnumTransactionStatus**](EnumTransactionStatus.md) |  | 
**value_date** | None, str, date,  | NoneClass, str,  | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. | value must conform to RFC-3339 full-date YYYY-MM-DD
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the transaction. | [optional] value must be a uuid
**internal_identification** | None, str,  | NoneClass, str,  | The institution&#x27;s internal identification for the transaction.  | [optional] 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**subcategory** | [**EnumTransactionSubcategory**](EnumTransactionSubcategory.md) | [**EnumTransactionSubcategory**](EnumTransactionSubcategory.md) |  | [optional] 
**credit_card_data** | [**TransactionCreditCardData**](TransactionCreditCardData.md) | [**TransactionCreditCardData**](TransactionCreditCardData.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

