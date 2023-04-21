# belvo_client.model.charge_payment_method_details_ofpi_content.ChargePaymentMethodDetailsOfpiContent

Information about the payer of a PSE payment.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Information about the payer of a PSE payment. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**payer_institution** | str, uuid.UUID,  | str,  | Unique identifier for the payer’s institution. | [optional] value must be a uuid
**beneficiary_bank_account** | str, uuid.UUID,  | str,  | Belvo&#x27;s unique ID used to identify the beneficiary&#x27;s bank account. | [optional] value must be a uuid
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

