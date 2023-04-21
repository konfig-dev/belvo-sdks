# belvo_client.model.annual_income_statement_individual.AnnualIncomeStatementIndividual

Object containing the reported annual incomes, deductions, and final balances of the tax payer.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the reported annual incomes, deductions, and final balances of the tax payer. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**gross_income** | [**GrossIncomeIndividual**](GrossIncomeIndividual.md) | [**GrossIncomeIndividual**](GrossIncomeIndividual.md) |  | 
**net_income** | [**NetIncomeIndividual**](NetIncomeIndividual.md) | [**NetIncomeIndividual**](NetIncomeIndividual.md) |  | 
**non_taxable_income** | [**NonTaxableIncomeIndividual**](NonTaxableIncomeIndividual.md) | [**NonTaxableIncomeIndividual**](NonTaxableIncomeIndividual.md) |  | 
**annual_totals** | [**AnnualTotalsIndividual**](AnnualTotalsIndividual.md) | [**AnnualTotalsIndividual**](AnnualTotalsIndividual.md) |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

