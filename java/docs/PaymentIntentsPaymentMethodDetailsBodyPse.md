

# PaymentIntentsPaymentMethodDetailsBodyPse

Details about the organization's bank account that will receive the payment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beneficiaryBankAccount** | **UUID** | Belvo&#39;s unique ID used to identify the beneficiary&#39;s bank account. |  |
|**callbackUrl** | **String** | The URL to your application that your customer will be directed to once they confirm the payment in their bank application. |  [optional] |
|**belvoFlow** | **Boolean** | This parameter determines the payment flow of the payment intent. By default, this is set to &#x60;true&#x60; and the payment intent created is processed using Belvo&#39;s payment flow and Belvo-integrated institutions. When set to &#x60;false&#x60;, the payment intent process uses institutions not integrated into Belvo&#39;s flow.        |  |



