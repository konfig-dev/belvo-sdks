# belvo_client.model.tax_assessment_business.TaxAssessmentBusiness

Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**fortuitous_profit_tax** | decimal.Decimal, int, float,  | decimal.Decimal,  | The tax applied on your unexpected income (such as lottery wins or house sales). | value must be a 32 bit float
**net_income_tax** | decimal.Decimal, int, float,  | decimal.Decimal,  | After additional deductions that you can apply, this will be the net income tax. If no further deduction are identified, this value will be the same as &#x60;total_tax_on_taxable_net_income&#x60;. | value must be a 32 bit float
**total_withholdings_for_the_taxable_year_to_be_declared** | decimal.Decimal, int, float,  | decimal.Decimal,  | How much the tax payer has already paid througout the fiscal year. | value must be a 32 bit float
**total_balance_payable** | decimal.Decimal, int, float,  | decimal.Decimal,  | How much the tax payer is required to pay. | value must be a 32 bit float
**total_balance_in_favor** | decimal.Decimal, int, float,  | decimal.Decimal,  | How much the tax payer is expected to receive. | value must be a 32 bit float
**total_tax_due** | decimal.Decimal, int, float,  | decimal.Decimal,  | After further deductions, this is the final calculated tax that the taxpayer is required to pay. | value must be a 32 bit float
**net_income_taxable** | decimal.Decimal, int, float,  | decimal.Decimal,  | The net income on which tax can be applied. | value must be a 32 bit float
**total_payment** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total the tax payer is required to pay, taking into account deductions and fiscal credits. | value must be a 32 bit float
**total_tax_on_taxable_net_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | The calculated total tax that can be applied on the tax payer&#x27;s taxable income (total income - exemptions - deductions). | value must be a 32 bit float
**total_withheld_tax** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

