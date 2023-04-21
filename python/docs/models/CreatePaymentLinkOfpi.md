# belvo_client.model.create_payment_link_ofpi.CreatePaymentLinkOfpi

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | str,  | str,  | Amount to be paid by your customer.    For OFPI, you can send through numbers with up to two decimal points, separated by a &#x60;.&#x60; period. For example: &#x60;\&quot;2853.78\&quot;&#x60;  | 
**provider** | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) |  | 
**payment_method_details** | [**PaymentMethodDetailsOfpi**](PaymentMethodDetailsOfpi.md) | [**PaymentMethodDetailsOfpi**](PaymentMethodDetailsOfpi.md) |  | 
**description** | str,  | str,  | The description of the payment.  | 
**[allowed_payment_method_types](#allowed_payment_method_types)** | list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For OFPI, this value must be set to &#x60;open_finance&#x60;. | 
**customer** | str,  | str,  | Belvo&#x27;s unique ID to reference the customer.  | 
**callback_urls** | [**PaymentLinkCallbackUrls**](PaymentLinkCallbackUrls.md) | [**PaymentLinkCallbackUrls**](PaymentLinkCallbackUrls.md) |  | [optional] 
**expires_in** | str,  | str,  | The payment link expiration time. It allows the following formats to be sent through:    - whole number + &#x60;m&#x60; for x amount of minutes. For example: &#x60;15m&#x60; for 15 minutes.   - whole number + &#x60;h&#x60; for x amount of hours. For example: &#x60;12h&#x60; for 12 hours.   - whole number + &#x60;d&#x60; for x amount of days. For example: &#x60;30d&#x60; for 30 days.    ℹ️ The minimum expiration time allowed for a payment link is &#x60;1m&#x60; (1 minute) and the maximum is &#x60;90d&#x60; (90 days). | [optional] if omitted the server will use the default value of "7d"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# allowed_payment_method_types

A list of payment method types allowed in this payment intent. For OFPI, this value must be set to `open_finance`.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For OFPI, this value must be set to &#x60;open_finance&#x60;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

