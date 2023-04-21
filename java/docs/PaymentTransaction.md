

# PaymentTransaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | The description of the payment.  |  |
|**id** | **UUID** | Belvo’s unique ID to reference the transaction. |  |
|**createdAt** | **OffsetDateTime** | The ISO-8601 timestamp of when the data point was last updated in Belvo&#39;s database. |  |
|**createdBy** | **UUID** | Belvo&#39;s unique ID for the user that created the payment. |  |
|**amount** | **String** | The transaction amount.   **Note**: The amount displayed is always positive as we indicate the direction of the transaction in &#x60;transaction_type&#x60; parameter.  |  |
|**currency** | **EnumPaymentsCurrency** |  |  |
|**transactionType** | **EnumPaymentTransactionType** |  |  |
|**beneficiary** | **UUID** | Belvo&#39;s unique ID used to identify the beneficiary&#39;s bank account. |  |
|**payer** | **Object** |  |  |
|**paymentIntent** | **UUID** | The unique ID of the payment intent associated with the transaction. |  [optional] |
|**customer** | **UUID** | Belvo&#39;s unique ID for the customer asscociated with this transaction. |  [optional] |



