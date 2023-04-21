# belvo_client.model.charge.Charge

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**amount** | None, str,  | NoneClass, str,  | The amount of the charge.  | 
**failure_code** | None, str,  | NoneClass, str,  | Error code that explains the reason behind a payment being unsuccessful (if applicable).  | 
**[metadata](#metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | 
**beneficiary** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary’s bank account. | value must be a uuid
**updated_at** | None, str, datetime,  | NoneClass, str,  | The ISO-8601 timestamp of when the status of the charge was last updated.  | value must conform to RFC-3339 date-time
**provider** | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) | [**EnumPaymentLinkProvider**](EnumPaymentLinkProvider.md) |  | 
**[payment_method_information](#payment_method_information)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**[payment_method_details](#payment_method_details)** | dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was last updated in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**failure_message** | None, str,  | NoneClass, str,  | Further information regarding the &#x60;failure_code&#x60;.  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current charge. | value must be a uuid
**status** | str,  | str,  | The current status of the charge.  | must be one of ["PENDING", "SUCCEEDED", "FAILED", ] 
**description** | str,  | str,  | The description of the payment.  | [optional] 
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the charge. | [optional] value must be a uuid
**customer** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the customer that the charge was created for. | [optional] value must be a uuid
**currency** | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) | [**EnumPaymentsCurrency**](EnumPaymentsCurrency.md) |  | [optional] 
**payment_method_type** | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) | [**EnumPaymentLinkAllowedPaymentMethod**](EnumPaymentLinkAllowedPaymentMethod.md) |  | [optional] 
**payment_intent** | str, uuid.UUID,  | str,  | The &#x60;payment_intent.id&#x60; associated with this charge. | [optional] value must be a uuid
**[transactions](#transactions)** | list, tuple,  | tuple,  | An array of Transaction objects relating to the charge. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# metadata

Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | 

# payment_method_details

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[ChargePaymentMethodDetailsPse](ChargePaymentMethodDetailsPse.md) | [**ChargePaymentMethodDetailsPse**](ChargePaymentMethodDetailsPse.md) | [**ChargePaymentMethodDetailsPse**](ChargePaymentMethodDetailsPse.md) |  | 
[ChargePaymentMethodDetailsOfpi](ChargePaymentMethodDetailsOfpi.md) | [**ChargePaymentMethodDetailsOfpi**](ChargePaymentMethodDetailsOfpi.md) | [**ChargePaymentMethodDetailsOfpi**](ChargePaymentMethodDetailsOfpi.md) |  | 

# payment_method_information

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, str, date, datetime, uuid.UUID, int, float, decimal.Decimal, bool, None, list, tuple, bytes, io.FileIO, io.BufferedReader,  | frozendict.frozendict, str, decimal.Decimal, BoolClass, NoneClass, tuple, bytes, FileIO |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### oneOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[PaymentMethodInformationPse](PaymentMethodInformationPse.md) | [**PaymentMethodInformationPse**](PaymentMethodInformationPse.md) | [**PaymentMethodInformationPse**](PaymentMethodInformationPse.md) |  | 

# transactions

An array of Transaction objects relating to the charge.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | An array of Transaction objects relating to the charge. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**PaymentTransaction**](PaymentTransaction.md) | [**PaymentTransaction**](PaymentTransaction.md) | [**PaymentTransaction**](PaymentTransaction.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

