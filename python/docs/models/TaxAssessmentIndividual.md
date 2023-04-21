# belvo_client.model.tax_assessment_individual.TaxAssessmentIndividual

Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**fortuitous_profit_tax** | decimal.Decimal, int, float,  | decimal.Decimal,  | The tax applied on your unexpected income (such as lottery wins or house sales). | value must be a 32 bit float
**net_income_tax** | decimal.Decimal, int, float,  | decimal.Decimal,  | After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as &#x60;total_tax_on_taxable_net_income&#x60;. | value must be a 32 bit float
**previous_year_balance** | decimal.Decimal, int, float,  | decimal.Decimal,  | Only applicable for DIAN.   The amount the tax payer has as a \&quot;credit\&quot; fromt he previous year (this is equal to the &#x60;balance_refundable&#x60;) of the previous year.  | value must be a 32 bit float
**total_tax_due** | decimal.Decimal, int, float,  | decimal.Decimal,  | After further deductions, this is the final calculated tax that the taxpayer is required to pay. | value must be a 32 bit float
**balance_refundable** | decimal.Decimal, int, float,  | decimal.Decimal,  | How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see &#x60;previous_year_balance&#x60;). | value must be a 32 bit float
**total_payment** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total the tax payer is required to pay, taking into account deductions and fiscal credits. | value must be a 32 bit float
**total_tax_on_taxable_net_income** | decimal.Decimal, int, float,  | decimal.Decimal,  | The calculated total tax that can be applied on the tax payer&#x27;s taxable income (total income - exemptions - deductions). | value must be a 32 bit float
**total_withheld_tax** | decimal.Decimal, int, float,  | decimal.Decimal,  | The total tax already withheld in the current fiscal year. | value must be a 32 bit float
**balance_payable** | decimal.Decimal, int, float,  | decimal.Decimal,  | How much the tax payer is required to pay. | value must be a 32 bit float
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

