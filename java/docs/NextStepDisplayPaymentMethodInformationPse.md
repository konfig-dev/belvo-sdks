

# NextStepDisplayPaymentMethodInformationPse

Object detailing the next steps you should follow for a specific `next_step` type. You'll need to send a PATCH request with the institution selected by the customer or their bank accounts (if there are accounts already saved in the Belvo database).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of &#x60;next_step&#x60; you need to follow.  |  [optional] |
|**pseDisplayPaymentMethodInformation** | [**DisplayPaymentMethodInformationContentPse**](DisplayPaymentMethodInformationContentPse.md) |  |  [optional] |
|**readyToConfirm** | **Boolean** | Boolean that indicates whether the payment intent is ready to be confirmed.     **Note:** When the value is &#x60;true&#x60;, you&#39;ll need to make a PATCH request sending through &#x60;confirm: true&#x60; to confirm the payment. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PAYMENT_METHOD_INFORMATION | &quot;pse_display_payment_method_information&quot; |
| CREDENTIALS_REQUIRED | &quot;pse_display_credentials_required&quot; |
| NEEDS_REDIRECT | &quot;pse_display_needs_redirect&quot; |
| TOKEN_REQUIRED | &quot;pse_display_token_required&quot; |
| CUSTOMER_BANK_ACCOUNTS | &quot;pse_display_customer_bank_accounts&quot; |
| CONFIRMATION_REQUIRED | &quot;pse_display_confirmation_required&quot; |
| PAYMENT_PROCESSING | &quot;pse_display_payment_processing&quot; |
| PAYMENT_FAILED | &quot;pse_display_payment_failed&quot; |
| PAYMENT_SUCCEEDED | &quot;pse_display_payment_succeeded&quot; |



