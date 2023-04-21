# belvo_client.model.accounts_loan_data_interest_rate.AccountsLoanDataInterestRate

Breakdown of the interest applied to the loan.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Breakdown of the interest applied to the loan. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**name** | None, str,  | NoneClass, str,  | The name of the type of interest rate applied to the loan. | 
**type** | [**EnumLoanDataInterestRateType**](EnumLoanDataInterestRateType.md) | [**EnumLoanDataInterestRateType**](EnumLoanDataInterestRateType.md) |  | 
**value** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The interest rate (in percent or currency value). | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

