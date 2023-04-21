# belvo_client.model.annual_costs_and_deductions_statement_business.AnnualCostsAndDeductionsStatementBusiness

Object containing the reported annual costs and applicable deductions.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the reported annual costs and applicable deductions. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**costs** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total costs for the company to operate. | value must be a 32 bit float
**total_costs_and_deductible_expenses** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total value of all costs and dedictible expenses. | value must be a 32 bit float
**administration_expenses** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total costs of the company related to training, company offsites, or similar. | value must be a 32 bit float
**distribution_and_sales_expenses** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total costs the company incurred in order to distribute or sell their product. | value must be a 32 bit float
**financial_expenses** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total value of any fees incurred by the company to operate (such as bank fees). | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

