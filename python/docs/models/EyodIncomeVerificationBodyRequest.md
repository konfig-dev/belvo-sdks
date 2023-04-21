# belvo_client.model.eyod_income_verification_body_request.EyodIncomeVerificationBodyRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**transaction_id** | str,  | str,  | Your unique ID for the income. | 
**account_holder_id** | str, uuid.UUID,  | str,  | Your unique ID for the account holder, in UUID format. | value must be a uuid
**institution** | str,  | str,  | The institution where the account is registered.  &gt;**Note:** This is the name that you use in your system to identify an institution. | 
**amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The income amount. | value must be a 32 bit float
**account_id** | str,  | str,  | Your unique ID for the account where the transaction occurred. | 
**account_holder_type** | [**EnumIncomeVerificationAccountHolderType**](EnumIncomeVerificationAccountHolderType.md) | [**EnumIncomeVerificationAccountHolderType**](EnumIncomeVerificationAccountHolderType.md) |  | 
**account_category** | [**EnumIncomeVerificationAccountCategory**](EnumIncomeVerificationAccountCategory.md) | [**EnumIncomeVerificationAccountCategory**](EnumIncomeVerificationAccountCategory.md) |  | 
**description** | str,  | str,  | The description of the income. | 
**currency** | str,  | str,  | The three-letter currency code of the income. For example:    • 🇧🇷 BRL (Brazilian Real)   • 🇨🇴 COP (Colombian Peso)   • 🇲🇽 MXN (Mexican Peso)    | 
**type** | [**EnumIncomeVerificationType**](EnumIncomeVerificationType.md) | [**EnumIncomeVerificationType**](EnumIncomeVerificationType.md) |  | 
**value_date** | str, date,  | str,  | The date when the income transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. | value must conform to RFC-3339 full-date YYYY-MM-DD
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

