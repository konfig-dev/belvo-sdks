# belvo_client.model.annual_income_statement_business.AnnualIncomeStatementBusiness

Object containing the reported annual incomes, deductions, and final balances of the tax payer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the reported annual incomes, deductions, and final balances of the tax payer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**gross_income_from_ordinary_activities** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total gross income that the company generated from their main economic activity. | value must be a 32 bit float
**other_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total income that the company generated from activities not associated with their main economic activity. | value must be a 32 bit float
**returns_rebates_and_discounts_on_sales** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total value of cancelled orders, corrected invoices, or similar, that can be discounted from the &#x60;total_gross_income&#x60;. | value must be a 32 bit float
**total_net_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total net income of the company, taking into account &#x60;returns_rebates_and_discounts_on_sales&#x60;. | value must be a 32 bit float
**dividends** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total income that the company generated from dividends. | value must be a 32 bit float
**total_gross_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total gross income the company generated. | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

