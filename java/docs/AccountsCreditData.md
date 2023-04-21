

# AccountsCreditData

The credit options associated with this account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**creditLimit** | **Float** | The maximum amount of credit the owner can receive. |  |
|**collectedAt** | **OffsetDateTime** | The ISO-8601 timestamp when the data point was collected. |  |
|**cuttingDate** | **String** | The closing date of the credit period. |  |
|**nextPaymentDate** | **String** | The due date for the next payment (&#x60;YYYY-MM-DD&#x60;). |  |
|**minimumPayment** | **Float** | The minimum amount to be paid on the &#x60;next_payment_date&#x60;. |  |
|**noInterestPayment** | **Float** | The minimum amount required to pay to avoid generating interest. |  |
|**interestRate** | **Float** | The annualized interest rate of the credit. |  |
|**endDate** | **String** | *This field has been deprecated.*  |  [optional] |
|**monthlyPayment** | **Double** | *This field has been deprecated.*  *The recurrent monthly payment, if applicable.*  |  [optional] |
|**lastPaymentDate** | **String** | *This field has been deprecated.*   *The date when the last credit payment was made.*  |  [optional] |



