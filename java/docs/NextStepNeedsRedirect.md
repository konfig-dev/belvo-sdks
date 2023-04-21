

# NextStepNeedsRedirect

Object detailing the next steps you should follow for a specific `next_step` type.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of &#x60;next_step&#x60; you need to follow. |  [optional] |
|**openFinanceDisplayNeedsRedirect** | [**NeedsRedirectContent**](NeedsRedirectContent.md) |  |  [optional] |
|**readyToConfirm** | **Boolean** | Boolean that indicates whether the payment intent is ready to be confirmed.     **Note:** When set to &#x60;true&#x60;, you need to confirm the payment by making a PATCH request sending through &#x60;confirm: true&#x60;. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_METHOD_INFORMATION | &quot;open_finance_display_payment_method_information&quot; |
| CONFIRMATION_REQUIRED | &quot;open_finance_display_confirmation_required&quot; |
| NEEDS_REDIRECT | &quot;open_finance_display_needs_redirect&quot; |
| PAYMENT_PROCESSING | &quot;open_finance_display_payment_processing&quot; |
| PAYMENT_SUCCEEDED | &quot;open_finance_display_payment_succeeded&quot; |
| PAYMENT_FAILED | &quot;open_finance_display_payment_failed&quot; |



