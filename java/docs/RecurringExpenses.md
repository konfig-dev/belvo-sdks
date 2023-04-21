

# RecurringExpenses

Recurring expense insights.   ℹ️ If no recurring expense insights are found, we return an empty array. 

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Belvo&#39;s unique identifier used to reference the current recurring expense. |  [optional] |
|**account** | [**Account**](Account.md) |  |  |
|**name** | **String** | The name for the recurring expense.  ℹ️ **Note**: This information is taken from the description section of a transaction and then normalized to provide you with an easy-to-read name. As such, sometimes the name will reflect the merchant the payment is made to (for example, Netflix.com), while for other recurring expenses, this could be something like \&quot;Monthly payment to John\&quot;.  |  |
|**transactions** | [**List&lt;RecurringExpenseSourceTransaction&gt;**](RecurringExpenseSourceTransaction.md) | An array of minified transaction objects used to evaluate the recurring expense. If no transactions were found, we return an empty array. |  |
|**frequency** | **EnumRecurringExpenseFrequency** |  |  |
|**averageTransactionAmount** | **Float** | The average transaction amount of the recurring expense. |  |
|**medianTransactionAmount** | **Float** | The median transaction amount of the recurring expense. |  |
|**daysSinceLastTransaction** | **Integer** | Number of days since the last recurring expense occurred.  Based on the frequency, you can infer how many days until the next charge will occur.  |  |
|**category** | **EnumRecurringExpenseCategory** |  |  |
|**paymentType** | **EnumRecurringExpensePaymentType** |  |  |



