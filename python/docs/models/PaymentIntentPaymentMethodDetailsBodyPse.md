# belvo_client.model.payment_intent_payment_method_details_body_pse.PaymentIntentPaymentMethodDetailsBodyPse

Details about the payment method type selected.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details about the payment method type selected. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**callback_url** | str,  | str,  | The callback URL that your user will be redirected to after confirming the payment in their banking application. | 
**belvo_flow** | bool,  | BoolClass,  | This parameter determines the payment flow of the payment intent. By default, this is set to &#x60;true&#x60; and the payment intent created is processed using the Belvo&#x27;s payment flow and Belvo-integrated institutions. When set to &#x60;false&#x60;, the payment intent process uses institutions not integrated into Belvo&#x27;s flow.        | if omitted the server will use the default value of True
**beneficiary_bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary’s bank account. | value must be a uuid
**payer_institution** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique identifier for the payer’s institution. | [optional] value must be a uuid
**payer_bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the customer’s bank account. | [optional] value must be a uuid
**username** | str,  | str,  | The username used to log in to the institution. This value is obfuscated. | [optional] 
**password** | str,  | str,  | The password used to log in to the institution. This value is obfuscated. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

