

# AccountsLoanData

The loan options associated with this account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**contractAmount** | **Float** | The initial total loan amount, calculated by the institution, when the contract was signed. This amount includes the principal + interest + taxes + fees. |  [optional] |
|**principal** | **Float** | Total amount of the loan (the amount the user receives). |  |
|**loanType** | **String** | The type of the loan, according to the institution. |  [optional] |
|**paymentDay** | **String** | The day of the month by which the owner needs to pay the loan (&#x60;YYYY-MM-DD&#x60;). |  [optional] |
|**outstandingPrincipal** | **Float** | Outstanding loan amount, that is, how much remains to pay on the principal (not including interest).  |  [optional] |
|**outstandingBalance** | **Float** | The amount remaining to pay in total, including interest. |  |
|**monthlyPayment** | **Float** | The recurrent monthly payment, if applicable. |  |
|**interestRates** | [**List&lt;AccountsLoanDataInterestRate&gt;**](AccountsLoanDataInterestRate.md) | Breakdown of the interest applied to the loan. |  |
|**fees** | [**List&lt;AccountsLoanDataFees&gt;**](AccountsLoanDataFees.md) | Breakdown of the fees applied to the loan. |  [optional] |
|**numberOfInstallmentsTotal** | **Integer** | The total number of installments required to pay the loan. |  [optional] |
|**numberOfInstallmentsOutstanding** | **Integer** | The number of installments left to pay. |  [optional] |
|**contractStartDate** | **LocalDate** | The date when the loan contract was signed (&#x60;YYYY-MM-DD&#x60;). |  [optional] |
|**contractEndDate** | **LocalDate** | The date when the loan is expected to be completed. |  [optional] |
|**contractNumber** | **String** | The contract number of the loan, as given by the institution. |  [optional] |
|**creditLimit** | **Double** | This field has been deprecated.  Please see &#x60;principal&#x60; instead.  |  [optional] |
|**lastPeriodBalance** | **Double** | This field has been deprecated.  Please see &#x60;outstanding_balance&#x60; instead.  |  [optional] |
|**interestRate** | **Double** | This field has been deprecated.  Please see the &#x60;interest_rates&#x60; object instead.  |  [optional] |
|**limitDay** | **String** | This field has been deprecated.  Please see &#x60;payment_day&#x60; instead.  |  [optional] |
|**cuttingDay** | **String** | This field has been deprecated.  The closing day of the month for the loan.  |  [optional] |
|**cuttingDate** | **String** | This field has been deprecated.  The closing date of the loan period.  |  [optional] |
|**lastPaymentDate** | **String** | This field has been deprecated.  The date when the last loan payment was made.  |  [optional] |
|**noInterestPayment** | **Double** | This field has been deprecated.  The minimum amount required to pay to avoid generating interest.  |  [optional] |



