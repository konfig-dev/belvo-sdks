# belvo_client.model.payment_method_information_pse.PaymentMethodInformationPse

Information about the payment method selected.  **Note**: If no payment method information is associated, we return an empty array.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Information about the payment method selected.  **Note**: If no payment method information is associated, we return an empty array. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**pse** | [**PaymentMethodInformationBodyPse**](PaymentMethodInformationBodyPse.md) | [**PaymentMethodInformationBodyPse**](PaymentMethodInformationBodyPse.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

