

# PaymentIntentPse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the payment.  |  |
|**id** | **UUID** | Belvo&#39;s unique ID for the current payment intent. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created this payment intent. |  |
|**customer** | **UUID** | Belvo&#39;s unique ID for the customer related to this payment intent. |  |
|**allowedPaymentMethodTypes** | **List&lt;EnumPaymentLinkAllowedPaymentMethod&gt;** | A list of payment method types allowed in this payment intent. For PSE, the value will be &#x60;pse&#x60;. |  |
|**amount** | **String** | Amount to be paid by your customer in this payment intent.  |  |
|**currency** | **EnumPaymentsCurrency** |  |  |
|**failureCode** | **String** | Error code that explains the reason behind a payment being unsuccessful (if applicable).  |  |
|**failureMessage** | **String** | Further information regarding the &#x60;failure_code&#x60;.  |  |
|**metadata** | **Object** | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. |  [optional] |
|**nextStep** | **Object** |  |  |
|**lastError** | **Object** |  |  |
|**paymentMethodDetails** | [**PaymentIntentPaymentMethodDetailsPse**](PaymentIntentPaymentMethodDetailsPse.md) |  |  |
|**paymentMethodInformation** | [**PaymentMethodInformationPse**](PaymentMethodInformationPse.md) |  |  |
|**charges** | [**List&lt;Charge&gt;**](Charge.md) | An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.  **Note**: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource.  |  [optional] |
|**provider** | **EnumPaymentLinkProvider** |  |  |
|**selectedPaymentMethodType** | **EnumPaymentLinkAllowedPaymentMethod** |  |  |
|**status** | **EnumPaymentIntentStatus** |  |  |
|**updatedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the payment intent was last updated.  |  |



