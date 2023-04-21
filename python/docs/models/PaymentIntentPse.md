# belvo_client.model.payment_intent_pse.PaymentIntentPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | str,  | str,  | Amount to be paid by your customer in this payment intent.  | 
**failure_code** | None, str,  | NoneClass, str,  | Error code that explains the reason behind a payment being unsuccessful (if applicable).  | 
**payment_method_information** | [**PaymentMethodInformationPse**](PaymentMethodInformationPse.md) | [**PaymentMethodInformationPse**](PaymentMethodInformationPse.md) |  | 
**payment_method_details** | [**PaymentIntentPaymentMethodDetailsPse**](PaymentIntentPaymentMethodDetailsPse.md) | [**PaymentIntentPaymentMethodDetailsPse**](PaymentIntentPaymentMethodDetailsPse.md) |  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**description** | str,  | str,  | The description of the payment.  | 
**failure_message** | None, str,  | NoneClass, str,  | Further information regarding the &#x60;failure_code&#x60;.  | 
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created this payment intent. | value must be a uuid
**[allowed_payment_method_types](#allowed_payment_method_types)** | list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For PSE, the value will be &#x60;pse&#x60;. | 
**updated_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the payment intent was last updated.  | value must conform to RFC-3339 date-time
**[next_step](#next_step)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**provider** | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) |  | 
**selected_payment_method_type** | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) |  | 
**currency** | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current payment intent. | value must be a uuid
**[last_error](#last_error)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**customer** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the customer related to this payment intent. | value must be a uuid
**status** | [**EnumPaymentIntentStatus**](EnumPaymentIntentStatus.md) | [**EnumPaymentIntentStatus**](EnumPaymentIntentStatus.md) |  | 
**[metadata](#metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | [optional] 
**[charges](#charges)** | list, tuple,  | tuple,  | An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.  **Note**: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource.  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# allowed_payment_method_types

A list of payment method types allowed in this payment intent. For PSE, the value will be `pse`.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of payment method types allowed in this payment intent. For PSE, the value will be &#x60;pse&#x60;. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) |  | 

# next_step

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[NextStepDisplayPaymentMethodInformationPse](NextStepDisplayPaymentMethodInformationPse.md) | [**NextStepDisplayPaymentMethodInformationPse**](NextStepDisplayPaymentMethodInformationPse.md) | [**NextStepDisplayPaymentMethodInformationPse**](NextStepDisplayPaymentMethodInformationPse.md) |  | 
[NextStepDisplayCredentialsRequiredPse](NextStepDisplayCredentialsRequiredPse.md) | [**NextStepDisplayCredentialsRequiredPse**](NextStepDisplayCredentialsRequiredPse.md) | [**NextStepDisplayCredentialsRequiredPse**](NextStepDisplayCredentialsRequiredPse.md) |  | 
[NextStepDisplayNeedsRedirectPse](NextStepDisplayNeedsRedirectPse.md) | [**NextStepDisplayNeedsRedirectPse**](NextStepDisplayNeedsRedirectPse.md) | [**NextStepDisplayNeedsRedirectPse**](NextStepDisplayNeedsRedirectPse.md) |  | 
[NextStepDisplayTokenRequiredPse](NextStepDisplayTokenRequiredPse.md) | [**NextStepDisplayTokenRequiredPse**](NextStepDisplayTokenRequiredPse.md) | [**NextStepDisplayTokenRequiredPse**](NextStepDisplayTokenRequiredPse.md) |  | 
[NextStepDisplayCustomerBankAccountsPse](NextStepDisplayCustomerBankAccountsPse.md) | [**NextStepDisplayCustomerBankAccountsPse**](NextStepDisplayCustomerBankAccountsPse.md) | [**NextStepDisplayCustomerBankAccountsPse**](NextStepDisplayCustomerBankAccountsPse.md) |  | 
[NextStepDisplayConfirmationRequiredPse](NextStepDisplayConfirmationRequiredPse.md) | [**NextStepDisplayConfirmationRequiredPse**](NextStepDisplayConfirmationRequiredPse.md) | [**NextStepDisplayConfirmationRequiredPse**](NextStepDisplayConfirmationRequiredPse.md) |  | 

# last_error

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[LastErrorInvalidCredentials](LastErrorInvalidCredentials.md) | [**LastErrorInvalidCredentials**](LastErrorInvalidCredentials.md) | [**LastErrorInvalidCredentials**](LastErrorInvalidCredentials.md) |  | 
[LastErrorInvalidToken](LastErrorInvalidToken.md) | [**LastErrorInvalidToken**](LastErrorInvalidToken.md) | [**LastErrorInvalidToken**](LastErrorInvalidToken.md) |  | 
[LastErrorLoginError](LastErrorLoginError.md) | [**LastErrorLoginError**](LastErrorLoginError.md) | [**LastErrorLoginError**](LastErrorLoginError.md) |  | 
[LastErrorTwoFactor](LastErrorTwoFactor.md) | [**LastErrorTwoFactor**](LastErrorTwoFactor.md) | [**LastErrorTwoFactor**](LastErrorTwoFactor.md) |  | 
[LastErrorPaymentError](LastErrorPaymentError.md) | [**LastErrorPaymentError**](LastErrorPaymentError.md) | [**LastErrorPaymentError**](LastErrorPaymentError.md) |  | 
[LastErrorSessionExpired](LastErrorSessionExpired.md) | [**LastErrorSessionExpired**](LastErrorSessionExpired.md) | [**LastErrorSessionExpired**](LastErrorSessionExpired.md) |  | 

# metadata

Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | 

# charges

An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.  **Note**: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource. 

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of charge objects related to this paymnet intent. If no charges are associated, we return an empty array.  **Note**: The charges resource will be deprecated and removed from our API by end of Q1 2023. We recommend not using any data from this resource.  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**Charge**](Charge.md) | [**Charge**](Charge.md) | [**Charge**](Charge.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

