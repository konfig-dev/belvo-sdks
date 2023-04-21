

# PaymentIntentPaymentMethodDetailsBodyPse

Details about the payment method type selected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**payerInstitution** | **UUID** | Belvo&#39;s unique identifier for the payer’s institution. |  [optional] |
|**payerBankAccount** | **UUID** | Belvo&#39;s unique ID used to identify the customer’s bank account. |  [optional] |
|**beneficiaryBankAccount** | **UUID** | Belvo&#39;s unique ID used to identify the beneficiary’s bank account. |  |
|**username** | **String** | The username used to log in to the institution. This value is obfuscated. |  [optional] |
|**password** | **String** | The password used to log in to the institution. This value is obfuscated. |  [optional] |
|**callbackUrl** | **String** | The callback URL that your user will be redirected to after confirming the payment in their banking application. |  |
|**belvoFlow** | **Boolean** | This parameter determines the payment flow of the payment intent. By default, this is set to &#x60;true&#x60; and the payment intent created is processed using the Belvo&#39;s payment flow and Belvo-integrated institutions. When set to &#x60;false&#x60;, the payment intent process uses institutions not integrated into Belvo&#39;s flow.        |  |



