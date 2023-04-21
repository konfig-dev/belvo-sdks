

# PaymentIntentPaymentMethodDetailsBodyIndividualOfpi

Payment method type selected.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**beneficiaryBankAccount** | **UUID** | Belvo&#39;s unique ID used to identify the beneficiary&#39;s bank account. |  |
|**payerInstitution** | **UUID** | Belvo&#39;s unique ID to reference the payer&#39;s institution. |  |
|**callbackUrl** | **String** | The callback URL that your user will be redirected to after confirming the payment in their banking application. |  |
|**cpf** | **String** | The customer&#39;s CPF number. Only required when the &#x60;customer_type&#x60; is &#x60;BUSINESS&#x60;.  **Note:** This value is obfuscated. |  [optional] |



