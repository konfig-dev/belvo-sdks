# belvo_client.model.receivables_transaction.ReceivablesTransaction

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[fees](#fees)** | list, tuple,  | tuple,  |  | 
**created_at** | str, datetime,  | str,  | The ISO timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**number_of_installments** | [**ReceivablesTransactionNumberOfInstallments**](ReceivablesTransactionNumberOfInstallments.md) | [**ReceivablesTransactionNumberOfInstallments**](ReceivablesTransactionNumberOfInstallments.md) |  | 
**gross_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The total gross amount of the transaction. | value must be a 32 bit float
**type** | [**EnumReceivableTransactionType**](EnumReceivableTransactionType.md) | [**EnumReceivableTransactionType**](EnumReceivableTransactionType.md) |  | 
**collected_at** | str, datetime,  | str,  | The ISO timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**institution_transaction_id** | str,  | str,  | Internal identification number that the acquirer uses to identify the transaction. ℹ️ **Note**: For Brazil, this number is the NSU. | 
**value_hour** | str,  | str,  | The time that the transaction occurred, according to the institution, in &#x60;HH:MM&#x60; format. | 
**currency** | str,  | str,  | The currency of the transaction. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that currencies other than those listed above may be returned. | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current receivable transaction. | value must be a uuid
**net_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The net amount of the transaction. | value must be a 32 bit float
**account** | [**ReceivablesTransactionAccount**](ReceivablesTransactionAccount.md) | [**ReceivablesTransactionAccount**](ReceivablesTransactionAccount.md) |  | 
**status** | [**EnumReceivableTransactionStatus**](EnumReceivableTransactionStatus.md) | [**EnumReceivableTransactionStatus**](EnumReceivableTransactionStatus.md) |  | 
**value_date** | str, date,  | str,  | The date that the transactions occurred, according to the institution, in &#x60;YYYY-MM-DD&#x60; format. | value must conform to RFC-3339 full-date YYYY-MM-DD
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# fees

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**RecevablesTransactionFees**](RecevablesTransactionFees.md) | [**RecevablesTransactionFees**](RecevablesTransactionFees.md) | [**RecevablesTransactionFees**](RecevablesTransactionFees.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

