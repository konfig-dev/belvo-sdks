# belvo_client.model.payment_links_payment_method_details_body_pse.PaymentLinksPaymentMethodDetailsBodyPse

Details about the organization's bank account that will receive the payment.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Details about the organization&#x27;s bank account that will receive the payment. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**belvo_flow** | bool,  | BoolClass,  | This parameter determines the payment flow of the payment intent. By default, this is set to &#x60;true&#x60; and the payment intent created is processed using the Belvo&#x27;s payment flow and Belvo-integrated institutions. When set to &#x60;false&#x60;, the payment intent process uses institutions not integrated into Belvo&#x27;s flow.        | if omitted the server will use the default value of True
**beneficiary_bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary&#x27;s bank account. | value must be a uuid
**callback_url** | str,  | str,  | The URL to your application that your customer will be directed to once they confirm the payment in their bank application. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

