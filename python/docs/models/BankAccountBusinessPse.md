# belvo_client.model.bank_account_business_pse.BankAccountBusinessPse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**institution** | None, str, uuid.UUID,  | NoneClass, str,  | Belvo&#x27;s unique ID for the institution that the bank account is created in. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;. | value must be a uuid
**number** | None, str,  | NoneClass, str,  | The bank account number. For &#x60;BUSINESS&#x60; bank accounts that Belvo creates for organizations, this field is &#x60;null&#x60;.  **Note:** Apart from the last four characters, all the rest of the characters are masked. | 
**created_at** | str, datetime,  | str,  | The ISO-8601 timestamp of when the data point was first created in Belvo&#x27;s database. | value must conform to RFC-3339 date-time
**[details](#details)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | For PSE, this field will return an empty object. | 
**holder** | [**HolderBusinessResponsePse**](HolderBusinessResponsePse.md) | [**HolderBusinessResponsePse**](HolderBusinessResponsePse.md) |  | 
**id** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the current bank account. | value must be a uuid
**created_by** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID for the user that created the bank account. | value must be a uuid
**customer** | None, str, uuid.UUID,  | NoneClass, str,  | Belvo&#x27;s unique ID for the customer associated with the bank account. For &#x60;BUSINESS&#x60; bank accounts, this field is &#x60;null&#x60;. | value must be a uuid
**[metadata](#metadata)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# details

For PSE, this field will return an empty object.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | For PSE, this field will return an empty object. | 

# metadata

Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Optional and customizable object where you can provide any additional key-value pairs for your internal purposes. For example, an internal reference number for the payment intent.  ⚠️ **Note**: You can only provide up to 50 keys (keys can have up to 50 characters each and each value can be up to 500 characters). We do not support nested objects, only ASCII values. | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

