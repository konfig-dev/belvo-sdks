

# Charge


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the payment.  |  [optional] |
|**id** | **UUID** | Belvo&#39;s unique ID for the current charge. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the charge. |  [optional] |
|**customer** | **UUID** | Belvo&#39;s unique ID for the customer that the charge was created for. |  [optional] |
|**failureCode** | **String** | Error code that explains the reason behind a payment being unsuccessful (if applicable).  |  |
|**failureMessage** | **String** | Further information regarding the &#x60;failure_code&#x60;.  |  |
|**status** | [**StatusEnum**](#StatusEnum) | The current status of the charge.  |  |
|**amount** | **String** | The amount of the charge.  |  |
|**currency** | **EnumPaymentsCurrency** |  |  [optional] |
|**metadata** | **Object** | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. |  |
|**beneficiary** | **UUID** | Belvo&#39;s unique ID used to identify the beneficiary’s bank account. |  |
|**provider** | **EnumPaymentLinkProvider** |  |  |
|**paymentMethodType** | **EnumPaymentLinkAllowedPaymentMethod** |  |  [optional] |
|**paymentMethodDetails** | **Object** |  |  |
|**paymentMethodInformation** | **Object** |  |  |
|**paymentIntent** | **UUID** | The &#x60;payment_intent.id&#x60; associated with this charge. |  [optional] |
|**transactions** | [**List&lt;PaymentTransaction&gt;**](PaymentTransaction.md) | An array of Transaction objects relating to the charge. |  [optional] |
|**updatedAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the status of the charge was last updated.  |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| SUCCEEDED | &quot;SUCCEEDED&quot; |
| FAILED | &quot;FAILED&quot; |



