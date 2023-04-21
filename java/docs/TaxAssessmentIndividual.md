

# TaxAssessmentIndividual

Object containing the calculated tax assessment of the tax payer. This includes the total taxable income, the income tax applied, and taxes already withheld.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**fortuitousProfitTax** | **Float** | The tax applied on your unexpected income (such as lottery wins or house sales). |  |
|**totalTaxOnTaxableNetIncome** | **Float** | The calculated total tax that can be applied on the tax payer&#39;s taxable income (total income - exemptions - deductions). |  |
|**netIncomeTax** | **Float** | After additional deductions that you can apply, this will be the net income tax. If not further deduction are identified, this value will be the same as &#x60;total_tax_on_taxable_net_income&#x60;. |  |
|**totalTaxDue** | **Float** | After further deductions, this is the final calculated tax that the taxpayer is required to pay. |  |
|**previousYearBalance** | **Float** | Only applicable for DIAN.   The amount the tax payer has as a \&quot;credit\&quot; fromt he previous year (this is equal to the &#x60;balance_refundable&#x60;) of the previous year.  |  |
|**totalWithheldTax** | **Float** | The total tax already withheld in the current fiscal year. |  |
|**balancePayable** | **Float** | How much the tax payer is required to pay. |  |
|**balanceRefundable** | **Float** | How much the tax payer is expected to receive. For DIAN, this will count as credit for the next fiscal year (see &#x60;previous_year_balance&#x60;). |  |
|**totalPayment** | **Float** | The total the tax payer is required to pay, taking into account deductions and fiscal credits. |  |



