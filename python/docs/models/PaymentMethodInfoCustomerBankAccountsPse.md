# belvo_client.model.payment_method_info_customer_bank_accounts_pse.PaymentMethodInfoCustomerBankAccountsPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the customer’s bank account. | [optional] value must be a uuid
**customer** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current customer. | [optional] value must be a uuid
**institution** | [**PaymentInstitution**](PaymentInstitution.md) | [**PaymentInstitution**](PaymentInstitution.md) |  | [optional] 
**number** | str,  | str,  | The customer&#x27;s bank account number. This value is obfuscated. | [optional] 
**holder** | [**HolderBankAccountPse**](HolderBankAccountPse.md) | [**HolderBankAccountPse**](HolderBankAccountPse.md) |  | [optional] 
**details** | [**PaymentMethodInformationDetailsPse**](PaymentMethodInformationDetailsPse.md) | [**PaymentMethodInformationDetailsPse**](PaymentMethodInformationDetailsPse.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

