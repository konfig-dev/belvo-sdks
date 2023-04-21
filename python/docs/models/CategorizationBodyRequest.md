# belvo_client.model.categorization_body_request.CategorizationBodyRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**transaction_id** | str,  | str,  | Your unique ID for the transaction. | 
**account_holder_id** | str,  | str,  | Your unique ID for the account holder. | 
**institution** | str,  | str,  | The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution. | 
**amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The transaction amount. | value must be a 32 bit float
**account_id** | str,  | str,  | Your unique ID for the account where the transaction occurred. | 
**account_holder_type** | [**EnumCategorizationAccountHolderType**](EnumCategorizationAccountHolderType.md) | [**EnumCategorizationAccountHolderType**](EnumCategorizationAccountHolderType.md) |  | 
**account_category** | [**EnumCategorizationAccountCategory**](EnumCategorizationAccountCategory.md) | [**EnumCategorizationAccountCategory**](EnumCategorizationAccountCategory.md) |  | 
**description** | str,  | str,  | The description of the transaction. | 
**currency** | str,  | str,  | The currency of the account, in ISO-4217 format. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso) | 
**type** | [**EnumCategorizationTransactionType**](EnumCategorizationTransactionType.md) | [**EnumCategorizationTransactionType**](EnumCategorizationTransactionType.md) |  | 
**value_date** | str, date,  | str,  | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. | value must conform to RFC-3339 full-date YYYY-MM-DD
**mcc** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The four-digit ISO 18245 Merchant Category Code (MCC). Only required when &#x60;account_category&#x60; &#x3D; &#x60;CREDIT_CARD&#x60;. | [optional] value must be a 32 bit integer
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

