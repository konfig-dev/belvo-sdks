# belvo_client.model.create_payment_intent_pse.CreatePaymentIntentPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | str,  | str,  | Amount to be paid by your customer.   For PSE, you can only send whole numbers (integers). For example: &#x60;\&quot;350000\&quot;&#x60;.  | 
**provider** | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) |  | 
**payment_method_details** | [**PaymentIntentsPaymentMethodDetailsPse**](PaymentIntentsPaymentMethodDetailsPse.md) | [**PaymentIntentsPaymentMethodDetailsPse**](PaymentIntentsPaymentMethodDetailsPse.md) |  | 
**description** | str,  | str,  | The description of the payment.  | 
**[allowed_payment_method_types](#allowed_payment_method_types)** | list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For PSE, this value must be set to &#x60;pse&#x60;. | 
**customer** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID to reference the customer.  | value must be a uuid
**[metadata](#metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# allowed_payment_method_types

A list of payment method types allowed in this payment intent. For PSE, this value must be set to `pse`.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For PSE, this value must be set to &#x60;pse&#x60;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) |  | 

# metadata

Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

