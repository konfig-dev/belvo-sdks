# belvo_client.model.annual_totals_individual.AnnualTotalsIndividual

Object containing the tax payers total exempt, deducted, and ordinary net incomes.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the tax payers total exempt, deducted, and ordinary net incomes. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**total_applicable_deductions** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total deductions that the taxpayer can apply to their income, according to the institution. | value must be a 32 bit float
**total_exempt_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Total income that is not taxable, according to the institution. | value must be a 32 bit float
**total_exemptions_and_deductions** | decimal.Decimal, int, float,  | decimal.Decimal,  | Sum total of all exempt and deductions that can be applied to the taxpayer&#x27;s income. | value must be a 32 bit float
**total_ordinary_net_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | Sum total of the taxpayer&#x27;s income (gross income - exemptions - deductions). | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

