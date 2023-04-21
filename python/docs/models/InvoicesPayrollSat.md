# belvo_client.model.invoices_payroll_sat.InvoicesPayrollSat

Details regarding the payroll payment. Only applicable for payroll invoices. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  | Details regarding the payroll payment. Only applicable for payroll invoices.  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total amount of the payroll payment.  | value must be a 32 bit float
**days** | None, decimal.Decimal, int,  | NoneClass, decimal.Decimal,  | The number of days covered by the payment.  | value must be a 32 bit integer
**date_to** | None, str, date,  | NoneClass, str,  | The end date of the payment period.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**type** | None, str,  | NoneClass, str,  | The payroll type, as defined by the legal entity of the country.  - 🇲🇽 Mexico [SAT catalog reference article](https://developers.belvo.com/docs/sat-catalogs#payroll-type)  | 
**version** | str,  | str,  | The version of the payroll object.  | 
**payment_date** | str, date,  | str,  | The payment date.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**date_from** | None, str, date,  | NoneClass, str,  | The start date of the payment period.  | value must conform to RFC-3339 full-date YYYY-MM-DD
**collected_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp when the data point was collected. | [optional] value must conform to RFC-3339 date-time
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

