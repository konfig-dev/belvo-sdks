# belvo_client.model.accounts_loan_data.AccountsLoanData

The loan options associated with this account.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | The loan options associated with this account. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**principal** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Total amount of the loan (the amount the user receives). | value must be a 32 bit float
**[interest_rates](#interest_rates)** | list, tuple, None,  | tuple, NoneClass,  | Breakdown of the interest applied to the loan. | 
**outstanding_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The amount remaining to pay in total, including interest. | value must be a 32 bit float
**collected_at** | str, datetime,  | str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**monthly_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The recurrent monthly payment, if applicable. | value must be a 32 bit float
**contract_amount** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees. | [optional] value must be a 32 bit float
**loan_type** | None, str,  | NoneClass, str,  | The type of the loan, according to the institution. | [optional] 
**payment_day** | None, str,  | NoneClass, str,  | The day of the month by which the owner needs to pay the loan (&#x60;YYYY-MM-DD&#x60;). | [optional] 
**outstanding_principal** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | Outstanding loan amount, that is, how much remains to pay on the principal (not including interest).  | [optional] value must be a 32 bit float
**[fees](#fees)** | list, tuple, None,  | tuple, NoneClass,  | Breakdown of the fees applied to the loan. | [optional] 
**number_of_installments_total** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The total number of installments required to pay the loan. | [optional] value must be a 32 bit integer
**number_of_installments_outstanding** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of installments left to pay. | [optional] value must be a 32 bit integer
**contract_start_date** | None, str, date,  | NoneClass, str,  | The date when the loan contract was signed (&#x60;YYYY-MM-DD&#x60;). | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**contract_end_date** | str, date,  | str,  | The date when the loan is expected to be completed. | [optional] value must conform to RFC-3339 full-date YYYY-MM-DD
**contract_number** | None, str,  | NoneClass, str,  | The contract number of the loan, as given by the institution. | [optional] 
**credit_limit** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | This field has been deprecated.  Please see &#x60;principal&#x60; instead.  | [optional] 
**last_period_balance** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | This field has been deprecated.  Please see &#x60;outstanding_balance&#x60; instead.  | [optional] 
**interest_rate** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | This field has been deprecated.  Please see the &#x60;interest_rates&#x60; object instead.  | [optional] 
**limit_day** | None, str,  | NoneClass, str,  | This field has been deprecated.  Please see &#x60;payment_day&#x60; instead.  | [optional] 
**cutting_day** | None, str,  | NoneClass, str,  | This field has been deprecated.  The closing day of the month for the loan.  | [optional] 
**cutting_date** | None, str,  | NoneClass, str,  | This field has been deprecated.  The closing date of the loan period.  | [optional] 
**last_payment_date** | None, str,  | NoneClass, str,  | This field has been deprecated.  The date when the last loan payment was made.  | [optional] 
**no_interest_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | This field has been deprecated.  The minimum amount required to pay to avoid generating interest.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# interest_rates

Breakdown of the interest applied to the loan.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Breakdown of the interest applied to the loan. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AccountsLoanDataInterestRate**](AccountsLoanDataInterestRate.md) | [**AccountsLoanDataInterestRate**](AccountsLoanDataInterestRate.md) | [**AccountsLoanDataInterestRate**](AccountsLoanDataInterestRate.md) |  | 

# fees

Breakdown of the fees applied to the loan.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Breakdown of the fees applied to the loan. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**AccountsLoanDataFees**](AccountsLoanDataFees.md) | [**AccountsLoanDataFees**](AccountsLoanDataFees.md) | [**AccountsLoanDataFees**](AccountsLoanDataFees.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

