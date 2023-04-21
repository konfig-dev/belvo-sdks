# belvo_client.model.account.Account

Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the account.  **Note**: For our recurring expenses resource, this account relates to the account that was analyzed to generate the recurring expenses report.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**loan_data** | [**AccountsLoanData**](AccountsLoanData.md) | [**AccountsLoanData**](AccountsLoanData.md) |  | 
**public_identification_value** | None, str,  | NoneClass, str,  | The value for the &#x60;public_identification_name&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be the agency and bank account number, separated by a slash. For example: &#x60;0444/45722-0&#x60;.  | 
**type** | None, str,  | NoneClass, str,  | The account type, as designated by the institution. | 
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**number** | None, str,  | NoneClass, str,  | The account number, as designated by the institution. | 
**balance** | [**AccountsBalance**](AccountsBalance.md) | [**AccountsBalance**](AccountsBalance.md) |  | 
**credit_data** | [**AccountsCreditData**](AccountsCreditData.md) | [**AccountsCreditData**](AccountsCreditData.md) |  | 
**name** | None, str,  | NoneClass, str,  | The account name, as given by the institution. | 
**balance_type** | None, str,  | NoneClass, str,  | Indicates whether this account is either an &#x60;ASSET&#x60; or a &#x60;LIABILITY&#x60;. You can consider the balance of an &#x60;ASSET&#x60; as being positive, while the balance of a &#x60;LIABILITY&#x60; as negative.  | 
**currency** | None, str,  | NoneClass, str,  | The currency of the account. For example: - 🇧🇷 BRL (Brazilian Real) - 🇨🇴 COP (Colombian Peso) - 🇲🇽 MXN (Mexican Peso)   Please note that other currencies other than in the list above may be returned. | 
**last_accessed_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of Belvo&#x27;s most recent successful access to the institution for the given link. | value must conform to RFC-3339 date-time
**category** | [**EnumAccountCategory**](EnumAccountCategory.md) | [**EnumAccountCategory**](EnumAccountCategory.md) |  | 
**public_identification_name** | None, str,  | NoneClass, str,  | The public name for the type of identification. For example: &#x60;\&quot;CLABE\&quot;&#x60;.  ℹ️ For 🇧🇷 Brazilian savings and checking accounts, this field will be &#x60;AGENCY/ACCOUNT&#x60;.  | 
**id** | str, uuid.UUID,  | str,  | The unique identifier created by Belvo used to reference the current account. | [optional] value must be a uuid
**link** | None, str,  | NoneClass, str,  | The &#x60;link.id&#x60; the account belongs to. | [optional] 
**institution** | [**InstitutionAccount**](InstitutionAccount.md) | [**InstitutionAccount**](InstitutionAccount.md) |  | [optional] 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | [optional] value must conform to RFC-3339 date-time
**[funds_data](#funds_data)** | list, tuple, None,  | tuple, NoneClass,  | One or more funds that contribute to the the pension account. | [optional] 
**receivables_data** | [**AccountsReceivablesData**](AccountsReceivablesData.md) | [**AccountsReceivablesData**](AccountsReceivablesData.md) |  | [optional] 
**bank_product_id** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The institution&#x27;s product ID for the account type.*  | [optional] 
**internal_identification** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  *The institution&#x27;s internal identification for the account.*  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# funds_data

One or more funds that contribute to the the pension account.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | One or more funds that contribute to the the pension account. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AccountsFundsData**](AccountsFundsData.md) | [**AccountsFundsData**](AccountsFundsData.md) | [**AccountsFundsData**](AccountsFundsData.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

