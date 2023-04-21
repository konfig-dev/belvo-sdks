# belvo_client.model.next_step_display_payment_succeeded.NextStepDisplayPaymentSucceeded

Object detailing the next steps you should follow for a specific `next_step` type.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object detailing the next steps you should follow for a specific &#x60;next_step&#x60; type. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**type** | str,  | str,  | The type of &#x60;next_step&#x60; you need to follow.  | [optional] must be one of ["open_finance_display_payment_method_information", "open_finance_display_confirmation_required", "open_finance_display_needs_redirect", "open_finance_display_payment_processing", "open_finance_display_payment_succeeded", "open_finance_display_payment_failed", ] 
**open_finance_display_payment_succeeded** | [**DisplayPaymentSucceeded**](DisplayPaymentSucceeded.md) | [**DisplayPaymentSucceeded**](DisplayPaymentSucceeded.md) |  | [optional] 
**ready_to_confirm** | bool,  | BoolClass,  | Boolean that indicates whether the payment intent is ready to be confirmed.     **Note:** When set to &#x60;true&#x60;, you need to confirm the payment by making a PATCH request sending through &#x60;confirm: true&#x60;. | [optional] if omitted the server will use the default value of False
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

