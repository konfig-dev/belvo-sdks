# belvo_client.model.display_confirmation_required_ofpi.DisplayConfirmationRequiredOfpi

Object detailing the next steps you should follow for a specific `next_step` type.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object detailing the next steps you should follow for a specific &#x60;next_step&#x60; type. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**beneficiary_bank_account** | [**BeneficiaryBankAccountOfpi**](BeneficiaryBankAccountOfpi.md) | [**BeneficiaryBankAccountOfpi**](BeneficiaryBankAccountOfpi.md) |  | [optional] 
**payer_name** | str,  | str,  | The name of the payer. | [optional] 
**payer_identifier** | str, uuid.UUID,  | str,  | The payer&#x27;s ID. | [optional] value must be a uuid
**payer_institution** | [**PaymentInstitution**](PaymentInstitution.md) | [**PaymentInstitution**](PaymentInstitution.md) |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

