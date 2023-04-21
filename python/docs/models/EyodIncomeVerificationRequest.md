# belvo_client.model.eyod_income_verification_request.EyodIncomeVerificationRequest

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**language** | str,  | str,  | Two-letter ISO 639-1 code for the language of the transaction. | 
**[transactions](#transactions)** | list, tuple,  | tuple,  | An array of transaction objects that you want enriched.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request. | 
**date_from** | str,  | str,  | The date from which you want to start getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_to&#x60;.  ⚠️ The value of &#x60;date_from&#x60; cannot be greater than &#x60;date_to&#x60;. | [optional] 
**date_to** | str,  | str,  | The date you want to stop getting incomes for, in &#x60;YYYY-MM-DD&#x60; format, within the last 365 days. When you use this parameter, you must also send &#x60;date_from&#x60;.  ⚠️ The value of &#x60;date_to&#x60; cannot be greater than today&#x27;s date (in other words, no future dates). | [optional] 
**[allowed_income_types](#allowed_income_types)** | list, tuple,  | tuple,  |  | [optional] 
**minimum_confidence_level** | [**EnumIncomeMinimumConfidenceLevelRequest**](EnumIncomeMinimumConfidenceLevelRequest.md) | [**EnumIncomeMinimumConfidenceLevelRequest**](EnumIncomeMinimumConfidenceLevelRequest.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# transactions

An array of transaction objects that you want enriched.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of transaction objects that you want enriched.  **Note:** Each object corresponds to one, unique transaction and you can send through up to 10,000 transactions per request. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EyodIncomeVerificationBodyRequest**](EyodIncomeVerificationBodyRequest.md) | [**EyodIncomeVerificationBodyRequest**](EyodIncomeVerificationBodyRequest.md) | [**EyodIncomeVerificationBodyRequest**](EyodIncomeVerificationBodyRequest.md) |  | 

# allowed_income_types

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EnumInvoiceAllowedIncomeTypesRequest**](EnumInvoiceAllowedIncomeTypesRequest.md) | [**EnumInvoiceAllowedIncomeTypesRequest**](EnumInvoiceAllowedIncomeTypesRequest.md) | [**EnumInvoiceAllowedIncomeTypesRequest**](EnumInvoiceAllowedIncomeTypesRequest.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

