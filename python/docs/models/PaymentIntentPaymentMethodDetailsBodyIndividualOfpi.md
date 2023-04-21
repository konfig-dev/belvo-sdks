# belvo_client.model.payment_intent_payment_method_details_body_individual_ofpi.PaymentIntentPaymentMethodDetailsBodyIndividualOfpi

Payment method type selected.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Payment method type selected. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**callback_url** | str,  | str,  | The callback URL that your user will be redirected to after confirming the payment in their banking application. | 
**beneficiary_bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary&#x27;s bank account. | value must be a uuid
**payer_institution** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID to reference the payer&#x27;s institution. | value must be a uuid
**cpf** | None, str,  | NoneClass, str,  | The customer&#x27;s CPF number. Only required when the &#x60;customer_type&#x60; is &#x60;BUSINESS&#x60;.  **Note:** This value is obfuscated. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

