# belvo_client.model.accounts_credit_data.AccountsCreditData

The credit options associated with this account.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | The credit options associated with this account. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**no_interest_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The minimum amount required to pay to avoid generating interest. | value must be a 32 bit float
**credit_limit** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The maximum amount of credit the owner can receive. | value must be a 32 bit float
**minimum_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The minimum amount to be paid on the &#x60;next_payment_date&#x60;. | value must be a 32 bit float
**interest_rate** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | The annualized interest rate of the credit. | value must be a 32 bit float
**cutting_date** | None, str,  | NoneClass, str,  | The closing date of the credit period. | 
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | value must conform to RFC-3339 date-time
**next_payment_date** | None, str,  | NoneClass, str,  | The due date for the next payment (&#x60;YYYY-MM-DD&#x60;). | 
**end_date** | None, str,  | NoneClass, str,  | *This field has been deprecated.*  | [optional] 
**monthly_payment** | None, decimal.Decimal, int, float,  | NoneClass, decimal.Decimal,  | *This field has been deprecated.*  *The recurrent monthly payment, if applicable.*  | [optional] 
**last_payment_date** | None, str,  | NoneClass, str,  | *This field has been deprecated.*   *The date when the last credit payment was made.*  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

