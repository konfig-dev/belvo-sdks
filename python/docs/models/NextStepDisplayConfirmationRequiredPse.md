# belvo_client.model.next_step_display_confirmation_required_pse.NextStepDisplayConfirmationRequiredPse

Object detailing the next steps you should follow for a specific `next_step` type.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object detailing the next steps you should follow for a specific &#x60;next_step&#x60; type. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**type** | str,  | str,  | The type of &#x60;next_step&#x60; you need to follow.  | [optional] must be one of ["pse_display_payment_method_information", "pse_display_credentials_required", "pse_display_needs_redirect", "pse_display_token_required", "pse_display_customer_bank_accounts", "pse_display_confirmation_required", "pse_display_payment_processing", "pse_display_payment_failed", "pse_display_payment_succeeded", ] 
**pse_display_confirmation_required** | [**DisplayConfirmationRequiredContentPse**](DisplayConfirmationRequiredContentPse.md) | [**DisplayConfirmationRequiredContentPse**](DisplayConfirmationRequiredContentPse.md) |  | [optional] 
**ready_to_confirm** | bool,  | BoolClass,  | Boolean that indicates whether the payment intent is ready to be confirmed.     **Note:** When the value is &#x60;true&#x60;, you&#x27;ll need to make a PATCH request sending through &#x60;confirm: true&#x60; to confirm the payment. | [optional] if omitted the server will use the default value of True
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

