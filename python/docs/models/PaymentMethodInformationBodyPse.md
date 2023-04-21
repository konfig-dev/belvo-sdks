# belvo_client.model.payment_method_information_body_pse.PaymentMethodInformationBodyPse

Payment method type selected.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Payment method type selected. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**provider_request_id** | str,  | str,  | Unique ID for the payment, as sent by the provider. | [optional] 
**redirect_url** | str,  | str,  | URL that redirects the user to the institution&#x27;s website. | [optional] 
**bank_payment_id** | str,  | str,  | Unique payment ID provided the institution. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

