

# RecurringExpenseSourceTransaction

An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the transaction provided by the institution. Usually, this is the text that the end user would see in the bank statement. The description can be an empty string. |  |
|**amount** | **Float** | The transaction amount. |  |
|**valueDate** | **LocalDate** | The date when the transaction occurred, in &#x60;YYYY-MM-DD&#x60; format. |  |



