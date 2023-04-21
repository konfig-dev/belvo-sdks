# belvo_client.model.next_step_display_token_required_pse.NextStepDisplayTokenRequiredPse

Object detailing the next steps you should follow for a specific `next_step` type.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object detailing the next steps you should follow for a specific &#x60;next_step&#x60; type. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**type** | str,  | str,  | The type of &#x60;next_step&#x60; you need to follow.  | [optional] must be one of ["pse_display_payment_method_information", "pse_display_credentials_required", "pse_display_needs_redirect", "pse_display_token_required", "pse_display_customer_bank_accounts", "pse_display_confirmation_required", "pse_display_payment_processing", "pse_display_payment_failed", "pse_display_payment_succeeded", ] 
**pse_display_token_required** | [**DisplayTokenRequiredContentPse**](DisplayTokenRequiredContentPse.md) | [**DisplayTokenRequiredContentPse**](DisplayTokenRequiredContentPse.md) |  | [optional] 
**ready_to_confirm** | bool,  | BoolClass,  | Boolean that indicates whether the payment intent is ready to be confirmed. This value will return:     - &#x60;false&#x60; when a customer wants to pay for the very first time. This is so because you still need to input information about your customer in the following steps to process a payment successfully.    - &#x60;true&#x60; when a customer wants to pay and this is not their first time. This is so because the payment intent has all the information needed about the customer to process a payment.    **Note:** When the value is &#x60;true&#x60;, you&#x27;ll need to confirm the payment intent. You can do this by making a PATCH request sending through the parameter &#x60;confirm: true&#x60;. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

