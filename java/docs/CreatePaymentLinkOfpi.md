

# CreatePaymentLinkOfpi


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the payment.  |  |
|**amount** | **String** | Amount to be paid by your customer.    For OFPI, you can send through numbers with up to two decimal points, separated by a &#x60;.&#x60; period. For example: &#x60;\&quot;2853.78\&quot;&#x60;  |  |
|**customer** | **String** | Belvo&#39;s unique ID to reference the customer.  |  |
|**allowedPaymentMethodTypes** | **List&lt;EnumPaymentLinkAllowedPaymentMethod&gt;** | A list of payment method types allowed in this payment intent. For OFPI, this value must be set to &#x60;open_finance&#x60;. |  |
|**provider** | **EnumPaymentLinkProvider** |  |  |
|**paymentMethodDetails** | [**PaymentMethodDetailsOfpi**](PaymentMethodDetailsOfpi.md) |  |  |
|**callbackUrls** | [**PaymentLinkCallbackUrls**](PaymentLinkCallbackUrls.md) |  |  [optional] |
|**expiresIn** | **String** | The payment link expiration time. It allows the following formats to be sent through:    - whole number + &#x60;m&#x60; for x amount of minutes. For example: &#x60;15m&#x60; for 15 minutes.   - whole number + &#x60;h&#x60; for x amount of hours. For example: &#x60;12h&#x60; for 12 hours.   - whole number + &#x60;d&#x60; for x amount of days. For example: &#x60;30d&#x60; for 30 days.    ℹ️ The minimum expiration time allowed for a payment link is &#x60;1m&#x60; (1 minute) and the maximum is &#x60;90d&#x60; (90 days). |  [optional] |



