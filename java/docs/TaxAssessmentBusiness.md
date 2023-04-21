

# TaxAssessmentBusiness

Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**netIncomeTaxable** | **Float** | The net income on which tax can be applied. |  |
|**fortuitousProfitTax** | **Float** | The tax applied on your unexpected income (such as lottery wins or house sales). |  |
|**totalTaxOnTaxableNetIncome** | **Float** | The calculated total tax that can be applied on the tax payer&#39;s taxable income (total income - exemptions - deductions). |  |
|**netIncomeTax** | **Float** | After additional deductions that you can apply, this will be the net income tax. If no further deduction are identified, this value will be the same as &#x60;total_tax_on_taxable_net_income&#x60;. |  |
|**totalTaxDue** | **Float** | After further deductions, this is the final calculated tax that the taxpayer is required to pay. |  |
|**totalWithholdingsForTheTaxableYearToBeDeclared** | **Float** | How much the tax payer has already paid througout the fiscal year. |  |
|**totalBalancePayable** | **Float** | How much the tax payer is required to pay. |  |
|**totalBalanceInFavor** | **Float** | How much the tax payer is expected to receive. |  |
|**totalPayment** | **Float** | The total the tax payer is required to pay, taking into account deductions and fiscal credits. |  |



