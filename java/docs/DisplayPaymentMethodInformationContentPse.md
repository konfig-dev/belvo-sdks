

# DisplayPaymentMethodInformationContentPse

Object detailing what payment method information you need to display.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerBankAccounts** | [**List&lt;PaymentMethodInfoCustomerBankAccountsPse&gt;**](PaymentMethodInfoCustomerBankAccountsPse.md) | Array of bank account objects.  **Note**: If there are no customer accounts saved in the Belvo database, we return an empty array. |  [optional] |
|**institutions** | [**List&lt;PaymentInstitution&gt;**](PaymentInstitution.md) | An array of institution objects. |  [optional] |



