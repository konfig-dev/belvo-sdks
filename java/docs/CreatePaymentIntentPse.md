

# CreatePaymentIntentPse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the payment.  |  |
|**amount** | **String** | Amount to be paid by your customer.   For PSE, you can only send whole numbers (integers). For example: &#x60;\&quot;350000\&quot;&#x60;.  |  |
|**customer** | **UUID** | Belvo&#39;s unique ID to reference the customer.  |  |
|**allowedPaymentMethodTypes** | **List&lt;EnumPaymentLinkAllowedPaymentMethod&gt;** | A list of payment method types allowed in this payment intent. For PSE, this value must be set to &#x60;pse&#x60;. |  |
|**paymentMethodDetails** | [**PaymentIntentsPaymentMethodDetailsPse**](PaymentIntentsPaymentMethodDetailsPse.md) |  |  |
|**provider** | **EnumPaymentLinkProvider** |  |  |
|**metadata** | **Object** | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. |  [optional] |



